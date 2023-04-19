package jinyoung;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q.02
		// Q.@
		String myBinaryStr = makeBinary(23);
		System.out.println(myBinaryStr);
	}

	public static String makeBinary(int num) {
		
//		십진수를 이진수(String 타입)로 리턴해주는 makeBinary(
//		타입) 함수를 만들어보세요.
//
//
//		Hint
//		문자열 변수를 하나 선언해서  == str
//		입력받은 정수를 2로 나눈 나머지를 문자열 변수에 더한다.
//		그 다음 입력받은 정수를 2로 나눈 몫을 이용하여 위 과정을 반복한다.
//		2로 나눈 몫이 1이 된다면 반복을 종료한다.
//		이진수로 만들어진 문자열 변수를 거꾸로(로꾸꺼) 뒤집은 다음 리턴한다.
		//나머지, 몫, 문자열

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요.");
		int input = sc.nextInt();
		
		String str = "";

		while(input > 0) {
			
			str = (num % 2)+ str;
			
			input = input / 2;
			
			if(input%2 == 0) {
				break;
			}
		}
		
		return str;
	}
}
