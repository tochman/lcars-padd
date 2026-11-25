# EPIC-06: Communications and science

> Epic file — for an overview of all epics see [FEATURES.md](../FEATURES.md).

---

> Provide modular PADD surfaces for communications and science-oriented information. Each domain should have a clear responsibility, consistent integration with the PADD shell and a useful initial vertical slice before live integrations are introduced.

**Stories:** US-0601, US-0602

**Status (2026-11-25):** 📋 US-0601 and US-0602 planned.

## Cross-cutting acceptance criteria

- [ ] Each module has a documented responsibility and a clear boundary from the PADD shell.
- [ ] Both modules follow the approved design system and navigation conventions.
- [ ] Loading, empty, error and offline states are handled.
- [ ] Data sources, permissions and privacy implications are documented before live integrations.
- [ ] Test data is clearly identified and cannot be mistaken for live information.

## User Stories

**US-0601: Access a communications module** 📋 Planned
- As a **PADD user**, in order to **reach communication-related information and functions from the PADD**, I would like to **have a dedicated communications module integrated into the PADD shell**.
- **Epic:** EPIC-06
- **Priority:** Medium
- **Complexity:** High
- **Background:** Communications is a distinct PADD capability. Its first slice should establish module boundaries and interaction patterns without assuming a particular live service.
- **Acceptance Criteria:**
  - [ ] The communications module has a documented initial scope and responsibility.
  - [ ] The module can be opened from the PADD shell and follows its navigation model.
  - [ ] An initial vertical slice demonstrates the agreed module structure using local or test data.
  - [ ] The module handles loading, empty, error and offline states.
  - [ ] Any proposed live communication service, account access or notification integration has documented permissions and privacy implications before implementation.
- **Notes:** The exact communication capabilities are intentionally not prescribed yet; refine them from concrete use cases rather than assuming a messaging provider or protocol.
- **Dependencies:** US-0302, US-0401.
- **Implementation issues:** [#11 — Define shared module contracts](../../issues/11), [#14 — Build the communications module slice](../../issues/14)

**US-0602: Access a science information module** 📋 Planned
- As a **PADD user**, in order to **inspect science-oriented readings and information**, I would like to **have a dedicated science module with structured information displays**.
- **Epic:** EPIC-06
- **Priority:** Medium
- **Complexity:** High
- **Background:** Science-oriented information has different data and presentation needs from communications and should be developed as its own module.
- **Acceptance Criteria:**
  - [ ] The science module has a documented initial scope and responsibility.
  - [ ] The module can be opened from the PADD shell and follows its navigation model.
  - [ ] An initial vertical slice presents structured local or test data in an appropriate readout or visualisation.
  - [ ] The module handles loading, empty, error and offline states.
  - [ ] Data provenance, units, refresh behaviour and any required permissions are documented before live data sources are integrated.
- **Notes:** Candidate capabilities may include structured readings, charts or reference information; select the first use case explicitly before implementation.
- **Dependencies:** US-0302, US-0401.
- **Implementation issues:** [#11 — Define shared module contracts](../../issues/11), [#15 — Build the science module slice](../../issues/15)
