package com.fatma.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String home() {
		return "<h1>Welcome!</h1>";
	}

	@RequestMapping("/today")
	public String today() {
		return "<h1>Today you will find luck in all your endeavors!</h1>";
	}

	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "<h1>Tomorrow, an opportunity will arise, so be sure to be open to new ideas!</h1>";
	}
	
	@RequestMapping("/travel/{destination}")
	public String travel(@PathVariable("destination") String destination) {
		return "Congratulations! You will soon travel to " + destination;
	}
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int number) {
		if (number % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	}
	
	
}