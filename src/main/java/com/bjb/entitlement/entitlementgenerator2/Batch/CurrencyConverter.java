package com.bjb.entitlement.entitlementgenerator2.Batch;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.bjb.entitlement.entitlementgenerator2.Bean.CurrencyConversionBean;

public class CurrencyConverter {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public float convert(String from,String to, float quantity) {
	logger.info("Calling currency conversion microserivce with currency conversion from "+ from +" to "+ to);
	String quantity_str = Float.toString(quantity);
	Map<String, String> uriVariables = new HashMap<>();
	uriVariables.put("diaryCurrency",from);
	uriVariables.put("accountCurrency", to);
	uriVariables.put("quantity", quantity_str);
	
	
	ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
									"http://localhost:8100/currency-converter/from/{diaryCurrency}/to/{accountCurrency}/quantity/{quantity}",
								//	"http://localhost:8765/currency-conversion-service/currency-converter-feign/from/{diaryCurrency}/to/{accountCurrency}/quantity/{quantity}",
								//	"http://localhost:8000/currency-exchange/from/{cfrom}/to/{cto}",
									CurrencyConversionBean.class,
									uriVariables);
	CurrencyConversionBean response = responseEntity.getBody();
	
	return response.getTotalCalculatedAmount();
	}
}
