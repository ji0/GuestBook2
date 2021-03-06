package com.sds.icto.guestbook.vo;

public class GuestBookVO {
	
	
	private Long no;
	private String name;
	private String password;
	private String message;
	private String reg_date;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	
	public GuestBookVO(){}
	
	public GuestBookVO(Long no, String name, String password, String message,
			String reg_date) {
		super();
		this.no = no;
		this.name = name;
		this.password = password;
		this.message = message;
		this.reg_date = reg_date;
	}
	
	
	
	

}
