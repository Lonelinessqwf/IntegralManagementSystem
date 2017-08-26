package com.CurrDesign.model;

import java.util.Date;

public class Account{
	private String userID;
	private String userName;
	private String password;
	private String realName;
	private Date netInDate;
	private String telephone;
	private Date birth;
	private String address;
	private int level;
	private int currentIntegral;
	public String getID() {
		return userID;
	}
	public void setID(String id) {
		this.userID = id;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Date getNetInDate() {
		return netInDate;
	}
	public void setNetInDate(Date netInDate) {
		this.netInDate = netInDate;
	}
	public String getPhoneNum() {
		return telephone;
	}
	public void setPhoneNum(String telephone) {
		this.telephone = telephone;
	}
	public Date getBirthday() {
		return birth;
	}
	public void setBirthday(Date birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getCurrentIntegral() {
		return currentIntegral;
	}
	public void setCurrentIntegral(int currentIntegral) {
		this.currentIntegral = currentIntegral;
	}
	
	
}
