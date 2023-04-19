package jinyoung.submit12;

public class Board {
	private int num;
	private String title;
	private String date;
	private String text;
	
	public Board() {
		
	}
	
	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", date=" + date + ", text=" + text + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Board(int num, String title, String date, String text) {
		super();
		this.num = num;
		this.title = title;
		this.date = date;
		this.text = text;
	}
	
	
	
}
