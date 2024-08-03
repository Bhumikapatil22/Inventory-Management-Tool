package com.bhumika.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class RawMaterial 
{
	@Id
	private int mid;
	private String mname;
	private int mquantity;
	private String munit;
	private float mcost;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMquantity() {
		return mquantity;
	}
	public void setMquantity(int mquantity) {
		this.mquantity = mquantity;
	}
	public String getMunit() {
		return munit;
	}
	public void setMunit(String munit) {
		this.munit = munit;
	}
	public float getMcost() {
		return mcost;
	}
	public void setMcost(float mcost) {
		this.mcost = mcost;
	}
	@Override
	public String toString() {
		return "RawMaterial [mid=" + mid + ", mname=" + mname + ", mquantity=" + mquantity + ", munit=" + munit
				+ ", mcost=" + mcost + "]";
	}
	public RawMaterial(int mid, String mname, int mquantity, String munit, float mcost) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mquantity = mquantity;
		this.munit = munit;
		this.mcost = mcost;
	}
	public RawMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
