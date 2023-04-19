package jinyoung;

import java.util.ArrayList;
import java.util.Arrays;

public class submit07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> intList = new ArrayList<>();
		// 10부터 20 사이의 랜덤 숫자를 10개 담기
		//10~20 => (int)(Math.random() * 11) + 10;
		for(int i = 0; i < 10; i++) {
			//int rand = (int)(Math.random() * 11)+ 10 ;
			int rand = makeRandom(10,20);
			intList.add(rand);
		}
		System.out.println(intList);
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int checkData : intList) {
			if(!result.contains(checkData)) {
				result.add(checkData);
			}
		}
		System.out.println(result);
		
		//중복 제거 다른 풀이
		for(int i = 0; i < intList.size(); i++) {
			if(!result.contains(intList.get(i))) {
				result.add(intList.get(i));
			}
		}
		
		System.out.println(result);
		
		//중복 제거 다른 풀이2
		for(int i = 0; i < intList.size(); i++) {
			for(int j = intList.size() - 1; j > i; j--) {
				if(intList.get(i) == intList.get(j)){
					intList.remove(j);
				}
			}
		}
		System.out.println(intList);
		
		
		
		//버블정렬
		
		for(int k = 0; k < result.size(); k++) {
			for(int i = 0; i < result.size()-1; i++) {
				// i > i+1 하면 오름차순
				// i < i+1 하면 내림차순
				if(result.get(i) > result.get(i+1)) {
					int t = result.get(i);
					result.set(i, result.get(i+1));
					result.set(i+1, t);
				}
				
			}
		}
		System.out.println(result);
		
		for(int k = 0; k < result.size(); k++) {
			for(int i = 0; i < result.size()-1; i++) {
				// i > i+1 하면 오름차순
				// i < i+1 하면 내림차순
				if(result.get(i) < result.get(i+1)) {
					int t = result.get(i);
					result.set(i, result.get(i+1));
					result.set(i+1, t);
				}
				
			}
		}
		System.out.println(result);
		
		
		System.out.println("\n=============================\n");
		

		ArrayList<Integer> intArray = new ArrayList<Integer>();
		
		for(int i = 0; i < intArray.size(); i++) {
			intArray.add((int) (Math.random() * 20) + 10);
		}
		
		ArrayList<String> man = new ArrayList<>(Arrays.asList("노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기" ));
		ArrayList<String> wife = new ArrayList<>(Arrays.asList("냉장고", "로봇청소기", "세탁기", "에어컨" ));
		
		ArrayList<String> gyoList = gyo(wife, man);
		ArrayList<String> hapList = hap(wife, man);
		
		for (int i = 0; i < gyoList.size(); i++) {
			System.out.println(gyoList.get(i));
		}
		
		for (int i = 0; i < hapList.size(); i++) {
			System.out.print(hapList.get(i) + " ");
		}
	}
	
	
	public static ArrayList<String> hap (ArrayList<String> wife,ArrayList<String> man){
		ArrayList<String> result = new ArrayList<>();
		
		for(int i = 0; i < wife.size(); i++) {
			result.add(wife.get(i));
		}
		
		boolean check = true;
		for(int i= 0; i< man.size(); i++) {
			for(int j = 0; j < result.size(); j++) {
				if(man.get(i).equals(result.get(j))) {
					check = false;
				}
			}
			if(check) {
				result.add(man.get(i));
			}
			check = true;
		}

		return result;
	}
	
	
	public static ArrayList<String> gyo(ArrayList<String> wife
			,ArrayList<String> man){
		
		ArrayList<String> result = new ArrayList<>();
		
		for(int i = 0; i < wife.size(); i++) {
			for(int j = 0; j < man.size(); j++) {
				if(wife.get(i).equals(man.get(j))) {
					result.add(wife.get(i));
				}
			}	
		}	
		return result;
	}
	
	public static int makeRandom(int a, int b) {
		return (int)(Math.random()* (b-a+1) + a);
	}

}
