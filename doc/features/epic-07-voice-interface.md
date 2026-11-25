# EPIC-07: Voice interface

> Epic file — for an overview of all epics see [FEATURES.md](../FEATURES.md).

---

> Add voice as an optional way to operate selected PADD functions. Voice should complement touch interaction, make microphone activity visible and avoid unexpected or unauthorised actions.

**Stories:** US-0701

**Status (2026-11-25):** 📋 US-0701 planned.

## User Stories

**US-0701: Operate selected PADD functions by voice** 📋 Planned
- As a **PADD user**, in order to **operate selected functions without using touch**, I would like to **use an optional voice interface with clear feedback and control over microphone access**.
- **Epic:** EPIC-07
- **Priority:** Medium
- **Complexity:** High
- **Background:** Voice is an alternative input method, not a replacement for touch. Its activation, privacy and command authority must remain explicit.
- **Acceptance Criteria:**
  - [ ] Supported interaction modes (such as push-to-talk) and the privacy model are documented.
  - [ ] A small, explicitly allowlisted command set is implemented and tested.
  - [ ] Speech capture, transcription, intent resolution and command execution have clear boundaries.
  - [ ] Listening/processing state, cancellation and failure feedback are visible.
  - [ ] Consequential actions require confirmation and all commands are permission-checked.
  - [ ] The PADD remains fully usable when microphone access is denied or voice is disabled.
  - [ ] Battery, latency and offline behaviour are measured and documented.
- **Notes:** Wake-word operation is not assumed; it requires a separate evaluation of privacy, hardware and battery impact.
- **Dependencies:** US-0302, US-0401. Microphone availability and permission must be detected at runtime.
- **Implementation issue:** [#12 — Design and implement the voice interface](../../issues/12)
