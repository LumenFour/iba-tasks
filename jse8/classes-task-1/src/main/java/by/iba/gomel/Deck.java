package by.iba.gomel;

/**
 * Deck class
 */
public class Deck {
    private final int     size;
    private int           col;
    private final Card[] card;

    /**
     * public constructor
     *
     * @param size
     *            input parameter
     */
    public Deck(final int size) {
        this.size = size;
        this.col = 0;
        this.card = new Card[size];
    }

    /**
     * addCard method
     *
     * @param card
     *            input parameter
     */
    public void addCard(final Card card) {
        this.card[this.col] = card;
        this.col++;
    }

    /**
     * getCardById method that returns card by id
     *
     * @param id
     *            input parameter
     * @return Card
     */
    public Card getCardById(final int id) {
        return this.card[id];
    }

    public int getKol() {
        return this.col;
    }

    public int getSize() {
        return this.size;
    }

}
