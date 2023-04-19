package ch10_extends_interface.simple;

public class SimpleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent papa = new Parent("아빠", 50);
		
		System.out.println(papa);
		
		Child baby = new Child();
//		Parent parent = baby;
		
		baby.setName("아기");
		baby.setAge(3);
		baby.sayHello();

		System.out.println(baby);
		
		//다형성
		//(면저브 정처기 문제에 자주 출제)
		Parent nami = new Child("나미", 17);
		
		System.out.println(nami);
		System.out.println(nami.getClass());
		nami.sayHello();
		
		
	}

}
