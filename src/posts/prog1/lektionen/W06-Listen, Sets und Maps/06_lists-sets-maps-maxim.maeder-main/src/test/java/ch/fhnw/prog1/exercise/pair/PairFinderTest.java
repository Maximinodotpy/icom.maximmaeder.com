package ch.fhnw.prog1.exercise.pair;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairFinderTest {

    @Test
    void hasSum() {
        var pairFinder = new PairFinder();

        String path = "numbers.txt";
        int target = 1234567;

        assertTrue(
                pairFinder.hasSum(target, path)
        );
    }

    @Test
    void hasNotSum() {
        var pairFinder = new PairFinder();

        String path = "numbers.txt";
        int target = 7654321;

        assertFalse(
                pairFinder.hasSum(target, path)
        );
    }
}