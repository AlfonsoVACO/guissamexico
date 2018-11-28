package com.guissa.guissa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.services.ComentariospService;

@Controller
@RequestMapping("/admins/comentariosp")
public class AdminComentariosPController {
	
	@Autowired
	@Qualifier("servicioComentariosp")
	private ComentariospService servicioComentariosp;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("comentariosp", servicioComentariosp.listAllComentariosp() );
		return LstAdminViews.ADMIN_COMENTARIOS_PR_INDEX_VIEW;		
	}
	
}
