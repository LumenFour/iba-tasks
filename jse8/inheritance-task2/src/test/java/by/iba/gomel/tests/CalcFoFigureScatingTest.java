package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.CalculatorForFigureScating;
import by.iba.gomel.Score;

public class CalcFoFigureScatingTest {
    CalculatorForFigureScating fs = new CalculatorForFigureScating(2);
    Score                      s  = new Score(1, 1);

    @Test
    public void testRatePlayer() {
        this.fs.addScore(this.s);
        final double[] p = {1, 2, 3, 4};
        this.fs.ratePlayer(1, p);
        final Score s1 = this.fs.getScoreById(1);
        final int i = (int) s1.getScoree();
        Assert.assertEquals("Error", 10, i);

    }

}
