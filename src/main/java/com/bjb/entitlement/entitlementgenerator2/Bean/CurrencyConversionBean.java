/***************************************************************************************
 * Bean used to hold the data fetched from currency conversion microservice 
 **************************************************************************************/
package com.bjb.entitlement.entitlementgenerator2.Bean;

	import java.math.BigDecimal;
	import org.springframework.stereotype.Component;

	@Component
	public class CurrencyConversionBean {
		
		private long id;
		private String cfrom;
		private String cto;
		private BigDecimal conversionMultiple;
		private BigDecimal quantity;
		private float totalCalculatedAmount;
		private int port;
		
		public CurrencyConversionBean(){
			
		}
		public CurrencyConversionBean(long id, String cfrom, String cto,
									  BigDecimal conversionMultiple,
									  BigDecimal quantity,
									  float totalCalculatedAmount,
									  int port) {
			super();
			this.id = id;
			this.cfrom = cfrom;
			this.cto = cto;
			this.conversionMultiple = conversionMultiple;
			this.quantity = quantity;
			this.totalCalculatedAmount = totalCalculatedAmount;
			this.port = port;
		}
		public float getTotalCalculatedAmount() {
			return totalCalculatedAmount;
		}
		public void setTotalCalculatedAmount(float totalCalculatedAmount) {
			this.totalCalculatedAmount = totalCalculatedAmount;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getCfrom() {
			return cfrom;
		}
		public void setCfrom(String cfrom) {
			this.cfrom = cfrom;
		}
		public String getCto() {
			return cto;
		}
		public void setCto(String cto) {
			this.cto = cto;
		}
		public BigDecimal getConversionMultiple() {
			return conversionMultiple;
		}
		public void setConversionMultiple(BigDecimal conversionMultiple) {
			this.conversionMultiple = conversionMultiple;
		}
		public BigDecimal getQuantity() {
			return quantity;
		}
		public void setQuantity(BigDecimal quantity) {
			this.quantity = quantity;
		}
		public int getPort() {
			return port;
		}
		public void setPort(int port) {
			this.port = port;
		}
}


