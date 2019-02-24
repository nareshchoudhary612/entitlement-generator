/***************************************************************************************
 * Entity class for Portfolio work file 
 **************************************************************************************/
package com.bjb.entitlement.entitlementgenerator2.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Portfolioworkfile")
public class PortfolioWorkFileEntity {
	
	@Id
	@Column(name="portfolioWfId")
	private String portfolioWfId;
	
	@Column(name="customerId")
	private String customerId;
	
	@Column(name="accountId")
	private String accountID;
	
	@Column(name="accountCurrency")
	private String accountCurrency;
	
	@Column(name="diaryCurrency")
	private String diaryCurrency;
	
	@Column(name="units")
	private float units;
	
	@Column(name="company")
	private String company;
	
	public PortfolioWorkFileEntity() {
		
	}
	
	public PortfolioWorkFileEntity(String portfolioWfId, String customerId, String accountID, String accountCurrency,
			String diaryCurrency, float units, String company) {
		super();
		this.portfolioWfId = portfolioWfId;
		this.customerId = customerId;
		this.accountID = accountID;
		this.accountCurrency = accountCurrency;
		this.diaryCurrency = diaryCurrency;
		this.units = units;
		this.company = company;
	}

	public String getPortfolioWfId() {
		return portfolioWfId;
	}

	public void setPortfolioWfId(String portfolioWfId) {
		this.portfolioWfId = portfolioWfId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public String getDiaryCurrency() {
		return diaryCurrency;
	}

	public void setDiaryCurrency(String diaryCurrency) {
		this.diaryCurrency = diaryCurrency;
	}

	public float getUnits() {
		return units;
	}

	public void setUnits(float units) {
		this.units = units;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	
	
}


/*package com.bjb.entitlement.entitlementgenerator2.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Portfolioworkfile")
public class PortfolioWorkFileEntity {
	
	@Id
	@Column(name="portfolioWfId")
	private String portfolioWfId;
	
	@Column(name="customerId")
	private String customerId;
	
	@Column(name="accountId")
	private String accountID;
	
	@Column(name="accountCurrency")
	private String accountCurrency;
	
	@Column(name="diaryCurrency")
	private String diaryCurrency;
	
	@Column(name="units")
	private float units;
	
	@Column(name="company")
	private String company;
	
	public PortfolioWorkFileEntity() {
		
	}
	
	public PortfolioWorkFileEntity(String portfolioWfId, String customerId, String accountID, String accountCurrency,
			String diaryCurrency, float units, String company) {
		super();
		this.portfolioWfId = portfolioWfId;
		this.customerId = customerId;
		this.accountID = accountID;
		this.accountCurrency = accountCurrency;
		this.diaryCurrency = diaryCurrency;
		this.units = units;
		this.company = company;
	}

	public String getPortfolioWfId() {
		return portfolioWfId;
	}

	public void setPortfolioWfId(String portfolioWfId) {
		this.portfolioWfId = portfolioWfId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public String getDiaryCurrency() {
		return diaryCurrency;
	}

	public void setDiaryCurrency(String diaryCurrency) {
		this.diaryCurrency = diaryCurrency;
	}

	public float getUnits() {
		return units;
	}

	public void setUnits(float units) {
		this.units = units;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	
	
}
*/