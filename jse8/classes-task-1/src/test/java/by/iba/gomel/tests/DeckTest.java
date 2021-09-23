package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Card;
import by.iba.gomel.Deck;

public class DeckTest {
    Card card = new Card(7, "Spades");
    Deck  deck = new Deck(3);

    @Test
    public void testAddCard() {
        this.deck.addCard(this.card);
        final Card cc = this.deck.getCardById(0);
        final int r = cc.getRank();
        Assert.assertEquals("Error", 7, r);
    }

    @Test
    public void testGetCardById() {
        this.deck.addCard(this.card);
        final Card cc = this.deck.getCardById(0);
        final int r = cc.getRank();
        Assert.assertEquals("Error", 7, r);
    }

    @Test
    public void testGetKol() {
        final int k = this.deck.getKol();
        Assert.assertEquals("Error", 0, k);
    }

    @Test
    public void testGetSize() {
        final int s = this.deck.getSize();
        Assert.assertEquals("Error", 3, s);
    }

}
