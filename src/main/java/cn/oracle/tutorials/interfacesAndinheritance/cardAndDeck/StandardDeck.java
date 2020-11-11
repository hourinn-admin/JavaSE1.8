package cn.oracle.tutorials.interfacesAndinheritance.cardAndDeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StandardDeck implements Deck{

	private List<Card> entireDeck;
	
	public StandardDeck(List<Card> existingList) {
        this.entireDeck = existingList;
    }
	
	public StandardDeck() {
		this.entireDeck = new ArrayList<Card>();
		for(Card.Suit suit : Card.Suit.values()) {
			for(Card.Rank rank : Card.Rank.values()) {
				this.entireDeck.add(new PlayingCard(rank, suit));
			}
		}
	}

	@Override
	public List<Card> getCards() {
		return this.entireDeck;
	}

	@Override
	public Deck deckFactory() {
		return new StandardDeck(new ArrayList<Card>());
	}

	@Override
	public int size() {
		return this.entireDeck.size();
	}

	@Override
	public void addCard(Card card) {
		this.entireDeck.add(card);
	}

	@Override
	public void addCards(List<Card> cards) {
		this.entireDeck.addAll(cards);
	}

	@Override
	public void addDeck(Deck deck) {
		List<Card> listToAdd = deck.getCards();
        entireDeck.addAll(listToAdd);
	}

	@Override
	public void shuffle() {
		Collections.shuffle(this.entireDeck);
	}

	@Override
	public void sort() {
		Collections.sort(this.entireDeck);
	}

	@Override
	public void sort(Comparator<Card> c) {
		Collections.sort(this.entireDeck,c);
	}

	@Override
	public String deckToString() {
		return this.entireDeck
	            .stream()
	            .map(Card::toString)
	            .collect(Collectors.joining("\n"));
	}

	@Override
	public Map<Integer, Deck> deal(int players, int numberOfCards) throws IllegalArgumentException {
		
		//this.entireDeck.stream().collect(collector)
		return null;
	}
	
	public enum Rank2 { 
        DEUCE  (2 , "Two"  ),
        THREE  (3 , "Three");
        private final int value;
        private final String text;
        Rank2(int value, String text) {
            this.value = value;
            this.text = text;
        }
        public int value() {return value;}
        public String text() {return text;}
    } 
	
	public static void main(String[] args) {
		StandardDeck myDeck = new StandardDeck();
		System.out.println("creating deck");
		myDeck.sort();
		System.out.println("sorted deck");
		System.out.println(myDeck.deckToString());
		
		myDeck.shuffle();
		myDeck.sort(new SortByRankThenSuit());
		System.out.println("Sorted by rank, then by suit");
        System.out.println(myDeck.deckToString()); 
        
        myDeck.shuffle();
        myDeck.sort(
            (firstCard, secondCard) -> {
                int compare =
                    firstCard.getRank().value() - secondCard.getRank().value();
                if (compare != 0)
                    return compare;
                else
                    return firstCard.getSuit().value() - secondCard.getSuit().value();
            }      
        ); 
        System.out.println("Sorted by rank, then by suit lamada");
        System.out.println(myDeck.deckToString());
        
        //static method in Comparator interface
        myDeck.shuffle();
        myDeck.sort(Comparator.comparing((card) -> card.getRank().value()));
        
        System.out.println("Sorted by rank only using static method in Comparator interface");
        System.out.println(myDeck.deckToString());
        
        //default method in Comparator interface
        myDeck.shuffle();
        myDeck.sort(Comparator.comparing((card) -> card.getRank().value()));
        myDeck.sort(
        	    Comparator
        	        .comparing(Card::getRank)
        	        .thenComparing(Comparator.comparing(Card::getSuit)));
        System.out.println("Sorted by rank only using static and default method in Comparator interface");
        System.out.println(myDeck.deckToString());
        
        myDeck.shuffle();
        myDeck.sort(
        	    Comparator.comparing(Card::getRank)
        	        .reversed()
        	        .thenComparing(Comparator.comparing(Card::getSuit)));
        System.out.println("Sorted by rank and reverse the order");
        System.out.println(myDeck.deckToString());
	}
}
