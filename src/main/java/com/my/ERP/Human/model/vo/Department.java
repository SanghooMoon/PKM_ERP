package com.my.ERP.Human.model.vo;


public class Department {
	
	// 필드
	private String dcode;	
	private String dname;	
	private String dcomment;
	private String dboss;
	private String startDate;

	public Department() {}	// 기본 생성자
	
	// get, set 메서드
	public String getDcode() {
		return dcode;
	}

	public void setDcode(String dcode) {
		this.dcode = dcode;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDcomment() {
		return dcomment;
	}

	public void setDcomment(String dcomment) {
		this.dcomment = dcomment;
	}

	public String getDboss() {
		return dboss;
	}

	public void setDboss(String dboss) {
		this.dboss = dboss;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Department [dcode=" + dcode + ", dname=" + dname + ", dcomment=" + dcomment + ", dboss=" + dboss
				+ ", startDate=" + startDate + "]";
	}

}
