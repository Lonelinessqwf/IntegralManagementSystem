package integral.domain;

import java.util.Date;

public class IntegralChangeRecord {
	private String recordId;	
	private String changeId;
	private int changeValue;
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
	public int getChangeValue() {
		return changeValue;
	}
	public void setChangeValue(int changeValue) {
		this.changeValue = changeValue;
	}
	public Date getChangeDate() {
		return changeDate;
	}
	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}
}
