package ch.fhnw.prog1.exercise.timespan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TimeSpanTest {

    @Test
    void constructorSimple() {
        TimeSpan span = new TimeSpan(3, 50);
        assertEquals(3, span.getHours());
        assertEquals(50, span.getMinutes());

        span = new TimeSpan(0, 30);
        assertEquals(0, span.getHours());
        assertEquals(30, span.getMinutes());

        span = new TimeSpan(2, 0);
        assertEquals(2, span.getHours());
        assertEquals(0, span.getMinutes());
    }

    @Test
    void totalMinutes() {
        TimeSpan span = new TimeSpan(0, 0);
        assertEquals(0, span.totalMinutes());

        span = new TimeSpan(0, 30);
        assertEquals(30, span.totalMinutes());

        span = new TimeSpan(2, 0);
        assertEquals(120, span.totalMinutes());

        span = new TimeSpan(3, 50);
        assertEquals(230, span.totalMinutes());
    }

    @Test
    void constructorNegative() {
        // folgende Konstruktor-Aufrufe sollen IllegalArgumentException werfen
        assertThrows(IllegalArgumentException.class, () -> {
            new TimeSpan(0, -30);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new TimeSpan(-1, 0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new TimeSpan(-1, 59);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new TimeSpan(-3, -50);
        });
    }

    @Test
    void constructorMinutesOver60() {
        // die folgenden Konstruktor-Aufrufe müssen sicherstellen, dass
        // keine Minutenwerte über 59 entstehen
        TimeSpan span = new TimeSpan(0, 90);
        assertEquals(1, span.getHours());
        assertEquals(30, span.getMinutes());

        span = new TimeSpan(3, 120);
        assertEquals(5, span.getHours());
        assertEquals(0, span.getMinutes());

        span = new TimeSpan(1, 61);
        assertEquals(2, span.getHours());
        assertEquals(1, span.getMinutes());
    }

    @Test
    void addSimple() {
        TimeSpan span = new TimeSpan(2, 0);
        span.add(2, 0);
        assertEquals(4, span.getHours());
        assertEquals(0, span.getMinutes());

        span = new TimeSpan(1, 10);
        span.add(0, 25);
        assertEquals(1, span.getHours());
        assertEquals(35, span.getMinutes());

        span = new TimeSpan(1, 15);
        span.add(2, 15);
        assertEquals(3, span.getHours());
        assertEquals(30, span.getMinutes());
    }

    @Test
    void addNegative() {
        // die folgenden add-Aufrufe sollen IllegalArgumentException werfen
        TimeSpan span1 = new TimeSpan(0, 0);
        assertThrows(IllegalArgumentException.class, () -> {
            span1.add(0, -30);
        });

        TimeSpan span2 = new TimeSpan(0, 30);
        assertThrows(IllegalArgumentException.class, () -> {
            span2.add(-2, 30);
        });

        TimeSpan span3 = new TimeSpan(2, 0);
        assertThrows(IllegalArgumentException.class, () -> {
            span3.add(-1, 0);
        });

        TimeSpan span4 = new TimeSpan(3, 55);
        assertThrows(IllegalArgumentException.class, () -> {
            span4.add(-3, -50);
        });
    }

    @Test
    void addConversion() {
        // die folgenden add-Aufrufe müssen sicherstellen, dass
        // keine Minutenwerte über 59 entstehen
        TimeSpan span = new TimeSpan(3, 50);
        span.add(0, 10);
        assertEquals(4, span.getHours());
        assertEquals(0, span.getMinutes());

        span = new TimeSpan(0, 5);
        span.add(1, 55);
        assertEquals(2, span.getHours());
        assertEquals(0, span.getMinutes());

        span = new TimeSpan(0, 0);
        span.add(0, 25);
        span.add(0, 25);
        span.add(0, 25);
        assertEquals(1, span.getHours());
        assertEquals(15, span.getMinutes());
    }

    @Test
    void addMinutesOver60() {
        // auch wenn direkt Minutenwerte über 60 übergeben werden,
        // dürfen keine Minutenwerte über 59 entstehen
        TimeSpan span = new TimeSpan(0, 0);
        span.add(0, 90);
        assertEquals(1, span.getHours());
        assertEquals(30, span.getMinutes());

        span = new TimeSpan(0, 5);
        span.add(1, 75);
        assertEquals(2, span.getHours());
        assertEquals(20, span.getMinutes());

        span = new TimeSpan(0, 0);
        span.add(0, 121);
        span.add(0, 182);
        span.add(0, 63);
        assertEquals(6, span.getHours());
        assertEquals(6, span.getMinutes());
    }
}
