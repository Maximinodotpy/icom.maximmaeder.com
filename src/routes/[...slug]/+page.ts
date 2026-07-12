import { error } from '@sveltejs/kit'

export async function load({ params }) {
	try {
		let slug = params.slug
		// trim any trailing or starting slashes from the slug
		slug = slug.replace(/^\/|\/$/g, '')

		const import_url = `../../posts/${slug}.md`
		console.log(`import_url: ${import_url}`);
		
		const post = await import(import_url)

		return {
			content: post.default,
			meta: post.metadata
		}
	} catch (e) {
		error(404, `Could not find ${params.slug}`)
	}
}
