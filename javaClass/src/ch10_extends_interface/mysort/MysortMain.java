package ch10_extends_interface.mysort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ch09_class.nextt.typing.school.Student;

public class MysortMain {

	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<>();
		stuList.add(new Student("준호",80,57,68));
		stuList.add(new Student("민경",75,64,89));
		stuList.add(new Student("준하",82,67,87));
		stuList.add(new Student("혜라",90,65,58));
		stuList.add(new Student("현진",64,65,98));
		stuList.add(new Student("동욱",75,15,34));
		
		// 콜백 함수 
		// 인터페이스(Comparator)의 추상메소드(compare)를 
		// 미리 다른 메소드(sort)에서 사용하고
		//추상메소드(compare)의 구현은 해당 메소드(sort)를 
		//실행하는 쪽에서 구현한다.
		Collections.sort(stuList, new Comparator<Student>() {
			@Override
			public int compare(Student stuA, Student stuB) {
				double diff = stuA.getAvg() - stuB.getAvg();
				return (diff < 0 ) ? (1) : (-1);
			}
		});
		
		//람다식
		Collections.sort(stuList, (stuA, stuB) -> 
			(stuA.getAvg() - stuB.getAvg() < 0) ? (1) : (-1)
		);
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println(i + 1 + "등." + stuList.get(i));
		}
		
		//콜백 함수 만들기
		MyCollections.mySort(stuList, new MyComparator<Student>() {
			@Override
			public boolean myCompare(Student a, Student b) {
				return a.getAvg() < b.getAvg();
			}
		});
		
		//람다식
		MyCollections.mySort(stuList, (a, b) -> 
		a.getAvg() < b.getAvg());
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println(i + 1 + "등." + stuList.get(i));
		}
		
	}
	
}
