package by.iba.gomel;

/**
 * class CalculatorForFigureScating
 */
public class CalculatorForFigureScating extends RatingCalculator implements RateByMultiplePoints {
    /**
     * public constructor
     *
     * @param kol
     *            input parameter
     */
    public CalculatorForFigureScating(final int kol) {
        super(kol);
    }

    @Override
    public void ratePlayer(final int playerId, final double[] points) {
        int sum = 0;
        for (final double point : points) {
            sum += point;
        }

        for (int i = 0; i < this.scores.length; i++) {
            if (this.scores[i].getPlayerId() == playerId) {
                this.scores[i].setScoree(sum);
                break;
            }
        }
    }

}
