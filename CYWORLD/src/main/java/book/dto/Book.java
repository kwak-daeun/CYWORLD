package book.dto;

import java.util.Date;

public class Book {
	
	private int bookNum;		// 방명록 번호
	private Date bookDate;		// 방명록 작성일자
	private String bookContent;	// 방명록 내용
	private String bookSecret;	// 방명록 비밀글
	
	public Book() {}

	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookDate=" + bookDate + ", bookContent=" + bookContent + ", bookSecret="
				+ bookSecret + "]";
	}

	public Book(int bookNum, Date bookDate, String bookContent, String bookSecret) {
		super();
		this.bookNum = bookNum;
		this.bookDate = bookDate;
		this.bookContent = bookContent;
		this.bookSecret = bookSecret;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public Date getBookDate() {
		return bookDate;
	}

	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	public String getBookContent() {
		return bookContent;
	}

	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}

	public String getBookSecret() {
		return bookSecret;
	}

	public void setBookSecret(String bookSecret) {
		this.bookSecret = bookSecret;
	}
}