package ch.fhnw.prog1.exercise.eratosthenes;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EratosthenesTest {

    @Test
    void eratosthenes100() {
        var e = new Eratosthenes();
        var res = e.eratosthenes(100);
        assertEquals(
            List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97),
            res
        );
    }

    @Test
    void eratosthenes10_000() {
        var e = new Eratosthenes();
        var res = e.eratosthenes(10_000);
    }

    @Test
    void eratosthenes100_000() {
        var e = new Eratosthenes();
        var res = e.eratosthenes(100_000);
    }

    @Test
    void eratosthenes1_000_000() {
        var e = new Eratosthenes();
        var res = e.eratosthenes(1_000_000);
    }

    @Test
    void eratosthenes100_000_000() {
        var e = new Eratosthenes();
        var res = e.eratosthenes(100_000_000);
    }

    @Test
    void eratosthenes10_000_000() {
        var e = new Eratosthenes();
        var res = e.eratosthenes(10_000_000);
    }
}