package BlackJack.src.BlackJack;

import java.util.ArrayList;

public class Gamer {
	//hit
	
	public Card hit(CardDeck cardDeck, ArrayList<Card> deck) {
		Card card = cardDeck.getCard(deck);
		return card;
	}
	public int Batting() {
		int capital = (int)((Math.random() * 100000) + 10000);
		
		return capital;
	}
	
	
}
