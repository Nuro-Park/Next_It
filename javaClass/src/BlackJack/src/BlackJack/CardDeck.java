package BlackJack.src.BlackJack;

import java.util.ArrayList;

public class CardDeck {

	public ArrayList<Card> SetCardDeck(){
		ArrayList<Card> deck = new ArrayList<Card>();
		
		for(int i = 0; i < 52; i++) {
			Card card = new Card();
			switch(i%4) {
			case 0:
				card.setPattern("Spadees");
				break;
			case 1:
				card.setPattern("Diamonds");
				break;
			case 2: 
				card.setPattern("Hearts");
				break;
			case 3:
				card.setPattern("Clovers");
				break;
			}
			switch(i%13) {
			case 0:
				card.setDenomiantion("A");
				break;
			case 1:
				card.setDenomiantion("2");
				break;
			case 2:
				card.setDenomiantion("3");
				break;
			case 3:
				card.setDenomiantion("4");
				break;
			case 4:
				card.setDenomiantion("5");
				break;
			case 5:
				card.setDenomiantion("6");
				break;
			case 6:
				card.setDenomiantion("7");
				break;
			case 7:
				card.setDenomiantion("8");
				break;
			case 8:
				card.setDenomiantion("9");
				break;
			case 9:
				card.setDenomiantion("10");
				break;
			case 10:
				card.setDenomiantion("J");
				break;
			case 11:
				card.setDenomiantion("Q");
				break;
			case 12:
				card.setDenomiantion("K");
				break;
			}
			deck.add(card);
		}
		return deck;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(Card card : SetCardDeck()) {
			sb.append(card.toString());
			sb.append("\n");
			
		}
		return sb.toString();
	}
	
	public Card getCard(ArrayList<Card> deck){
        int size = deck.size();
        int num= (int)(Math.random()*size);
        Card selectedCard = deck.get(num);
        deck.remove(num);
        return selectedCard;
    }
	
}
