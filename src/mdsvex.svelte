<script lang="ts" module>
	import { img } from '$lib/components/custom'
	import a from '$lib/components/custom/a.svelte';
	export { img, a }
</script>

<script lang="ts">
	let props = $props()
</script>

{@render props.children?.()}
