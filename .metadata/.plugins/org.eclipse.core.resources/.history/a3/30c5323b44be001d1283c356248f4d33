package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		 
	ConfigurableApplicationContext context =	SpringApplication.run(DemoApplication.class, args);
	
	 Alien a = context.getBean(Alien.class); a.show(); 
	 
	 
	 //object   created only once  -spring framework uses single turn design pattern 
	
	 /*@Component : it will instantiate your object it means you want a new object 
	  */
	  

	
	 /*@Scope : it will not create the object automatically .
	 *you have to call then after it will create object for you .  
	 */
	 
	 
	 /*@Autowired : it will try to search for the object in this spring container
		and will get connected with the object 
		*/
	 
	 
	//@Qualifier : search by name of the component
	 
	 
	 
	 /*What is Spring Boot, and how is it different from the Spring Framework?
	  * 
	  * 
	  *  Spring Boot is a framework that makes it easier and faster to create Spring-based applications
          by providing many features out-of-the-box, 
          while the Spring Framework is a broader framework that provides many modules and libraries for building Java applications, 
          including web applications.
           Spring Boot simplifies and streamlines the development process, 
	  *  while the Spring Framework offers more flexibility and customization options.
	  */
	 
	 
	 
	 
	 /*How do you create a simple Spring Boot application, and what are the key components of a Spring Boot application? 
	  * 
	  * 
	  * To create a simple Spring Boot application,
	  *  you need to define dependencies,
	  *   create an application class with @SpringBootApplication,
	  *    and define a controller for handling requests and responses.

       The key components of a Spring Boot application are
        the application class, dependencies, configuration, controllers, and services.
         Together, these components provide a functional and scalable web application.
	  * 
	  */
	 
	 
	 /*What is dependency injection, and how does Spring Boot implement it?
	  * 
	  * 
	  * Dependency injection is a design pattern that allows for loose coupling
	  *  between components in an application by injecting dependencies instead of hard-coding them. 
	  * Spring Boot implements dependency injection using @Autowired and @Qualifier annotations.
	  */
	 
	 
	 
	 
	 /*What is the difference between singleton and prototype scope in Spring Boot, and when would you use each?
	  * 
	  * 
	  * Singleton scope creates a single instance of a bean, 
	  * while prototype scope creates a new instance of a bean each time it is injected.
	  *  Singleton scope is used when a single instance of a bean is required throughout the application, 
	  *  while prototype scope is used when a new instance of a bean is required for each injection point.
	  * 
	  */
	 
	 
	}
}
