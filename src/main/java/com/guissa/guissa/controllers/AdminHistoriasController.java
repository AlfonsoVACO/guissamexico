package com.guissa.guissa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.services.HistorysService;

@Controller
@RequestMapping("/admins/historias")
public class AdminHistoriasController {
	
	@Autowired
	@Qualifier("servicioHistorys")
	private HistorysService servicioHistorys;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("historias", servicioHistorys.listAllHistorys() );
		return LstAdminViews.ADMIN_HISTORIAS_INDEX_VIEW;		
	}
	
}
