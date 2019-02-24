package com.bjb.entitlement.entitlementgenerator2.Batch;

import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import com.bjb.entitlement.entitlementgenerator2.DAOService.PortfolioWorkFileDAO;
import com.bjb.entitlement.entitlementgenerator2.Entity.DiaryEntity;
import com.bjb.entitlement.entitlementgenerator2.Entity.EntitlementEntity;
import com.bjb.entitlement.entitlementgenerator2.Entity.PortfolioWorkFileEntity;
	 
	public class entGenProcessor implements ItemProcessor<DiaryEntity, List<EntitlementEntity>>
	{
		private Logger logger = LoggerFactory.getLogger(this.getClass());
		@Autowired
		PortfolioWorkFileDAO portfolioWorkFileDAO;
		
		@Override
		public List<EntitlementEntity> process(DiaryEntity item) throws Exception {
			
			List<PortfolioWorkFileEntity> pfwfs = portfolioWorkFileDAO.findByCompany(item.getCompanyName());
			CurrencyConverter cc = new CurrencyConverter();
			List<EntitlementEntity> eeList = new ArrayList<EntitlementEntity>();
			logger.info("Number of Portfolio having "+item.getCompanyName()+" shares are " + pfwfs.size());
		
			for(int i =0; i<pfwfs.size(); i++) {
			
				logger.info("Processing "+ (i+1)+" out of"+pfwfs.size());
				
				EntitlementEntity entitlementEntity= new EntitlementEntity();
				
				entitlementEntity.setDiaryId(item.getDiaryNo());
				
				entitlementEntity.setCustomerId(pfwfs.get(i).getCustomerId());
				
				entitlementEntity.setAccountId(pfwfs.get(i).getAccountID());
				
				entitlementEntity.setPortfolioId(pfwfs.get(i).getPortfolioWfId());
				
				entitlementEntity.setPayCurrency(item.getCurrency());			
				
				entitlementEntity.setAccountCurrency(pfwfs.get(i).getAccountCurrency());
				
				entitlementEntity.setUnits(pfwfs.get(i).getUnits());
				
				entitlementEntity.setPerUnitAmount(item.getAmount());
				
				float totalAmountTemp = entitlementEntity.getUnits()* entitlementEntity.getPerUnitAmount();
				
				if(entitlementEntity.getPayCurrency() != entitlementEntity.getAccountCurrency()) {
					float totalAmount =cc.convert(entitlementEntity.getPayCurrency(), entitlementEntity.getAccountCurrency(), totalAmountTemp);
					entitlementEntity.setTotalDividendAmount(totalAmount);
				}
				else {
					entitlementEntity.setTotalDividendAmount(totalAmountTemp);
				}
	
					
				eeList.add(entitlementEntity);
			}

			return eeList;
		}
	}

