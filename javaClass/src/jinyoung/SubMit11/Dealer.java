package jinyoung.SubMit11;

import java.util.ArrayList;

public class Dealer {
	// 카드 받기
	public Card hit(Deck getDeck, ArrayList<Card> deck) {
		Card card = getDeck.getCard(deck);
		return card;
	}
	
	public ArrayList<Card> dealerGet(int dealerSum, ArrayList<Card> deck,
			ArrayList<Card> dealerCard){
		
		int sum = dealerSum;
		
		Deck getDeck = new Deck();
		Rule rule = new Rule();
		
		while(sum > 17) {
			Card card = getDeck.getCard(deck);
			dealerCard.add(card);
			sum = rule.getSum(dealerCard);
		}
		
		return dealerCard;
	}
	
}
