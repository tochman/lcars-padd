# LCARS PADD

An Android tablet application that brings an LCARS-inspired PADD experience to a broad range of Android-based tablets.

The product is designed to be hardware-independent. It should run on most supported Android tablets without requiring a specific manufacturer, model, custom ROM or device-specific operating-system image.

## Project direction

- A focused, touch-first PADD experience for Android tablets.
- Native Android application architecture using Kotlin and Jetpack Compose.
- Adaptive layouts for different screen sizes, resolutions, aspect ratios and orientations.
- Runtime detection of device capabilities, with graceful handling when hardware features are unavailable.
- A modular shell for communications, science, device information and other capabilities.
- Optional voice interaction with clear privacy and permission boundaries.
- Local-first operation, avoiding unnecessary cloud services and background processing.
- A maintainable application installation and update path.

## Compatibility approach

Android tablet compatibility is a product requirement, not a hardware-selection exercise. Development and testing may use a small set of representative reference devices, but no single device defines the architecture or limits the intended product audience.

The application should use standard Android APIs wherever possible. Manufacturer-specific behaviour, custom ROM features, device-owner provisioning and privileged system integrations are optional capabilities and must never be assumed for the core experience.

LineageOS may be used as one test environment or optional deployment target. It is not a prerequisite for running PADD.

## Design reference

The visual language is based on the LCARS-inspired design system developed in [T.H.A.D.E.U.S.](https://github.com/tochman/ai-dlc-thadeus). PADD will translate its design principles and tokens into native Android components; it will not depend on the T.H.A.D.E.U.S. application at runtime.

The project must not use Star Trek names, ship insignia, logos, sounds or other protected franchise assets.

## Documentation

- [Features and epics](doc/FEATURES.md) — product scope, epic overview and links to user stories.
- [Feature documentation](doc/features/) — one document per epic, including user stories, acceptance criteria, decisions and dependencies.

The issue tracker is used for implementation work and discussion. The feature documents are the durable description of what the product should do and why.

## Initial technical direction

- **Platform:** Android tablets
- **Language:** Kotlin
- **UI:** Jetpack Compose
- **Architecture:** Modular, adaptive, local-first and privacy-conscious
- **Compatibility:** Broad Android tablet support, subject to a documented minimum Android version and API availability

The minimum Android version and detailed compatibility policy will be established through the platform compatibility work. No particular tablet model or Android distribution is a product prerequisite.

## Build and run the preview

The current app scaffold uses a provisional minimum Android API level of 26; this is a development setting, not the final compatibility commitment. It uses JDK 17 or newer, Gradle 9.8.0 (pinned by the wrapper), Android Gradle Plugin 9.5.0, Kotlin Compose compiler plugin 2.4.10, and Android SDK Platform 37.

```sh
./gradlew :app:assembleDebug
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

To run the Compose UI test on a connected device or emulator:

```sh
./gradlew :app:connectedDebugAndroidTest
```

## Project status

The first Compose preview is a UI scaffold; it does not yet read device or network data or provide functional feature modules. See [EPIC-01](doc/features/epic-01-hardware-and-platform.md), [EPIC-02](doc/features/epic-02-android-build-and-foundation.md) and the [feature overview](doc/FEATURES.md) for current scope.
