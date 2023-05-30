package user.dto;

import java.util.Date;

public class User {

	private int memberNo;			// 회원 번호
	private String memberId;		// 회원 아이디
	private String memberPw;		// 회원 비밀번호
	private Date memberDate;		// 회원 가입일
	private String memberName;		// 회원 이름
	private String memberPhone;		// 회원 핸드폰
	private Date memberBirth;		// 회원 생년월일
	
	public User() {}
	
	@Override
	public String toString() {
		return "User [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPw=" + memberPw + ", memberDate="
				+ memberDate + ", memberName=" + memberName + ", memberPhone=" + memberPhone + ", memberBirth="
				+ memberBirth + "]";
	}

	public User(int memberNo, String memberId, String memberPw, Date memberDate, String memberName, String memberPhone,
			Date memberBirth) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberDate = memberDate;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberBirth = memberBirth;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public Date getMemberDate() {
		return memberDate;
	}

	public void setMemberDate(Date memberDate) {
		this.memberDate = memberDate;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public Date getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(Date memberBirth) {
		this.memberBirth = memberBirth;
	}
}