package com.guissa.guissa.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.models.entidades.User;
import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.services.ContactNegociosService;
import com.guissa.guissa.services.ContactoService;
import com.guissa.guissa.services.HistorysService;
import com.guissa.guissa.services.NegocioEsService;
import com.guissa.guissa.services.NotasService;
import com.guissa.guissa.services.imp.UserServiceImp;
import com.guissa.guissa.utils.ExamplesClass;

@Controller
@RequestMapping("/admins")
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
	
	@Autowired
	@Qualifier("servicioUsers")
	private UserServiceImp servicioUsers;

	@GetMapping("/")
	public String index(Model model) {
		UserDetails datals = getSession( );
		
		ExamplesClass<User> examplesAlumno = new ExamplesClass<>(new User(), new Object[] { "correo", datals.getUsername() });
		
		User usuario = servicioUsers.getUserByCriteria( examplesAlumno.getExample() );
		List<User> lstUsers = servicioUsers.listAllUser()
				.stream()
				.filter(u->u.getIdTipousuario().idTipoUsuario == 1)
				.collect(Collectors.toList());
		
		model.addAttribute("lstusers", lstUsers);
		model.addAttribute("user", usuario);
		model.addAttribute("username", datals.getUsername());
		model.addAttribute("tipo", datals.getAuthorities());
		
		model.addAttribute("hist", servicioHistorys.historysCount());
		model.addAttribute("nego", servicioNegocioEs.negocioEsCount());
		model.addAttribute("nota", servicioNotas.notasCount());
		model.addAttribute("notas", servicioNotas.listAllNotas());
		model.addAttribute("contn", servicioContactNegocios.contactnegociosCount());
		model.addAttribute("cont", servicioContacto.contactoCount());		
		return LstAdminViews.ADMIN_INDEX_VIEW;
	}
	
	private UserDetails getSession() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		UserDetails userDetails = null;
		if (principal instanceof UserDetails)
			userDetails = (UserDetails) principal;
		return userDetails;
	}
}
