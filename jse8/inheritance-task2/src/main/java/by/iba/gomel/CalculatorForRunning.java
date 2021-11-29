package by.iba.gomel;

/**
 * class CalculatorForRunning
 */
public class CalculatorForRunning extends RatingCalculator implements RateByResult {
    /**
     * public constructor
     *
     * @param kol
     *            input parameter
     */
    public CalculatorForRunning(final int kol) {
        super(kol);
    }

    @Override
    public void setPlayerResult(final int playerId, final double result) {
        for (int i = 0; i < this.scores.length; i++) {
            if (this.scores[i].getPlayerId() == playerId) {
                this.scores[i].setScoree(result);
                break;
            }
        }
    }

    @Override
    public void sort(final Score[] s) {
        for (int i = 0; i < (s.length - 1); i++) {
            if (s[i].getScoree() > s[i + 1].getScoree()) {
                final Score tmp = s[i];
                s[i] = s[i + 1];
                s[i + 1] = tmp;
            }
        }
    }

}
