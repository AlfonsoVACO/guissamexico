package com.guissa.guissa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.services.ContactNegociosService;
import com.guissa.guissa.services.ContactoService;
import com.guissa.guissa.services.HistorysService;
import com.guissa.guissa.services.NegocioEsService;
import com.guissa.guissa.services.NotasService;

@Controller
@RequestMapping("/administracion/inicio")
public class AdminInicioController {

	@Autowired
	@Qualifier("servicioContactNegocios")
	private ContactNegociosService servicioContactNegocios;

	@Autowired
	@Qualifier("servicioContacto")
	private ContactoService servicioContacto;

	@Autowired
	@Qualifier("servicioHistorys")
	private HistorysService servicioHistorys;

	@Autowired
	@Qualifier("servicioNegocioEs")
	private NegocioEsService servicioNegocioEs;

	@Autowired
	@Qualifier("servicioNotas")
	private NotasService servicioNotas;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("hist", servicioHistorys.historysCount());
		model.addAttribute("nego", servicioNegocioEs.negocioEsCount());
		model.addAttribute("nota", servicioNotas.notasCount());
		model.addAttribute("notas", servicioNotas.listAllNotas());
		model.addAttribute("contn", servicioContactNegocios.contactnegociosCount());
		model.addAttribute("cont", servicioContacto.contactoCount());
		return LstAdminViews.ADMIN_INDEX_VIEW.getString();
	}
}
