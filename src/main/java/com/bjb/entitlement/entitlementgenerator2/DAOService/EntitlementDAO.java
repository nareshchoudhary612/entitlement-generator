/***************************************************************************************
 * Data access layer for Entitlements
 **************************************************************************************/
package com.bjb.entitlement.entitlementgenerator2.DAOService;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.bjb.entitlement.entitlementgenerator2.Entity.EntitlementEntity;

public interface EntitlementDAO extends CrudRepository<EntitlementEntity, Long> {
	
}
