<script lang="ts">
	import { dev } from '$app/environment'
	import { formatDate } from '$lib/utils';
	import { onMount } from 'svelte'
	import { Printer } from 'lucide-svelte';

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
				<span class="hidden_in_print">•</span>
				<p class="hidden_in_print">word count: {wordCount}</p>
			{/if}

			{#if dev}
				<span class="hidden_in_print">•</span>
				<a class="hidden_in_print print" onclick={(e) => {
					e.preventDefault();
					window.print();
				}} href="#_">
					<Printer class="hidden_in_print" />
					<span class="hidden_in_print">Print</span>
				</a>
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
		
		@media print {
			max-inline-size: 100%;
			margin-inline: 0;
		}

		h1 {
			text-transform: capitalize;
		}

		.meta {
			margin-top: var(--size-2);
			color: var(--text-2);
			display: flex;
			gap: var(--size-2);
			flex-wrap: wrap;

			.print {
				display: flex;
				align-items: center;
				gap: var(--size-1);
				color: var(--text-2);
				text-decoration: none;

				&:hover {
					color: var(--text-1);
				}
			}
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

		/* reset on print */
		@media print {
			margin-block-end: 0;

			color: black;
		}
	}
</style>
