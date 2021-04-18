package com.hacker.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*here we are creating rest api controller by adding the annotation,
 * RestController which come from RestController present in the package
 * org.springframework.web.bind.annotation 
*/@RestController
public class HelloController {
	
	@RequestMapping("/hello") // here we are passing api url	
	//here requestMapping by default call the get method
	public String sayHi() {
		return "Hi";
	}
	
	//when we trying to define more than 1 request mapping then we get error (Ambigouse mapping
	/*@RequestMapping("/hello") // here we are passing api url	
	//here requestMapping by default call the get method
	public String sayAPi() {
		return "APi";
	}*/

}
