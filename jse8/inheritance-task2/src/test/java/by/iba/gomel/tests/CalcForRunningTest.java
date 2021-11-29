package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.CalculatorForRunning;
import by.iba.gomel.Score;

public class CalcForRunningTest {
    CalculatorForRunning fr  = new CalculatorForRunning(3);
    Score                s   = new Score(1, 1);
    Score                ss  = new Score(2, 2);
    Score                sss = new Score(3, 3);

    @Test
    public void testSetPlayerResult() {
        this.fr.addScore(this.s);
        this.fr.addScore(this.ss);
        this.fr.addScore(this.sss);
        this.fr.setPlayerResult(3, 9);
        final Score s1 = this.fr.getScoreById(3);
        final int i = (int) s1.getScoree();
        Assert.assertEquals("Error", 9, i);
    }

    @Test
    public void testSort() {
        this.fr.addScore(this.s);
        this.fr.addScore(this.ss);
        this.fr.addScore(this.sss);
        final Score[] s1 = this.fr.getScores();
        Assert.assertEquals("Error", 1, s1[0].getPlayerId());
    }

}
