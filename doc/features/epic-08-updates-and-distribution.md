# EPIC-08: Updates and distribution

> Epic file — for an overview of all epics see [FEATURES.md](../FEATURES.md).

---

> Provide a safe and maintainable way to distribute PADD application updates. Operating-system updates remain the responsibility of the device manufacturer or the user's chosen Android distribution. Updates must be verifiable, recoverable and understandable to the device owner.

**Stories:** US-0801

**Status (2026-11-25):** 📋 US-0801 planned.

## User Stories

**US-0801: Update the PADD application and device platform safely** 📋 Planned
- As a **PADD user or administrator**, in order to **keep PADD current without compromising application integrity**, I would like to **receive verifiable application updates through a documented and recoverable update process**.
- **Epic:** EPIC-08
- **Priority:** Medium
- **Complexity:** High
- **Background:** Application and operating-system updates have different trust and recovery requirements and must not be treated as one undifferentiated update mechanism.
- **Acceptance Criteria:**
  - [ ] The PADD application update strategy is documented independently of device OS updates.
  - [ ] PADD does not attempt to replace or silently manage manufacturer/ROM system updates.
  - [ ] Signing, artifact integrity and versioning requirements are defined.
  - [ ] Release channels and staged rollout options are documented.
  - [ ] Rollback and recovery behaviour is documented and tested where feasible.
  - [ ] Update prerequisites, including power and network requirements, are clear.
  - [ ] Updates do not silently bypass user or administrator control.
- **Notes:** Prefer standard Android app distribution and update mechanisms. Do not build an OS updater; system updates remain outside PADD's core responsibility.
- **Dependencies:** US-0201, US-0202.
- **Implementation issue:** [#13 — Define OTA updates, release and recovery distribution](../../issues/13)
