package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void addReturnsSumForPositiveNegativeAndZeroValues() {
        assertEquals(7, App.add(3, 4));
        assertEquals(-1, App.add(3, -4));
        assertEquals(0, App.add(0, 0));
    }

    @Test
    void isPrimeRejectsNumbersBelowTwoAndCompositeNumbers() {
        assertFalse(App.isPrime(-7));
        assertFalse(App.isPrime(0));
        assertFalse(App.isPrime(1));
        assertFalse(App.isPrime(9));
        assertFalse(App.isPrime(49));
    }

    @Test
    void isPrimeAcceptsPrimeNumbersIncludingSmallestPrime() {
        assertTrue(App.isPrime(2));
        assertTrue(App.isPrime(3));
        assertTrue(App.isPrime(97));
    }

    @Test
    void reverseHandlesRegularEmptyAndWhitespaceStrings() {
        assertEquals("dcba", App.reverse("abcd"));
        assertEquals("", App.reverse(""));
        assertEquals(" a b ", App.reverse(" b a "));
    }

    @Test
    void factorialCalculatesBaseCasesAndPositiveNumbers() {
        assertEquals(1, App.factorial(0));
        assertEquals(1, App.factorial(1));
        assertEquals(120, App.factorial(5));
    }

    @Test
    void factorialThrowsForNegativeInput() {
        IllegalArgumentException thrown =
                assertThrows(IllegalArgumentException.class, () -> App.factorial(-1));

        assertEquals("Negative number", thrown.getMessage());
    }

    @Test
    void isPalindromeIgnoresCaseSpacesAndPunctuation() {
        assertTrue(App.isPalindrome("Madam"));
        assertTrue(App.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(App.isPalindrome(""));
    }

    @Test
    void isPalindromeReturnsFalseForNonPalindromes() {
        assertFalse(App.isPalindrome("hello"));
        assertFalse(App.isPalindrome("Java unit tests"));
    }

    @Test
    void fibonacciUpToIncludesValuesNoGreaterThanLimit() {
        assertEquals(List.of(0), App.fibonacciUpTo(0));
        assertEquals(List.of(0, 1, 1), App.fibonacciUpTo(1));
        assertEquals(List.of(0, 1, 1, 2, 3, 5, 8), App.fibonacciUpTo(10));
    }

    @Test
    void fibonacciUpToThrowsForNegativeInput() {
        IllegalArgumentException thrown =
                assertThrows(IllegalArgumentException.class, () -> App.fibonacciUpTo(-5));

        assertEquals("Negative input", thrown.getMessage());
    }

    @Test
    void charFrequencyCountsEveryCharacterExactly() {
        assertEquals(Map.of(), App.charFrequency(""));
        assertEquals(Map.of('a', 2, 'b', 1, '!', 1), App.charFrequency("aba!"));
        assertEquals(Map.of('A', 1, 'a', 1, ' ', 1), App.charFrequency("A a"));
    }

    @Test
    void isAnagramIgnoresSpacesAndCaseOnly() {
        assertTrue(App.isAnagram("Dormitory", "dirty room"));
        assertTrue(App.isAnagram("Listen", "Silent"));
        assertFalse(App.isAnagram("a-b", "ab"));
        assertFalse(App.isAnagram("apple", "papelx"));
    }

    @Test
    void averageCalculatesMeanForPositiveNegativeAndSingleElementArrays() {
        assertEquals(2.5, App.average(new int[]{1, 2, 3, 4}), 0.000001);
        assertEquals(-2.0, App.average(new int[]{-3, -2, -1}), 0.000001);
        assertEquals(42.0, App.average(new int[]{42}), 0.000001);
    }

    @Test
    void averageThrowsForEmptyArray() {
        IllegalArgumentException thrown =
                assertThrows(IllegalArgumentException.class, () -> App.average(new int[]{}));

        assertEquals("Empty array", thrown.getMessage());
    }

    @Test
    void filterEvensReturnsOnlyEvenNumbersInOriginalOrder() {
        assertEquals(List.of(2, 4, 0, -6), App.filterEvens(List.of(1, 2, 3, 4, 0, -6, -7)));
        assertEquals(List.of(), App.filterEvens(List.of(1, 3, 5)));
        assertEquals(List.of(), App.filterEvens(List.of()));
    }

    @Test
    void mostCommonWordIgnoresCaseAndPunctuation() {
        assertEquals("java", App.mostCommonWord("Java, java! tests are useful; JAVA works."));
        assertEquals("hello", App.mostCommonWord("hello"));
    }
}
