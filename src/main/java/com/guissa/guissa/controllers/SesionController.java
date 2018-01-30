package com.guissa.guissa.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.guissa.guissa.models.entidades.User;
import com.guissa.guissa.models.resources.LstViews;
import com.guissa.guissa.models.resources.LstAdminViews;

@Controller
@RequestMapping("/login/sesion")
public class SesionController {
	
	private static final Log LOGGER = LogFactory.getLog(SesionController.class);
	
	@GetMapping("/")
	public String login(Model modelo,
			@RequestParam(name = "error", required =false) String error,
			@RequestParam(name = "logout", required =false) String logout) {
		LOGGER.info("Metodo: login()");
		modelo.addAttribute("error", error);
		modelo.addAttribute("logout", logout);
		modelo.addAttribute("user", new User());
		return LstViews.LOGIN_VIEW.getString();
	}
	
	@PostMapping
	public String logincheck(@ModelAttribute(name = "user") User user) {
		LOGGER.info("Metodo: logincheck()");
		return LstAdminViews.ADMIN_INDEX_VIEW.getString();
	}

}
