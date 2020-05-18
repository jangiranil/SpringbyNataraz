package com.nt.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private Integer sno;
	private String sname;
	private String saddrs;
	private Date dob;
	
	@Required
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	@Required
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Required
	public void setSaddrs(String saddrs) {
		this.saddrs = saddrs;
	}
	//@Required
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", saddrs=" + saddrs + ", dob=" + dob + "]";
	}

	
}
