# LCARS PADD — Features

This document is the functional overview of the LCARS PADD project. It describes the intended capabilities and links each area to its implementation issue.

The project is an Android-based tablet experience with an LCARS-inspired interface. The initial target is a supported tablet running LineageOS, with a native Android application built using Kotlin and Jetpack Compose.

## Project goals

- Create a focused, tablet-first PADD interface.
- Use a native Android implementation rather than embedding a web application as the primary UI.
- Establish a maintainable OS and hardware baseline.
- Provide modular information and utility surfaces for communications, science and device status.
- Support voice interaction as an optional, privacy-conscious input method.
- Keep the initial system local-first and avoid unnecessary cloud dependencies.

## Design language

The visual language is derived from the existing T.H.A.D.E.U.S. project:

- Repository: https://github.com/tochman/ai-dlc-thadeus
- Design tokens and styles: `src/renderer/theme.css`
- Reusable LCARS components: `src/renderer/Lcars.jsx`
- Dialog patterns: `src/renderer/LcarsDialog.jsx`
- Design documentation: `docs/features/epic-04-branding-and-desktop.md`

T.H.A.D.E.U.S. is a design reference, not a runtime dependency. PADD will implement the design system natively in Jetpack Compose. The Android implementation should preserve the established visual principles while adapting layout, navigation and interaction to touch-first tablet use.

The project uses an LCARS-inspired visual language. It must not use Star Trek names, ship insignia, logos, sounds or other protected franchise assets.

## Feature areas

### Hardware and operating system

Select a tablet model and establish a supported operating-system baseline. Validate device-specific support, hardware functionality, installation and recovery before committing to deeper platform integration.

Related issues:
- [PADD-001: Select tablet hardware and define the device baseline](../issues/2)
- [PADD-002: Define the LineageOS target and compatibility strategy](../issues/3)
- [PADD-003: Establish a reproducible LineageOS build environment](../issues/4)
- [PADD-004: Produce and validate the baseline Android build](../issues/5)

### LCARS design system

Translate the T.H.A.D.E.U.S. design language into a platform-neutral specification and implement it as a reusable native Compose component library.

Expected component families include:
- Panels, frames and elbow-shaped containers
- Navigation elements and action controls
- Segmented bars and status indicators
- Readout tables and data displays
- Meters and progress indicators
- Section headings and dialogs

Controls must be distinguishable from passive readouts. Accessibility, contrast, focus indication, touch targets and reduced-motion behaviour are part of the design system.

Related issues:
- [PADD-005: Specify the LCARS-inspired design system for Android](../issues/6)
- [PADD-006: Implement the native LCARS Compose component library](../issues/7)

### PADD launcher and home shell

Provide the main entry point and navigation framework for the PADD experience. The shell hosts feature modules, status information and primary actions, and adapts to the selected tablet's dimensions and orientation.

The shell should remain useful without network access or AI services.

Related issue:
- [PADD-007: Build the PADD launcher and home shell](../issues/8)

### Android system integration

Evaluate system-level customisation such as immersive mode, kiosk behaviour, status and navigation bars, notifications, lock-screen behaviour and default launcher configuration.

Distinguish ordinary application capabilities from features that require device-owner provisioning, privileged permissions or a custom OS image. Preserve documented maintenance and recovery paths.

Related issue:
- [PADD-008: Investigate and implement SystemUI integration](../issues/9)

### Device telemetry and diagnostics

Provide a local engineering view of relevant device health information, such as battery, charging, storage, memory, thermal state, connectivity and supported sensor status.

Diagnostics should be privacy-conscious, avoid unnecessary polling and make export an explicit action. Local operation is the default; remote transmission requires a separately approved design.

Related issue:
- [PADD-009: Add device telemetry and engineering diagnostics](../issues/10)

### Communications and science modules

Provide modular surfaces for communication-related functions and science-oriented information. Initial implementations may use local or test data while module boundaries and data contracts are established.

Each module should handle loading, empty, error and offline states and should document data sources and permissions before live integrations are introduced.

Related issue:
- [PADD-010: Implement communications and science modules](../issues/11)

### Voice interface

Add optional voice interaction for a deliberately limited set of PADD functions. Separate speech capture, transcription, intent resolution and command execution.

The interface must communicate when the microphone is active, support cancellation and provide a complete non-voice alternative. Commands must be permission-checked, with confirmation for consequential actions. Local processing is preferred where practical.

Related issue:
- [PADD-011: Design and implement the voice interface](../issues/12)

### Updates and distribution

Define separate strategies for application updates and operating-system or firmware updates. Establish signing, artifact integrity, release channels, staged rollout and recovery requirements before implementing a custom update mechanism.

Related issue:
- [PADD-012: Define OTA updates, release and recovery distribution](../issues/13)

## Architecture principles

- **Native Android:** Kotlin and Jetpack Compose are the primary application technologies.
- **Local-first:** Core shell and modules should remain useful without cloud connectivity.
- **Modular:** Keep the launcher, feature modules and privileged platform integration separated.
- **Privacy-conscious:** Minimise collection and transmission of device and user data.
- **Accessible:** Include accessibility semantics, contrast, focus and reduced-motion support from the beginning.
- **Recoverable:** Document installation, update, maintenance and rollback procedures.
- **Evidence-led hardware choices:** Do not lock device-specific implementation until hardware and OS support have been verified.

## Initial delivery sequence

1. Select and validate the target hardware and OS baseline.
2. Establish a reproducible build environment and produce a working baseline image.
3. Specify the design system and implement the Compose component library.
4. Build the PADD shell and navigation.
5. Add system integration and device diagnostics.
6. Implement communications, science and voice capabilities.
7. Define and validate update and distribution procedures.

The issue tracker is the source of truth for task status, detailed scope, acceptance criteria and dependencies. This document provides the higher-level functional map and should be updated when the agreed product scope changes.

## Project tracking

- [EPIC-01: LCARS PADD — Android platform and experience](../issues/1)
- [All open issues](../issues)
