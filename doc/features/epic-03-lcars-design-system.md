# EPIC-03: LCARS design system

> Epic file — for an overview of all epics see [FEATURES.md](../FEATURES.md).

---

> Bring the established T.H.A.D.E.U.S. LCARS-inspired visual language to the PADD as a native, touch-first Android design system. The result should feel coherent with the reference project while being implemented and maintained independently.

**Stories:** US-0301, US-0302

**Status (2026-11-25):** 📋 US-0301 and US-0302 planned.

## Design source

Reference project: [T.H.A.D.E.U.S.](https://github.com/tochman/ai-dlc-thadeus)

Review:
- `src/renderer/theme.css`
- `src/renderer/Lcars.jsx`
- `src/renderer/LcarsDialog.jsx`
- `docs/features/epic-04-branding-and-desktop.md`

T.H.A.D.E.U.S. is a design reference, not a runtime dependency. The Android implementation uses native Kotlin and Jetpack Compose. Preserve the LCARS-inspired visual principles without using Star Trek names, insignia, logos, sounds or protected franchise assets.

## User Stories

**US-0301: Specify the PADD design language** 📋 Planned
- As a **PADD product designer**, in order to **keep the PADD visually consistent with T.H.A.D.E.U.S.**, I would like to **have a platform-neutral specification of the design tokens, components and interaction rules**.
- **Epic:** EPIC-03
- **Priority:** High
- **Complexity:** Medium
- **Background:** The desktop T.H.A.D.E.U.S. implementation is a visual reference, but Android needs explicit touch-first rules and native platform semantics.
- **Acceptance Criteria:**
  - [ ] Colours, typography, spacing, proportions, frame geometry, borders and semantic states are documented.
  - [ ] Component behaviour is specified for actions, navigation, readouts, meters, status indicators and dialogs.
  - [ ] Passive readouts are clearly distinguished from interactive controls.
  - [ ] Contrast, focus, touch target, accessibility and reduced-motion requirements are explicit.
  - [ ] Android-specific adaptations from the T.H.A.D.E.U.S. desktop implementation are documented.
- **Dependencies:** US-0101 (final display dimensions should be reconciled with the hardware choice).
- **Implementation issue:** [#6 — Specify the LCARS-inspired design system for Android](../../issues/6)

**US-0302: Implement the native Compose component library** 📋 Planned
- As an **Android developer**, in order to **build screens from consistent and reusable interface elements**, I would like to **have a native Jetpack Compose component library that implements the PADD design system**.
- **Epic:** EPIC-03
- **Priority:** High
- **Complexity:** High
- **Background:** A shared component library prevents each screen from implementing its own interpretation of the PADD visual language.
- **Acceptance Criteria:**
  - [ ] A reusable Compose theme and semantic design tokens are implemented.
  - [ ] Core panels, frames, elbow elements, pills, segmented bars, readouts, meters, headings and dialogs are available.
  - [ ] Components expose relevant normal, focused, disabled, warning and alert states.
  - [ ] Accessibility semantics, touch targets and reduced-motion behaviour are tested.
  - [ ] A component gallery or demo screen demonstrates the library.
- **Dependencies:** US-0301, US-0202.
- **Implementation issue:** [#7 — Implement the native LCARS Compose component library](../../issues/7)
