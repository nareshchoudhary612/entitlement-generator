package com.bjb.entitlement.entitlementgenerator2.Batch;

import java.util.List;
import javax.persistence.EntityManagerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.bjb.entitlement.entitlementgenerator2.Entity.EntitlementEntity;

public class EntGenWriter implements ItemWriter<List<EntitlementEntity>> {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	 EntityManagerFactory emf;

		@Override
		public void write(List<? extends List<EntitlementEntity>> items) throws Exception {
			logger.info("Writing data with records "+items.size());
			for(List<EntitlementEntity> z :items) {
				z.get(0).getAccountCurrency();
			}
			for(List<EntitlementEntity> o : items) {
				JpaItemWriter<EntitlementEntity> jpaItemWriter = new JpaItemWriter<>();
				jpaItemWriter.setEntityManagerFactory(emf);
				jpaItemWriter.write(o);	    			 
			}
		}	
}