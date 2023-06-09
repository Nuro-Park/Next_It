package ch07_array;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMain {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub	
		//배열(Array)
		
		String samjang = "삼장";
		String woogong = "오공";
		String saojong = "사오정";
		String palgye ="저팔계";
		
		//문자열 배열 String[]
		//배열의 선언
		//숫자 4는 첨자를 의미하며, 배열의 크기를 정한다.
		//배열의 크키는 밖뀌지 않는 (핵트롤)
		
		String[] seoyugi = new String[4];
		
		//.length 배열의 길이를 리턴(메소드는 아님)
		System.out.println(seoyugi.length);
		
		//배열 내 요소(element) 확인 
		//인덱스 사용 (=인덱싱)
		System.out.println(seoyugi[0]);
		
		//처음 생성된 배열 내에는 기본값(default)이 들어있다.
		//참조 타입: null
		//기본 타입: 숫자면 0, boolean면 false
		int[] numbers = new int[3];
		System.out.println(numbers[0]);
		boolean[] bools = new boolean[5];
		System.out.println(bools[0]);
		
		System.out.println("\n===============================\n");
		
		//배열에 값 넣기
		seoyugi[0] = samjang;
		System.out.println(seoyugi[0]); //"삼장", null, null, null ...
		
		seoyugi[1] = woogong; //"삼장","오공",null
		seoyugi[2] = saojong; //"삼장","오공","사오정"
		seoyugi[3] = palgye;  //"삼장","오공","사오정","저팔계"
		
		System.out.println(seoyugi);
		
		//for문을 이용해서 0부터 array.length 미만까지 
		//인덱스를 순회하면 배열의 모든 요소에 접근이 가능하다.
		for(int i = 0; i < seoyugi.length; i ++) {
			System.out.println(seoyugi[i]);
		}
		
		//배열 요소를 조회하는 메소드 만들기
		printArray(seoyugi); //삼장,오공,사오정,저팔계
		
		System.out.println("\n===============================\n");
		
		//배열의 단점
		//크기가 고정됨(핵토파스칼 트롤)
		//늘어나지도, 줄어들지도 않으며
		//값을 추가하거나 제거하지도 못한다.
		
		//코드 편집기에서 빨간줄이 쫙 그이는 에러는
		//컴파일 에러로, 실행을 안해봐도 이클립스 캐치
		
		//실행했을 때 발생하는 에러는 런타임 에러
//		seyugi[4] = "크리링";
		
		//배열의 장점
		//for문을 이용하여 배열에 담긴 모든 요소들을
		//한번 처리할 수 있다.(데이터 처리)
		for(int i = 0; i < seoyugi.length; i++) {
			seoyugi[i] = "서유기 " + seoyugi[i];
		}
		printArray(seoyugi);
		
		//배열 내 특정 요소에 접근하여 처리를 할 수 있다.
		//서유기 오공 -> 드래곤볼 오공 
		for(int i = 0; i < seoyugi.length; i++) {
			//오공이 포함되어 있으면 true다
			if(seoyugi[i].contains("오공")) {
				seoyugi[i] = seoyugi[i].replace("서유기", "드래곤볼");
			}
		}
		printArray(seoyugi);
		
		System.out.println("\n===============================\n");
		
		int[] intArray = new int[6];
		
		//기존 값 넣는 방식
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		intArray[5] = 6;
		
		printArray(intArray);
		
		for(int i = 0; i < intArray.length; i++) {
			//로또 번호 
			//1~45 사이의 랜덤 숫자
			//Math.random() -> 0 ~ 1 사이의 랜덤 소수 0, 0.1 0.9
			//Math.random() * 5   0, 0.5 4.5 -> 0 ~ 5미만의 랜덤 소수
			//(int)(Math.random() * 5) 0~4 사이의 랜덤 정수
			// 0 0 4 
			//(int)(Math.random() * 45) -> 0~44사이의 랜덤 정수
			//(int)(Math.random() * 45) + 1 -> 1~45 사이의 랜덤 정수
		
			intArray[i] =(int)(Math.random() * 45) + 1;
		}
		printArray(intArray);
		
		System.out.println("\n===============================\n");
		
		//값을 넣으며 배열 선언
		String[] students = {"홍민경","유동윤", "박진영", "김대일"};
		
		printArray(students);
		
		System.out.println("\n===============================\n");
		
		//문자열 나누기 
		String subjects = "자바, SQL, 자바스크립트, JSP";
		
		//.split(문자열)
		//괄호안 문자열을 기준으로 해당 문자열을 나누어
		// 문자열 배열로 리턴한다.
		String[] subjectArray = subjects.split(", ");
		
		System.out.println(subjectArray.length);
		System.out.println(subjectArray[1]);
		
		//데이터가 잘 정돈되어 있지 않다면 
		// , 로 일단 나누고 양쪽 공백을 제거해주면 된다(trim).
		for (int i = 0; i < subjectArray.length; i++) {
			subjectArray[i]= subjectArray[i].trim();
		}
		printArray(subjectArray);
		
		System.out.println("\n===============================\n");
		
		//배열의 복사
		String[] sinSeoyugi = seoyugi;
		printArray(sinSeoyugi);
		
		sinSeoyugi[0] = "강호동";
		sinSeoyugi[1] = "이수근";
		
		printArray(sinSeoyugi);
		printArray(seoyugi); //기존 배열에도 영향을 미친다.
		
		//@ 앞은 객체의 타입
		//@ 뒤에 붙은 건 hashCode를 16진수로 나타낸 것  
		System.out.println(seoyugi);
		System.out.println(sinSeoyugi);
		
		System.out.println(seoyugi.hashCode());
		System.out.println(sinSeoyugi.hashCode());
		
		//숫자를 16진수로 변환
		System.out.println(Integer.toHexString(seoyugi.hashCode()));
		
		//해쉬코드(hasshcode)
		//객체의 메모리 주소값을 이용해서
		//해쉬를 적용한 코드
		
		//해쉬(hash)
		//해쉬함수(암호화 알고리즘)를 이용해서
		//데이터를 암호화 하는 기법(대표 SHA)
		String password = "1q2w3e4";
		String encryptPw = encrypt(password);
		System.out.println(encryptPw);
		
		String loginPW="1q2w3e4";
		encryptPw = encrypt(loginPW);
		System.out.println(encryptPw);
		
		System.out.println("\n===============================\n");
		
		//올바른 배열 복사
		String[] newSeoyugi = seoyugi.clone();
		printArray(seoyugi);
		printArray(newSeoyugi);
		
		newSeoyugi[2] = "은지원";
		printArray(newSeoyugi);
		printArray(seoyugi);
		
		//.clone을 까먹었다
		String[] copy = new String[seoyugi.length];
		//copy의 각 인덱스에, seoyugi의 각 인덱스 값을 넣어준다.
		for(int i = 0; i< seoyugi.length; i++) {
			copy[i] = seoyugi[i];
		}
		printArray(copy);
		
		System.out.println("\n===============================\n");
		
		//숫자 배열
		int[] numArray = {23,123,4345,231,21,1,2};
		System.out.println(numArray[0]);
		//인덱스 0번 값과 인덱스 1번 값의 위치를 바꿔보기
//		int temp = numArray[5];
//		numArray[1] = numArray[0];
//		numArray[0] = temp;
		printArray(numArray);
		
		swap(0,1, numArray);
		printArray(numArray);
		
		//가끔 면접에서 묻는 문제 
		//Call by Value와 Call by Reference 구분
		//기본타입 변수에 대해서는 Call by Value로 동작
		//참조타입 변수에 대해서는 Call by Reference로 동작
		
		int a = 10;
		int b = a;
		
		System.out.println(b);
		
		a = 20;
		System.out.println(b);
		
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("\n===============================\n");
		
		//다차원 배열 
		//1D -> x축
		//2D -> x축, y축 
		//3D -> x축, y축, z축
		//4D -> x축, y축, z축, t 
		int[] oneDir = {1,2,3,4};
		//2D는 1차원 배열 내에 1차원 배열들이 존재하는 경우
		//행렬로 나타낸다면
		//1 2 3
		//4 5 6
		//7 8 9
		int[][] twoDir = {{1,2,3}, {4,5,6}, {7,8,9}};
		//twoDir 으로 부터 {7,8,9}배열을 꺼내고 싶다 
		int[] tempArray = twoDir[2];
		printArray(tempArray);
		
		//twoDir으로부터 6을 꺼내고 싶다.
		int six = twoDir[1][2];
		System.out.println(six);
		
		//3차원 배열은 1차원 배열 내 2차원 배열들이 존재
		int[][][] threeDir = {{{1,2,3}, {4,5,6}, {7,8,9}}
								,{{10,20,30}, {40,50,60}, {70,80,90}}
								,{{11,22,33}, {44,55,66}, {77,88,99}}};
		//0층의 행렬
		//1 2 3
		//4 5 6
		//7 8 9
		//1층의 행렬
		//10 20 30
		//40 50 60
		//2층의 행렬
		//11 22 33
		//44 55 66
		System.out.println(threeDir[2][0][2]); 
		
		System.out.println("\n===============================\n");
		
		//정렬
		int[] numberArray = {123,32,13,42,231,21};
		
		//Arrays.sort(배열)
		//해당 배열을 오름차순 정렬
		Arrays.sort(numberArray);
		
		printArray(numberArray);
		
		//내림차순 정렬
		//이 방법은 참조타입 객체를 담은 배열일 경우에만 가능 
//		Arrays.sort(numberArray,Collections.reverseOrder());
		
		// 현재 13, 21, 32, 42, 123, 231
		//내림차순 ~ 
		
		//numberArray에 모든 요소에 -1을 곱합
		//-13,-23,-32,-42 ...
		//Arrays.sort(numberArray)적용
		//-231,-123,-42 ...
		//numberArray에 모든 요소에 -1을 곱합
		//231,123,42,32 ...
		for(int i = 0; i < numberArray.length; i++) {
			numberArray[i]  *= -1;
		}
		Arrays.sort(numberArray);
		for(int i = 0; i < numberArray.length; i++) {
			numberArray[i]  *= -1;
		}
		printArray(numberArray);
		
		System.out.println("\n===============================\n");
		
		//알고리즘으로 정렬
		//버블정렬
		
		for(int k = 0; k < numberArray.length-1; k++) {
			for(int i = 0; i < numberArray.length-1; i++) {
				// i > i+1 하면 오름차순
				// i < i+1 하면 내림차순
				if(numberArray[i] > numberArray[i+1]) {
					int t = numberArray[i];
					numberArray[i] = numberArray[i+1];
					numberArray[i+1] = t;
				}
				
			}
		}
		
		printArray(numberArray);
		
		
	}
	
	public static void swap(int p_a, int p_b) {
		int temp = p_a;
		p_a = p_b;
		p_b = temp;
	}
	
	//자리 바꾸기 메소드
	public static void swap(int idxA, int idxB, int[] numArray) {
		int temp = numArray[idxA];
		numArray[idxA] = numArray[idxB];
		numArray[idxB] = temp;
	}
	
	
	//메소드 오버로딩
	public static void printArray(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			//i가 마지막일때에는 뒤에 콤마(,)를 붙이지 않고,
			//개행문자도 넣는다.
			if(i==intArray.length -1) {
				System.out.println(intArray[i]);
			}else {
				System.out.print(intArray[i] + ", ");	
			}
		}
	}
	
	public static void printArray(String[] strArray) {
		for(int i = 0; i < strArray.length; i++) {
			//i가 마지막일때에는 뒤에 콤마(,)를 붙이지 않고,
			//개행문자도 넣는다.
			if(i==strArray.length -1) {
				System.out.println(strArray[i]);
			}else {
				System.out.print(strArray[i] + ", ");	
			}
		}
	}
	
	public static String encrypt(String text) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(text.getBytes());

        return bytesToHex(md.digest());
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }

}
