package com.bjb.entitlement.entitlementgenerator2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bjb.entitlement.entitlementgenerator2.DAOService.DiaryDAO;
import com.bjb.entitlement.entitlementgenerator2.Entity.DiaryEntity;

@RestController
@RequestMapping(path ="/diary")
public class DiaryController {
	
	@Autowired
    DiaryDAO diaryDAO;

//	@RequestMapping(method = RequestMethod.GET, path="/x")
	@RequestMapping(method = RequestMethod.GET, path="/status/{status}")
	public List<DiaryEntity> helloWorld(@PathVariable("status") String status) {
		System.out.println("Requested diary with status :" + status);	
		List<DiaryEntity> diarys = diaryDAO.findByStatus(status);
		System.out.println(diarys.get(1).getDiaryNo());
		System.out.println(diarys.get(1).getStatus());
			return diarys;
	}
	
	@RequestMapping(method = RequestMethod.GET, path="/diary/{diaNo}")
	public List<DiaryEntity> getDiary(@PathVariable("diaNo") String diaNo) {
		System.out.println("Requested diary with id :" + diaNo);	
		List<DiaryEntity> diarys = diaryDAO.findByDiaryNo(diaNo);
		System.out.println(diarys.get(1).getDiaryNo());
		System.out.println(diarys.get(1).getStatus());
			return diarys;
	}
}
