/***************************************************************************************
 * Data Access layer for diary 
 **************************************************************************************/
package com.bjb.entitlement.entitlementgenerator2.DAOService;


import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.bjb.entitlement.entitlementgenerator2.Entity.DiaryEntity;

public interface DiaryDAO extends CrudRepository<DiaryEntity, Long> {
	
	List<DiaryEntity> findByStatus(String status);
	
	List<DiaryEntity> findByDiaryNo(int diaNo);
	

}
