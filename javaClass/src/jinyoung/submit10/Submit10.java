package jinyoung.submit10;

import java.util.ArrayList;
import java.util.Scanner;

public class Submit10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library library = Library.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 책 입고 | 2. 책 대여 | 3.책 목록 | 4. 책 검색 | 5. 종료");
			System.out.print(">>>");
			
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				//책 입고
				System.out.println("책 번호를 입력해주세요");
				
				int no = Integer.parseInt(sc.nextLine());
				
				library.inputLib(no);
				
			}else if(select == 2) {
				//책 대여
				System.out.println("책 번호를 입력해주세요");
				System.out.print(">>>");
				System.out.println("책 이름을 입력해주세요: ");
				String name = sc.nextLine();
				//name을 포함하는 book 객체들을찾아서 가져오기
				
				ArrayList<Book> searchList = library.searchBookList(name);
				if(searchList.size() == 0 ) {
					System.out.println("해당 책이 존재하지 않습니다.");
				}else if(searchList.size() ==1) {
					library.selectLibrary(searchList.get(0).getBookNo());
					System.out.println(searchList);
				}else {
					library.showLibList();
					System.out.println("책 번호를 입력해주세요");
					System.out.print(">>>");
					int no = Integer.parseInt(sc.nextLine());
					
					library.selectLibrary(no);
				}
				
				
			}else if(select == 3) {
				//책 목록 
				library.showLibList();
				
			}else if(select == 4) {
				//책 검색
				System.out.println("책 이름을 입력해주세요");
				
				String name = sc.nextLine();
				
				library.findBook(name);
				
			}else{
				//종료
				System.out.println("종료합니다");
				break;
			}
			
		}
		
	}

}
