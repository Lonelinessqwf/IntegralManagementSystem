package com.CurrDesign.model;

import java.util.Date;

public class PresentExchangeRecord{
	private String exchangeID;
	private String presentID;
	private Date exchangeDate;
	public String getExchangeID(){
		return exchangeID;
	}
	public void setExchangeID(String exchangeID){
		this.exchangeID = exchangeID;
	}
	public String getPresentID() {
		return presentID;
	}
	public void setPresentId(String presentId) {
		this.presentID = presentId;
	}
	public Date getExchangeDate() {
		return exchangeDate;
	}
	public void setExchangeDate(Date exchangeDate) {
		this.exchangeDate = exchangeDate;
	}
	
}
