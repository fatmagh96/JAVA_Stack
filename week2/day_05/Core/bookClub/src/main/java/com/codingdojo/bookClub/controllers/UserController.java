package com.codingdojo.bookClub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.bookClub.models.LogUser;
import com.codingdojo.bookClub.models.User;
import com.codingdojo.bookClub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	private UserService userServ;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("regUser", new User());
		model.addAttribute("logUser", new LogUser());
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute(name="regUser") User regUser, BindingResult result,
			Model model, HttpSession session ) {
		userServ.register(regUser, result);
		if(result.hasErrors()) {
			model.addAttribute("logUser", new LogUser());
			return "index.jsp";
		}
		
		session.setAttribute("user_id", regUser.getId());
		return "redirect:/books";
	}
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute(name="logUser") LogUser logUser, BindingResult result,
			Model model, HttpSession session ) {
		User user = userServ.login(logUser, result);
		if(result.hasErrors()) {
			model.addAttribute("regUser", new User());
			return "index.jsp";
		}
		
		session.setAttribute("user_id", user.getId());
		return "redirect:/books";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	
}
