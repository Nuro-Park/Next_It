package jinyoung.SubMit11;

import java.util.ArrayList;

public class Card {
	// hearts, spades, diamonds, clovers
	private String pattern;
	private String number;

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public ArrayList<Card> setCardDeck() {
		ArrayList<Card> deck = new ArrayList<>();

		// 조커 뺀 카드는 52장
		for (int i = 0; i < 52; i++) {
			Card card = new Card();
			// 스페이드, 하트,다이아몬드,클로버
			switch (i % 4) {
			case 0:
				card.setPattern("Spade");
				break;
			case 1:
				card.setPattern("Heart");
				break;
			case 2:
				card.setPattern("Diamond");
				break;
			case 3:
				card.setPattern("Clover");
				break;
			}
			switch (i % 13) {
			case 0:
				card.setNumber("A");
				break;
			case 1:
				card.setNumber("1");
				break;
			case 2:
				card.setNumber("2");
				break;
			case 3:
				card.setNumber("3");
				break;
			case 4:
				card.setNumber("4");
				break;
			case 5:
				card.setNumber("5");
				break;
			case 6:
				card.setNumber("6");
				break;
			case 7:
				card.setNumber("7");
				break;
			case 8:
				card.setNumber("8");
				break;
			case 9:
				card.setNumber("9");
				break;
			case 10:
				card.setNumber("10");
				break;
			case 11:
				card.setNumber("J");
				break;
			case 12:
				card.setNumber("Q");
				break;
			case 13:
				card.setNumber("K");
				break;
			}
		}
		return deck;
	}
	
	//카드 나눠주기

}
