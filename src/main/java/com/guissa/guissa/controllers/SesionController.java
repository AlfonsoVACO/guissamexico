package com.guissa.guissa.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.guissa.guissa.models.entidades.User;
import com.guissa.guissa.models.resources.LstViews;
import com.mysema.query.jpa.impl.JPAQuery;
import com.guissa.guissa.models.resources.LstAdminViews;
import com.guissa.guissa.models.entidades.QTipoUsuario;
import com.guissa.guissa.models.entidades.QUser;

@Controller
@RequestMapping("/login/sesion")
public class SesionController {
		
	@PersistenceContext
	private EntityManager em;
	
	private static final Log LOGGER = LogFactory.getLog(SesionController.class);
	
	@GetMapping("/login")
	public String login(Model modelo,
			@RequestParam(name = "error", required =false) String error,
			@RequestParam(name = "logout", required =false) String logout) {
		LOGGER.info("Metodo: login()");
		modelo.addAttribute("error", error);
		modelo.addAttribute("logout", logout);
		//modelo.addAttribute("user", new User());
		return LstViews.LOGIN_VIEW.getString();
	}
	
	/*@PostMapping
	public String logincheck(@ModelAttribute(name = "user") User user) {
		LOGGER.info("Metodo: logincheck()");
		return LstAdminViews.ADMIN_INDEX_VIEW.getString();
	}*/
	
	@GetMapping("/loginsuccess")
	public ModelAndView logincheck() {
		ModelAndView mav = new ModelAndView(LstAdminViews.ADMIN_INDEX_VIEW.getString());
		User usuario = (User) SecurityContextHolder.getContext().getAuthentication();
		mav.addObject("user", usuario);
		return mav;
	}
	
	//<input type='hidden' name='${_cfrf.paremeterName}' value='${_csrf.token}'></input>
	// username
	//password
	
	/*
	 * <form th:action='${/logout}' method='POST'>
	 * 
	 * </form>
	 * */
	@PostMapping("/busca")
	public String busca(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
		LOGGER.info("Método: busca(String, String)");
		QUser quser = QUser.user;
		QTipoUsuario qtipo_usuario = QTipoUsuario.tipoUsuario;
		
		JPAQuery query = new JPAQuery(em);
		List<User> users = query.from(quser).innerJoin(qtipo_usuario).on(quser.idTipousuario.eq(qtipo_usuario))
			    .where( quser.correo.eq(user.getCorreo()).and( quser.pass.eq(user.getPass()) ) )
			    .list(quser);
		
		LOGGER.info(users.get(users.size() -1 ).toString() );
		if(!users.isEmpty()) {
			return "redirect: login";
		}else {
			return "redirect: loginsuccess";
		}

	}
}
