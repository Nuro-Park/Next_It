package jinyoung.SubMit11;

import java.util.ArrayList;
import java.util.Scanner;

public class Submit11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//블랙잭 게임
				//딜러 한명, 게이머 한명
				//카드는 조커를 제외한 52장
				//2~10은 숫자 그대로 점수를, K/Q/J는 10점, A는 1 또는 11로 계산
				//딜러와 게이머는 순차적으로 카드를 하나씩 뽑아 2개의 카드 소지
				//딜러는 카드2장의 합계 점수가 16점 이하면 반드시 1장을 추가로 뽑고
				//17점 이상이면 추가할 수 없다.
				//양쪽 다 추가 뽑기 없이, 카드를 오픈하면 딜러와 게이머 중 소유한 카드의 합이 21에
				//가장 가까운 쪽이 승리
				//단 21을 초과하면 초과한 쪽이 진다.
				//배팅할 수 있는 자본금 최소 1,000~100,000까지 지급 (랜덤)
				
				//주요 객체
				//카드덱 / 카드 / 규칙 / 딜러 / 유저
				//카드덱 => 52개의 서로 다른 카드를 갖고 있다
				//카드 1개를 뽑아준다.
				//카드 => 다이아몬드,하트,스페이드,클럽 중 1개의 무늬를 가지고 있다.
				//A,2~10,K,Q,J 중 하나를 가지고 있다
				//규칙 => 점수를 측정
				//승패를 판단하고 배팅금 받기 
		Card card = new Card();
		Deck getDeck = new Deck();
		Rule rule = new Rule();
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		
		ArrayList<Card> deck = card.setCardDeck();
		ArrayList<Card> dealerCard = new ArrayList<Card>();
		ArrayList<Card> gamerCard = new ArrayList<Card>();
		
		System.out.println("---------BLACK JACK--------");
		System.out.println("-----게임에 오신걸 환영합니다-----");
		System.out.println("지금부터 카드를 나누겠습니다. 건승하시길");
	
		dealerCard.add(getDeck.getCard(deck));
		
		int dealerSum = rule.print("dealer", dealerCard);
		int gamerSum = rule.print("gamer", gamerCard);
		
		while(true) {
			System.out.println("1. HIT | 2. STAND");
			
			Scanner sc = new Scanner(System.in);
			
			int select = sc.nextInt();
			
			if(select == 1) {
				card = gamer.hit(getDeck, deck);
				gamerCard.add(card);
				gamerSum = rule.print("gamer", gamerCard);
				rule.Bust("Gamer",gamerSum);
			}else {
				dealerCard = dealer.dealerGet(dealerSum, deck, dealerCard);
				dealerSum = rule.getSum(dealerCard);
				if(rule.Bust("Dealer", dealerSum)) {
					break;
				}
				rule.gmWin(dealerSum, gamerSum);
				break;
			}
		}
	}

}
