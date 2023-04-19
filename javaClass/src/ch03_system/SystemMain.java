package ch03_system;

import java.util.Scanner;

public class SystemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//표준 출력
		//콘솔창에 텍스트 출력하기
		//println()
		//콘솔창에 괄호안 문자열을 내용을 출력 후 줄 바꿈 (개행문자) 해준다.
		System.out.println("이미 알고 있음");
		System.out.println("Start");
		System.out.println(); //줄바꿈만 일어남
		System.out.println("end");
		
		//print()
		//괄호 안 내용을 출력하기만 함
		System.out.print("줄바꿈 안됨");
		System.out.print("보기불편");
		
		System.out.println("\n ================================\n");
		
		//제어문자
		//문자열 내에 역슬래시 (\)를 이용하여
		//특정 기능을 사용할 수 있다.
		
		//\n 줄바꿈
		System.out.print("println처럼 동작\n");
		System.out.println("중간에 \n을 넣어보자");
		
		// \t 탭
		System.out.println("일\t월\t화\t수\n못\n금\n토");
		System.out.println("1\t2\t3\t4\t5");
		System.out.println("6\t7\t8");
		
		//문자열 내에서 기능을 가지는 문자(/,",')
		//얘네들을 출력하고 싶다면 말에 /를 붙여준다.
		System.out.println("개행문자는\\n");
		System.out.println("소크라데스 왈 너 자신을 아라\n");
		
		System.out.println("\n================================\n");
		//print()]
		//콘솔창에 포멧 문자열(format string  ) 형태로 내용을 출력
		//System.out.print("%d 명이 수업을 듣고 있습니다. \n, ", 24, "수업");
		
		//
		//Scanner 클래스로부터 객체 생성
		Scanner scan = new Scanner(System.in);
		
		
		
	}

}
