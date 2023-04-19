package jinyoung;

import java.util.Arrays;

public class Sumbit06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q. 01
//
//		한국 배우들의 명단을 배열로 만들어보았습니다.
//		for문을 이용하여 "이"씨 성을 가진 사람이 몇명인지 출력해주세요.

		String[] nameList = { "이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열", "공유", "마동석", "이종석", "황정민", "박소담", "이선균", "이성민",
				"최민식", "이동휘", "권상우", "소지섭", "공효진", "조정석", "허성태", "이하늬" };
		int count = 0;
		for (int i = 0; i < nameList.length; i++) {
			
			//if(nameList[i].indexOf("이") == 0){
			// count++; }
			
			if (nameList[i].substring(0, 1).equals("이")) {
				count++;
			}
		}
		System.out.println("이씨 성을 가진 배우가 총" + count + "명 있습니다");

//		Q. 02
//
//		최댓값, 최솟값 구하기

		int[] intArr = { 23, 456, 213, 32, 464, 1, 2, 4 };

		Arrays.sort(intArr);

		System.out.println(intArr[intArr.length - 1]);
		System.out.println(intArr[0]);

		int max = intArr[0];
		for(int i = 0; i < intArr.length; i++) {
			if(max < intArr[i] ){
				max = intArr[i];
			}
		}
		System.out.println("최댓값" + max);
		//최솟값
		int min = intArr[0];
		for(int i = 0; i < intArr.length; i++) {
			if(min > intArr[i]) {
				min = intArr[i];
			}
		}
		System.out.println("최소값" + min);
//		Q. 03
//
//		로또 번호 생성기
//
//		1~45 까지의 랜덤 숫자 6개를 배열에 중복되지 않도록 담고, 이를 정렬한 배열을 리턴하는 makeLotto() 함수를 만들어주세요.

		int[] myLotto = makeLotto();
		for (int i = 0; i < myLotto.length; i++) {
			System.out.print(myLotto[i] + " ");
		}
		
		System.out.println("\n===================================\n");
		
		int[] winLotto = {4,24,27,35,37,45};
		int buyCount = 0;
		
		while(true) {
			buyCount++;
			int[] lotto = makeLotto();
			
			int cnt = 0;
			for(int i = 0; i < winLotto.length; i++) {
				if(winLotto[i] == lotto[i]) {
					cnt++;
				}
			}
			if(cnt == 6 ) {
				System.out.println("1등 당첨");
				System.out.println("구매 횟수" + buyCount);
				System.out.println("구매 금액" + (buyCount*1000));
				break;
			}else {
				System.out.println(buyCount + "회차");
			}
		}
	}

	public static int[] makeLotto() {

		int[] intArray = new int[6];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (intArray[i] == intArray[j]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(intArray);

		int[] result = new int[6];
		int idx = 0;
		outer : while(true) {
			int rand = (int) (Math.random() * 45) + 1;
			
			//rand가 result 배열 안에 없는 숫자라면 담기
			for(int i = 0; i < result.length; i++) {
				if(result[i] == rand){
					continue outer;
				}
			}
			
			result[idx] = rand;
			idx++;
			
			if(idx == 6) {
				break;
			}
		}
		
		Arrays.sort(result);
		
		return intArray;
		//return result;
		
		//
		
	}
}
