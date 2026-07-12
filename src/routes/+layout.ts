export const prerender = true

export async function load({ url }) {
	const response = await fetch('https://data.maximmaeder.com/data.json')
	const data_maximmaeder_com = await response.json()

	return {
		url: url.pathname,
		data_maximmaeder_com
	}
}
