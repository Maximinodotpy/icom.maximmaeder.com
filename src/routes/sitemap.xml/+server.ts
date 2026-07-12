import * as config from '$lib/config'
import type { Post } from '$lib/types'

export const prerender = true

export async function GET({ fetch }) {
	const response = await fetch('/api/posts')
	const posts: Post[] = await response.json()

	const headers = { 'Content-Type': 'application/xml' }

	const sitemapxml = `
		<?xml version="1.0" encoding="UTF-8"?>
		<urlset xmlns="http://www.sitemaps.org/schemas/sitemap/0.9">
			<url>
				<loc>${config.url}</loc>
				<lastmod>${new Date().toISOString()}</lastmod>
			</url>
			${posts
				.map(
					(post) => `
					<url>
						<loc>${config.url}/blog/${post.slug}</loc>
						<lastmod>${new Date(post.date).toISOString()}</lastmod>
					</url>
				`
				)
				.join('')}
		</urlset>
	`.trim()

	return new Response(sitemapxml, { headers })
}
