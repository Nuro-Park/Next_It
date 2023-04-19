package jinyoung;

import java.util.ArrayList;
import java.util.Scanner;

public class Submit03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력");
		int num = Integer.parseInt(sc.nextLine());
		long value = 1;
		for (int i = num; i > 0; i--) {
			value = value * i;
		}
		System.out.println(value);
		
		System.out.println("\n===========================\n");
		
		//Q.10팩토리얼
		int rst = 1;
		for(int i = 0; i <= 10; i++) {
			rst*=i;
		}
		System.out.println(rst);
		
		long rst1 = 1;
		for(int i = 0; i <= 15; i++) {
			rst1*=i;
		}
		System.out.println(rst1);
		
		System.out.println("\n===========================\n");

		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";

		int count = 0;
		for (int i = 0; i < findWally.length(); i++) {
			if(i == findWally.length()-1) {
				break;
			}
			String str = findWally.substring(i, i +2);
			if (str.equals("월리")) {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("\n===========================\n");
		
		/*
		 * //월리 int cnt = 0; for(int i = 0; i < findWally.length(); i++) { String str =
		 * findWally.substring(i,i+2); if(str.equals("월리")){ cnt++; } }
		 * System.out.println(cnt);
		 */
		System.out.println("\n===========================\n");

		String stars = "*****";
		for (int i = 4; i < stars.length(); i--) {
			if (i == -1) {
				break;
			}
			System.out.println(stars.substring(0, i + 1));
		}
		
		System.out.println("\n===========================\n");
		//Q3. 거꾸로 트리
		
		//i가 0,2,3,4,
		//stars는 5,4,3,2,1
		//stars.substring() 결과가 5.4.3.2.1.
		String Star = "******";
		for(int i = 0; i<5; i++) {
		//	System.out.println(star.Substring(i));
		}

	}

}
