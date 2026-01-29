package it.unical.demacs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class AlgorithmsTest {
    private Algorithms algorithms;

    @BeforeEach
    public void setUp() {
        algorithms = new Algorithms();
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(algorithms.isPalindrome("radar"));
        assertTrue(algorithms.isPalindrome("otto"));
        assertFalse(algorithms.isPalindrome("ciao"));
        assertFalse(algorithms.isPalindrome("nonpalindromo"));
    }

    @Test
    public void testBinarySearch() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(0, algorithms.binarySearch(numbers, 1));
        assertEquals(9, algorithms.binarySearch(numbers, 10));
        assertEquals(-1, algorithms.binarySearch(numbers, 11));
        assertEquals(-1, algorithms.binarySearch(numbers, 0));

        int[] emptyArray = {};
        assertEquals(-1, algorithms.binarySearch(emptyArray, 1));
        assertEquals(-1, algorithms.binarySearch(emptyArray, 0));
        assertEquals(-1, algorithms.binarySearch(emptyArray, -1));
        assertEquals(-1, algorithms.binarySearch(emptyArray, 10));
    }
}














