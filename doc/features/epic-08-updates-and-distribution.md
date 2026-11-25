# EPIC-08: Updates and distribution

> Epic file — for an overview of all epics see [FEATURES.md](../FEATURES.md).

---

> Provide a safe and maintainable way to distribute PADD application updates and, where applicable, operating-system updates. Updates must be verifiable, recoverable and understandable to the device owner.

**Stories:** US-0801

**Status (2026-11-25):** 📋 US-0801 planned.

## User Stories

**US-0801: Update the PADD application and device platform safely** 📋 Planned
- As a **PADD administrator**, in order to **keep devices maintained without compromising their integrity**, I would like to **have a documented and recoverable update process for the application and operating system**.
- **Epic:** EPIC-08
- **Priority:** Medium
- **Complexity:** High
- **Acceptance Criteria:**
  - [ ] Application updates and OS/firmware updates have separate strategies.
  - [ ] Signing, artifact integrity and versioning requirements are defined.
  - [ ] Release channels and staged rollout options are documented.
  - [ ] Rollback and recovery behaviour is documented and tested where feasible.
  - [ ] Update prerequisites, including power and network requirements, are clear.
  - [ ] Updates do not silently bypass user or administrator control.
- **Notes:** A custom updater should not be built until the selected device and ROM update path are understood.
- **Dependencies:** US-0101, US-0102, US-0201, US-0202.
- **Implementation issue:** [#13 — Define OTA updates, release and recovery distribution](../../issues/13)
