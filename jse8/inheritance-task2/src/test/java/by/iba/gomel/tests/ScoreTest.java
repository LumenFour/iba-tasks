package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Score;

public class ScoreTest {

    Score s = new Score();

    @Test
    public void testGetPlayerId() {
        this.s.setPlayerId(1);
        Assert.assertEquals("Error", 1, this.s.getPlayerId());
    }

    @Test
    public void testGetScoree() {
        this.s.setScoree(2);
        final int i = (int) this.s.getScoree();
        Assert.assertEquals("Error", 2, i);
    }

}
