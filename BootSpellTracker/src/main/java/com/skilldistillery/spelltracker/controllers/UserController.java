package com.skilldistillery.spelltracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.skilldistillery.spelltracker.data.UserDAO;
import com.skilldistillery.spelltracker.entities.User;

@Controller
public class UserController {
	@Autowired
	private UserDAO userDAO;
	
	
	
	@GetMapping("/")
	public String home(Model model) {
		User u = userDAO.authenticateUser("billybob", "password");
		model.addAttribute("testUser", u);
		return "home";
	}

}
