package com.codingdojo.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateController {

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	
	@GetMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMM dd yyyy");
		model.addAttribute("date", dateFormat.format(date));
		return "date.jsp";
	}
	
	@GetMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
		model.addAttribute("time", timeFormat.format(date));
		return "time.jsp";
	}
}
