package cn.oracle.tutorials.interfacesAndinheritance.cardAndDeck;

public class PlayingCard implements Card{
	
	private Card.Rank rank;
	private Card.Suit suit;
	
	public PlayingCard(Card.Rank rank, Card.Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	@Override
	public Card.Suit getSuit() {
		return this.suit;
	}

	@Override
	public Card.Rank getRank() {
		return this.rank;
	}

	@Override
	public int compareTo(Card o) {
		return this.hashCode() - o.hashCode();
	}
	
	public boolean equals(Object obj) {
        if (obj instanceof Card) {
            if (((Card)obj).getRank() == this.rank &&
                ((Card)obj).getSuit() == this.suit) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
     
 
    public int hashCode() {
        return ((suit.value()-1)*13)+rank.value();
    }
 
 
    public String toString() {
        return this.rank.text() + " of " + this.suit.text();
    }


}
