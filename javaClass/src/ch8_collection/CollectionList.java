package ch8_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//리스트의 선언(ArrayList)
		// 1. 
		ArrayList<String> student = new ArrayList<String>();
		
		//<String> 이 부분을 제너릭(Generic)이라고 부른다
		// 2. 오른쪽에 제너릭은 생략 가능
		ArrayList<String> strList = new ArrayList<>();
		
		//Collection 들은 객체만 담을 수 있다.
		//참조타입들 = 객체
		ArrayList<Integer> intList = new ArrayList<>();
		
		//Wrapper Class 
		//기본 타입의 데이터를 객체(참조타입)로
		//사용해야 하는 경우 사용
		int num = 12;
		
		//기본타입의 데이터를 Wrapper 클래스 객체로 변환
		// = 박싱(boxing)
		Integer numClass = new Integer(num);
		System.out.println(num);
		
		// = 오토 박싱(auto boxing)
		Integer autoNum = num;
		System.out.println(autoNum);
		
		//Wrapper 클래스 객체에 저장된 값을
		//기본 타입의 데이터로 꺼내기 
		// = 언박싱(unboxing)
		int temp = autoNum.intValue();
		System.out.println(temp);
		
		//오토 언박싱
		int autoTemp = autoNum;
		
		//한줄 요약
		//오토 박싱과 언박싱이 알아서 잘 되므로,
		//우리가 Wrapper 클랠스를 사용하는데 불편함은 없다
		
		System.out.println("\n===============================\n");
		
		//.size()
		//담고 있는 데이터 수 리턴
		System.out.println(intList.size());
		
		//.add()
		//ArrayList에 값 담기
		intList.add(5);
		System.out.println(intList.size());
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		// syso에 컬렉션 객체를 넣으면, 자동으로 내부 값이 출력된다
		System.out.println(intList);
		
		student.add("이자영");
		student.add("백민기");
		student.add("최성복");
		student.add("박창연");
		student.add("박헤라");
		
		System.out.println(student);
		
		//제너릭<> 타입과 일치하는 데이터만 추가 가능
//		student.add(12);
		
		System.out.println("\n===============================\n");
		//.get(인덱스)
		//해당 인덱스 값을 리턴
		
		System.out.println(student.get(2));
		
		//.set(인덱스., 값)
		//해당 인덱스의 값을 괄호 안 값으로 교체
		student.set(2, "장유정");
		System.out.println(student);
		
		//.contains(값)
		//리스트 안에 해당 값이 존재하면 true 리턴
		//존재하지 않으면 fasle값이 리턴
		System.out.println(student.contains("장유정"));
		
		// .index(값)
		//리스트 안에 해당 값이 인덱스 몇번에 존재하는지 리턴
		//존재하면 해당 인덱스 리턴, 없다면 -1 리턴
		//-1 리턴 여부로 contains처럼 사용 가능
		System.out.println(student.indexOf("이자영"));
		System.out.println(student.indexOf("이준호"));
		System.out.println(student.indexOf("이준호") != -1);
		
		// .isEmpty()
		//리스트가 비어있는 체크
		//비어 있다면 true/아니라면 false 처럼
		//.size() == 0 과 같다 
		System.out.println(student.isEmpty());
		System.out.println(student.size() == 0);
		
		
		//.remove(인덱스)
		//해당 인덱스의 인덱스 값을 삭제
		student.remove(3);
		System.out.println(student);
		
		
		//.remove(값)
		//리스트에 해당 값이 있으면 삭제
		student.remove("백민기");
		System.out.println(student);
		//값이 없으면 아무일도 일어나지 않는다.
		student.remove("아무말");
		System.out.println(student);
		
		//.clear()		//리스트를 비움(size가 0이 된다)
		student.clear();
		System.out.println(student);
		
		//초기화해도 리스트를 비울 수 있다.
		intList = new ArrayList<>();
		System.out.println(intList);
		
		System.out.println("\n===============================\n");
		
		student.add("이자영");
		student.add("백민기");
		student.add("최성복");
		student.add("박창연");
		student.add("박헤라");
		
		System.out.println(student);
		
		//for문으로 리스트 내 데이터 처리
		//모든 요소에 넘버링 추가 ex) 1. 이자영 2. 백민기
		for(int i = 0; i< student.size(); i++) {
			student.set(i, (i+1) + ". " + student.get(i));
		}
		System.out.println(student);
		
		System.out.println("\n===============================\n");
		//리스트 복사 
		ArrayList<String> copyList = new ArrayList<>();
		//student의 모든 값들이 copyList 에 담긴다
		copyList.addAll(student);
		System.out.println(copyList);
		
		//리스트 복사 2
		ArrayList<String> copyList2 = new ArrayList<>(student);
		System.out.println(copyList2);
		
		//리스트 복사 3
		ArrayList<String> copyList3 = new ArrayList<>();
		for(int i = 0; i < student.size(); i++) {
			copyList.add(student.get(i));
		}
		System.out.println(copyList3);
		
		System.out.println("\n===============================\n");
		
		//향상된 for 문 
		//(= 일반적으로 말하는 foreach문)
		for( String stu : student) {
			System.out.println(stu);
		}
		
		//인덱스가 존재하는 ArrayList에서는
		//향상된 for문의 서ㅏ용이 큰 메리트가 있지는 않다.
		
		System.out.println("\n===============================\n");
		
		//자바의 foreach문 
		student.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		});
		
		//람다식 사용하기 
		student.forEach(t-> System.out.println(t));

		//람다식인데 명령어가 여러줄이면 
		//중괄호 블록 만들어주어야 한다
		
		student.forEach(t-> {
			System.out.println(t);
			System.out.println(t);
		});
		
		System.out.println("\n===============================\n");
		
		//값을 주면서 리스트 선언
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,23,4,5));
		System.out.println(numbers);
		
		//정렬
		Collections.sort(numbers);
		System.out.println(numbers);
		
		//내림차순
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println(numbers);
		
		
		//버블정렬
		
		for(int k = 0; k < numbers.size(); k++) {
			for(int i = 0; i < numbers.size()-1; i++) {
				// i > i+1 하면 오름차순
				// i < i+1 하면 내림차순
				if(numbers.get(i) > numbers.get(i+1)) {
					int t = numbers.get(i);
					numbers.set(i, numbers.get(i+1));
					numbers.set(i+1, t);
				}
				
			}
		}
		System.out.println(numbers);
		
		
	}

}
