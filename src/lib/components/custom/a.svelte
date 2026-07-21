<script lang="ts">
	import { onMount } from "svelte"
	import { computePosition } from "@floating-ui/dom";
	import type { Post } from "$lib/types";

	type Props = {
		href: string,
		target?: string,
		children: () => any
	}

	let { href, target, children }: Props = $props()

	const id = Math.random().toString(36).substring(2, 15) + Math.random().toString(36).substring(2, 15)
	const is_external = href.startsWith('http') || href.startsWith('https') || href.startsWith('mailto') || href.startsWith('tel')

	let post: Post | null = $state(null)

	/* onMount(() => {
		const link = document.getElementById(`link-${id}`)
		const tooltip = document.getElementById(`tooltip-${id}`)

		if (link && tooltip && !is_external) {
			if (href.startsWith('/')) {
				// Fetch the post data from the API
				fetch(`/api/posts`)
					.then(response => response.json())
					.then(data => {
						const posts = data as Post[]
						console.log('posts: ', posts);
						post = posts.find(p => p.slug === href.slice(1)) || null
					})
					.catch(error => {
						console.error('Error fetching post data:', error)
					})
			}

			link.addEventListener('mouseenter', async () => {
				const { x, y } = await computePosition(link, tooltip, {
					placement: 'top',
				})
				tooltip.style.left = `${x}px`
				tooltip.style.top = `${y}px`
				tooltip.style.display = 'block'
			})

			link.addEventListener('mouseleave', () => {
				tooltip.style.display = 'none'
			})
		}
	}) */
</script>

<span>
	<a {href} {target} id="link-{id}" rel="noopener noreferrer" class="link">
		{@render children?.()}
		{is_external ? '🔗' : ''}
	</a>
	
	<!-- <div
		id="tooltip-{id}"
		class="tooltip"
		style="width: max-content;
		position: absolute;
		top: 0;
		left: 0;
		background: #222;
		color: white;
		font-weight: bold;
		padding: 5px;
		border-radius: 4px;
		font-size: 90%;
		display: none;"
	>
		{#if post}
			<div class="tooltip-content">
				<h3>{post.title}</h3>
				<p>{post.description}</p>
			</div>
		{:else}
			<div class="tooltip-content">
				<p>No preview available</p>
			</div>
		{/if}
	</div> -->
</span>