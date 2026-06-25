# Unit Testing Exercise

This project contains unit tests for the utility methods in
`app/src/main/java/org/example/App.java`.

## Team members

- Elad
- Nir
- Ori

## Requirements

- JDK 21 (the Gradle toolchain may download it automatically)
- Internet access on the first run so Gradle can resolve dependencies

## Running the tests

From inside the `nir` directory:

```bash
bash gradlew test
```

The HTML test report is generated at:

```text
app/build/reports/tests/test/index.html
```

## Test strategy

`AppTest.java` tests every public function in `App.java`:

- arithmetic: `add`, `factorial`, and `average`
- number processing: `isPrime` and `fibonacciUpTo`
- strings: `reverse`, `isPalindrome`, `isAnagram`, and `mostCommonWord`
- collections: `charFrequency` and `filterEvens`

The suite includes normal inputs, boundary values, negative inputs, empty
collections/strings, exception cases, case-insensitive text, punctuation,
ordering, and duplicate values. It uses varied JUnit assertions such as
`assertEquals`, `assertTrue`, `assertFalse`, `assertThrows`,
`assertIterableEquals`, `assertNotEquals`, `assertNotSame`, and `assertAll`.

The tests cover all methods and the important documented branches. This is a
strong baseline, but no finite test suite proves that a program has no bugs.
Additional tests would be appropriate if null handling, integer overflow,
Unicode normalization, tie-breaking in `mostCommonWord`, or behavior for empty
text were added to the specification.

## LLM usage

Codex was used to inspect the supplied implementation, replace the obsolete
generated test, propose boundary and error cases, write the JUnit 5 tests, and
review whether the resulting suite is sufficient. A summary of the interaction
is stored in
[`chats/codex-session.md`](chats/codex-session.md).
