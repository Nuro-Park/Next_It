package jinyoung.SubMit11;

import java.util.ArrayList;

public class Rule {
	// 카드 출력
	public int print(String gm,ArrayList<Card> deck) {
		Rule rule = new Rule();
		int sum = 0;
		for(int i = 0; i < deck.size(); i++) {
			if( i == 0) {
				if(gm.equals("dealer")) {
					System.out.println("딜러 카드 : ???");
				}else {
					System.out.println("게이머 카드 : )" + deck.get(0).getPattern()
							+ " of " + deck.get(0).getNumber() );
				}
			}else {
				System.out.println(deck.get(i).getPattern() + " of " + deck.get(i).getNumber());
				if(gm.equals("dealer")) {
					System.out.println();
				}
			}
			if(i == deck.size() -1 && gm.equals("gamer")) {
				sum = rule.getSum(deck);
				System.out.println("총합 : " + sum);
			}
		}
		return sum;
	}
	public int getSum(ArrayList<Card> deck) {
		int sum = 0;
		
		for(int i =0; i< deck.size(); i++) {
			String num = deck.get(i).getNumber();
			if(num.equals("A")) {
				sum += 1;
			}
			else if(num.equals("J") || num.equals("Q") || num.equals("K")){
				sum += 10;
			}
			else {
				sum = Integer.parseInt(num);
			}
		}
		
		return sum;
	}
	
	//A는 1 또는 11의 값을 가진다
	public boolean Ace() {
		Card card = new Card();
		if(card.getNumber().equals("A") || card.getNumber().equals("11")) {
			return true;
		}else {
			return false;
		}
	}
	
	//버스트
	public boolean Bust(String gm,int sum) {
		if( sum > 21 ) {
			System.out.println(gm + "Bust 총합 : " + sum);
			return true;
		}else {
			return false;
		}
	}
	public boolean Bust(int sum) {
		if(sum > 21) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isBlackJack(int value, ArrayList<Card> deck) {
        return value == 21 && deck.size() == 2;
    }
	
	//카드의 합이 21에 누가 더 가까운지 비교하기
	public void gmWin(int dealerSum, int gamerSum) {
		int dealer = 21 - dealerSum;
		int gamer = 21 - gamerSum;
		
		String str = "";
		
		if(dealer > gamer) {
			str += "Gamer Winner";
		}else if(dealer == gamer) {
			str += "Draw";
		}else {
			str += "Dealer Winner";
		}
		System.out.println(str + "딜러총합 : " + dealerSum + "게이머 총합 : " + gamerSum);
	}
	
}
