package BlackJack.src.BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CardDeck cardDeck = new CardDeck();
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
		Rule rule = new Rule();

		ArrayList<Card> deck = cardDeck.SetCardDeck();
		ArrayList<Card> dealerCard = new ArrayList<Card>();
		ArrayList<Card> gamerCard = new ArrayList<Card>();

		System.out.println("-----Black Jack-----");
		System.out.println("--게임에 오신걸 환영합니다.--");
		System.out.println("지금부터 카드를 나누겠습니다.");
		System.out.println("부디 승리하시길 기원합니다");

		dealerCard.add(cardDeck.getCard(deck));
		dealerCard.add(cardDeck.getCard(deck));
		gamerCard.add(cardDeck.getCard(deck));
		gamerCard.add(cardDeck.getCard(deck));

		int dealerSum = rule.output("dealer", dealerCard);
		int gamerSum = rule.output("gamer", gamerCard);

		int capital = gamer.Batting();
		System.out.println("현재 자본금 : " + capital);

		Scanner sc = new Scanner(System.in);

		System.out.println("얼마를 배팅하시겠습니까?");
		int money = sc.nextInt();

		// System.out.println(cardDeck.toString());

		while (true) {

			System.out.println("카드를 뽑겠습니까? 1.Hit | 2.Stand | 3. 자본금 보기 | 4.카드목록\n게임을 종료하시고 싶으시면 아무거나 입력하세요");

			int select = sc.nextInt();

			int sum = capital;

			// hit 선택한 경우
			if (select == 1) {
				Card card = gamer.hit(cardDeck, deck);
				gamerCard.add(card);
				gamerSum = rule.output("gamer", gamerCard);
				if (rule.isBust("Gamer", gamerSum)) {
					sum = sum - money;
					System.out.println(money + "만큼 자본금에서 차감됩니다.");
				} else if (rule.blackJack("Gamer", gamerSum)) {
					sum = (money * 2);
					System.out.println("승리하신걸 축하드립니다 " + sum + "의 배당금을 받아갔습니다.");
					break;
				}

			} else if (select == 2) {
				// stand 선택한 경우
				dealerCard = dealer.dealerGetCard(dealerSum, deck, dealerCard);
				dealerSum = rule.getSum(dealerCard);
				if (rule.isBust("Dealer", dealerSum)) {
					sum = (int) (money * 1.5);
					System.out.println(sum + "만큼 배당금을 받아갑니다.");
					break;
				}
				rule.Winner(dealerSum, gamerSum);
				break;
			} else if (select == 3) {
				System.out.println("현재 자본금 : " + sum);
			} else if( select == 4) {
				System.out.println(cardDeck.toString());
			}

		}

	}

}
