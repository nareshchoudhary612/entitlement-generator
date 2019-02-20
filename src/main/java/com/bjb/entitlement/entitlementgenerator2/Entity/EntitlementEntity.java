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
	
	@Column(name="units")
	private String units;
	
	@Column(name="perUnitAmount")
	private String perUnitAmount;
	
	@Column(name="totalDividendAmount")
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
