package ch09_class.nextt.homePage;

import java.util.Scanner;

public class HomePageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//회원가입, 로그인
		//학번, 아이디, 비밀번호, 이름
		
		MemberDB memDB = MemberDB.getInstance();
		BoardDB boardDB = BoardDB.getInstance();
		memDB.showMemList();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 회원가입 | 2. 로그인 | 3.회원목록 | 4. 종료");
			System.out.println(">>>");
			
			int command = Integer.parseInt(sc.nextLine());
			
			if(command == 1) {
				//회원가입
				System.out.println("아이디를 입력해주세요");
				System.out.println(">>>");
				String id = sc.nextLine();
				
				System.out.println("비밀번호를 입력해주세요");
				System.out.println(">>>");
				String pw = sc.nextLine();
				
				System.out.println("이름을 입력해주세요");
				System.out.println(">>>");
				String name = sc.nextLine();
				
				Member mem = new Member(memDB.makeStuId(), id, pw, name);
				memDB.registMember(mem);
				
			}else if (command == 2) {
				//로그인
				System.out.println("아이디를 입력해주세요");
				System.out.println(">>>");
				String id = sc.nextLine();
				
				System.out.println("비밀번호를 입력해주세요");
				System.out.println(">>>");
				String pw = sc.nextLine();
				
				//memDB 객체의 memList에서 입력한 id와 pw가 일치하는 Member 객체를
				//찾아서 해당 Member 객체를 리턴
				Member login = memDB.login(id, pw);
				
				if(login != null) {
					//로그인 성공
					System.out.println("로그인 성공");
					System.out.println(login.getName() + "님 환영합니다");
					
					//게시판
					//게시판 목록
					//글쓰기(글 제목, 글 내용, 작성일, 글 번호)
					//글조회
					//로그아웃
					while(true) {
						//게시물 목록 출력
						boardDB.showBoardList();
						
						System.out.println("행동을 선택해주세요");
						System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
						System.out.print(">>>");
						
						int select = Integer.parseInt(sc.nextLine());
						
						if(select == 1) {
							//TODO 글쓰기
							System.out.println("글 제목을 입력해주세요");
							System.out.print(">>>");
							String title = sc.nextLine();
							
							System.out.println("글 내용을 입력해주세요");
							System.out.print(">>>");
							String content = sc.nextLine();
							
							Board board = new Board(0,title,content,login.getId());
							boardDB.addBoard(board);
						}
						else if(select == 2 ) {
							//TODO 글조회
							System.out.println("글 번호를 입력해주세요");
							System.out.println(">>>");
							
							int no = Integer.parseInt(sc.nextLine());
							
							// 1
							//제목: 공지사항 필독
							//작성자 : admin
							//
							// 욕설금지
							boardDB.selectBoard(no);
							
						}else {
							//TODO 로그아웃
							break;
						}
					}
					
				}else {
					System.out.println("아이디 혹은 비밀번호가 틀립니다");
				}
				
				
			}else if(command == 3) {
				//회원목록 보기
				memDB.showMemList();
			}else {
				//종료
				System.out.println("종료");
				break;
			}
			
		}
	}
}
