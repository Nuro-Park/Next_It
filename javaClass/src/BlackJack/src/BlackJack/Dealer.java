package BlackJack.src.BlackJack;

import java.util.ArrayList;

public class Dealer {
	public Card hit(CardDeck cardDeck, ArrayList<Card> deck) {
		Card card = cardDeck.getCard(deck);
		return card;
	}
	
	//17 미만이면 카드 추가로 뽑
    public ArrayList<Card> dealerGetCard(int dealerSum, ArrayList<Card> deck, ArrayList<Card> dealerCard) {
        CardDeck cardDeck = new CardDeck(); 
        Rule rule = new Rule(); 
        int sum = dealerSum; 

        while(sum < 17) {
            Card card = cardDeck.getCard(deck);
            dealerCard.add(card);
            sum = rule.getSum(dealerCard);
        }

        return dealerCard; 
    }
}
