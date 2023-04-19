package jinyoung.submit10;

public class Book {
	private int bookNo;
	private String bookName;
	private boolean bookRental;
	
	public Book() {}

	public Book(int bookNo, String bookName, boolean bookRental) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookRental = bookRental;
	}

	@Override
	public String toString() {
		//삼항연산자
//		String state =(bookRental) ? ("대여중") : ("입고중") ;
//		
//		return "[책번호: " + bookNo + ", 책 제목: " + bookName + ", 대여상태: "+ 
//		 state + "]";
		if(bookRental) {
			return "[책번호: " + bookNo + ", 책 제목: " + bookName + ", 대여상태: 대여중" + "]";
		}else {
			return "[책번호: " + bookNo + ", 책 제목: " + bookName + ", 대여상태: 입고중" + "]";
		}
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public boolean isBookRental() {
		return bookRental;
	}

	public void setBookRental(boolean bookRental) {
		this.bookRental = bookRental;
	}
	
	
	
	
}
