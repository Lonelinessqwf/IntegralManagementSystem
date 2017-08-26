package com.CurrDesign.model;

import java.util.Date;

public class Integral{
	private String integralID;
	private String userID;
	private int integralType;
	private int value;
	private Date startDate;
	private Date expDate;
	public String getID() {
		return integralID;
	}
	public void setID(String id) {
		this.integralID = id;
	}
	public String getUserID() {
		return userID;
	}
	public void setUser(String id) {
		this.userID = id;
	}
	public int getIntegralType(){
		return integralType;
	}
	public void setIntegralType(int integralType)
	{
		this.integralType = integralType;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return expDate;
	}
	public void setEndDate(Date endDate) {
		this.expDate = endDate;
	}
	
	
}
