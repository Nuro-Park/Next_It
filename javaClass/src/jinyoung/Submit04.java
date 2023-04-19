package jinyoung;

import java.util.Scanner;

public class Submit04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("거꾸로 뒤집을 문자열 입력: ");
		String kor = sc.next();

		String str = "";
		for (int i = kor.length() - 1; i >= 0; i--) {
			//i = 문자열 kor 길이의 - 1 이고 i는 0이상일 때 i는 차감
			//i만큼 문자 거꾸로 출력
			System.out.print(kor.charAt(i));
		}

		System.out.println("거꾸로 뒤집을 문자열 입력: ");
		kor = sc.next();

		String[] arr = kor.split("");
		for (int i = kor.length() - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		
		// TODO Auto-generated method stub
		// 1. 사용자가 현재 위치를 입력하면 사용자의 위치와 가까운 엘리베이터가 이동한다.
		// 2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면 위 층 엘리베이터가 내려온다.
//		ex) 엘리베이터 A는 1층, B는 7층일때 사용자의 위치가 4층이면 엘리베이터 B가 내려온다.
//		3. 사용자의 위치로 엘리베이터의 위치를 바꿔준다.
		//int A =10, int B = 1;
		//A가 10층 B가 1층 일때
		//U가 2층으로 갈 시 input = 2
		//B는 2층이 되어야 한다.
		//if(){
		//	B = input;
		//}
//		4. 엘리베이터 프로그램을 종료하려면 q, exit 중 하나를 입력한다.

		int A = (int) (Math.random() * 10 + 1); //1~10까지 랜덤 숫자 생성
		int B = (int) (Math.random() * 10 + 1);
		int rsta;
		int rstb;
		
		while (true) {

			System.out.println("=============희영빌딩 엘리베이터============");
			System.out.println("승강기 A의 현재 위치:" + A);
			System.out.println("승강기 B의 현재 위치:" + B);
			System.out.println("몇층에 계시나요?[종료하시려면 q 또는 exit 입력]:");
			
			
			String input = sc.nextLine();
			
			
			if (input.equals("q") || input.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}

			else if (1 <= Integer.parseInt(input) && Integer.parseInt(input) <= 10) {
				//1이상 10 이하 AND
				rsta = Integer.parseInt(input) - A;
				rstb = Integer.parseInt(input) - B;
				
				if (Math.abs(rsta) >= Math.abs(rstb)) {
					//Math.abs 절댓값.
					//rsta값이 rstb보다 클 경우 B 승강기 이동
					
					System.out.println("승강기 B가 " + input + " 층으로 이동하였습니다.");
					B = Integer.parseInt(input);
					//B 값이 입력값으로 리턴
				}
				else if (Math.abs(rsta) < Math.abs(rstb)) {
					//rstb가 rsta보다 클 경우 A 승강기 이동
					
					System.out.println("승강기 A가 " + input + " 층으로 이동하였습니다.");
					A = Integer.parseInt(input);
				}
				else if (Math.abs(rsta) == Math.abs(rstb)) {
					//2번 조건에 따라 rsta랑 rstb가 같을 시 A 승강기 이동
					System.out.println("승강기 A가 " + input + " 층으로 이동하였습니다.");
					A = Integer.parseInt(input);
				}

				System.out.println(input + " 층에서 엘리베이터를 호출합니다.");

			}
		}
		
		System.out.println("=========================================");
		
		
	}

}
