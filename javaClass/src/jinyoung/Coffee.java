package jinyoung;

public class Coffee {
	
	private String Name;
	private int price;
	
	public Coffee(){}
	
	@Override
	public String toString() {
		return Name +  ":" + price ;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Coffee(String name, int price) {
		super();
		Name = name;
		this.price = price;
	}
}
