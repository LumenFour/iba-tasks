package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.RatingCalculator;
import by.iba.gomel.Score;

public class RatingCalculatorTest {
    RatingCalculator rc  = new RatingCalculator(3);
    Score            s   = new Score(1, 1);
    Score            ss  = new Score(5, 5);
    Score            sss = new Score(2, 2);

    @Test
    public void testAddScore() {
        this.rc.addScore(this.s);
        final Score s1 = this.rc.getScoreById(1);
        Assert.assertEquals("Error", 1, s1.getPlayerId());
    }

    @Test
    public void testGetKol() {
        this.rc.addScore(this.s);
        Assert.assertEquals("Error", 1, this.rc.getKol());
    }

    @Test
    public void testSort() {
        this.rc.addScore(this.s);
        this.rc.addScore(this.ss);
        this.rc.addScore(this.sss);
        final Score[] s1 = this.rc.getScores();
        Assert.assertEquals("Error", 5, s1[0].getPlayerId());

    }

}
