package com.CurrDesign.model;


import java.util.Date;

public class IntegralChangeRecord{	
	private String changeID;
	private String integralID;
	private int changeValue;
	private Date changeTime;
	private int reason;
	private String reasonExtra;
	public String getChangeID() {
		return changeID;
	}
	public void setChangeID(String changeID) {
		this.changeID = changeID;
	}
	public String getIntegralID() {
		return integralID;
	}
	public void setIntegralID(String integralID) {
		this.integralID = integralID;
	}
	public double getChangeValue() {
		return changeValue;
	}
	public void setChangeValue(int changeValue) {
		this.changeValue = changeValue;
	}
	public Date getChangeTime() {
		return changeTime;
	}
	public void setChangeDate(Date changeTime) {
		this.changeTime = changeTime;
	}
	public int getReason(){
		return reason;
	}
	public void setReason(int reason){
		this.reason = reason;
	}
	public String getReasonExtra(){
		return reasonExtra;
	}
	public void setReasonExtra(String reasonExtra){
		this.reasonExtra = reasonExtra;
	}
}
