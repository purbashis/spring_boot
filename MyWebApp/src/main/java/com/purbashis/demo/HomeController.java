package com.purbashis.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
	@RequestMapping("home")
	//@ResponseBody
	
	/*
	 * @RequestMapping("home") is a Spring Boot annotation used to
	 *  map HTTP requests to a controller method that handles requests
	 *   for a specific URL path.
	 */
	
	public String home ()
	{
		System.out.println("hi accepted");
		return"home.jsp";
	}

}
/*
 * for converting jsp to servlate we add tomcat jasper dependency 
 * 
 */
