package jinyoung.SubMit11;

import java.util.ArrayList;

public class Gamer{
	private int battingMoney;

	public int getBattingMoney() {
		return battingMoney;
	}

	public void setBattingMoney(int battingMoney) {
		this.battingMoney = battingMoney;
	}
	
	//카드 받기
	public Card hit(Deck getDeck, ArrayList<Card> deck) {
		Card card = getDeck.getCard(deck);
		return card;
	}
}
