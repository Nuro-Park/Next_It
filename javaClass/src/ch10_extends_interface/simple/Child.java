package ch10_extends_interface.simple;

//Child는 Parent가 가진 필드변수, 메소드를 가지고 있는 상태
//private으로 되어있으면 자식 객체에서 접근할 수 없다.
public class Child extends Parent{
	
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sayHello() {
		System.out.println("응애");
	}

	@Override
	public String toString() {
		return "Child [getName()=" + super.getName() + ", getAge()=" + getAge() + "]";
	}
	
}
