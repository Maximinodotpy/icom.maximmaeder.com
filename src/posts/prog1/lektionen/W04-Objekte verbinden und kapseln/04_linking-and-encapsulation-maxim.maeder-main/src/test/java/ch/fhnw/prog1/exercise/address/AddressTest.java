package ch.fhnw.prog1.exercise.address;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static java.lang.reflect.Modifier.isPrivate;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class AddressTest {

//    @Order(1)
//    @Test
//    public void testConstructor() {
//        Address address = new Address("Bahnhofstrasse", 6, 5210, "Windisch");
//        assertNotNull(address);
//    }
//
//    @Order(2)
//    @Test
//    public void testFormat() {
//        Address address = new Address("Bahnhofstrasse", 6, 5210, "Windisch");
//        assertEquals("Bahnhofstrasse 6\n5210 Windisch", address.format());
//        address = new Address("Birsweg", 120, 4000, "Basel");
//        assertEquals("Birsweg 120\n4000 Basel", address.format());
//    }
//
//    @Order(3)
//    @Test
//    public void testConstructorGetters() {
//        Address address = new Address("Bahnhofstrasse", 6, 5210, "Windisch");
//        assertEquals("Bahnhofstrasse", address.getStreet());
//        assertEquals(6, address.getNumber());
//        assertEquals(5210, address.getZipCode());
//        assertEquals("Windisch", address.getCity());
//
//        address = new Address("Traugott-Meyer-Street", 13, 4147, "Aesch");
//        assertEquals("Traugott-Meyer-Street", address.getStreet());
//        assertEquals(13, address.getNumber());
//        assertEquals(4147, address.getZipCode());
//        assertEquals("Aesch", address.getCity());
//    }
//
//    @Order(4)
//    @Test
//    public void testFieldsPrivate() {
//        var attribute = Address.class.getDeclaredFields();
//        for (var attr : attribute) {
//            assertTrue(isPrivate(attr.getModifiers()),
//                    "Field '" + attr.getName() + "' is not private");
//        }
//    }
//
//    @Order(5)
//    @Test
//    public void testConstructorExceptionNullOrEmpty() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address(null, 6, 5210, "Windisch");
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", 6, 5210, null);
//        });
//
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("", 6, 5210, "Windisch");
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", 6, 5210, "");
//        });
//    }
//
//    @Order(6)
//    @Test
//    public void testConstructorExceptionNumber() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", -1, 5210, "Windisch");
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", -100, 5210, "Windisch");
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", 0, 5210, "Windisch");
//        });
//    }
//
//    @Order(7)
//    @Test
//    public void testConstructorExceptionZipCode() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", 6, 0, "Windisch");
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", 6, -1, "Windisch");
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", 6, -1000, "Windisch");
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", 6, -5210, "Windisch");
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", 6, 999, "Windisch");
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", 6, 20, "Windisch");
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", 6, 10000, "Windisch");
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", 6, Integer.MAX_VALUE, "Windisch");
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Address("Bahnhofstrasse", 6, Integer.MIN_VALUE, "Windisch");
//        });
//
//        assertDoesNotThrow(() -> {
//            new Address("Bahnhofstrasse", 6, 1000, "Lausanne");
//            new Address("Bahnhofstrasse", 6, 9999, "Musterstadt");
//        });
//    }
//
//    @Order(8)
//    @Test
//    public void testSetStreet() {
//        Address address = new Address("Bahnhofstrasse", 6, 5210, "Windisch");
//        assertEquals("Bahnhofstrasse", address.getStreet());
//        address.setStreet("Bahnhofweg");
//        assertEquals("Bahnhofweg", address.getStreet());
//        address.setStreet("Musterstrasse");
//        assertEquals("Musterstrasse", address.getStreet());
//    }
//
//    @Order(9)
//    @Test
//    public void testSetStreetException() {
//        Address address = new Address("Bahnhofstrasse", 6, 5210, "Windisch");
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setStreet(null);
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setStreet("");
//        });
//    }
//
//    @Order(10)
//    @Test
//    public void testSetNumber() {
//        Address address = new Address("Bahnhofstrasse", 6, 5210, "Windisch");
//        assertEquals(6, address.getNumber());
//        address.setNumber(1);
//        assertEquals(1, address.getNumber());
//        address.setNumber(10001);
//        assertEquals(10001, address.getNumber());
//    }
//
//    @Order(11)
//    @Test
//    public void testSetNumberException() {
//        Address address = new Address("Bahnhofstrasse", 6, 5210, "Windisch");
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setNumber(-1);
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setNumber(-100);
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setNumber(0);
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setNumber(Integer.MIN_VALUE);
//        });
//    }
//
//    @Order(12)
//    @Test
//    public void testSetZipCode() {
//        Address address = new Address("Bahnhofstrasse", 6, 5210, "Windisch");
//        assertEquals(5210, address.getZipCode());
//        address.setZipCode(4053);
//        assertEquals(4053, address.getZipCode());
//        address.setZipCode(1000);
//        assertEquals(1000, address.getZipCode());
//        address.setZipCode(9999);
//        assertEquals(9999, address.getZipCode());
//    }
//
//    @Order(13)
//    @Test
//    public void testSetZipCodeException() {
//        Address address = new Address("Bahnhofstrasse", 6, 5210, "Windisch");
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setZipCode(0);
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setZipCode(-1);
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setZipCode(23);
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setZipCode(999);
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setZipCode(10000);
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setZipCode(Integer.MIN_VALUE);
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setZipCode(Integer.MAX_VALUE);
//        });
//    }
//
//    @Order(14)
//    @Test
//    public void testSetCity() {
//        Address address = new Address("Bahnhofstrasse", 6, 5210, "Windisch");
//        assertEquals("Windisch", address.getCity());
//        address.setCity("Basel");
//        assertEquals("Basel", address.getCity());
//        address.setCity("Bern");
//        assertEquals("Bern", address.getCity());
//    }
//
//    @Order(15)
//    @Test
//    public void testSetCityException() {
//        Address address = new Address("Bahnhofstrasse", 6, 5210, "Windisch");
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setCity(null);
//        });
//        assertThrows(IllegalArgumentException.class, () -> {
//            address.setCity("");
//        });
//    }
}
