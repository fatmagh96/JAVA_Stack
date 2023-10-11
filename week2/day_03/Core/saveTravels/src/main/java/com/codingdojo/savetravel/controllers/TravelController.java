package com.codingdojo.savetravel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.savetravel.models.Travel;
import com.codingdojo.savetravel.services.TravelService;

import jakarta.validation.Valid;

@Controller
public class TravelController {
	
	@Autowired
	private TravelService travelService;
	
	@GetMapping("/expenses")
	public String index(@ModelAttribute("travel") Travel travel, Model model) {
		List<Travel> travels = travelService.findAll();
		model.addAttribute("travels", travels);
		
		return "travels.jsp";
	}
	
	@PostMapping("/expenses")
	public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Travel> travels = travelService.findAll();
			model.addAttribute("travels", travels);
			return "travels.jsp";
		} else {
			travelService.create(travel);
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Travel travel = travelService.findById(id);
		model.addAttribute("travel", travel);
		return "edit.jsp";
	}
	
	@PutMapping("/edit/expenses/{id}")
	public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		} else {
			travelService.update(travel);
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/expenses/{id}")
	public String show(@PathVariable("id") Long id,Model model) {
		Travel travel = travelService.findById(id);
		model.addAttribute("travel", travel);
		return "show.jsp";
	}
	
	@DeleteMapping("/expenses/{id}")
	public String delete(@PathVariable("id") Long id) {
		travelService.delete(id);
		return "redirect:/expenses";
	}

}
