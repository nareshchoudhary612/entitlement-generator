/***************************************************************************************
 * Test controller to check DAO services
 **************************************************************************************/
package com.bjb.entitlement.entitlementgenerator2;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bjb.entitlement.entitlementgenerator2.DAOService.DiaryDAO;
import com.bjb.entitlement.entitlementgenerator2.DAOService.EntitlementDAO;
import com.bjb.entitlement.entitlementgenerator2.DAOService.PortfolioWorkFileDAO;
import com.bjb.entitlement.entitlementgenerator2.Entity.DiaryEntity;
import com.bjb.entitlement.entitlementgenerator2.Entity.EntitlementEntity;
import com.bjb.entitlement.entitlementgenerator2.Entity.PortfolioWorkFileEntity;

@RestController
@RequestMapping(path ="/diary")
public class DiaryController {
	
	@Autowired
    DiaryDAO diaryDAO;
	@Autowired
	PortfolioWorkFileDAO portfolioWorkFileDAO;
	@Autowired
	EntitlementDAO entitlementDAO;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(method = RequestMethod.GET, path="/status/{status}")
	public List<DiaryEntity> helloWorld(@PathVariable("status") String status) {
		logger.info("Requested diary with status :" + status);	
		List<DiaryEntity> diarys = diaryDAO.findByStatus(status);
		return diarys;
	}
	
	@RequestMapping(method = RequestMethod.GET, path="/id/{diaNo}")
	public List<DiaryEntity> getDiary(@PathVariable("diaNo") String diaNo) {
		int diary_number = Integer.parseInt(diaNo);
		System.out.println("Requested diary with id :" + diaNo);	
		List<DiaryEntity> diarys = diaryDAO.findByDiaryNo(diary_number);
		return diarys;
	}
	
	@RequestMapping(method = RequestMethod.GET, path="/entitlement/company/{company}")
	public List<PortfolioWorkFileEntity> getPortFolio(@PathVariable("company") String company) {
		logger.info("Requested portfolio holding share of company :" + company);	
		List<PortfolioWorkFileEntity> pf = portfolioWorkFileDAO.findByCompany(company);
		return pf;
	}
	
	@PostMapping("/entitlement/create")
	public int createEntitlement(@RequestBody EntitlementEntity newEntitlement){
		EntitlementEntity ee = entitlementDAO.save(newEntitlement);		
		return ee.getEntitlementId();
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
	}

}
