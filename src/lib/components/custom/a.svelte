<script lang="ts">
	type Props = {
		href: string,
		target?: string,
	}

	let { href, target }: Props = $props()
</script>

<a {href} {target}>
	<slot /> CUSTOM LINK
</a>