---
title: Design System
description: The Design System of this Website.
date: '2026-07-12'
published: true
---

Since this Website is a Fork of a Joy of Code Website, I will also use the Design System of Joy of Code. The original code can be found [here](https://github.com/joysofcode/sveltekit-markdown-blog). 

Of course I made some changes to fit my needs, but it is based on [open-props](https://open-props.style).

## Buttons

<button class="button brand">Brand Button</button>
<button>Regular Button</button>

<button class="surface-1">Surface 1 Button</button>
<button class="surface-2">Surface 2 Button</button>
<button class="surface-3">Surface 3 Button</button>
<button class="surface-4">Surface 4 Button</button>

## Colors

<div class="color-badge brand">--brand</div>
<div class="color-badge text-1">--text-1</div>
<div class="color-badge text-2">--text-2</div>

<div class="color-badge surface-1">--surface-1</div>
<div class="color-badge surface-2">--surface-2</div>
<div class="color-badge surface-3">--surface-3</div>
<div class="color-badge surface-4">--surface-4</div>

<div class="color-badge background">--background</div>

## Fonts

<div>Text: Atkinson Hyperlegible</div>

```typescript
{
    Code: "JetBrains Mono"
}
```

## Icons

I use [Lucide](https://lucide.dev/icons/list) for my icons.

<style>
    .color-badge {
        display: inline-block;
        padding: 0.5rem 1rem;
        font-weight: bold;
        margin-right: 0.5rem;
        border-radius: var(--radius-2);

        &.brand {
            background-color: var(--brand);
            color: white;
        }
        &.text-1 {
            background-color: var(--text-1);
            color: white;
        }
        &.text-2 {
            background-color: var(--text-2);
            color: white;
        }
        /* &.surface-1 {
            background-color: var(--surface-1)
        }
        &.surface-2 {
            background-color: var(--surface-2)
        }
        &.surface-3 {
            background-color: var(--surface-3)
        }
        &.surface-4 {
            background-color: var(--surface-4)
        } */
        &.background {
            background-color: var(--background);
            color: white;
        }
    }
</style>