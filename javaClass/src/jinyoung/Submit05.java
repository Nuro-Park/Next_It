package jinyoung;

import java.util.Scanner;

public class Submit05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q.01
		Scanner sc = new Scanner(System.in);

		int n = 0;
		makeTree(n);

		// Q.02
		String str2 = "";
		reverse(str2);

		// Q.3 십진수를 이진수로 변환
		//(자바에서 이진수, 16진수 등등은 문자열)
		//17 -> "100001"
		String myBinaryStr = makeBinary(23);
		System.out.println(myBinaryStr);
	}

	public static String makeBinary(int num) {
		//num에 17이 들어왔다
		//17을 2로 나눠서 나머지 1 / 몫은 6
		//8을  2로 나눠서 나머지 0 / 몫은 4
		//2를 2로 나눠서 나머지 0 / 몫은 2
		//2를 2로 나눠서 나머지 0 / 몫은 1 스톱
		
		//반복횟수와 기준이 애매하면 while(true)
		String result = "";
		while(true) {
			result += (num % 2);
			num = num/2;
			
			if(num == 9 ) {
				break;
			}
		}
		return makeBinary(num);
	}
	
	public static String reverse(String str2) {
		String example = "로꾸꺼 로꾸꺼";
		
		String result = "";
		for(int i =  example.length(); i >= 1; i--) {
			String str = example.substring(i-1, i);
			
			System.out.print(str);
			result += str;
		}
		return str2;
	}


	public static int makeTree(int n) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {
			String space = "";
			for (int k = 0; k < input - i; k++) {
				space += " ";
			}
			String starr = "";
			for (int j = 0; j < (i * 2) + 1; j++) {
				starr += "*";
			}
			System.out.println(space + starr);
		}
		return input;
	}
}
