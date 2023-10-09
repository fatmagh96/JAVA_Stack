package com.fatma.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/your_server")
public class counterController {
	
	@RequestMapping("")
	public String index(HttpSession session) {
		if (session.getAttribute("counter")==null) {
//			int counter = 1;
			session.setAttribute("counter", 0);
		}
		else {
			int counter =(int) session.getAttribute("counter");
			session.setAttribute("counter", counter+1);	
			System.out.println(session.getAttribute("counter"));
		}
		return "index.jsp";
	}
	
	@RequestMapping("/twice")
	public String two(HttpSession session) {
		if (session.getAttribute("counter")==null) {
			session.setAttribute("counter", 0);
		}
		else {
			int counter =(int) session.getAttribute("counter");
			session.setAttribute("counter", counter+2);	
			System.out.println(session.getAttribute("counter"));
		}
		return "two.jsp";
	}
	
	@RequestMapping("/counter")
	public String home() {
		return "count.jsp"; 
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("counter", 0);
		return "redirect:/your_server/counter"; 
	}
	
}
