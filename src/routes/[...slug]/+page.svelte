<script lang="ts">
	import { dev } from '$app/environment'
	import { formatDate } from '$lib/utils';
	import { onMount } from 'svelte'

	let { data } = $props();


	let readingTime = $state(0);
	let wordCount = $state(0);

	console.log(data);
	console.log('halllllo');

	onMount(() => {
		console.log('mounted ...');

		const contentEl = document.getElementById('content');
		if (contentEl) {
			const allTextElements = contentEl.querySelectorAll('p, h1, h2, h3, h4, h5, h6, li');

			const textContent = Array.from(allTextElements).map(el => el.textContent).join(' ');

			// Count the number of words 
			wordCount = textContent.trim().split(/\s+/).length;

			// Calculate reading time (assuming an average reading speed of 200 words per minute)
			readingTime = Math.ceil(wordCount / 200);
		}
	})
</script>

<svelte:head>
	<title>{data.meta.title}</title>
	<meta property="og:type" content="article" />
	<meta property="og:title" content={data.meta.title} />
</svelte:head>

<article>
	<hgroup>
		<h1>{data.meta.title}</h1>

		<div class="meta">
			<p>Published at {formatDate(data.meta.date)}</p>
	
			<!-- Show the reading time -->
			{#if readingTime > 0}
				<span>•</span>
				<p>Reading time: {readingTime} minute{readingTime > 1 ? 's' : ''}</p>
			{/if}
			
			{#if dev}
				<span>•</span>
				<p>word count: {wordCount}</p>
			{/if}
		</div>

		<!-- Description -->
		<!-- {#if data.meta.description}
			<p>{data.meta.description}</p>
		{/if} -->
	</hgroup>

	<div class="tags">
		{#each data.meta.categories as category}
			<span class="surface-4">&num;{category}</span>
		{/each}
	</div>

	<div class="prose" id="content">
		<data.content />
	</div>
</article>

<style>
	article {
		max-inline-size: var(--size-content-3);
		margin-inline: auto;

		h1 {
			text-transform: capitalize;
		}

		.meta {
			margin-top: var(--size-2);
			color: var(--text-2);
			display: flex;
			gap: var(--size-2);
		}

		.tags {
			display: flex;
			gap: var(--size-3);
			margin-top: var(--size-7);

			> * {
				padding: var(--size-2) var(--size-3);
				border-radius: var(--radius-round);
			}
		}
	}

	:global(.prose > *) {
		margin-block-end: var(--size-4);
	}
</style>
