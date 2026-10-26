# Hide Unresolved Mentions Plugin

An Obsidian plugin that allows you to hide specific backlinks and unresolved mentions based on file names or tags.

## Features

- Hide backlinks/unresolved mentions by file name (comma-separated list)
- Hide backlinks/unresolved mentions by tag (files containing a specific tag)
- Add a "Hide" button directly in the backlinks pane to quickly suppress mentions
- Automatic filtering when metadata changes or layout changes

## Installation

### Manual Installation

1. Copy the entire `backlink-exclude` folder to your vault's plugins directory:
   - On Windows: `<vault>\.obsidian\plugins\`
   - On macOS: `<vault>/.obsidian/plugins/`
   - On Linux: `<vault>/.obsidian/plugins/`

2. Make sure the folder contains these files:
   - `main.js` (the compiled plugin)
   - `manifest.json`
   - `versions.json`

3. Open Obsidian and go to Settings → Community Plugins
4. Enable "Hide Unresolved Mentions" in the installed plugins list

## Usage

### Settings

Access the plugin settings through Settings → Community Plugins → Hide Unresolved Mentions → Options

#### Blocked Files
- Enter comma-separated file basenames (without .md extension)
- Example: `template, draft, scratch`
- These files will be hidden from backlinks and unresolved mentions

#### Blocked Tag
- Enter a tag (with or without the # symbol)
- Default: `backlink-exclude`
- Files containing this tag will be hidden from backlinks and unresolved mentions

### Quick Hide Button

When viewing backlinks or unresolved mentions:
1. Look for the "🙈 Hide" button next to each mention
2. Click it to automatically add the suppress tag to that file
3. The mention will be immediately hidden

## How It Works

The plugin monitors:
- Metadata changes (when tags are added/removed)
- Layout changes (when backlink panes are opened/closed)

It then applies filtering rules to hide mentions based on:
1. File basename matching (case-insensitive)
2. Tag matching (case-insensitive)

## Development

To build from source:

```bash
npm install
./build.sh
```

Or manually:
```bash
node esbuild.config.mjs production
```

Note: The npm build script has TypeScript issues, so use the build.sh script or run esbuild directly.

## License

MIT License

## Author

Francis