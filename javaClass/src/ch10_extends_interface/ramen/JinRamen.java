package ch10_extends_interface.ramen;

public class JinRamen extends Ramen{
	
	public JinRamen(String name, int price) {
		super(name,price);
	}

	@Override
	public void printRecipe() {
		// TODO Auto-generated method stub
		System.out.println("끓는 물에 면과 스프를 넣고 3분 후에 드셔요");
	}
	
}
