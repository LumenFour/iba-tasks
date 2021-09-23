package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Card;

public class CardsTest {

    Card crd = new Card(7, "Spades");

    @Test
    public void testGetRank() {
        final int r = this.crd.getRank();
        Assert.assertEquals("Error", 7, r);
    }

    @Test
    public void testGetSuit() {
        final String s = this.crd.getSuit();
        Assert.assertEquals("Error", "Spades", s);
    }

    @Test
    public void testSetRank() {
        this.crd.setRank(7);
        final int r = this.crd.getRank();
        Assert.assertEquals("Error", 7, r);
    }

    @Test
    public void testSetSuit() {
        this.crd.setSuit("Clubs");
        final String s = this.crd.getSuit();
        Assert.assertEquals("Error", "Clubs", s);
    }

}
