package by.iba.gomel;

import java.util.Arrays;

/**
 * class RatingCalculator
 */
public class RatingCalculator {
    protected Score[] scores;
    private int       kol;
    private final int size;

    /**
     * public constructor
     *
     * @param aSize
     *            input parameter
     */
    public RatingCalculator(final int aSize) {
        this.kol = 0;
        this.size = aSize;
        this.scores = new Score[this.size];
    }

    /**
     * method addScore
     *
     * @param s
     *            input parameter
     */
    public void addScore(final Score s) {
        this.scores[this.kol] = s;
        this.kol++;
    }

    public int getKol() {
        return this.kol;
    }

    /**
     * method getScoreById
     *
     * @param id
     *            input parameter
     * @return Score
     */
    public Score getScoreById(final int id) {
        for (final Score score : this.scores) {
            if (score.getPlayerId() == id) {
                return score;
            }
        }
        return null;
    }

    public Score[] getScores() {
        final Score[] newScores = Arrays.copyOf(this.scores, this.scores.length);
        this.sort(newScores);
        return newScores;
    }

    public int getSize() {
        return this.size;
    }

    /**
     * method sort
     *
     * @param s
     *            input parameter
     */
    public void sort(final Score[] s) {
        for (int i = 0; i < (s.length - 1); i++) {
            if (s[i].getScoree() < s[i + 1].getScoree()) {
                final Score tmp = s[i];
                s[i] = s[i + 1];
                s[i + 1] = tmp;
            }
        }
    }

}
