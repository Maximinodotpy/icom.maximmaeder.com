package ch.fhnw.prog1.exercise.lotto.impl;

import java.util.HashSet;

public class Lottery {
    public static final int BASE_PRIZE = 5;
    public static final int MULTIPLIER = 20;

    private final int maxNumber;
    private int soldTickets = 0;
    private HashSet<Integer> winningNumbers = null;

    public Lottery(int maxNumber) {
        if (maxNumber < 6) {
            throw new IllegalArgumentException();
        }
        this.maxNumber = maxNumber;
    }

    public int getSoldTickets() {
        return soldTickets;
    }

    /**
     * Returns true if the winning numbers for this lottery have
     * already been drawn; false otherwise.
     */
    public boolean hasDrawn() {
        return winningNumbers != null;
    }

    /**
     * Returns the previously drawn winning numbers of this
     * lottery. If the winning numbers have not yet been drawn,
     * this method throws an {@link IllegalStateException}.
     * To avoid client code to change the winning numbers list,
     * this methode always returns a copy, not the internal list
     * directly.
     */
    public HashSet<Integer> getWinningNumbers() {
        if (winningNumbers == null) {
            throw new IllegalStateException("not drawn yet");
        }
        return new HashSet<>(winningNumbers);
    }

    /**
     * Creates a new ticket with the given numbers and returns it.
     * If the winning numbers have already been drawn, it's
     * obviously illegal to still buy tickets, so this method
     * throws an {@link IllegalStateException}.
     * The method also checks that all the provided numbers are
     * valid (between 1 and maxNumber), that there are exactly
     * six numbers in the list, and that all the numbers are
     * different. If any of these conditions are violated, the
     * method throws an {@link IllegalArgumentException}.
     */
    public Ticket buyTicket(Integer[] numbers) {
        // TODO
        return null;
    }

    /**
     * Draws six random (different!) winning numbers. If the
     * winning numbers have previously been drawn, this method
     * throws an {@link IllegalStateException}.
     */
    public void draw() {
        // TODO
    }
}
