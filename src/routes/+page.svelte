<script lang="ts">
	import { formatDate } from '$lib/utils'
	import * as config from '$lib/config'

	let { data } = $props()

	const viewtypes = [
		{
			name: 'List',
			icon: 'https://api.iconify.design/material-symbols:format-list-bulleted.svg',
		},
		{
			name: 'Grid',
			icon: 'https://api.iconify.design/material-symbols:grid-view.svg',
		},
		{
			name: 'Folders',
			icon: 'https://api.iconify.design/material-symbols:folder.svg',
		}
	]
	let current_viewtype = $state(viewtypes[0])
</script>

<svelte:head>
	<title>{config.title}</title>
</svelte:head>

<section>
	<!-- Viewtypes -->
	<div class="viewtypes-list">
		{#each viewtypes as viewtype}
			<button class="viewtype {current_viewtype.name == viewtype.name ? 'active' : ''}" onclick={() => {
				console.log('active viewtype ...');
				console.log(viewtype);
				current_viewtype = viewtype
			}}>
				<img src={viewtype.icon} alt={viewtype.name} />
				{ viewtype.name }
			</button>
		{/each}
	</div>

	{#if data.posts.length === 0}
		<p>No posts found.</p>
	{:else if current_viewtype.name === 'Grid'}
		<div class="posts grid">
			{#each data.posts as post}
				<div class="post">
					<a href={post.slug} class="title">{post.title}</a>
					<p class="date">{formatDate(post.date)}</p>
					<p class="description">{post.description}</p>
				</div>
			{/each}
		</div>
	{:else if current_viewtype.name === 'Folders'}
		<div class="posts folders">
			{#each data.posts as post}
				<div class="post">
					<a href={post.slug} class="title">{post.title}</a>
					<p class="date">{formatDate(post.date)}</p>
					<p class="description">{post.description}</p>
				</div>
			{/each}
		</div>
	{:else if current_viewtype.name === 'List'}
		<ul class="posts">
			{#each data.posts as post}
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
	.viewtypes-list {
		display: flex;
		gap: var(--size-3);
		margin-block-end: var(--size-7);

		img {
			/* filter: invert(1); */
			/* opacity: 0.5; */
		}

		.viewtype.active {
			background-color: var(--blue-2);
		}

		button {
			color: var(--blue-9);
			background-color: var(--blue-0);
			border: 1px solid var(--blue-3);
			box-shadow: none;
			text-shadow: none;

			&:hover {
				background-color: var(--blue-1);
			}
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
</style>
