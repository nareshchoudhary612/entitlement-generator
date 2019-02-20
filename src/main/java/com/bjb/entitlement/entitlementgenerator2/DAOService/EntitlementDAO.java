package com.bjb.entitlement.entitlementgenerator2.DAOService;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.bjb.entitlement.entitlementgenerator2.Entity.EntitlementEntity;
import com.bjb.entitlement.entitlementgenerator2.Entity.PortfolioWorkFileEntity;

public interface EntitlementDAO extends CrudRepository<EntitlementEntity, Long> {
	
}
