package reply.dto;

import java.util.Date;

public class Reply {

	private int replyNo;		// 댓글 번호
	private String replyCom;	// 댓글 내용
	private Date replyDate;		// 댓글 일자
	
	public Reply() {}

	@Override
	public String toString() {
		return "Reply [replyNo=" + replyNo + ", replyCom=" + replyCom + ", replyDate=" + replyDate + "]";
	}
	
	public Reply(int replyNo, String replyCom, Date replyDate) {
		super();
		this.replyNo = replyNo;
		this.replyCom = replyCom;
		this.replyDate = replyDate;
	}

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}

	public String getReplyCom() {
		return replyCom;
	}

	public void setReplyCom(String replyCom) {
		this.replyCom = replyCom;
	}

	public Date getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}
}