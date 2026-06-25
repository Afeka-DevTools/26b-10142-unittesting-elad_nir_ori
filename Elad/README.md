# HW2 - Elad Rosenbush

Individual HW2 submission for the Gradle Unit Testing assignment.

All Elad-specific work is stored under this top-level `Elad/` folder.

## Structure

```text
Elad/
├── README.md
├── app/
│   └── src/
│       ├── main/java/org/example/App.java
│       └── test/java/org/example/AppTest.java
├── chats/
│   ├── COPILOT.md
│   └── LEARNING.md
├── logs/
│   ├── COPILOT.md
│   └── LEARNING.md
├── gradle/
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle.kts
```

## What Was Implemented

`app/src/test/java/org/example/AppTest.java` contains JUnit 5 tests for all public methods in `App.java`:

- `add`
- `isPrime`
- `reverse`
- `factorial`
- `isPalindrome`
- `fibonacciUpTo`
- `charFrequency`
- `isAnagram`
- `average`
- `filterEvens`
- `mostCommonWord`

The tests use:

- `assertEquals`
- `assertTrue`
- `assertFalse`
- `assertThrows`

The test suite includes regular cases, boundary cases, and exception cases where relevant.

## LLM Documentation

The learning and implementation chat records are stored here:

- `chats/LEARNING.md`
- `chats/COPILOT.md`
- `logs/LEARNING.md`
- `logs/COPILOT.md`

The ChatGPT share links are included inside those files.

## How To Run

From the repository root:

```bash
cd Elad
chmod +x gradlew
./gradlew test
```

If the local machine uses Java 25 and Gradle fails before configuration, run with Java 21:

```bash
cd Elad
JAVA_HOME=/path/to/jdk-21 ./gradlew test
```

## Verified Result

The suite was verified with Java 21:

```text
BUILD SUCCESSFUL
17 tests, 0 failures, 0 errors, 0 skipped
```
