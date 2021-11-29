package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.CalculatorForBoxing;
import by.iba.gomel.Score;

public class CalcForBoxingTest {
    CalculatorForBoxing cb  = new CalculatorForBoxing(3);
    Score               s   = new Score(1, 1);
    Score               ss  = new Score(2, 2);
    Score               sss = new Score(3, 3);

    @Test
    public void testAddPoints() {
        this.cb.addScore(this.sss);
        this.cb.addPoints(3, 7);
        final Score s1 = this.cb.getScoreById(3);
        final int i = (int) s1.getScoree();
        Assert.assertEquals("Error", 10, i);
    }

    @Test
    public void testDisqualification() {
        this.cb.addScore(this.s);
        this.cb.disqualification(1);
        final Score s1 = this.cb.getScoreById(1);
        final int i = (int) s1.getScoree();
        Assert.assertEquals("Error", 0, i);

    }

    @Test
    public void testKnockout() {
        this.cb.addScore(this.s);
        this.cb.knockout(1);
        final Score s1 = this.cb.getScoreById(1);
        final int i = (int) s1.getScoree();
        Assert.assertEquals("Error", 100, i);
    }

}
