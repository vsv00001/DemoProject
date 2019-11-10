package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	CommonService commonService;
	
	@RequestMapping("demo")
	public String demo() {
		return commonService.common();
	}
	
}
