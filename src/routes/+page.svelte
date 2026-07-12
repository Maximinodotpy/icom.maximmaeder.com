<script lang="ts">
	import { formatDate } from '$lib/utils'
	import * as config from '$lib/config'
	import { List, Grid, Folder } from 'lucide-svelte'
	import type { Post } from '$lib/types.js';

	let { data } = $props()

	const viewtypes = [
		{
			name: 'List',
			icon: List,
		},
		{
			name: 'Grid',
			icon: Grid,
		},
		{
			name: 'Folders',	
			icon: Folder,
		}
	]
	let current_viewtype = $state(viewtypes[2])
	let searchQuery = $state('')

	let filteredPosts = $derived.by(() => {
		return data.posts.filter((post) => {
			const query = searchQuery.toLowerCase()
			return post.title.toLowerCase().includes(query) || post.description.toLowerCase().includes(query)
		})
	})

	interface Item {
		name: string
		type: 'folder' | 'file'
		children?: Item[]
		post?: Post
	}

	const formatPostsIntoRecursiveFolders = (posts: Post[]) => {
		const folders: Item[] = []

		// The slug may look like this /subfolder/hello-world, we want to split it into parts and create a nested structure
		posts.forEach((post) => {
			const parts = post.slug.split('/').filter(Boolean)
			let currentFolder = folders

			parts.forEach((part, index) => {
				const isLastPart = index === parts.length - 1
				const existingFolder = currentFolder.find((item) => item.name === part && item.type === 'folder')

				if (isLastPart) {
					// If it's the last part, we add the post as a file
					currentFolder.push({
						name: part,
						type: 'file',
						post: post,
					})
				} else {
					if (existingFolder) {
						// If the folder already exists, we move into it
						currentFolder = existingFolder.children!
					} else {
						// If the folder doesn't exist, we create it and move into it
						const newFolder: Item = {
							name: part,
							type: 'folder',
							children: [],
						}
						currentFolder.push(newFolder)
						currentFolder = newFolder.children!
					}
				}
			})
		})

		return folders
	}
</script>

<svelte:head>
	<title>{config.title}</title>
</svelte:head>

<section>
	<!-- Viewtypes -->
	<div class="search-bar">
		<input type="text" placeholder="Search posts..." class="surface-4" bind:value={searchQuery} />
		
		<div class="viewtypes-list">
			{#each viewtypes as viewtype}
				{@const Icon = viewtype.icon}
				<button class="viewtype {current_viewtype.name == viewtype.name ? 'brand' : 'surface-4'}" onclick={() => {
					console.log('active viewtype ...');
					console.log(viewtype);
					current_viewtype = viewtype
				}}>
					<Icon></Icon>
					{ viewtype.name }
				</button>
			{/each}
		</div>
	</div>
	

	{#if filteredPosts.length === 0}
		<p>No posts found.</p>

		{#if searchQuery}
			<p>Try searching for something else.</p>
		{/if}
	{:else if current_viewtype.name === 'Grid'}
		<div class="posts grid">
			{#each filteredPosts as post}
				<div class="post">
					<a href={post.slug} class="title">{post.title}</a>
					<p class="date">{formatDate(post.date)}</p>
					<p class="description">{post.description}</p>
				</div>
			{/each}
		</div>
	{:else if current_viewtype.name === 'Folders'}
		<div class="folders">
			{#snippet folder(items: Item[])}
				{#each items as item}
					<div class="folder-item">
						{#if item.type === 'folder'}
							<p>{item.name}</p>
							{@render folder(item?.children ?? [])}
						{:else if item.type === 'file'}
							<div class="post">
								<a href={item?.post?.slug} class="title">{item?.post?.title}</a>
								<!-- <p class="date">{formatDate(item?.post?.date)}</p> -->
								<!-- <p class="description">{item?.post?.description}</p> -->
							</div>
						{/if}
					</div>
				{/each}
			{/snippet}

			{@render folder(formatPostsIntoRecursiveFolders(filteredPosts))}
		</div>
	{:else if current_viewtype.name === 'List'}
		<ul class="posts">
			{#each filteredPosts as post}
				<li class="post">
					<a href={post.slug} class="title">{post.title}</a>
					<p class="date">{formatDate(post.date)}</p>
					<p class="description">{post.description}</p>
				</li>
			{/each}
		</ul>
	{/if}
</section>

<style>
	.search-bar {
		display: flex;
		justify-content: space-between;
		align-items: center;
		flex-wrap: wrap;
		gap: var(--size-4);
		margin-block-end: var(--size-7);

		input {
			padding: var(--size-2) var(--size-4);
		}
		
		.viewtypes-list {
			display: flex;
			flex-wrap: wrap;
			gap: var(--size-2);
		}
	}
	

	.posts {
		display: grid;
		gap: var(--size-7);

		.post {
			max-inline-size: var(--size-content-3);

			&:not(:last-child) {
				border-bottom: 1px solid var(--border);
				padding-bottom: var(--size-7);
			}

			.title {
				font-size: var(--font-size-fluid-3);
				text-transform: capitalize;
			}

			.date {
				color: var(--text-2);
			}

			.description {
				margin-top: var(--size-3);
			}
		}

		&.grid {
			grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
		}

	}

	.folder-item {
		margin-inline-start: var(--size-4);
	}

	.folders > .folder-item {
		margin-inline-start: 0;
	}
</style>
