# EPIC-01: Android compatibility

> Epic file — for an overview of all epics see [FEATURES.md](../FEATURES.md).

---

> Define the Android platform and compatibility contract for PADD as a native application. PADD should work across a representative range of Android tablets without requiring a project-selected device, custom ROM, or privileged system image.

**Stories:** US-0101, US-0102

**Status (2026-11-25):** 📋 US-0101 and US-0102 planned.

## Architectural direction

PADD is a hardware-independent Android application. The project does not build, fork, install, or distribute Android or LineageOS images. Users remain responsible for their device and operating-system updates; PADD uses standard Android application installation and update mechanisms.

Compatibility is defined by Android platform versions, adaptive layout behaviour, and runtime-detected capabilities rather than by a single tablet model or vendor ROM. LineageOS and manufacturer-specific distributions may be included in testing where useful, but they are not prerequisites. Specific devices may be used as test fixtures, but none is an exclusive product target.

## User Stories

**US-0101: Define the Android tablet compatibility matrix** 📋 Planned
- As a **PADD developer**, in order to **support a range of Android tablets predictably**, I would like to **have documented platform requirements and a representative reference-device matrix**.
- **Epic:** EPIC-01
- **Priority:** High
- **Complexity:** Medium
- **Background:** Build and UI decisions must accommodate a range of Android versions, screen sizes, densities, orientations and window configurations rather than one selected tablet.
- **Acceptance Criteria:**
  - [ ] A compatibility policy and representative test matrix are documented.
  - [ ] The minimum Android version and API requirements are proposed for review.
  - [ ] The matrix covers materially different tablet form factors, screen sizes, memory profiles, Android versions and optional hardware capabilities.
  - [ ] Optional hardware capabilities are identified separately from core application requirements.
  - [ ] Reference devices are explicitly described as test fixtures, not exclusive supported models.
  - [ ] Known limitations and a process for adding tested devices and reporting compatibility are documented.
- **Dependencies:** None.
- **Implementation issue:** [#2 — Define the Android tablet compatibility and reference-device matrix](../../issues/2)

**US-0102: Define the Android API and device-capability strategy** 📋 Planned
- As a **PADD developer**, in order to **keep core functionality available across different tablets**, I would like to **have documented API requirements and a strategy for detecting optional device capabilities**.
- **Epic:** EPIC-01
- **Priority:** High
- **Complexity:** Medium
- **Background:** Sensors, microphones, cellular connectivity and privileged system controls vary across tablets and Android distributions; they must not be assumed for core application use.
- **Acceptance Criteria:**
  - [ ] Minimum and target Android API levels are documented with rationale.
  - [ ] Core, optional and unsupported capabilities are classified.
  - [ ] Permission and capability detection requirements are documented.
  - [ ] No core feature depends on undocumented or manufacturer-specific APIs.
  - [ ] Optional privileged integrations have explicit compatibility boundaries.
  - [ ] The compatibility strategy does not require a custom ROM or OS image.
- **Dependencies:** US-0101.
- **Implementation issue:** [#3 — Define Android API and device-capability compatibility](../../issues/3)

## Candidate test fixtures

The Samsung Galaxy Tab A9+ 5G (SM-X216B) is one potential test fixture. It does not define the supported-device boundary or require a custom ROM. Its exact RAM/storage and regional software configuration need to be recorded only if used for device-specific manual validation. No bootloader unlock or firmware modification is required by this epic.

## References

- [Android large-screen app quality guidelines](https://developer.android.com/docs/quality-guidelines/large-screen-app-quality)
- [Adaptive layouts in Compose](https://developer.android.com/develop/ui/compose/layouts/adaptive)
