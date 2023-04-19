package ch10_extends_interface.starcraft;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class StarCraftMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine marine = new Marine("마린", 6, 50, 0);
		System.out.println(marine);
		
		marine.move(100, 200);
		marine.stimpack();
		System.out.println(marine);
		
		Marine marine2 = new Marine();
		System.out.println(marine2);
		
		Zealot zealot = new Zealot();
		System.out.println(zealot);
		
		zealot.move(10, 5);
		
		Zealot zealot2 = new Zealot();
		Zealot zealot3 = new Zealot();
		Zealot zealot4 = new Zealot();
		Zealot zealot5 = new Zealot();
		Zealot zealot6 = new Zealot();
		
		//질럿을 드래그로 선택 후 한번에 이동명령 내리기
		
		ArrayList<Zealot> protossList = new ArrayList<>();
		
		protossList.add(zealot);
		protossList.add(zealot2);
		protossList.add(zealot3);
		protossList.add(zealot4);
		protossList.add(zealot5);
		protossList.add(zealot6);
		
		for(int i = 0; i < protossList.size(); i++) {
			protossList.get(i).move(50, 70);
		}
		
		HighTempler highTempler = new HighTempler();
		System.out.println(highTempler);
		
		highTempler.thunterStorm();
		System.out.println(highTempler);
		
		//하이템플러도 같이 드래그해서 이동시키고 싶으나
		//ArrayList<Zealot>에는 담기지 않는다.
//		protossList.add(highTempler);
		
		//다형성(Polymorphism)
		//하나의 객체가 여러 타입을 가질 수 있는 것
		//자식 객체에서 부모 객체로 형변환이 가능하다.
		
		StarUnit highTempler2 = new HighTempler();
		//자식에서 부모로의 형변환은 자동 형변환이 된다.
		StarUnit highTempler1 = highTempler;
		
		Object obj = highTempler2;
		Object temp = new Zealot();
		
		ArrayList<StarUnit> starList = new ArrayList<>();
		
		//starList는 StarUnit의 자식 객체들을 다 담을 수 있다.
		//담기면서 자동형변환 되어 담김
		starList.add(zealot);
		starList.add(zealot2);
		starList.add(zealot3);
		starList.add(zealot4);
		starList.add(highTempler);
		starList.add(highTempler2);
		starList.add(zealot6);
		starList.add(marine);
		
		for(int i = 0; i<starList.size(); i++) {
			starList.get(i).move(100, 150);
		}
		
		marine.attack(zealot6);
		System.out.println(zealot6);
		
		marine.attack(highTempler);
		System.out.println(highTempler);
		
		zealot.attack(marine2);
		System.out.println(marine2);
		
		
		System.out.println("======================================");
		
		//HighTempler(자식) 이 StarUnit(부모)로
		//형변환이 되어있기 때문에 
		//부모가 가지고 있지 않은 메소드 사용불가
		//starList.get(4).thunderStorm();
		
		//자식 -> 부모 상태인 객체를
		//부모 -> 자식 형변환 한 후 자식의 메소드 사용
		//부모 -> 자식은 자동 형변환 안됨
		HighTempler welcome = (HighTempler)starList.get(4);
		
		welcome.thunterStorm();
		
		((HighTempler)starList.get(4)).thunterStorm();
		
		//for문을 돌려서 이 객체가 원래는 하이템플러였다면 
		//썬더스톰을 쓰도록 하기
		
		//하이템플러 -> 스타유닛 -> 하이템플러 (O)
		//하이템플러 -> 스타유닉 -> 질럿, 마린 (X)
//		((HighTempler)starList.get(0)).move(5,5);
		
		for(int i = 0; i<starList.size(); i++) {
			if(starList.get(i).getName().equals("하이템플러")) {
				((HighTempler)starList.get(i)).thunterStorm();
			}
			
			//객체 instanceof 클래스
			//좌측의 객체가 우측의 클래스로 형변환이 
			//가능하다면 true , 불가능 하다면 false 리턴
			if (starList.get(i) instanceof HighTempler) {
				((HighTempler)starList.get(i)).thunterStorm();
			}
		}
		
		//마린이면 stimpack() 쓰기
		for(int i = 0; i < starList.size(); i++) {
			if(starList.get(i).getName().equals("마린")) {
				((Marine)starList.get(i)).stimpack();
			}
			if(starList.get(i) instanceof Marine) {
				((Marine)starList.get(i)).stimpack();
			}
		}
		
		//부모 객체 
		StarUnit scv = new StarUnit("SCV",5,60,0);
		
		//일반적으로 부모 객체는 자식 객체로 형변환할 수 없다.
		System.out.println(scv instanceof Zealot);
		
		//일반적으로 자식 객체는 부모 객체로 형변환이 가능하다
		System.out.println(zealot instanceof StarUnit);
		
		//부모 객체로 형변환 되었던 자식 객체는 
		//다시 자식 타입으로 형변환이 가능하다.
		System.out.println(starList.get(0) instanceof Zealot);
		
		
	}

}
