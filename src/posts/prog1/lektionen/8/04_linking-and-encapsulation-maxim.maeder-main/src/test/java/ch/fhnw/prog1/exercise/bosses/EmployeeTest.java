package ch.fhnw.prog1.exercise.bosses;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class EmployeeTest {

    Employee ceo = new Employee("CEO", null);

    Employee headOfSales = new Employee("Head of Sales", ceo);
    Employee headOfMarketing = new Employee("Head of Marketing", ceo);
    Employee headOfProduction = new Employee("Head of Production", ceo);

    Employee webTeamLeader = new Employee("Web Team Leader", headOfMarketing);
    Employee walt = new Employee("Walt", webTeamLeader);
    Employee will = new Employee("Will", webTeamLeader);

    Employee mike = new Employee("Mike", headOfMarketing);

    Employee sara = new Employee("Sara", headOfSales);
    Employee susi = new Employee("Susi", headOfSales);
    Employee seth = new Employee("Seth", headOfSales);

    Employee paul = new Employee("Paul", headOfProduction);
    Employee pete = new Employee("Pete", headOfProduction);

    Employee outsider = new Employee("Outsider", null);

    @Order(1)
    @Test
    void isSuperiorOf() {
        assertTrue(ceo.isSuperiorOf(headOfSales));
        assertTrue(ceo.isSuperiorOf(webTeamLeader));
        assertTrue(ceo.isSuperiorOf(walt));

        assertTrue(headOfMarketing.isSuperiorOf(walt));
        assertTrue(webTeamLeader.isSuperiorOf(walt));

        assertFalse(headOfMarketing.isSuperiorOf(ceo));
        assertFalse(webTeamLeader.isSuperiorOf(ceo));
        assertFalse(walt.isSuperiorOf(ceo));

        assertFalse(walt.isSuperiorOf(will));
        assertFalse(will.isSuperiorOf(walt));

        assertFalse(headOfSales.isSuperiorOf(walt));
    }

    @Order(2)
    @Test
    void isSuperiorOfSelf() {
        assertTrue(ceo.isSuperiorOf(ceo));
        assertTrue(headOfProduction.isSuperiorOf(headOfProduction));
        assertTrue(paul.isSuperiorOf(paul));
        assertTrue(outsider.isSuperiorOf(outsider));
    }

    @Order(3)
    @Test
    void isSuperiorOfOutsider() {
        assertFalse(ceo.isSuperiorOf(outsider));
        assertFalse(outsider.isSuperiorOf(ceo));

        assertFalse(walt.isSuperiorOf(outsider));
        assertFalse(outsider.isSuperiorOf(walt));
    }

    @Order(4)
    @Test
    void findCommonSuperiorWithDirect() {
        assertSame(ceo, headOfSales.findCommonSuperiorWith(headOfMarketing));
        assertSame(ceo, headOfSales.findCommonSuperiorWith(headOfProduction));
        assertSame(ceo, headOfProduction.findCommonSuperiorWith(headOfSales));

        assertSame(webTeamLeader, walt.findCommonSuperiorWith(will));
        assertSame(webTeamLeader, will.findCommonSuperiorWith(walt));

        assertSame(headOfProduction, paul.findCommonSuperiorWith(pete));
        assertSame(headOfProduction, pete.findCommonSuperiorWith(paul));
    }

    @Order(5)
    @Test
    void findCommonSuperiorWithIndirect() {
        assertSame(ceo, sara.findCommonSuperiorWith(paul));
        assertSame(ceo, pete.findCommonSuperiorWith(susi));
        assertSame(ceo, seth.findCommonSuperiorWith(webTeamLeader));
    }

    @Order(6)
    @Test
    void findCommonSuperiorWithDifferentLevels() {
        assertSame(headOfMarketing, walt.findCommonSuperiorWith(mike));
        assertSame(headOfMarketing, mike.findCommonSuperiorWith(walt));

        assertSame(ceo, walt.findCommonSuperiorWith(paul));
        assertSame(ceo, paul.findCommonSuperiorWith(walt));

        assertSame(ceo, walt.findCommonSuperiorWith(headOfProduction));
        assertSame(ceo, headOfProduction.findCommonSuperiorWith(walt));
    }

    @Order(7)
    @Test
    void findCommonSuperiorWithOneAboveTheOther() {
        assertSame(ceo, ceo.findCommonSuperiorWith(walt));
        assertSame(webTeamLeader, webTeamLeader.findCommonSuperiorWith(walt));
        assertSame(headOfMarketing, headOfMarketing.findCommonSuperiorWith(walt));
    }

    @Order(8)
    @Test
    void findCommonSuperiorWithSelf() {
        assertSame(ceo, ceo.findCommonSuperiorWith(ceo));
        assertSame(headOfProduction, headOfProduction.findCommonSuperiorWith(headOfProduction));
        assertSame(paul, paul.findCommonSuperiorWith(paul));
        assertSame(outsider, outsider.findCommonSuperiorWith(outsider));
    }

    @Order(9)
    @Test
    void findCommonSuperiorWithOutsider() {
        assertNull(walt.findCommonSuperiorWith(outsider));
        assertNull(outsider.findCommonSuperiorWith(walt));

        assertNull(outsider.findCommonSuperiorWith(ceo));
        assertNull(ceo.findCommonSuperiorWith(outsider));
    }
}
