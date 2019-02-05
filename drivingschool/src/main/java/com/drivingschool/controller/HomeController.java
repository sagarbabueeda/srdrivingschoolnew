package com.drivingschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	String enrollId="";
	
	@RequestMapping("/getEnrollIdController")
	public String getEnrollIdController() {
		
		int enrollIdInt1=(int) (Math.random()*10);
		int enrollIdInt2=(int) (Math.random()*10);
		int enrollIdInt3=(int) (Math.random()*10);
		int enrollIdInt4=(int) (Math.random()*10);
		int enrollIdInt5=(int) (Math.random()*10);
		int enrollIdInt6=(int) (Math.random()*10);
		
		enrollId = "E"+enrollIdInt1+enrollIdInt2+enrollIdInt3+enrollIdInt4+enrollIdInt5+enrollIdInt6;
		
		return enrollId;	
		
	}
	
	@RequestMapping("/")
	public String getPage() {
		
		return "index";
		
	}


}
