package com.purbashis.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	//public String home(HttpServletRequest req,HttpServletResponse res ) //HttpServletRequest request the data 
	//{    // HttpSession session =req.getSession();
	//	String name = req.getParameter("name");//data coming from the client 
		//System.out.println("it accepted ."+name);
		//request dispatcher 
	//	session.setAttribute("name", name);
	
	//	return "home";
	
	
	
	
	
	
	//model and view
	public ModelAndView home(@RequestParam("name")String myName)
	{
	ModelAndView mv = new ModelAndView();
	mv.addObject("name",myName);
	mv.setViewName("home");
	return mv;
	
	/*
	 * Spring MVC gives u a special class model and view which can hold 
	 * two things 
	 * 1. the view name 
	 * 2.data (you can add multiple data you want )
	 */
	/*
	 * @RequestParam is a Spring Boot annotation used to extract data from an HTTP request and
	 *  bind it to a method parameter in a controller or REST endpoint.
	 *   It is typically used to retrieve query parameters,
	 *  form data, or HTTP headers from an incoming request.
	 */
	
	
	}

}
/*
 * for converting jsp to servlate we add tomcat jasper dependency 
 * 
 */