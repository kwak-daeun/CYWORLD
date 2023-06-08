package diary.dto;

import java.util.Date;

public class Diary {

	private int diaryNo;			// 게시글 번호
	private String memberId;		// 회원 아이디(FK)
	private String diaryCategory;	// 게시글 카테고리
	private String diaryTitle;		// 게시글 제목
	private String diaryContent;	// 게시글 내용
	private Date diaryDate;			// 게시글 작성일자
	private String diaryLike;		// 게시글 좋아요
	private String diarySecret;		// 게시글 공개여부
	
	public Diary() {}

	@Override
	public String toString() {
		return "Diary [diaryNo=" + diaryNo + ", memberId=" + memberId + ", diaryCategory=" + diaryCategory
				+ ", diaryTitle=" + diaryTitle + ", diaryContent=" + diaryContent + ", diaryDate=" + diaryDate
				+ ", diaryLike=" + diaryLike + ", diarySecret=" + diarySecret + "]";
	}

	public Diary(int diaryNo, String memberId, String diaryCategory, String diaryTitle, String diaryContent,
			Date diaryDate, String diaryLike, String diarySecret) {
		super();
		this.diaryNo = diaryNo;
		this.memberId = memberId;
		this.diaryCategory = diaryCategory;
		this.diaryTitle = diaryTitle;
		this.diaryContent = diaryContent;
		this.diaryDate = diaryDate;
		this.diaryLike = diaryLike;
		this.diarySecret = diarySecret;
	}

	public int getDiaryNo() {
		return diaryNo;
	}

	public void setDiaryNo(int diaryNo) {
		this.diaryNo = diaryNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getDiaryCategory() {
		return diaryCategory;
	}

	public void setDiaryCategory(String diaryCategory) {
		this.diaryCategory = diaryCategory;
	}

	public String getDiaryTitle() {
		return diaryTitle;
	}

	public void setDiaryTitle(String diaryTitle) {
		this.diaryTitle = diaryTitle;
	}

	public String getDiaryContent() {
		return diaryContent;
	}

	public void setDiaryContent(String diaryContent) {
		this.diaryContent = diaryContent;
	}

	public Date getDiaryDate() {
		return diaryDate;
	}

	public void setDiaryDate(Date diaryDate) {
		this.diaryDate = diaryDate;
	}

	public String getDiaryLike() {
		return diaryLike;
	}

	public void setDiaryLike(String diaryLike) {
		this.diaryLike = diaryLike;
	}

	public String getDiarySecret() {
		return diarySecret;
	}

	public void setDiarySecret(String diarySecret) {
		this.diarySecret = diarySecret;
	}
}