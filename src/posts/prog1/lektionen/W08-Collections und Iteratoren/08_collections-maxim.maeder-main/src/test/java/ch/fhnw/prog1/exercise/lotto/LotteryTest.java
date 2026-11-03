package ch.fhnw.prog1.exercise.lotto;

import ch.fhnw.prog1.exercise.lotto.impl.Lottery;
import ch.fhnw.prog1.exercise.lotto.impl.Ticket;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
class LotteryTest {

    @Test
    @Order(9)
    void getCorrectNumbers() {
        for (int i = 0; i < 10_000; i++) {
            Lottery lottery = new Lottery(10);
            Ticket ticket = lottery.buyTicket(new Integer[]{1, 2, 3, 4, 5, 6});
            lottery.draw();
            Integer[] correct = ticket.getCorrectNumbers();
            assertNotNull(correct);
            assertTrue(correct.length <= 6);
            HashSet<Integer> winningNumbers = lottery.getWinningNumbers();
            HashSet<Integer> ticketNumbers = new HashSet<>(Arrays.asList(ticket.getNumbers()));
            // check that correct numbers are winning numbers of the
            // lottery, and actually on the ticket!
            for (int n : correct) {
                assertTrue(winningNumbers.contains(n));
                assertTrue(ticketNumbers.contains(n));
            }
            // check that all numbers on the ticket that are winning
            // numbers are reported as correct numbers
            assertEquals(new HashSet<>(Arrays.asList(correct)).size(), correct.length);
            ticketNumbers.retainAll(winningNumbers);
            assertEquals(ticketNumbers.size(), correct.length);
        }
    }

    @Test
    @Order(10)
    void getCorrectNumbersNotDrawnYet() {
        Lottery lottery = new Lottery(10);
        Ticket ticket = lottery.buyTicket(new Integer[]{1, 2, 3, 4, 5, 6});
        assertThrows(IllegalStateException.class, ticket::getCorrectNumbers);
        lottery.draw();
        assertNotNull(ticket.getCorrectNumbers());
    }

    @Test
    @Order(11)
    void getPrize() {
        for (int i = 0; i < 10_000; i++) {
            Lottery lottery = new Lottery(42);
            Ticket ticket = lottery.buyTicket(new Integer[]{1, 2, 3, 4, 5, 6});
            lottery.draw();
            Integer[] correct = ticket.getCorrectNumbers();
            assertNotNull(correct);
            assertTrue(correct.length <= 6);
            int prize = ticket.getPrize();
            // the following is intentionally not very smart - don't do this
            // in real code (including your solution!)
            if (correct.length == 0) {
                assertEquals(0, prize);
            } else if (correct.length == 1) {
                assertEquals(5, prize);
            } else if (correct.length == 2) {
                assertEquals(100, prize);
            } else if (correct.length == 3) {
                assertEquals(2_000, prize);
            } else if (correct.length == 4) {
                assertEquals(40_000, prize);
            } else if (correct.length == 5) {
                assertEquals(800_000, prize);
            } else {
                assertEquals(16_000_000, prize);
            }
        }

        for (int i = 0; i < 10_000; i++) {
            // use a lottery with only 10 numbers to see the higher prizes too
            Lottery lottery = new Lottery(10);
            Ticket ticket = lottery.buyTicket(new Integer[]{1, 2, 3, 4, 5, 6});
            lottery.draw();
            Integer[] correct = ticket.getCorrectNumbers();
            assertNotNull(correct);
            assertTrue(correct.length <= 6);
            int prize = ticket.getPrize();
            // the following is intentionally not very smart - don't do this
            // in real code (including your solution!)
            if (correct.length == 0) {
                assertEquals(0, prize);
            } else if (correct.length == 1) {
                assertEquals(5, prize);
            } else if (correct.length == 2) {
                assertEquals(100, prize);
            } else if (correct.length == 3) {
                assertEquals(2_000, prize);
            } else if (correct.length == 4) {
                assertEquals(40_000, prize);
            } else if (correct.length == 5) {
                assertEquals(800_000, prize);
            } else {
                assertEquals(16_000_000, prize);
            }
        }
    }

    @Test
    @Order(12)
    void getPrizeNotDrawnYet() {
        Lottery lottery = new Lottery(10);
        Ticket ticket = lottery.buyTicket(new Integer[]{1, 2, 3, 4, 5, 6});
        assertThrows(IllegalStateException.class, ticket::getPrize);
        lottery.draw();
        assertTrue(ticket.getPrize() >= 0);
    }
}
