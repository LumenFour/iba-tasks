package by.iba.gomel;

/**
 * Cards class
 */
public class Card {
    private int    rank;
    private String suit;

    /**
     * public constructor with
     *
     * @param r
     *            input parameter
     * @param s
     *            input parameter
     */
    public Card(final int r, final String s) {
        this.rank = r;
        this.suit = s;
    }

    public int getRank() {
        return this.rank;
    }

    public String getSuit() {
        return this.suit;
    }

    public void setRank(final int rank) {
        this.rank = rank;
    }

    public void setSuit(final String suit) {
        this.suit = suit;
    }

}
