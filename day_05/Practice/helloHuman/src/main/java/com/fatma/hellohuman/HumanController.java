package com.fatma.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String home(@RequestParam(value="name", required=false) String name,
			@RequestParam(value="lname", required=false) String lname,
			@RequestParam(value="times", required=false) Integer times) {
		if (name == null) {
			return "Hello Human";
		}
		if(times != null) {
			String test =  "";
			for(int i=0;i<times;i++) {
				test += ("Hello " + name+ " ");
			}
			
			return test;
		}
		return "hello " + name + " " + lname;
	}
}
