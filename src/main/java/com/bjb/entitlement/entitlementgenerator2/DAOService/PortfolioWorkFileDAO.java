/***************************************************************************************
 * Data access layer for Portfolio Work file
 **************************************************************************************/
package com.bjb.entitlement.entitlementgenerator2.DAOService;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.bjb.entitlement.entitlementgenerator2.Entity.PortfolioWorkFileEntity;

public interface PortfolioWorkFileDAO extends CrudRepository<PortfolioWorkFileEntity, Long>{
	
	List<PortfolioWorkFileEntity> findByCompany(String company);
	
	
}
