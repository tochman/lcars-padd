# LCARS PADD

An Android-based, tablet-first PADD experience with an LCARS-inspired interface, built natively with Kotlin and Jetpack Compose.

The project explores a dedicated tablet environment running on supported Android hardware, with LineageOS as the preferred operating-system baseline where device support allows it.

## Project direction

- A focused, touch-first PADD interface for tablet hardware.
- Native Android application architecture using Kotlin and Jetpack Compose.
- A modular shell for communications, science, device information and other capabilities.
- Optional voice interaction with clear privacy and permission boundaries.
- Local-first operation, avoiding unnecessary cloud services and background processing.
- A maintainable installation, update and recovery path.

## Design reference

The visual language is based on the LCARS-inspired design system developed in [T.H.A.D.E.U.S.](https://github.com/tochman/ai-dlc-thadeus). PADD will translate its design principles and tokens into native Android components; it will not depend on the T.H.A.D.E.U.S. application at runtime.

The project must not use Star Trek names, ship insignia, logos, sounds or other protected franchise assets.

## Documentation

- [Features and epics](doc/FEATURES.md) — product scope, epic overview and links to user stories.
- [Feature documentation](doc/features/) — one document per epic, including user stories, acceptance criteria, decisions and dependencies.

The issue tracker is used for implementation work and discussion. The feature documents are the durable description of what the product should do and why.

## Initial technical direction

- **Platform:** Android
- **Preferred OS:** LineageOS, subject to hardware support
- **Language:** Kotlin
- **UI:** Jetpack Compose
- **Architecture:** Modular, local-first, privacy-conscious

Hardware and OS choices remain provisional until the compatibility assessment is complete.

## Project status

The project is in its initial discovery and architecture phase. See [EPIC-01](doc/features/epic-01-hardware-and-platform.md) and the [feature overview](doc/FEATURES.md) for the current scope.
