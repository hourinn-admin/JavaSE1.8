package cn.oracle.tutorials.interfacesAndinheritance.cardAndDeck;

import java.util.Comparator;

public class SortByRankThenSuit implements Comparator<Card> {

	@Override
	public int compare(Card firstCard, Card secondCard) {
		int comVal = firstCard.getRank().value() - secondCard.getRank().value();
		if(comVal != 0) return comVal;
		else	return firstCard.getSuit().value() - secondCard.getSuit().value();
	}
}
