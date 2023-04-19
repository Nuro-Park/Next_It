package jinyoung;
import java.util.Arrays;
import java.util.Scanner;

public class Submit01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String name, email,phone;
		int age;
		double height;
		
		System.out.println("이름 : ");
		name = scan.nextLine();
		System.out.println("나이 : ");
		age = scan.nextInt();
		System.out.println("키 : ");
		height = (int) scan.nextDouble();
		System.out.println("연락처 : ");
		phone = scan.next();
		System.out.println("이메일 : ");
		email = scan.next();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(phone);
		System.out.println(email);
		
		String enigma = "너오구늘리뭐너먹구지리";
		enigma = enigma.replace("너","");
		enigma = enigma.replace("구","");
		enigma = enigma.replace("리","");
		System.out.println("해독완료!! -> 오늘 뭐먹지");
		System.out.println(enigma);
		
		int example = 0;
		int sum = 0;
		
		System.out.println("숫자를 입력 : ");
		
		example = scan.nextInt();
		
		while(example !=0){
			example += example%10;
			sum /= 10;
        }
        System.out.println("각 자리수의 합은 "+sum);
        scan.close();
        
        int example1 = 278;
        
        //숫자를 문자열로 변환
        String strEx = example1 + ""; //"278"
        //문자열을 각 자리수마다 자른다.
        //substring 추천
        String str1 = strEx.substring(0,1); //"2"
        String str2 = strEx.substring(1,2); //"2"
        String str3 = strEx.substring(2,3); //"2"
        
        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);
        int int3 = Integer.parseInt(str3);
        
        //한줄로 끝내기 
        int result = int1 + int2 + int3;
        System.out.println(result);
        
	}

}
