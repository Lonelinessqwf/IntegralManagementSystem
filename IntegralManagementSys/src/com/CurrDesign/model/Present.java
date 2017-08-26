package com.CurrDesign.model;


public class Present{
	private String presentID;
	private String presentType;
	private double presentPrice;
	private int costIntegral;
	private int presentNum;
	public String getPresentID() {
		return presentID;
	}
	public void setPresentID(String presentID) {
		this.presentID = presentID;
	}
	public String getPresentType() {
		return presentType;
	}
	public void setPresentType(String presentType) {
		this.presentType = presentType;
	}
	public double getPresentPrice() {
		return presentPrice;
	}
	public void setPresentPrice(double presentPrice) {
		this.presentPrice = presentPrice;
	}
	public int getCostIntegral(){
		return costIntegral;
	}
	public void setCostIntegral(int costIntegral){
		this.costIntegral = costIntegral;
	}
	public int getPresentNum() {
		return presentNum;
	}
	public void setPresentNum(int presentNum) {
		this.presentNum = presentNum;
	}
	
}
