# EPIC-01: Hardware and platform

> Epic file — for an overview of all epics see [FEATURES.md](../FEATURES.md).

---

> Establish a reliable physical and operating-system foundation for the PADD. The selected tablet must be maintainable, supported by a suitable Android distribution and capable of delivering the intended always-available, touch-first experience.

**Stories:** US-0101, US-0102

**Status (2026-11-25):** 📋 US-0101 and US-0102 planned.

## User Stories

**US-0101: Select the target PADD tablet** 📋 Planned
- As a **PADD project owner**, in order to **build on hardware that can be maintained over time**, I would like to **select a tablet based on verified technical compatibility, usability and availability**.
- **Epic:** EPIC-01
- **Priority:** High
- **Complexity:** Medium
- **Background:** The hardware decision constrains display layout, device permissions, performance, power use and every device-specific implementation choice.
- **Acceptance Criteria:**
  - [ ] Candidate tablets are compared for bootloader access, community support, display, performance, battery, connectivity and sensors.
  - [ ] LineageOS or a viable Android alternative is verified for the exact model and regional variant.
  - [ ] The selected model, memory/storage configuration and device codename are documented.
  - [ ] Known limitations, accessories and recovery risks are recorded.
  - [ ] A primary target and, where practical, a fallback are identified.
- **Notes:** Hardware-dependent decisions should remain provisional until evidence has been collected.
- **Dependencies:** None.
- **Implementation issue:** [#2 — Select tablet hardware and define the device baseline](../../issues/2)

**US-0102: Establish the supported operating-system baseline** 📋 Planned
- As a **PADD maintainer**, in order to **run a secure and supportable Android platform**, I would like to **select and document the OS version and ROM strategy for the target tablet**.
- **Epic:** EPIC-01
- **Priority:** High
- **Complexity:** Medium
- **Acceptance Criteria:**
  - [ ] Exact device codename and supported variants are documented.
  - [ ] Official or community ROM availability and maintenance status are verified.
  - [ ] Android version, kernel/device-tree status and vendor firmware requirements are recorded.
  - [ ] Bootloader, installation, recovery and rollback constraints are documented.
  - [ ] A go/no-go recommendation is recorded for the chosen OS.
- **Notes:** LineageOS is preferred where device support is credible; it is not an unconditional requirement.
- **Dependencies:** US-0101.
- **Implementation issue:** [#3 — Define the LineageOS target and compatibility strategy](../../issues/3)
