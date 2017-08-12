package integral.domain;

import java.util.Date;

public class ExchangeRecord {
	private String presentId;
	private String userId;
	private String username;
	private double costIntegral;
	private Date exchangeDate;
	public String getPresentId() {
		return presentId;
	}
	public void setPresentId(String presentId) {
		this.presentId = presentId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getCostIntegral() {
		return costIntegral;
	}
	public void setCostIntegral(double costIntegral) {
		this.costIntegral = costIntegral;
	}
	public Date getExchangeDate() {
		return exchangeDate;
	}
	public void setExchangeDate(Date exchangeDate) {
		this.exchangeDate = exchangeDate;
	}
	
	
	
}
