package com.kenniche.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kenniche.models.Dojo;
import com.kenniche.models.Ninja;
import com.kenniche.services.DojoService;
import com.kenniche.services.NinjaService;



@Controller
public class MainController {

	private final DojoService dojoServ;
	private final NinjaService ninjaServ;
	
	public MainController(DojoService dojoServ, NinjaService ninjaServ) {
		this.dojoServ = dojoServ;
		this.ninjaServ = ninjaServ;
	}
	
	@GetMapping("/dojos/new")
	public String person(@ModelAttribute("newDojo") Dojo newDojo, BindingResult result) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("newDojo") Dojo newDojo, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("allDojos", dojoServ.getAll());
			return "newDojo.jsp";
		}
		dojoServ.create(newDojo);
		return "redirect:/dojos/new";
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("newNinja") Ninja newNinja, BindingResult result, Model model) {
		ArrayList<Dojo> dojos = dojoServ.getAll();
		model.addAttribute("dojos", dojos);
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String create(@Valid @ModelAttribute("newNinja") Ninja newNinja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("allNinjas", ninjaServ.getAll());
			model.addAttribute("allDojos", dojoServ.getAll());
			return "newNinja.jsp";
		}
		ninjaServ.create(newNinja);
		return "redirect:/ninjas/new";
	}
	
	@GetMapping("/dojos/{id}")
	public String details( @PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoServ.findDojo(id));
		ArrayList<Ninja> ninjas = ninjaServ.getAll();
		model.addAttribute("ninjas", ninjas);
		return "dojoInfo.jsp";
	}
	
}