package ch05_controll;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
		//while문
		int i = 1; //초기화식 
		while(i <= 10) { //조건식
			//조건문이 false가 되면 while문 종료
			//true면 내부 실행
			System.out.println(i);
			i++; //증감식
		}
		
		//for문을 while처럼 쓰
		int k =1;
		for( ; k<=10; ) {
			System.out.println(k);
			k++;
		}
		
		//while문으로 구구단 2단
		//2x2=5
		//2x9=18
		
		int j = 2;
		while(j < 10) {
			System.out.println(2 * j);
			/*
			 * for(int l = 2; l<10; l++) {
			 * 
			 * //System.out.println(j * l); }
			 */
			j++;
		}
		//서로 같은 반복문이긴 하나, 일반적으로
		//while 문은 반복횟수가 정해지지 않은 경우 사용
		//for문은 반복횟수가 정해져 있는 경우 사용
		
		System.out.println("\n===========================\n");
		
		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("이름 입력[종료는 q 또는 Q"); 
			System.out.println(">>> ");
			
			String input = sc.nextLine();
			
			if(input.equals("q") || input.equals("Q")) {
				System.out.println("프로그램을 종료합니다.");
				isRun = false;
			}else {
				System.out.println(input + "님 환영합니다.");
			}
		}
		
		//break문 사용
		
//		while(true) {
//			System.out.println("이름 입력[종료는 q 또는 Q"); 
//			System.out.println(">>> ");
//			
//			String input = sc.nextLine();
//			
//			//대소문자 구분 없이 체크
//			if(input.equalsIgnoreCase("q")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			System.out.println(input + "님 환영합니다.");
//			
//		}
		
		System.out.println("\n===========================\n");
		
		//do-while 문
		isRun = false;
		//반복해야할 내용이 최소 한번은 실행되게끔
		//하고 싶을때 사용
		do {
			//반복될 내용 작성
			System.out.println("하이");
		}while(isRun);
		
		System.out.println("\n===========================\n");
		
		//while문 또한 다중으로 사용가능
		//while문으로 구구단
		int gug = 2;
		while(gug < 10) {
			int gu = 2;
			while(gu < 10) {
				System.out.println(gug + "X" + gu + "=" +gug* gu);
				gu++;
			}
			gug++;
		}
		
		System.out.println("\n===========================\n");
		
		//포켓몬스터
		int enemyHp = 100;
		outer: while(true) {
			System.out.println("야생의 파이리를 만났습니다.");
			System.out.println("행동을 선택해주세요");
			System.out.println("1.공격 | 2. 도망");
			System.out.println(">>> ");
			
			int command = Integer.parseInt(sc.nextLine());
			
			if(command == 1) {
				//TODO 공격
				System.out.println("공격 방법 선택");
				System.out.println("1. 백만볼트| 2.전광석화 | 3.공격 취소");
				System.out.println(">>> ");
				
				int select = Integer.parseInt(sc.nextLine());
				if(select == 1) {
					System.out.println("피~~카~~츄~~~~~~");
					enemyHp -= 20;
				}
				else if(select == 2){
					System.out.println("삐까삐까!!");
					enemyHp -= 10;
				}
				else if (select ==3 ) {
					System.out.println("공격 취소");
					//내부 while문 종료
					//외부 while문 계속 실]
					
					break;
				}
				
				System.out.println("파이리의 현재 체력:" + enemyHp);
				
				//파이리 죽음
				if(enemyHp <= 0 ) {
					System.out.println("파이리를 잡았습니다.");
					//System.exit(0); //프로그램 종료
					//외부 while문 중지
					break outer;
				}
				
			}
			else if(command ==2) {
				//TODO 도망
				System.out.println("도망쳤습니다.");
				break;
			}
		}
	}

}
