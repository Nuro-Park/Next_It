package jinyoung.SubMit11;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<>();
	//getter, setter 
	
	public Deck() {
	}
	
	public Deck(Card card) {
		deck.add(card);
	}
	
	//카드 나눠주기
	public Card getCard(ArrayList<Card> deck ){
		
		int size = deck.size();
		int num = (int)(Math.random() * size);
		Card card = deck.get(num);
		deck.remove(num);   //뽑은 카드는 목록에서 제거
		
		return card;
	}
	
	
	
}
