package jinyoung;

import java.util.ArrayList;
import java.util.HashSet;

public class test03 {

	public class Coffee {
		//Field
		private String name;
		private int price;		

		//Constructor
		public Coffee(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}
		
		//to String
		@Override
		public String toString() {
			return "Coffee [name=" + name + ", price=" + price + "]";
		}
		//Getters Setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
	}
	
	public class Cafe {
		//field
		private String cafeName;
		private ArrayList<String> Coffee = new ArrayList<>();
		
		//Constructor
		public Cafe(String cafeName, ArrayList<String> coffee) {
			super();
			this.cafeName = cafeName;
			Coffee = coffee;
		}
		public Cafe(String cafeName) {
			this.cafeName = cafeName;
		}

		//to String
		@Override
		public String toString() {
			return "Cafe [cafeName=" + cafeName + ", Coffee=" + Coffee + "]";
		}

		//Getters Setters
		public String getCafeName() {
			return cafeName;
		}

		public void setCafeName(String cafeName) {
			this.cafeName = cafeName;
		}

		public ArrayList<String> getCoffee() {
			return Coffee;
		}

		public void setCoffee(ArrayList<String> coffee) {
			Coffee = coffee;
		}
	}
}
