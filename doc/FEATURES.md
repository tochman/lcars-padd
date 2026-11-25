# LCARS PADD — Features

This document is the product feature overview. It lists the project's epics and provides the entry point to their user stories.

The product vision and repository introduction are documented in the [README](../README.md). Each epic has a separate document under `doc/features/`.

## Epics

| Epic | Topic | Description | Status |
|---|---|---|---|
| [EPIC-01](features/epic-01-hardware-and-platform.md) | Hardware and platform | Select the target tablet and establish a supported Android/LineageOS baseline. | 📋 Planned |
| [EPIC-02](features/epic-02-android-build-and-foundation.md) | Android build and foundation | Make the OS build and baseline installation reproducible and verifiable. | 📋 Planned |
| [EPIC-03](features/epic-03-lcars-design-system.md) | LCARS design system | Specify and implement the native Jetpack Compose design system. | 📋 Planned |
| [EPIC-04](features/epic-04-padd-shell.md) | PADD shell | Build the tablet-first launcher, home screen and navigation. | 📋 Planned |
| [EPIC-05](features/epic-05-system-integration-and-diagnostics.md) | System integration and diagnostics | Integrate with Android system capabilities and expose local device diagnostics. | 📋 Planned |
| [EPIC-06](features/epic-06-communications-and-science.md) | Communications and science | Provide modular communications and science-oriented experiences. | 📋 Planned |
| [EPIC-07](features/epic-07-voice-interface.md) | Voice interface | Add optional, privacy-conscious voice interaction. | 📋 Planned |
| [EPIC-08](features/epic-08-updates-and-distribution.md) | Updates and distribution | Define safe application and operating-system update processes. | 📋 Planned |

## How to read the feature documentation

Each epic document contains:
- A concise description of the intended outcome and user value.
- A list of its user stories.
- Epic status and relevant decisions.
- User stories written from an actor's perspective, with priority, complexity, acceptance criteria, notes and dependencies.

Status markers:
- 📋 Planned
- 🚧 In progress
- ✅ Done (implemented and merged)
- 🚀 Deployed (for projects using continuous deployment)

For projects using releases, a completed story can additionally be marked with `Released in vX.Y.Z`.

Epics are organised by product area, not by release. A release may contain stories from several epics.

## Project tracking

- [EPIC-00: Project umbrella and initial delivery scope](../issues/1)
- [All issues](../issues)

The issue tracker records implementation tasks and discussion. These feature documents remain the source of truth for product intent, user stories and acceptance criteria.
