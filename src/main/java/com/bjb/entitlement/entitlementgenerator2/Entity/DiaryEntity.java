/***************************************************************************************
 * Entity class for table Diary
 **************************************************************************************/
package com.bjb.entitlement.entitlementgenerator2.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Service
@Entity
@Table(name="diary")
public class DiaryEntity {
	
	@Id
	@GeneratedValue
	@Column(name="diaryNo")
	private int diaryNo;
	
	@Column(name="eventName")
	private String eventName;
	
	@Column(name="amount")
	private int amount;
	
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="status")
	private String status;
	
	@Column (name= "payDate")
	private Date payDate;

	

	public DiaryEntity(){
		
	}

	
	

	public DiaryEntity(int diaryNo, String eventName, int amount, String companyName, String status, String currency,
			Date payDate) {
		super();
		this.diaryNo = diaryNo;
		this.eventName = eventName;
		this.amount = amount;
		this.companyName = companyName;
		this.status = status;
		this.currency = currency;
		this.payDate = payDate;
	}




	public int getDiaryNo() {
		return diaryNo;
	}



	public void setDiaryNo(int diaryNo) {
		this.diaryNo = diaryNo;
	}



	public String getEventName() {
		return eventName;
	}



	public void setEventName(String eventName) {
		this.eventName = eventName;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public Date getPayDate() {
		return payDate;
	}



	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	
	
	
	

	
	
}


/*package com.bjb.entitlement.entitlementgenerator2.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="diary")
public class DiaryEntity {
	
	@Id
	@Column(name="diaryNo")
	private int diaryNo;
	
	@Column(name="eventName")
	private String eventName;
	
	@Column(name="amount")
	private int amount;
	
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="status")
	private String status;
	
	@Column (name= "payDate")
	private Date payDate;

	

	public DiaryEntity(){
		
	}

	
	

	public DiaryEntity(int diaryNo, String eventName, int amount, String companyName, String status, String currency,
			Date payDate) {
		super();
		this.diaryNo = diaryNo;
		this.eventName = eventName;
		this.amount = amount;
		this.companyName = companyName;
		this.status = status;
		this.currency = currency;
		this.payDate = payDate;
	}




	public int getDiaryNo() {
		return diaryNo;
	}



	public void setDiaryNo(int diaryNo) {
		this.diaryNo = diaryNo;
	}



	public String getEventName() {
		return eventName;
	}



	public void setEventName(String eventName) {
		this.eventName = eventName;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public Date getPayDate() {
		return payDate;
	}



	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	
	
	
	

	
	
}
*/