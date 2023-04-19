package jinyoung.submit10;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	private ArrayList<Book> bookList = new ArrayList<>();

	private Library() {
		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";
		
		String[] temp = strBooks.split(",");
		
		//공백제거
		for(int i = 0; i < temp.length; i++) {
			temp[i] = temp[i].trim();
		}
		
		for(int i = 0; i < temp.length; i++) {
			bookList.add(new Book(bookList.size()+1, temp[i], false));
		}
		
		
		
//		bookList.add(new Book(1, "삼국지", false));
//		bookList.add(new Book(2, "해리포터와 마법사의 돌", false));
//		bookList.add(new Book(3, "해리포터와 비밀의 방", false));
//		bookList.add(new Book(4, "해리포터와 아즈카반의 죄수", false));
//		bookList.add(new Book(5, "해리포터와 불사조 기사단", false));
//		bookList.add(new Book(6, "해리포터와 혼혈왕자", false));
//		bookList.add(new Book(7, "해리포터와 죽음의 성물,어린왕자", false));
//		bookList.add(new Book(8, "나의 라임 오렌지나무", false));
//		bookList.add(new Book(9, "이것이 자바다", false));
//		bookList.add(new Book(10, "좋은생각", false));
//		bookList.add(new Book(11, "반지의 제왕: 반지 원정대,", false));
//		bookList.add(new Book(12, "반지의 제왕: 두 개의 탑", false));
//		bookList.add(new Book(13, "반지의 제왕: 왕의 귀환", false));
//		bookList.add(new Book(14, "토익보카", false));
//		bookList.add(new Book(15, "개미", false));
	}


	// 싱글톤
	
	private static Library instance = new Library();

	public static Library getInstance() {
		return instance;
	}

	// 책 입고
	public void inputLib(int no) {
		for (int i = 0; i < bookList.size(); i++) {
			Book bo = bookList.get(i);
			if (bo.getBookNo() == no) {
				bo.setBookRental(false);
				System.out.println(bo.getBookName() + "이(가) 입고되었습니다.");
			}
		}
	}

	// 책 대여
	public void selectLibrary(int no) {
		for (int i = 0; i < bookList.size(); i++) {
			Book bo = bookList.get(i);
			if (bo.getBookNo() == no) {
				bo.setBookRental(true);
				System.out.println(bo.getBookName() + "을 대여하였습니다.");
			}
		}
	}

	// 책 목록
	public void showLibList() {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}

	// 책 검색
	public void findBook(String name) {
		for (int i = 0; i < bookList.size(); i++) {
			Book bo = bookList.get(i);
			if (bo.getBookName().contains(name)) {
				System.out.println(bookList.get(i));
			}
		}
		return;
	}

	// @책 대여
	//책 검색 + 검색된 책 목록 리턴
	public ArrayList<Book> searchBookList(String keyword){
		ArrayList<Book> result = new ArrayList<>();
		
		for (int i = 0; i < bookList.size(); i++) {
			Book bo = bookList.get(i);
			if(bo.getBookName().contains(keyword)) {
				result.add(bookList.get(i));
			}
		}
		return result;
	}
}
