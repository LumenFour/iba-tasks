package by.iba.gomel;

/**
 * class CalculatorForBoxing
 */
public class CalculatorForBoxing extends RatingCalculator
        implements Disqualification, RateByAccumulatingPoints {

    public static final int HUNDRED = 100;

    /**
     * public constructor
     *
     * @param kol
     *            input parameter
     */
    public CalculatorForBoxing(final int kol) {
        super(kol);
    }

    @Override
    public void addPoints(final int playerId, final int points) {
        for (int i = 0; i < this.scores.length; i++) {
            if (this.scores[i].getPlayerId() == playerId) {
                this.scores[i].setScoree(this.scores[i].getScoree() + points);
                break;
            }
        }
    }

    @Override
    public void disqualification(final int playerId) {
        for (int i = 0; i < this.scores.length; i++) {
            if (this.scores[i].getPlayerId() == playerId) {
                this.scores[i].setScoree(0);
                break;
            }
        }

    }

    @Override
    public void knockout(final int playerId) {
        for (int i = 0; i < this.scores.length; i++) {
            if (this.scores[i].getPlayerId() == playerId) {
                this.scores[i].setScoree(CalculatorForBoxing.HUNDRED);
                break;
            }
        }
    }

}
