# LEARNING

This file summarizes the Part 2 self-learning stage.

## What I Learned

Unit testing checks a small unit of code, usually one method, in isolation. A
good unit test has a clear input, a clear expected result, and an assertion that
compares the actual result with the expected behavior.

In JUnit 5:

- `@Test` marks a method as a test.
- `assertEquals` checks exact expected values.
- `assertTrue` and `assertFalse` check boolean results.
- `assertThrows` checks expected exception paths.
- `assertNotNull` checks that an object exists.

## Edge Cases

The most important edge cases in this project were:

- Negative numbers for methods that reject them.
- Empty arrays, empty strings, and empty lists.
- Boundary values such as `0`, `1`, and `2`.
- Strings with spaces, case differences, and punctuation.
- Composite numbers, prime numbers, and square composite numbers.

## How I Checked Sufficiency

I reviewed every public method in `App.java` and listed its possible behavior:

- Normal return value.
- Boolean true and false branches.
- Empty or boundary input.
- Exception path, when the method defines one.

Then I wrote tests so each behavior had at least one matching assertion.

The final verification command was:

```bash
./gradlew test
```

It passed successfully when run with Java 21.

## Chat Documentation

The full prompt and learning record are documented in `chats/LEARNING_CHAT.md`.
The public ChatGPT share link is:

https://chatgpt.com/share/6a3d4321-ec0c-83eb-b1f5-e9a2d3d26fd3
