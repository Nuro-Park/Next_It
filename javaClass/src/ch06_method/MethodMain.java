package ch06_method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드 = method = 함수 = function
		// 굳이 나누자면 method는 클래스에 종소된 함수를 말하며,
		// function은 클래스에 독립적인 함수를 말한다.

		// 1부터 100까지 다 더하면 결과는?
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		// 30부터 60까지 다 더하면 결과는?
		sum = 0;

		for (int i = 30; i <= 60; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 25부터 50까지 다 더하면 결과는?
//		sum = 0;
//		for (int i = 25; i <= 50; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		printSum(25,50);

		System.out.println("=====================================");

		// 위 작업을 함수로 만들기
		//메소드 실행
		//70부터 90까지 더하기
		printSum(70,90);
		
		//함수를 쓰면 좋은점
		//실행부의 코드가 간결해진다. (가독성 증가)
		//중복된 코드를 함수로 만들어서 사용하면 
		//해당 코드를 한 곳에서 관리할 수 있으므로 수정할때 용이 
		//리턴값이 존재하는 함수 만들기
		
		returnSum(80,90); // 리턴값을 사용하고 있지 않음
		
		int rst = returnSum(80,90);
		
		System.out.println("=====================================");
		
		//System.out.println();를 print(); 만들어 쓰기
		
		print("파이썬 저리가라");
		System.out.println("파이썬 저라가라~");
		
		System.out.println(true);
		print(55);
		
		System.out.println("=====================================");
		
		//절댓값 구해주는 메소드 만들기 
		int number = Math.abs(-10);
		System.out.println(number);
		
		//메소드명: absolute
		//파라미터 타입: int
		// 리턴 타입 : int
		number = absolute(-10);
		System.out.println(number);
		
		System.out.println("=====================================");
		
		//이름,국어 점수, 영어 점수, 수학 점수를 
		//파라미터로 넣으면 
		//이름 : 유정
		//국어: 90
		//영어: 85
		//수학: 87
		//평균: 87.11
		//등급: B
		//(90점 이상 A,80점 이상 B, 그 외 C)
		makeCard("유정", 90,85,87);	
		
		System.out.println("=====================================");
		
		//LoopFor 에서 했던 각 자리수 더하기 메소드화
		int sum1 = eachAdd(3758342);
		System.out.println(sum1);
		
		System.out.println("=====================================");
		
		//LoopWhile 에서 했던 포켓몬스터도 메소드로 만들어버리기
		//playPokemon();
		
		System.out.println("=====================================");
		
		//재귀함수(Recursion function)
		//메소드 내부에서 해당 메소드를 또 실행하는 경우
		//메소드를 반복 실행
		
		//5
		//4
		//3
		//2
		//1
		
		recursionPrint(5);
		
		//팩토리얼
		long no = factorial(5);
		System.out.println(no);
		
		//재귀함수를 이용한 팩토리얼 
		no = recFactorial(5);
		System.out.println(no);
		
	}// main 
	
	public static long recFactorial(int num) {
		
		if(num == 1) {
			return 1;
		}
		return num * recFactorial(num - 1);
		// 5를 넣었다면 
		// 5 * recFactorial(4)
		// 5 * 4 * recFactorial(3)
		// 5 * 4 * 3 recFactorial(2)
		// 5 * 4 * 3 * 2 * recFactorial(1)
	}
	
	public static long factorial(int num) {
		//단축키[Ctrl + H]
		long rst1 = 1;
		for(int i = 1; i <= num; i++) {
			rst1*=i;
		}
		return rst1;
	}
	
	public static void recursionPrint(int num){
		//재귀함수도 반복을 중단하는 조건을 잘 설정해주어야 한다.
		if(num <= 0 ) {
			return;
		}
		System.out.println(num);
		recursionPrint(num-1);
	}
	
	// 리턴 타입이 없는 void 메소드도 리턴은 사용가능 
	public static void playPokemon() {
		
		Scanner sc = new Scanner(System.in);
		
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
					//break outer;
					
					//void에서의 리턴
					//메소드를 즉시 종료하는 효
					return;
				}
				
			}
			else if(command ==2) {
				//TODO 도망
				System.out.println("도망쳤습니다.");
				break;
			}
		}
	}
	
	public static int eachAdd(int num) {
		   
		String strEx = num + "";
		
		int result = 0;
		//문자열의 길이만큼 반복되는 for문
		for(int i = 0; i < strEx.length(); i++) {
			result += Integer.parseInt(strEx.substring(i,i+1));
		}
		System.out.println("각 자리수를 더한 값:"+result);
		
		int sum1 = result;
		
		return sum1;
	}
	
	public static void makeCard(String name, int kor,
			int eng, int math) {
		System.out.println("이름 " + name);
		System.out.println("국어 " + kor);
		System.out.println("영어 " + eng);
		System.out.println("수학 " + math);
		System.out.println("이름 " + name);
		
		//avg 값 반올림 (몇 번째 자리를 기준)
		double avg = (kor+eng + math)/3.0;
		//반올림 
		//89.66666666 -> 90
		//89.67
		double score = weRound(avg,1);
		System.out.println("평균 = " + score);
		
		String grade = "C";
		
		if(90 <= avg) {
			grade = "A";
		}else if (90>=avg && avg>=80) {
			grade = "B";
		}
		System.out.println("등급" + grade);
		return;
	}
	/**
	 * 입력한 소수를 반올림하여 소수 n번째 자리로 리턴해주는 함수입니다.
	 * @param num 반올림 하고자 하는 소수
	 * @param n 소수 n번째 자리까지 리턴
	 * @return 반올림 된 소수를 리턴
	 * */
	
	//반올림 메소드
	public static double weRound(double num, int n) {
		//Math.round() 은 소수 첫째자리에서
		//반올림한 정수를 리턴
		//3.141592 에 Math.round(3.141592) 를 하면
		//3이 된다. 3.1로 만들고 싶다면?
		
		// 3.141592에 10을 곱한다 -> 31.41595
		//Math.round(31.41592) -> 31
		//31을 10으로 나눈다 -> 3.1
		
		//3.141592에 100을 곱한다 -> 314.1592
		//Math.round(314.1592) -> 314
		//314를 100으로 나눈다 -> 3.14
		
		//10의 n 제곱 구하기
		//Math.pow(10, n);
		int ten = 1;
		for(int i = 0; i < n; i++) { //n회 반복되는 for문
			ten *=10;
		}
		
		num = num * ten;
		long temp = Math.round(num);
		
		double result = (double)temp / ten;
		
		return result;
	}

	public static int absolute(int num) {
		//들어온 num 값이 양수면 그대로 리턴
		//음수면 양수르 바꿔준 후 리턴(-1를 곱함)
		if (num < 0 ) {
			num *= -1;
		}
		return num;
	}

	// 메소드 선언
	// 접근제어자 static 리턴 타입 메소드명(Parameter){ }
	//void는 리턴타입이 없는 메소드를 의미
	public static void printSum(int from, int to) {
		// 25부터 50까지 다 더하면 결과는?
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static int returnSum(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		//변수 sum의 값을 리턴/'''''''
		//메소드 내에 return이 실행이 되면
		//그 즉시 메속드를 종료
		System.out.println(sum);
		return sum;
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	// 하나의 클래스 내에 있는 메소드는 기본적으로
	// 메소드명이 중복되면 안된다.
	//메소드 오버로딩 
	//하나의 클래스 내에 파라미터의 타입, 수를 다르게 지정하는 경우
	//중복된 메소드명을 사용할 수 있음
	public static void print(int num) {
		System.out.println(num);
	}

}
