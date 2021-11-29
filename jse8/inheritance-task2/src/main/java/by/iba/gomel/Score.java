package by.iba.gomel;

/**
 * class Score
 */
public class Score {

    private double scoree;
    private int    playerId;

    /**
     * public constructor without parameters
     */
    public Score() {
        this.scoree = 0;
        this.playerId = 0;
    }

    /**
     * public constructor
     *
     * @param aScore
     *            input parameter
     * @param aPlayerId
     *            input parameter
     */
    public Score(final int aScore, final int aPlayerId) {
        this.scoree = aScore;
        this.playerId = aPlayerId;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public double getScoree() {
        return this.scoree;
    }

    public void setPlayerId(final int pi) {
        this.playerId = pi;
    }

    public void setScoree(final double scoree) {
        this.scoree = scoree;
    }

}
