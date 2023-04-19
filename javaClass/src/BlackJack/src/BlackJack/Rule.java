package BlackJack.src.BlackJack;

import java.util.ArrayList;

public class Rule {
	// 카드 출력
	public int output(String gm, ArrayList<Card> deck) {

		Rule rule = new Rule();
		int sum = 0;
		for (int i = 0; i < deck.size(); i++) {

			if (i == 0) {
				if (gm.equals("dealer")) {
					System.out.print("딜러 카드 : ??? ");
				} else {
					System.out.print("현재 보유 중인 카드 목록\n" + deck.get(0).getPattern() + ", " + deck.get(0).getDenomiantion()+"\n");
				}
			} else {
				System.out.print(deck.get(i).getPattern() + ", " + deck.get(i).getDenomiantion() +"\n");
				if (gm.equals("dealer")) {
					System.out.println();
				}
			}

			if (i == deck.size() - 1 && gm.equals("gamer")) {
				sum = rule.getSum(deck);
				System.out.println("총합 : " + sum);
			}

		}

		return sum;

	}

// 카드 합 구하기
	public int getSum(ArrayList<Card> deck) {

        int sum = 0;

        for(int i = 0; i < deck.size(); i++) {
            String num = deck.get(i).getDenomiantion();
            if(num.equals("A")) {
                sum += 1;
            }else if(num.equals("J")  || num.equals("Q") || num.equals("K")) {
                sum += 10;
            }else {
                sum += Integer.parseInt(num);
            }
        }

        return sum; 
    }
	
	//21일 경우 Black Jack
	public boolean blackJack(String gm, int sum) {
		if(sum == 21) {
			System.out.println( gm + " is Black Jack!!! ");
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean blackJack(int sum) {
		if(sum == 21) {
			return true;
		}else {
			return false;
		}
	}
	

	// 버스트
	public boolean isBust(String gm, int sum) {
		if (sum > 21) {
			System.out.println(gm + " Bust (총합 : " + sum + ")");
			System.out.println(gm + "은 패배하셨습니다!");
			return true;
		} else {
			return false;
		}
	}

	// 버스트
	public boolean isBust(int sum) {
		if (sum > 21) {
			return true;
		} else {
			return false;
		}
	}

	// 숫자 21에 가까우면 승리
	public void Winner(int dealerSum, int gamerSum) {
		
		Gamer gamerMoney = new Gamer();
		int money = gamerMoney.Batting();
		
		int dealer = 21 - dealerSum;
		int gamer = 21 - gamerSum;
		
		String str = "";
		
		if (dealer > gamer) {
			str = "Gamer is Winner";
			money = money * 2;
		} else if (dealer == gamer) {
			str = "Draw ";
		} else {
			str = "Dealer is Winner";
		}

		System.out.println(str + "(딜러 총합 : " + dealerSum + ", 게이머 총합 : " + gamerSum + ")" );

	}
}
