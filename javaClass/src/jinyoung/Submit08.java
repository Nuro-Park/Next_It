package jinyoung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Submit08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q.1

		ArrayList<Integer> myLotto = makeLotto();
		System.out.println(myLotto);

		// Q.2
		HashMap<String, String> infoMap = new HashMap<>();

		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");

		Scanner sc = new Scanner(System.in);

		System.out.println("아이디를 입력해주세요");
		String id = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String pw = sc.next();

		while (true) {
			if (infoMap.containsKey(id)) {
				if (infoMap.containsValue(pw)) {
					System.out.println("로그인 성공");
					break;
				}
				if (!infoMap.containsValue(pw)) {
					System.out.println("비밀번호가 틀렸습니다.");
					break;
				}
			} else if (!infoMap.containsKey(id)) {
				System.out.println("존재하지 않는 아이디입니다.");
				break;
			}
		}
		sc.close();

	}

	public static ArrayList<Integer> makeLotto() {
				
				HashSet<Integer> lotto = new HashSet<>();
				
				int rnum;
				
				while(lotto.size() != 6) {
					
					rnum = (int)(Math.random() * 45) + 1;
					
					lotto.add(rnum);
				}
				
				ArrayList<Integer> lottoList = new ArrayList<>(lotto);
				
				Collections.sort(lottoList);
				
				return lottoList;
	}

}
