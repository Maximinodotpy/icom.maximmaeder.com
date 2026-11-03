package ch.fhnw.prog1.exercise.lotto;

import ch.fhnw.prog1.exercise.lotto.impl.Lottery;
import ch.fhnw.prog1.exercise.lotto.impl.Ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class LotteryApp {
    private static final int MAX_NUMBER = 42;

    private final Scanner scanner;
    private final Lottery lottery;
    private final ArrayList<Ticket> tickets;

    public LotteryApp() {
        scanner = new Scanner(System.in);
        lottery = new Lottery(MAX_NUMBER);
        tickets = new ArrayList<>();
    }

    void main() {
        IO.print("Wie viele Lose möchten Sie kaufen? ");
        int numTickets = scanner.nextInt();

        buyTickets(numTickets);

        lottery.draw();
        IO.println("\nGewinnzahlen: " + lottery.getWinningNumbers() + "\n");

        reportOutcome();
    }

    private void buyTickets(int numTickets) {
        for (int i = 1; i <= numTickets; i++) {
            Integer[] numbers = readNumbers(i);
            Ticket ticket = lottery.buyTicket(numbers);
            tickets.add(ticket);
        }
    }

    private Integer[] readNumbers(int tic) {
        HashSet<Integer> numbers = new HashSet<>();
        IO.print("Geben Sie 6 Lotto-Zahlen für Los " + tic + " ein: ");
        while (numbers.size() < 6) {
            int next = scanner.nextInt();
            if (next <= 0 || next > MAX_NUMBER) {
                IO.println("Ungültige Zahl " + next);
            } else if (!numbers.add(next)) {
                IO.println("Zahl " + next + " bereits gewählt");
            }
        }
        return numbers.toArray(Integer[]::new);
    }

    private void reportOutcome() {
        int sum = 0;
        for (Ticket tic : tickets) {
            IO.println(tic + ":");
            Integer[] correct = tic.getCorrectNumbers();
            if (correct.length != 0) {
                IO.println("Richtige: " + Arrays.toString(correct));
            }
            IO.println("Gewinn:   " + tic.getPrize() + " CHF\n");
            sum += tic.getPrize();
        }
        IO.println("Gesamtgewinn: " + sum + " CHF");
    }
}
