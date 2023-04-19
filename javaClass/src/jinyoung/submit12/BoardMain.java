package jinyoung.submit12;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Board board = new Board();
		CartoonBoard cartoonBoard = new CartoonBoard();
		AudioBoard audioBoard = new AudioBoard();
		
		ArrayList<Board> boardList = new ArrayList<>();
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
			System.out.println(">>>");
			
			Scanner sc = new Scanner(System.in);
			
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println(board.toString());
			}else if(select == 2) {
				System.out.println("글 제목을 입력해주세요");
				String title = sc.nextLine();
				System.out.println("글 내용을 입력해주세요");
				String text = sc.nextLine();
			}else {
				System.out.println("종료합니다.");
				break;
			}
			
		}
	}

}
