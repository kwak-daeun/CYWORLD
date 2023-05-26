package reply.dto;

import java.util.Date;

public class Reply {

	private int replyNum;		// 댓글 번호
	private String replyCom;	// 댓글 내용
	private Date replyDate;		// 댓글 일자
	
	public Reply() {}

	@Override
	public String toString() {
		return "Reply [replyNum=" + replyNum + ", replyCom=" + replyCom + ", replyDate=" + replyDate + "]";
	}
	
	public Reply(int replyNum, String replyCom, Date replyDate) {
		super();
		this.replyNum = replyNum;
		this.replyCom = replyCom;
		this.replyDate = replyDate;
	}

	public int getReplyNum() {
		return replyNum;
	}

	public void setReplyNum(int replyNum) {
		this.replyNum = replyNum;
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