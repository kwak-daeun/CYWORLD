package book.dto;

import java.util.Date;



public class Book {
	
	private int bookNo;		// 방명록 번호
	private Date bookDate;		// 방명록 작성일자
	private String bookContent;	// 방명록 내용
	private String bookSecret;	// 방명록 비밀글
	private String bookId;		// 방명록 작성자 
	
	
	public Book() {}

	@Override
	public String toString() {
		return "Book [bookN=" + bookNo + ", bookDate=" + bookDate + ", bookContent=" + bookContent + ", bookSecret="
				+ bookSecret + ", bookId=" +bookId + "]";
	}

	public Book(int bookNo, Date bookDate, String bookContent, String bookSecret, String bookId) {
		super();
		this.bookNo = bookNo;
		this.bookDate = bookDate;
		this.bookContent = bookContent;
		this.bookSecret = bookSecret;
		this.bookId = bookId;
	}
	
	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}


	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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