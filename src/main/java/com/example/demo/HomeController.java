package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	//@ResponseBody
	/*
	 * Use ResponseBody to display return anything written inside the controller. As
	 * jsp not supported by Springboot, to return a jsp page, need to add mvn
	 * dependency "tomcat-jasper" in pom.xml file.
	 */	
	
	public String home(HttpServletRequest request) {
		String name = request.getParameter("name");
		System.out.println("Hi, welcome"+name);
		request.setAttribute("name", name);
		return "home";
	}

}
