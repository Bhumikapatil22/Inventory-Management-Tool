package com.bhumika.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Manager 
{
	@Id
	private String memail;
	private String mpassword;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(String memail, String mpassword) {
		super();
		this.memail = memail;
		this.mpassword = mpassword;
	}
	@Override
	public String toString() {
		return "Manager [memail=" + memail + ", mpassword=" + mpassword + "]";
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	
	
}