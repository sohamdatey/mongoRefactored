package com.reporting.test.report.liabilitybyfund.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="reportconfig")
public class LiabilityByFundConfig {

	
	@Id
	private String reportId;
	private Date begindate;
	private Date endDate;
	private int assetGroupId;
	private int companyId;
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
	@Override
	public String toString() {
		return "LiabilityByFundConfig [reportId=" + reportId + ", begindate=" + begindate + ", endDate=" + endDate
				+ ", assetGroupId=" + assetGroupId + ", companyId=" + companyId + "]";
	}
	
	

}
