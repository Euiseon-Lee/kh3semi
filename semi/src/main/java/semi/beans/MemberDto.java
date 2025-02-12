package semi.beans;

import java.util.Date;

public class MemberDto {
	private String memberId;
	private String memberPw;
	private String memberBirth;
	private String memberName;
	private String memberFname;
	private String memberLname;
	private String memberPhone;
	private String memberEmail;
	private String memberGrade;
	private String memberPost;
	private String memberBasicAddress;
	private String memberDetailAddress;
	private Date memberJoindate;
	private Date memberLogindate;
	
	public MemberDto() {
	}
	
	


	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", memberPw=" + memberPw + ", memberBirth=" + memberBirth
				+ ", memberName=" + memberName + ", memberFname=" + memberFname + ", memberLname=" + memberLname
				+ ", memberPhone=" + memberPhone + ", memberEmail=" + memberEmail + ", memberGrade=" + memberGrade
				+ ", memberPost=" + memberPost + ", memberBasicAddress=" + memberBasicAddress + ", memberDetailAddress="
				+ memberDetailAddress + ", memberJoindate=" + memberJoindate + ", memberLogindate=" + memberLogindate
				+ "]";
	}




	//member : getter + setter 
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
	public String getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
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
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPost() {
		return memberPost;
	}
	public void setMemberPost(String memberPost) {
		this.memberPost = memberPost;
	}
	public String getMemberBasicAddress() {
		return memberBasicAddress;
	}
	public void setMemberBasicAddress(String memberBasicAddress) {
		this.memberBasicAddress = memberBasicAddress;
	}
	public String getMemberDetailAddress() {
		return memberDetailAddress;
	}
	public void setMemberDetailAddress(String memberDetailAddress) {
		this.memberDetailAddress = memberDetailAddress;
	}
	public Date getMemberJoindate() {
		return memberJoindate;
	}
	public void setMemberJoindate(Date memberJoindate) {
		this.memberJoindate = memberJoindate;
	}
	public Date getMemberLogindate() {
		return memberLogindate;
	}
	public void setMemberLogindate(Date memberLogindate) {
		this.memberLogindate = memberLogindate;
	}
	public String getMemberFname() {
		return memberFname;
	}
	public void setMemberFname(String memberFname) {
		this.memberFname = memberFname;
	}
	public String getMemberLname() {
		return memberLname;
	}
	public void setMemberLname(String memberLname) {
		this.memberLname = memberLname;
	}
	
	public String getMemberGrade() {
		return memberGrade;
	}
	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}




	//member : getter(이름(국,우편번호,기본주소,상세주소 null 처리)
	public String getMemberNameString() {
		if(this.memberName==null) return "";
		else return this.memberName;
	}
	
	public String getMemberPostString() {
		if(this.memberPost==null) return "";
		else return this.memberPost;
	}
	
	public String getMemberBasicAddressString() {
		if(this.memberBasicAddress==null) return "";
		else return this.memberBasicAddress;
	}
	
	public String getMemberDetailAddressString() {
		if(this.memberDetailAddress==null) return "";
		else return this.memberDetailAddress;
	}
	
	
}
