# HW2 - Ori Shohat

Individual HW2 submission for the Gradle Unit Testing assignment.

All Ori-specific work is stored under this top-level `Ori/` folder.

## Structure

```text
Ori/
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

`app/src/test/java/org/example/AppTest.java` contains JUnit 5 tests for all
public methods in `App.java`:

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

The tests use `assertEquals`, `assertTrue`, `assertFalse`, and `assertThrows`.
The suite includes regular cases, boundary cases, empty inputs, and exception
paths where relevant.

## LLM Documentation

The learning and implementation chat records are stored here:

- `chats/LEARNING.md`
- `chats/COPILOT.md`
- `logs/LEARNING.md`
- `logs/COPILOT.md`

Public Part 2 ChatGPT share link:

https://chatgpt.com/share/6a3d4321-ec0c-83eb-b1f5-e9a2d3d26fd3

## How To Run

From the repository root:

```bash
cd Ori
chmod +x gradlew
./gradlew test
```

If the local machine uses a newer Java version and Gradle fails before
configuration, run with Java 21:

```bash
cd Ori
JAVA_HOME=/path/to/jdk-21 ./gradlew test
```

## Verified Result

The suite was verified with Java 21:

```text
BUILD SUCCESSFUL
```
