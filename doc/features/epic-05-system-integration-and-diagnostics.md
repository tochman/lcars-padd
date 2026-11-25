# EPIC-05: System integration and diagnostics

> Epic file — for an overview of all epics see [FEATURES.md](../FEATURES.md).

---

> Make the PADD feel like a focused device while retaining safe and supportable access to Android. Provide useful local insight into device health without unnecessary data collection.

**Stories:** US-0501, US-0502

**Status (2026-11-25):** 📋 US-0501 and US-0502 planned.

## User Stories

**US-0501: Integrate the PADD with Android system behaviour** 📋 Planned
- As a **PADD administrator**, in order to **provide a focused device experience**, I would like to **configure appropriate Android system behaviours such as immersive mode, kiosk operation and launcher integration**.
- **Epic:** EPIC-05
- **Priority:** Medium
- **Complexity:** High
- **Background:** Some desired device behaviours are not available to ordinary Android applications. The project must understand platform boundaries before choosing an implementation.
- **Acceptance Criteria:**
  - [ ] A capability matrix distinguishes ordinary app features from device-owner and system-image capabilities.
  - [ ] Requirements for permissions, provisioning and privileged integration are documented.
  - [ ] No undocumented privilege escalation is required.
  - [ ] Safe escape, maintenance and recovery paths are defined.
  - [ ] Implemented behaviours are validated on representative Android versions and device configurations.
- **Dependencies:** Android compatibility requirements from EPIC-01, US-0401. Any privileged integration remains optional.
- **Implementation issue:** [#9 — Investigate and implement SystemUI integration](../../issues/9)

**US-0502: Inspect device health and diagnostics locally** 📋 Planned
- As a **PADD user or maintainer**, in order to **understand the tablet's operational state**, I would like to **see relevant device health indicators and inspect diagnostic information locally**.
- **Epic:** EPIC-05
- **Priority:** Medium
- **Complexity:** Medium
- **Background:** Device health is useful to both users and maintainers, but diagnostics must not become an unnecessary telemetry or data-collection system.
- **Acceptance Criteria:**
  - [ ] The diagnostics view shows supported battery, charging, storage, memory, thermal, connectivity and sensor information.
  - [ ] Unsupported or permission-restricted metrics are clearly identified.
  - [ ] Logs can be inspected or exported through an explicit action without exposing secrets or personal content.
  - [ ] Sampling frequency and battery impact are documented.
  - [ ] Data remains local by default; remote transmission requires a separately approved design.
- **Dependencies:** US-0401. Device metrics must be capability-detected and unavailable metrics must not impair core use.
- **Implementation issue:** [#10 — Add device telemetry and engineering diagnostics](../../issues/10)
