/***************************************************************************************
 * Entity class for table Entitlement
 **************************************************************************************/
package com.bjb.entitlement.entitlementgenerator2.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Entitlement")
public class EntitlementEntity {
	@Id
	@GeneratedValue
	@Column(name="entitlementId")
	private int entitlementId;
	
	@Column(name="diaryId")
	private int diaryId;
	
	@Column(name="customerId")
	private String customerId;
	
	@Column(name="accountId")
	private String accountId;
	
	@Column(name="portfolioId")
	private String portfolioId;
	
	@Column(name="payCurrency")
	private String payCurrency;
	
	@Column(name="accountCurrency")
	private String accountCurrency;
	
	@Column(name="units")
	private float units;
	
	@Column(name="perUnitAmount")
	private float perUnitAmount;
	
	@Column(name="totalDividendAmount")
	private float totalDividendAmount;
	
	public EntitlementEntity() {
		
	}

	
	
	public EntitlementEntity(int entitlementId, int diaryId, String customerId, String accountId, String portfolioId,
			String payCurrency, String accountCurrency, float units, float perUnitAmount, float totalDividendAmount) {
		super();
		this.entitlementId = entitlementId;
		this.diaryId = diaryId;
		this.customerId = customerId;
		this.accountId = accountId;
		this.portfolioId = portfolioId;
		this.payCurrency = payCurrency;
		this.accountCurrency = accountCurrency;
		this.units = units;
		this.perUnitAmount = perUnitAmount;
		this.totalDividendAmount = totalDividendAmount;
	}





	public String getAccountCurrency() {
		return accountCurrency;
	}





	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}





	public float getUnits() {
		return units;
	}





	public String getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

	public void setUnits(float units) {
		this.units = units;
	}

	public int getEntitlementId() {
		return entitlementId;
	}

	public void setEntitlementId(int entitlementId) {
		this.entitlementId = entitlementId;
	}

	public int getDiaryId() {
		return diaryId;
	}

	public void setDiaryId(int diaryId) {
		this.diaryId = diaryId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getPayCurrency() {
		return payCurrency;
	}

	public void setPayCurrency(String payCurrency) {
		this.payCurrency = payCurrency;
	}


	public float getPerUnitAmount() {
		return perUnitAmount;
	}

	public void setPerUnitAmount(float perUnitAmount) {
		this.perUnitAmount = perUnitAmount;
	}

	public float getTotalDividendAmount() {
		return totalDividendAmount;
	}

	public void setTotalDividendAmount(float totalDividendAmount) {
		this.totalDividendAmount = totalDividendAmount;
	}
	
	
}




//package springbatch_example.SpringBatchXmlToDatabase.model;
/*
public class EntitlementEntity {
	
	private int entitlementId;
	
	private int diaryId;
	
	private String customerId;
	
	private String accountId;
	
	private String portfolioId;
	
	private String payCurrency;
	
	private String units;
	
	private String perUnitAmount;
	
	private String totalDividendAmount;
	
	public EntitlementEntity() {
		
	}

	public EntitlementEntity(int entitlementId, int diaryId, String customerId, String accountId, String payCurrency,
			String units, String perUnitAmount, String totalDividendAmount) {
		super();
		this.entitlementId = entitlementId;
		this.diaryId = diaryId;
		this.customerId = customerId;
		this.accountId = accountId;
		this.payCurrency = payCurrency;
		this.units = units;
		this.perUnitAmount = perUnitAmount;
		this.totalDividendAmount = totalDividendAmount;
	}

	public int getEntitlementId() {
		return entitlementId;
	}

	public void setEntitlementId(int entitlementId) {
		this.entitlementId = entitlementId;
	}

	public int getDiaryId() {
		return diaryId;
	}

	public void setDiaryId(int diaryId) {
		this.diaryId = diaryId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getPayCurrency() {
		return payCurrency;
	}

	public void setPayCurrency(String payCurrency) {
		this.payCurrency = payCurrency;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getPerUnitAmount() {
		return perUnitAmount;
	}

	public void setPerUnitAmount(String perUnitAmount) {
		this.perUnitAmount = perUnitAmount;
	}

	public String getTotalDividendAmount() {
		return totalDividendAmount;
	}

	public void setTotalDividendAmount(String totalDividendAmount) {
		this.totalDividendAmount = totalDividendAmount;
	}
	
	
}
*/