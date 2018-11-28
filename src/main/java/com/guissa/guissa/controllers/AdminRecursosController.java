package com.guissa.guissa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.models.resources.LstAdminViews;

@Controller
@RequestMapping("/admins/recursos")
public class AdminRecursosController {

	/*@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("eventos", servicioEvento.listAllEvento() );
		return LstAdminViews.ADMIN_EVENTOS_INDEX_VIEW;		
	}*/
	
}
