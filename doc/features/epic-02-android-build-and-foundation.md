# EPIC-02: Android build and foundation

> Epic file — for an overview of all epics see [FEATURES.md](../FEATURES.md).

---

> Make the selected Android platform reproducible to build, install and validate. A known-good baseline is a prerequisite for application development and device-specific integration.

**Stories:** US-0201, US-0202

**Status (2026-11-25):** 📋 US-0201 and US-0202 planned.

## User Stories

**US-0201: Reproduce the Android build environment** 📋 Planned
- As a **PADD developer**, in order to **build and maintain the selected platform reliably**, I would like to **have a documented and reproducible build environment**.
- **Epic:** EPIC-02
- **Priority:** High
- **Complexity:** High
- **Acceptance Criteria:**
  - [ ] Host OS, required packages, JDK, repo tool and build dependencies are documented.
  - [ ] Source checkout and target configuration are scripted or unambiguously documented.
  - [ ] Vendor blob acquisition and provenance are documented.
  - [ ] Signing keys and credentials are excluded from source control and handled safely.
  - [ ] A clean build can be started by following the project instructions.
- **Notes:** Containerisation or other environment automation may be evaluated if it makes builds more reproducible.
- **Dependencies:** US-0101, US-0102.
- **Implementation issue:** [#4 — Establish a reproducible LineageOS build environment](../../issues/4)

**US-0202: Install and validate the baseline Android build** 📋 Planned
- As a **PADD developer**, in order to **know that the selected device is a sound foundation for the product**, I would like to **install and validate a clean baseline OS build before adding PADD-specific changes**.
- **Epic:** EPIC-02
- **Priority:** High
- **Complexity:** High
- **Acceptance Criteria:**
  - [ ] The device boots the agreed OS build.
  - [ ] Display, touch, Wi-Fi, audio, cameras, sensors, charging and sleep/wake are tested where applicable.
  - [ ] Installation, recovery and rollback procedures are documented and tested where feasible.
  - [ ] Build identifiers and image hashes are recorded.
  - [ ] A baseline test report is committed.
- **Dependencies:** US-0101, US-0102, US-0201.
- **Implementation issue:** [#5 — Produce and validate the baseline Android build](../../issues/5)
