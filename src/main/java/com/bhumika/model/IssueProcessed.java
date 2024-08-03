package com.bhumika.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class IssueProcessed 
{
	@Id
	private int id;
	private int processedId;
	private String processedName;
	private String issuerName;
	private int quantity;
	private String issueDate;
	private String issueTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProcessedId() {
		return processedId;
	}
	public void setProcessedId(int processedId) {
		this.processedId = processedId;
	}
	public String getProcessedName() {
		return processedName;
	}
	public void setProcessedName(String processedName) {
		this.processedName = processedName;
	}
	public String getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssueTime() {
		return issueTime;
	}
	public void setIssueTime(String issueTime) {
		this.issueTime = issueTime;
	}
	@Override
	public String toString() {
		return "IssueProcessed [id=" + id + ", processedId=" + processedId + ", processedName=" + processedName
				+ ", issuerName=" + issuerName + ", quantity=" + quantity + ", issueDate=" + issueDate + ", issueTime="
				+ issueTime + "]";
	}
	public IssueProcessed(int id, int processedId, String processedName, String issuerName, int quantity,
			String issueDate, String issueTime) {
		super();
		this.id = id;
		this.processedId = processedId;
		this.processedName = processedName;
		this.issuerName = issuerName;
		this.quantity = quantity;
		this.issueDate = issueDate;
		this.issueTime = issueTime;
	}
	public IssueProcessed() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
