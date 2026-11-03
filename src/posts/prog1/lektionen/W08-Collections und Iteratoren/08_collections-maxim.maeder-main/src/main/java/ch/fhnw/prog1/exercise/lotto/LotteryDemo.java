package ch.fhnw.prog1.exercise.lotto;

import ch.fhnw.prog1.exercise.lotto.impl.Lottery;
import ch.fhnw.prog1.exercise.lotto.impl.Ticket;

import java.util.Arrays;

public class LotteryDemo {
    void main() {
        Lottery lottery = new Lottery(42); // Zahlen 1 bis 42

        // wähle 6 Zahlen und kaufe ein Los:
        Ticket tic = lottery.buyTicket(new Integer[]{1, 42, 23, 8, 12, 37});

        // jetzt wird gezogen:
        lottery.draw();
        IO.println("Gewinnzahlen: " + lottery.getWinningNumbers());

        // Los «kennt» jetzt die korrekten Zahlen und berechnet den Gewinn:
        IO.println("Los " + tic.getId() + ":");
        IO.println("Richtige: " + Arrays.toString(tic.getCorrectNumbers()));
        IO.println(tic.getPrize() + " CHF gewonnen!");
    }
}