package jinyoung;

import java.util.ArrayList;
import java.util.Scanner;

import ch09_class.nextt.typing.school.Student;
import jinyoung.test03.Cafe;
import jinyoung.test03.Coffee;

public class test04 {
	
	//필드 선언
	private String name;
	private int price;
	
	
	public test04(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


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


	@Override
	public String toString() {
		return "test04 [name=" + name + ", price=" + price + "]";
	}
	

}
