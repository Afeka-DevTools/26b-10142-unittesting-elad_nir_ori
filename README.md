# 26B-10142 Unit Testing

## Team

Team name: `elad_nir_ori`

Known members:

- Ori Shohat - `orishohat`
- Nir - `nir786`

## Project Description

This repository contains a small Java/Gradle project with utility functions in
`app/src/main/java/org/example/App.java` and JUnit 5 unit tests in
`app/src/test/java/org/example/AppTest.java`.

The tests cover all public functions in `App.java`, including regular inputs,
boundary cases, empty inputs where relevant, and exception paths.

## How To Run The Tests

1. Clone the repository:

   ```bash
   git clone https://github.com/Afeka-DevTools/26b-10142-unittesting-elad_nir_ori.git
   cd 26b-10142-unittesting-elad_nir_ori
   ```

2. Make sure Java 21 is installed:

   ```bash
   java -version
   ```

   The project configures a Java 21 toolchain in Gradle.

3. Run all tests:

   ```bash
   ./gradlew test
   ```

4. Optional: inspect the HTML test report:

   ```bash
   open app/build/reports/tests/test/index.html
   ```

## LLM Documentation

- Part 2 self-learning conversation: `chats/LEARNING_CHAT.md`
- Public Part 2 ChatGPT share link: https://chatgpt.com/share/6a3d4321-ec0c-83eb-b1f5-e9a2d3d26fd3
- Part 2 learning summary: `logs/LEARNING.md`
- Part 3 test-writing conversation and coverage notes: `logs/COPILOT.md`
