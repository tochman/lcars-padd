# EPIC-02: Android application foundation

> Epic file — for an overview of all epics see [FEATURES.md](../FEATURES.md).

---

> Establish a reproducible native Android application foundation and verify that PADD can be installed and operated across a representative range of Android tablets. The project builds an application, not a custom Android distribution.

**Stories:** US-0201, US-0202

**Status (2026-11-25):** 📋 US-0201 and US-0202 planned.

## Architectural decision

PADD is a hardware-independent Android application. The project does not require building, forking or distributing LineageOS or another Android ROM. A standard Android SDK/Gradle toolchain is the default development and delivery path.

LineageOS and manufacturer-specific Android distributions may be included in compatibility testing where useful, but they are optional environments rather than prerequisites.

## User Stories

**US-0201: Build the PADD Android application reproducibly** 📋 Planned
- As a **PADD developer**, in order to **build and maintain the application consistently**, I would like to **have a documented and reproducible Android development and build environment**.
- **Epic:** EPIC-02
- **Priority:** High
- **Complexity:** Medium
- **Background:** A reliable application build should be reproducible without requiring contributors to build or modify an entire Android operating system.
- **Acceptance Criteria:**
  - [ ] Required JDK, Android SDK, Gradle and build-tool versions are documented and pinned appropriately.
  - [ ] A clean checkout can build the application by following the project instructions.
  - [ ] Debug and release build variants are defined.
  - [ ] Signing credentials and secrets are excluded from source control and handled safely.
  - [ ] Build outputs and version identifiers can be verified.
  - [ ] CI can execute the standard build and automated test tasks.
- **Notes:** Prefer the standard Android Gradle Plugin toolchain. Containerisation may be evaluated if it improves reproducibility without complicating Android SDK use.
- **Dependencies:** None.
- **Implementation issue:** [#4 — Establish a reproducible Android application build environment](../../issues/4)

**US-0202: Validate PADD across Android tablet configurations** 📋 Planned
- As a **PADD developer**, in order to **deliver a consistent experience across different Android tablets**, I would like to **validate installation, core interactions and adaptive layouts on representative devices and configurations**.
- **Epic:** EPIC-02
- **Priority:** High
- **Complexity:** High
- **Background:** Emulator testing alone cannot expose every variation in manufacturer software, touch behaviour, hardware capability, power management and system integration.
- **Acceptance Criteria:**
  - [ ] A representative test matrix covers different screen sizes, aspect ratios, Android API levels and hardware capabilities.
  - [ ] The application installs, launches and operates on each supported reference configuration.
  - [ ] Portrait, landscape, resizing and relevant window configurations are tested.
  - [ ] Missing optional hardware capabilities do not prevent core application use.
  - [ ] Installation and upgrade behaviour is tested using standard Android distribution mechanisms.
  - [ ] Known incompatibilities and minimum requirements are documented.
- **Notes:** Reference devices are test fixtures, not exclusive product targets. Compatibility should be described by Android version, API availability and capabilities rather than by a single approved model.
- **Dependencies:** US-0201 and the compatibility requirements established in EPIC-01.
- **Implementation issue:** [#5 — Validate PADD on representative Android tablets](../../issues/5)
