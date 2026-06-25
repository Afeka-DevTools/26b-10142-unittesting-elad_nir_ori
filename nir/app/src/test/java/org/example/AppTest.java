package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void addHandlesPositiveNegativeAndZeroValues() {
        assertAll(
                () -> assertEquals(7, App.add(3, 4)),
                () -> assertEquals(-7, App.add(-3, -4)),
                () -> assertEquals(0, App.add(5, -5)),
                () -> assertEquals(9, App.add(9, 0))
        );
    }

    @Test
    void isPrimeRecognizesPrimeAndCompositeNumbers() {
        assertAll(
                () -> assertTrue(App.isPrime(2)),
                () -> assertTrue(App.isPrime(97)),
                () -> assertFalse(App.isPrime(1)),
                () -> assertFalse(App.isPrime(0)),
                () -> assertFalse(App.isPrime(-7)),
                () -> assertFalse(App.isPrime(100))
        );
    }

    @Test
    void reverseHandlesRegularEmptyAndUnicodeStrings() {
        assertAll(
                () -> assertEquals("avaJ", App.reverse("Java")),
                () -> assertEquals("", App.reverse("")),
                () -> assertEquals("אבהא", App.reverse("אהבא"))
        );
    }

    @Test
    void factorialCalculatesBaseAndPositiveCases() {
        assertAll(
                () -> assertEquals(1, App.factorial(0)),
                () -> assertEquals(1, App.factorial(1)),
                () -> assertEquals(120, App.factorial(5))
        );
    }

    @Test
    void factorialRejectsNegativeInput() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> App.factorial(-1));

        assertEquals("Negative number", exception.getMessage());
    }

    @Test
    void isPalindromeIgnoresCaseSpacesAndPunctuation() {
        assertAll(
                () -> assertTrue(App.isPalindrome("RaceCar")),
                () -> assertTrue(App.isPalindrome("A man, a plan, a canal: Panama!")),
                () -> assertTrue(App.isPalindrome("")),
                () -> assertFalse(App.isPalindrome("unit test"))
        );
    }

    @Test
    void fibonacciUpToReturnsValuesNotGreaterThanLimit() {
        assertIterableEquals(
                List.of(0, 1, 1, 2, 3, 5, 8, 13),
                App.fibonacciUpTo(13)
        );
        assertIterableEquals(List.of(0), App.fibonacciUpTo(0));
    }

    @Test
    void fibonacciUpToRejectsNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> App.fibonacciUpTo(-1));
    }

    @Test
    void charFrequencyCountsEveryCharacterExactly() {
        Map<Character, Integer> result = App.charFrequency("banana!");

        assertAll(
                () -> assertEquals(4, result.size()),
                () -> assertEquals(3, result.get('a')),
                () -> assertEquals(2, result.get('n')),
                () -> assertEquals(1, result.get('b')),
                () -> assertEquals(1, result.get('!')),
                () -> assertFalse(result.containsKey('x'))
        );
    }

    @Test
    void charFrequencyReturnsAnEmptyMapForEmptyInput() {
        assertTrue(App.charFrequency("").isEmpty());
    }

    @Test
    void isAnagramIgnoresCaseAndWhitespace() {
        assertAll(
                () -> assertTrue(App.isAnagram("Dormitory", "Dirty room")),
                () -> assertTrue(App.isAnagram("Listen", "Silent")),
                () -> assertFalse(App.isAnagram("Java", "JUnit")),
                () -> assertFalse(App.isAnagram("abc", "ab"))
        );
    }

    @Test
    void averageSupportsPositiveNegativeAndFractionalResults() {
        assertAll(
                () -> assertEquals(3.0, App.average(new int[]{1, 2, 3, 4, 5})),
                () -> assertEquals(-2.0, App.average(new int[]{-1, -2, -3})),
                () -> assertEquals(1.5, App.average(new int[]{1, 2}), 0.000001)
        );
    }

    @Test
    void averageRejectsAnEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> App.average(new int[]{}));
    }

    @Test
    void filterEvensPreservesOrderAndDuplicates() {
        List<Integer> input = List.of(5, 2, 4, 2, -6, 7);

        List<Integer> result = App.filterEvens(input);

        assertAll(
                () -> assertIterableEquals(List.of(2, 4, 2, -6), result),
                () -> assertNotSame(input, result)
        );
    }

    @Test
    void filterEvensReturnsEmptyListWhenThereAreNoEvenNumbers() {
        assertEquals(List.of(), App.filterEvens(List.of(1, 3, 5)));
    }

    @Test
    void mostCommonWordIgnoresCaseAndPunctuation() {
        String result = App.mostCommonWord("Java, tests! Java code; JAVA.");

        assertEquals("java", result);
        assertNotEquals("tests", result);
    }
}
