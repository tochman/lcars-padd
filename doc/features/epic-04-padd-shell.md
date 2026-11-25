# EPIC-04: PADD shell

> Epic file — for an overview of all epics see [FEATURES.md](../FEATURES.md).

---

> Provide the main PADD experience: a stable, tablet-first home surface that brings modules, status information and primary actions together in a consistent navigation model.

**Stories:** US-0401

**Status (2026-11-25):** 📋 US-0401 planned.

## User Stories

**US-0401: Navigate the PADD from a dedicated home shell** 📋 Planned
- As a **PADD user**, in order to **reach the device's main capabilities quickly**, I would like to **have a dedicated home screen with clear module navigation, status information and contextual actions**.
- **Epic:** EPIC-04
- **Priority:** High
- **Complexity:** High
- **Acceptance Criteria:**
  - [ ] The application launches into a stable PADD home screen.
  - [ ] Primary modules are reachable through consistent navigation.
  - [ ] Layout adapts to the selected tablet's dimensions and orientation.
  - [ ] Navigation and transient state survive relevant lifecycle events.
  - [ ] The shell remains useful without network access or AI services.
- **Notes:** The shell hosts feature modules; it should not absorb their domain logic.
- **Dependencies:** US-0302, US-0202.
- **Implementation issue:** [#8 — Build the PADD launcher and home shell](../../issues/8)
