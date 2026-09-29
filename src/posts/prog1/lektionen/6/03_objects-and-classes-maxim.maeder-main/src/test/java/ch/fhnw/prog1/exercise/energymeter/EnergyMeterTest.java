package ch.fhnw.prog1.exercise.energymeter;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(OrderAnnotation.class)
public class EnergyMeterTest {

    @Order(1)
    @Test
    void constructor() {
        EnergyMeter meter = new EnergyMeter(100);
        assertEquals(100, meter.capacity);
        assertEquals(0, meter.level);

        meter = new EnergyMeter(50.5);
        assertEquals(50.5, meter.capacity);
        assertEquals(0, meter.level);
    }

    @Order(2)
    @Test
    void constructorIllegalArg() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EnergyMeter(-100);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new EnergyMeter(-0.001);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new EnergyMeter(-Double.MIN_VALUE);
        });

        assertDoesNotThrow(() -> {
            new EnergyMeter(0);
        });
    }

    @Order(3)
    @Test
    void fill() {
        EnergyMeter meter = new EnergyMeter(100);
        meter.fill(30);
        assertEquals(30, meter.level);

        meter.fill(50.5);
        assertEquals(80.5, meter.level);

        meter.fill(19.5);
        assertEquals(100, meter.level);
    }

    @Order(4)
    @Test
    void fillIllegalArg() {
        EnergyMeter meter = new EnergyMeter(100);
        assertThrows(IllegalArgumentException.class, () -> {
            meter.fill(-10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            meter.fill(-Double.MIN_VALUE);
        });

        assertDoesNotThrow(() -> {
            meter.fill(0);
        });
    }

    @Order(5)
    @Test
    void fillBeyondCapacity() {
        EnergyMeter meter = new EnergyMeter(50);
        meter.fill(30);
        assertEquals(30, meter.level);

        meter.fill(25);
        assertEquals(50, meter.level);  // should not exceed capacity

        meter.fill(Math.PI);
        assertEquals(50, meter.level);  // should still not exceed capacity
    }

    @Order(6)
    @Test
    void consume() {
        EnergyMeter meter = new EnergyMeter(100);
        meter.fill(100);
        meter.consume(10, 2);
        assertEquals(80, meter.level);

        meter.consume(5.5, 4);
        assertEquals(58, meter.level);

        meter.consume(40, 0.5);
        assertEquals(38, meter.level);

        meter.consume(38, 1);
        assertEquals(0, meter.level);
    }

    @Order(7)
    @Test
    void consumeIllegalArg() {
        EnergyMeter meter = new EnergyMeter(100);
        assertThrows(IllegalArgumentException.class, () -> {
            meter.consume(-10, 2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            meter.consume(-Double.MIN_VALUE, 2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            meter.consume(10, -2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            meter.consume(10, -Double.MIN_VALUE);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            meter.consume(-10, -2);
        });

        assertDoesNotThrow(() -> {
            meter.consume(0, 2);
        });
        assertDoesNotThrow(() -> {
            meter.consume(10, 0);
        });
        assertDoesNotThrow(() -> {
            meter.consume(0, 0);
        });
    }

    @Order(8)
    @Test
    void consumeBeyondEmpty() {
        EnergyMeter meter = new EnergyMeter(100);
        meter.fill(50);
        meter.consume(10, 6);
        assertEquals(0, meter.level);  // should not go below 0

        meter.consume(0.5, 0.1);
        assertEquals(0, meter.level);  // should still not go below 0
    }

    @Order(9)
    @Test
    void percentFull() {
        EnergyMeter meter = new EnergyMeter(1000);
        assertEquals(0, meter.percentFull());

        meter.fill(250);
        assertEquals(25, meter.percentFull());

        meter.fill(1);
        assertEquals(25.1, meter.percentFull());

        meter.fill(1000);
        assertEquals(100, meter.percentFull());
    }

    @Order(10)
    @Test
    void percentFullZeroCapacity() {
        EnergyMeter meter = new EnergyMeter(0);
        assertEquals(100, meter.percentFull());
        meter.fill(10);
        assertEquals(100, meter.percentFull());
        meter.consume(5, 1);
        assertEquals(100, meter.percentFull());
    }
}
