import { error } from '@sveltejs/kit';

const posts = import.meta.glob('../../posts/*.md');

export async function load({ params }) {
    const slug = params.slug.replace(/^\/|\/$/g, '');

    const path = `../../posts/${slug}.md`;

    const loader = posts[path];

    if (!loader) {
        throw error(404, `Could not find ${slug}`);
    }

    const post = await loader();

    return {
        content: post.default,
        meta: post.metadata
    };
}