package integral.domain;

import java.util.Date;

public class IntegralChangeRecord {
	private String recordId;	
	private String changeId;
	private double changeValue;
	private Date changeDate;
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getChangeId() {
		return changeId;
	}
	public void setChangeId(String changeId) {
		this.changeId = changeId;
	}
	public double getChangeValue() {
		return changeValue;
	}
	public void setChangeValue(double changeValue) {
		this.changeValue = changeValue;
	}
	public Date getChangeDate() {
		return changeDate;
	}
	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}
}
