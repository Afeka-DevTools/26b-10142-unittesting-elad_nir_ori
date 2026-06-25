package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void addHandlesPositiveNegativeAndZeroValues() {
        assertEquals(9, App.add(4, 5));
        assertEquals(-3, App.add(-7, 4));
        assertEquals(0, App.add(0, 0));
    }

    @Test
    void isPrimeRejectsValuesBelowTwoAndCompositeNumbers() {
        assertFalse(App.isPrime(-5));
        assertFalse(App.isPrime(0));
        assertFalse(App.isPrime(1));
        assertFalse(App.isPrime(9));
        assertFalse(App.isPrime(49));
    }

    @Test
    void isPrimeAcceptsPrimeNumbers() {
        assertTrue(App.isPrime(2));
        assertTrue(App.isPrime(3));
        assertTrue(App.isPrime(29));
    }

    @Test
    void reverseReturnsCharactersInOppositeOrder() {
        assertEquals("edcba", App.reverse("abcde"));
        assertEquals("", App.reverse(""));
        assertEquals("a", App.reverse("a"));
    }

    @Test
    void factorialCalculatesBaseAndRegularValues() {
        assertEquals(1, App.factorial(0));
        assertEquals(1, App.factorial(1));
        assertEquals(120, App.factorial(5));
    }

    @Test
    void factorialRejectsNegativeNumbers() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> App.factorial(-1));

        assertEquals("Negative number", exception.getMessage());
    }

    @Test
    void isPalindromeIgnoresCaseSpacesAndPunctuation() {
        assertTrue(App.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(App.isPalindrome("No lemon, no melon"));
        assertTrue(App.isPalindrome(""));
    }

    @Test
    void isPalindromeRejectsNonPalindromes() {
        assertFalse(App.isPalindrome("Java testing"));
    }

    @Test
    void fibonacciUpToReturnsAllValuesNotGreaterThanLimit() {
        assertEquals(List.of(0), App.fibonacciUpTo(0));
        assertEquals(List.of(0, 1, 1), App.fibonacciUpTo(1));
        assertEquals(List.of(0, 1, 1, 2, 3, 5, 8), App.fibonacciUpTo(10));
    }

    @Test
    void fibonacciUpToRejectsNegativeInput() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> App.fibonacciUpTo(-3));

        assertEquals("Negative input", exception.getMessage());
    }

    @Test
    void charFrequencyCountsEachCharacterExactly() {
        assertEquals(Map.of('a', 2, 'b', 1, 'A', 1), App.charFrequency("abaA"));
        assertTrue(App.charFrequency("").isEmpty());
    }

    @Test
    void isAnagramIgnoresCaseAndWhitespace() {
        assertTrue(App.isAnagram("Dormitory", "Dirty room"));
        assertTrue(App.isAnagram("Listen", "Silent"));
    }

    @Test
    void isAnagramRejectsDifferentLetters() {
        assertFalse(App.isAnagram("hello", "world"));
        assertFalse(App.isAnagram("abc", "abcc"));
    }

    @Test
    void averageCalculatesMeanForPositiveNegativeAndMixedValues() {
        assertEquals(2.5, App.average(new int[]{1, 2, 3, 4}));
        assertEquals(-2.0, App.average(new int[]{-1, -2, -3}));
        assertEquals(0.0, App.average(new int[]{-2, 0, 2}));
    }

    @Test
    void averageRejectsEmptyArray() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> App.average(new int[]{}));

        assertEquals("Empty array", exception.getMessage());
    }

    @Test
    void filterEvensKeepsOnlyEvenNumbersInOriginalOrder() {
        assertEquals(List.of(2, 4, 0, -6), App.filterEvens(List.of(1, 2, 3, 4, 0, -6)));
        assertEquals(List.of(), App.filterEvens(List.of(1, 3, 5)));
        assertEquals(List.of(), App.filterEvens(List.of()));
    }

    @Test
    void mostCommonWordReturnsMostFrequentWordIgnoringCaseAndPunctuation() {
        assertEquals("java", App.mostCommonWord("Java, java! tests? code."));
        assertEquals("unit", App.mostCommonWord("Unit tests make unit behavior clear."));
    }
}
