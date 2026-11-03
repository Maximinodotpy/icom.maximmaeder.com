package ch.fhnw.prog1.exercise.lotto.impl;

import java.util.Arrays;

public class Ticket {
    private final Lottery lottery;
    private final int id;

    /**
     * Creates a ticket that is linked to the given lottery. The
     * constructor is package-private, because only the {@link Lottery}
     * class is allowed to create tickets.
     */
    Ticket(Lottery lottery, int id, Integer[] numbers) {
        this.lottery = lottery;
        this.id = id;
        // TODO: store numbers in a new instance variable
    }

    /**
     * Returns the ticket ID. The first ticket sold has the
     * ID 1, the next 2, and so on.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the six numbers on this ticket, as an ArrayList.
     * Because the numbers on a ticket should not be changed later,
     * this method always returns a copy, not the internal list
     * directly.
     */
    public Integer[] getNumbers() {
        // TODO
        return null;
    }

    /**
     * Returns the correct numbers on this ticket. This method can
     * only be called after the winning numbers of the lottery
     * have been drawn; before that, it throws an
     * {@link IllegalStateException}.
     */
    public Integer[] getCorrectNumbers() {
        // TODO
        return null;
    }

    /**
     * Returns the prize that this ticket is worth, depending on
     * how many winning numbers it has. This method can only be
     * called after the winning numbers of the lottery have been
     * drawn; before that, it throws an {@link IllegalStateException}.
     */
    public int getPrize() {
        // TODO
        return 0;
    }

    public String toString() {
        return "Los " + id + " " + Arrays.toString(getNumbers());
    }
}
