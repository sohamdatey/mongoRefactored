package com.reporting.test.report.pr.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="reportconfig")
public class ParticipantConfig {

	
	@Id
	private String reportId;
	private Date begindate;
	private Date endDate;
	private int assetGroupId;
	private int companyId;
	private int empId;
	
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public Date getBegindate() {
		return begindate;
	}
	public void setBegindate(Date begindate) {
		this.begindate = begindate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getAssetGroupId() {
		return assetGroupId;
	}
	public void setAssetGroupId(int assetGroupId) {
		this.assetGroupId = assetGroupId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "ParticipantConfig [reportId=" + reportId + ", begindate=" + begindate + ", endDate=" + endDate
				+ ", assetGroupId=" + assetGroupId + ", companyId=" + companyId + ", empId=" + empId + "]";
	}
	
	
	
	

}
