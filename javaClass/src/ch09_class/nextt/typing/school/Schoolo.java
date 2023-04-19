package ch09_class.nextt.typing.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ch09_class.nextt.NextStudent;
import ch09_class.nextt.commans.UtillClass;

public class Schoolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student yes1 = new Student("예슬",85,80,87,(85+80+87)/3.0);
		System.out.println(yes1);
		
		//캡슐화 적용
		//같은 폴더 내에 있는 클래스라면 private 빼곤 접근 가능
		System.out.println(yes1);
		
		///avg에 대한 setter를 지워서 평균응ㄴ 수정할 수 없도록 함
//		yes1.setAvg(100);
		
		System.out.println(yes1.getKor());
		
		//국어 점수 바꾸기
		
		yes1.setKor(93);
		System.out.println(yes1);
		
		System.out.println("\n========================================\n");
		
		Student yes2 = new Student("김대일",90,95,84, UtillClass.weRound( (90+95+84)/3.0 , 1));
		System.out.println(yes2);
		
		yes2.setEng(85);
		System.out.println(yes2);
		
		
		//평균을 넣지 않아도 적용되도록 생성자 추가
		Student yujeong = new Student("유정",92,83,78);
		System.out.println(yujeong);
		
		System.out.println("\n========================================\n");
		
		ArrayList<Student> stuList = new ArrayList<>();
		stuList.add(yes1);
		stuList.add(yes2);
		stuList.add(yujeong);
		stuList.add(new Student("준호",80,57,68));
		stuList.add(new Student("민경",75,64,89));
		stuList.add(new Student("준하",82,67,87));
		
		for(int i = 0; i< stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		System.out.println("\n========================================\n");
		
		//학생들의 평균을 이용해서 
		//1등. xx~~~~
		
		for(int k = 0; k < stuList.size(); k++) {
			for(int i = 0; i < stuList.size()-1; i++) {
				// i > i+1 하면 오름차순
				// i < i+1 하면 내림차순
				if(stuList.get(i).getAvg() < stuList.get(i+1).getAvg()) {
					Student t  = stuList.get(i);
					stuList.set(i, stuList.get(i+1));
					stuList.set(i+1, t);
				}
				
			}
		}
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1) + "등 " + stuList.get(i));
		}
		
		System.out.println("\n========================================\n");
		
		//Collections.sort()
//		Collections.sort(stuList, (stuA,stuB) -> (int)(stuA.getAvg() - stuB.getAvg()));
		
		Collections.sort(stuList, new Comparator<Student>() {
			@Override
			public int compare(Student stuA, Student stuB) {
				double diff = stuB.getAvg() - stuA.getAvg();
				//양의 소수, 음의 소수
				if(diff < 0) {
					//음의 정수
					return -1;
				}
				return 1;
			}
		});
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1) + "등 " + stuList.get(i));
		}
		
		System.out.println("\n========================================\n");
		
		Collections.sort(stuList , (stuA,stuB) 
				-> (stuB.getAvg() - stuA.getAvg() > 0) ? (1) : (-1));
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1) + "등 " + stuList.get(i));
		}
	}

}
