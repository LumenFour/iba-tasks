package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.Card;
import by.iba.gomel.FullDeckOfCards;
import by.iba.gomel.Rank;
import by.iba.gomel.Suit;

/**
 * Tests.
 */
public class Tests {

	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();

	@Test
	public void testSingleCards() {
		Card cardOne = new Card(Rank.ACE, Suit.DIAMONDS);
		cardOne.printCardInfo();
		Card cardTwo = new Card(Rank.EIGHT, Suit.SPADES);
		cardTwo.printCardInfo();
		String first = "Card's rank: \"ACE\", suit: \"DIAMONDS\"\n" + "Card's rank: \"EIGHT\", suit: \"SPADES\"\n";
		Assert.assertEquals("test", first, this.log.getLog());
	}

	@Test
	public void testFullDeckOfCards() {
		FullDeckOfCards deck = new FullDeckOfCards();
		Card testReceiving = deck.getCardById(2, 10);
		testReceiving.printCardInfo();
		String output = "Card's rank: \"QUEEN\", suit: \"CLUBS\"\n";
		Assert.assertEquals("test", output, this.log.getLog());
	}
}
