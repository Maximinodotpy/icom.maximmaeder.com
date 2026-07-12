<script lang="ts">
	import * as config from '$lib/config'

	let {
		data_maximmaeder_com
	}: {
		data_maximmaeder_com?: any
	} = $props()
</script>

<footer>
	<p>{config.title} &copy {new Date().getFullYear()}</p>

	<div>
		<ul class="links">
		<!-- <li>
			<a href="/about">About</a>
		</li>
		<li>
			<a href="/contact">Contact</a>
		</li> -->
			<li>
				<a href="/rss.xml" target="_blank">RSS</a>
			</li>
			<li>
				<a href="/sitemap.xml" target="_blank">Sitemap</a>
			</li>

			{#each data_maximmaeder_com?.socials ?? [] as social}
				<li class="social-links">
					<a href={social.url} target="_blank">
						<img src="{social.icon}" alt="{social.name}" class="social-icon" />
						{social.name}
					</a>
				</li>
			{/each}

			{#each data_maximmaeder_com?.subdomains ?? [] as social}
				<li class="social-links">
					<a href={social.url} target="_blank">
						<img src="{social.icon}" alt="{social.name}" class="social-icon" />
						{social.name}
					</a>
				</li>
			{/each}
		</ul>
	</div>
</footer>

<style>
	:global([color-scheme="dark"]) {
		.social-icon {
			filter: invert(1);
		}
	}

	footer {
		padding-block: var(--size-7);
		border-top: 1px solid var(--border);

		p {
			color: var(--text-2);
		}

		.links {
			display: flex;
			column-gap: .75rem;
			flex-wrap: wrap;

			.social-links {

				a {
					display: flex;
					align-items: center;
					gap: 0.3rem;
				}

				.social-icon {
					inline-size: 1rem;
					block-size: 1rem;
					user-select: none;

					/* Invert the icon in darkmode */
					
				}
			}
			

			a {
				color: inherit;
				text-decoration: none;
			}
		}

	}
</style>
