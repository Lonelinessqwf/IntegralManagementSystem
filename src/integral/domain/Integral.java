package integral.domain;

import java.util.Date;

public class Integral {
	private String id;
	private String value;
	private Date startDate;
	private Date expDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
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
