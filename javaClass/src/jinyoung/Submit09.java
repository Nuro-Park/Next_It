package jinyoung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Submit09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q1
		test04 ref = new test04("냉장고",2000000);
		test04 tv = new test04("TV",1000000);
		test04 air = new test04("에어컨",800000);
		test04 comp = new test04("컴퓨터",1300000);
		test04 airp = new test04("선풍기",100000);
		
		ArrayList<test04> proList = new ArrayList<>();
		
		proList.add(ref);
		proList.add(tv);
		proList.add(air);
		proList.add(comp);
		proList.add(airp);
		
		Collections.sort(proList, (proA, proB) -> proA.getPrice() - proB.getPrice());
		
		for(int i = 0; i< proList.size(); i++) {
			System.out.println(proList.get(i));
		}
		
		//indexOf()
		//ArrayList<String> ramen = ["신라면", "안성탕면", "진라면"]
		//ArrayList<Integer> number = [10,20,30]
		//ramen.indexOf("안성탕면") = 1
		
		//proList.indexOf("TV") 
		
		for(int i = 0; i < proList.size(); i++) {
			if(proList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
		
		System.out.println("\n===============================================\n");
		
		//Q2
		
		Cafe starBucks = new Cafe("스타벅스");
		starBucks.addCoffee(new Coffee("아메리카노", 5000));
		starBucks.addCoffee(new Coffee("카푸치노", 6000));
		starBucks.addCoffee(new Coffee("오곡라떼", 7000));
		
		Cafe conte = new Cafe("꽁떼");
		conte.addCoffee(new Coffee("아메리카노", 2500));
		conte.addCoffee(new Coffee("바닐라라떼", 3000));
		conte.addCoffee(new Coffee("아이스티", 3500));
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 스타벅스 방문 | 2. 꽁떼 방문 | 3. 사무실 복귀..");
			System.out.print(">>> ");
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				//TODO 스타벅스 방문
				System.out.println("어서오세요 스타벅스 입니다.");
				starBucks.showMenu();
				starBucks.buyCoffee(sc);
				
			}
			else if(select == 2) {
				//TODO 꽁떼 방문
				System.out.println("어서오세요 꽁떼 입니다.");
				conte.showMenu();
				conte.buyCoffee(sc);
			}
			else {
				//사무실 복귀
				System.out.println("사무실로 복귀합니다..");
				break;
			}
		}
		
	}

}
