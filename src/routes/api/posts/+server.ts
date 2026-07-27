import { json } from '@sveltejs/kit'
import type { Post } from '$lib/types'

async function getPosts() {
	let posts: Post[] = []

	const paths = import.meta.glob('/src/posts/**/*.md', { eager: true })

	for (const path in paths) {
		const file = paths[path]
		/* const slug = path.split('/').at(-1)?.replace('.md', '') */
		// the file could be in a subfodler or many subfolders so accoutn for that in the slug
		const slug = path.split('/').slice(3).join('/').replace('.md', '')

		if (file && typeof file === 'object' && 'metadata' in file && slug) {
			const metadata = file.metadata as Omit<Post, 'slug'>
			const post = { ...metadata, slug } satisfies Post
			post.published && posts.push(post)
		}
	}

	posts = posts.sort(
		(first, second) => new Date(second.date).getTime() - new Date(first.date).getTime()
	)

	// Also sort it so that index files are at the top of their respective folders
	posts = posts.sort((first, second) => {
		const firstSlugParts = first.slug.split('/')
		const secondSlugParts = second.slug.split('/')
		if (firstSlugParts.length === secondSlugParts.length) {
			if (firstSlugParts[firstSlugParts.length - 1] === 'index') {
				return -1
			} else if (secondSlugParts[secondSlugParts.length - 1] === 'index') {
				return 1
			}
			return 0
		}
		return firstSlugParts.length - secondSlugParts.length
	})

	return posts
}

export async function GET() {
	const posts = await getPosts()
	return json(posts)
}
