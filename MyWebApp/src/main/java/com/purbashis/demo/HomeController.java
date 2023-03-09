package com.purbashis.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
//	@ResponseBody

	/*
	 * @RequestMapping("home") is a Spring Boot annotation used to
	 *  map HTTP requests to a controller method that handles requests
	 *   for a specific URL path.
	 */
	public String home(HttpServletRequest req,HttpServletResponse res ) //HttpServletRequest request the data 
	{     HttpSession session =req.getSession();
		String name = req.getParameter("name");//data coming from the client 
		System.out.println("it accepted ."+name);
		//request dispatcher 
		session.setAttribute("name", name);
	
		return "home";
	}

}
/*
 * for converting jsp to servlate we add tomcat jasper dependency 
 * 
 */