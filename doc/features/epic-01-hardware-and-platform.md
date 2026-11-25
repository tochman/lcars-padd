# EPIC-01: Hardware and platform

> Epic file — for an overview of all epics see [FEATURES.md](../FEATURES.md).

---

> Establish a reliable physical and operating-system foundation for the PADD. The selected tablet must be maintainable, supported by a suitable Android distribution and capable of delivering the intended always-available, touch-first experience.

**Stories:** US-0101, US-0102

**Status (2026-11-25):** 🚧 US-0101 in progress; US-0102 planned.

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

### Initial hardware assessment (2026-11-25)

The project owner's existing **Samsung Galaxy Tab A9+ 5G (SM-X216B)**, obtained through Telenor in Sweden, is the primary evaluation candidate. This is a candidate, not yet a final hardware/OS approval.

| Area | Finding |
|---|---|
| Display and form factor | Samsung Sweden lists an 11-inch 1920 x 1200 display with up to 90 Hz refresh rate. |
| Performance and storage | The model uses Qualcomm's Snapdragon 695 platform. Samsung lists 4 GB/64 GB and 8 GB/128 GB configurations for this model; the owner's exact configuration is not yet known. |
| Battery and connectivity | Samsung lists a 7040 mAh battery and 5G connectivity. |
| Device codename | `gta9p` is used by an unofficial community LineageOS device tree for SM-X216B; it is not an official LineageOS designation for a supported device. |
| OS support | SM-X216B is not listed as a supported device in the official LineageOS device directory. An unofficial `lineage-23.2` device tree exists for this exact model, but its source/build instructions do not establish that a complete ROM is released, bootable, or suitable for daily use. |
| Bootloader and recovery | Unlock availability has not been verified on this Swedish/Telenor unit. A community Galaxy Tab A9+ guide describes an unlock flow and warns that unlocking wipes the device and irreversibly trips Knox; it does not confirm this unit's CSC or current firmware. |
| Fallback | None selected. The existing tablet is the practical initial target; consider a fallback only if device-level validation or OS support fails. |

**Initial recommendation:** Proceed with the SM-X216B as the target for application work on Samsung's stock Android baseline, but do not approve a custom ROM or device-specific OS build yet. Before an OS decision, identify the installed RAM/storage and CSC, verify OEM unlocking availability without unlocking the bootloader, and validate a candidate build plus recovery on the actual device. Do not unlock or flash the owner's tablet without explicit approval.

**Evidence**
- [Samsung Sweden: Galaxy Tab A9+ 5G specifications](https://www.samsung.com/se/tablets/galaxy-tab-a/galaxy-tab-a9-plus-5g-mystic-navy-64gb-sm-x216bdbaeub/)
- [Samsung India: Galaxy Tab A9+ 5G specifications](https://www.samsung.com/in/tablets/galaxy-tab-a/galaxy-tab-a9-plus-5g-mystic-silver-64gb-sm-x216bzsains/)
- [Official LineageOS device directory](https://wiki.lineageos.org/devices/)
- [Unofficial SM-X216B `gta9p` LineageOS device tree and build instructions](https://github.com/bthavanish/android_device_samsung_gta9p/tree/lineage-23.2)
- [XDA community discussion: Galaxy Tab A9+ bootloader unlocking](https://xdaforums.com/t/unlocking-bootloader-on-galaxy-tab-a9-android-14.4678684/)

**US-0102: Establish the supported operating-system baseline** 📋 Planned
- As a **PADD maintainer**, in order to **run a secure and supportable Android platform**, I would like to **select and document the OS version and ROM strategy for the target tablet**.
- **Epic:** EPIC-01
- **Priority:** High
- **Complexity:** Medium
- **Background:** The target OS strategy depends on the exact device variant and its real maintenance status; choosing a ROM based only on brand or model family is not sufficient.
- **Acceptance Criteria:**
  - [ ] Exact device codename and supported variants are documented.
  - [ ] Official or community ROM availability and maintenance status are verified.
  - [ ] Android version, kernel/device-tree status and vendor firmware requirements are recorded.
  - [ ] Bootloader, installation, recovery and rollback constraints are documented.
  - [ ] A go/no-go recommendation is recorded for the chosen OS.
- **Notes:** LineageOS is preferred where device support is credible; it is not an unconditional requirement.
- **Dependencies:** US-0101.
- **Implementation issue:** [#3 — Define the LineageOS target and compatibility strategy](../../issues/3)
