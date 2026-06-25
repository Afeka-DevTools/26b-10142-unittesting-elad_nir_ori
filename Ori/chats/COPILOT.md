# COPILOT

This file documents the LLM-assisted test-writing stage for Part 3.

## Tool And Goal

Tool used: Codex.

Goal: replace the generated starter test with meaningful JUnit 5 tests for all
public methods in `App.java`.

## Test Coverage Plan

| Method | Covered behavior |
| --- | --- |
| `add` | Positive values, negative values, zero |
| `isPrime` | Values below 2, primes, composites, square composite |
| `reverse` | Regular string, empty string, spaces |
| `factorial` | `0`, `1`, positive number, negative exception |
| `isPalindrome` | Case-insensitive palindrome, punctuation, empty string, false cases |
| `fibonacciUpTo` | Limit `0`, limit `1`, normal limit, negative exception |
| `charFrequency` | Empty input, repeated characters, case sensitivity, spaces |
| `isAnagram` | Ignores spaces and case, does not ignore punctuation, false case |
| `average` | Normal average, negative values, single element, empty exception |
| `filterEvens` | Preserves even values in order, no evens, empty list |
| `mostCommonWord` | Ignores case and punctuation, single word |

## Assertions Used

- `assertEquals` for exact numeric, string, list, and map results.
- `assertTrue` and `assertFalse` for boolean methods.
- `assertThrows` for exception paths.

## Verification

The final test suite was run with:

```bash
./gradlew test
```

Result: build successful, all tests passed.
