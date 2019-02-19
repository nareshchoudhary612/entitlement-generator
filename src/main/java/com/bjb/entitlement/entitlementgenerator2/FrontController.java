package com.bjb.entitlement.entitlementgenerator2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
	
	@RequestMapping(method = RequestMethod.GET, path="/hello")
	public String helloWorld() {
		return "hello World";
	}
}
