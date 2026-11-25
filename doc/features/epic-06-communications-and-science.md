# EPIC-06: Communications and science

> Epic file — for an overview of all epics see [FEATURES.md](../FEATURES.md).

---

> Provide modular PADD surfaces for communications and science-oriented information. The initial experience should establish clear module boundaries and useful offline/test-data flows before live integrations are introduced.

**Stories:** US-0601

**Status (2026-11-25):** 📋 US-0601 planned.

## User Stories

**US-0601: Access communications and science modules** 📋 Planned
- As a **PADD user**, in order to **use the tablet for communication and information**, I would like to **access dedicated communications and science modules from the PADD shell**.
- **Epic:** EPIC-06
- **Priority:** Medium
- **Complexity:** High
- **Acceptance Criteria:**
  - [ ] Communications and science modules have documented responsibilities and boundaries.
  - [ ] Both modules are reachable from the PADD shell.
  - [ ] Each has an initial working vertical slice using local or test data.
  - [ ] Loading, empty, error and offline states are handled.
  - [ ] Data sources, permissions and privacy requirements are documented before live integrations are added.
- **Notes:** The exact communications and science capabilities should be refined as concrete use cases are agreed.
- **Dependencies:** US-0302, US-0401.
- **Implementation issue:** [#11 — Implement communications and science modules](../../issues/11)
