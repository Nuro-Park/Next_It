package jinyoung;

import java.util.Scanner;

public class Submit02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name,grade;
		int korean, english, math;
		double avg;
		
		System.out.println("이름을 입력해주세요.");
		name = sc.next();
		System.out.println("국어 점수를 입력해주세요.");
		korean = sc.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		english = sc.nextInt();
		System.out.println("수학 점수을 입력해주세요.");
		math = sc.nextInt();
		
		avg = ((double)(korean+english+math)/3.0);
		

		if(avg >= 90) {
			grade = "A";
		}
		else if(90 > avg && avg >= 80 ) {
			grade = "B";
		}
		else {
			grade = "C";
		}
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.printf("평균 : " + " %.2f \n" , avg);
		System.out.println("등급 : " + grade);
		
		//String grade = (avg>=90) ? ("A") : ( (avg>=80) ? ("B") : ("C"))
		
		String idBack;
		System.out.println("주민번호 뒷자리를 입력하세요");
		idBack = sc.next();
		
		int num = Integer.parseInt(idBack.substring(0, 1));
		
		String gender = ((num % 2) == 0) ? "여" : "남";
		
		System.out.println("성별: " + gender);
		
		sc.close();
	}

}
