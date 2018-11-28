package com.guissa.guissa.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.guissa.guissa.models.entidades.User;
import com.guissa.guissa.services.UserService;

public class SesionVariables {
	
	@Autowired
	@Qualifier("servicioUsers")
	private static UserService servicioUsers;
	
	public static UserDetails sesionDetails() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return (principal instanceof UserDetails) ? (UserDetails) principal : null;
	}
	
	public static User sesionUsuario() {
		UserDetails datail = sesionDetails();
		ExamplesClass<User> examplesUser = 
				new ExamplesClass<>(
						new User(),
						new Object[] { "correo", datail.getUsername() }
				);		
		return servicioUsers.getUserByCriteria(examplesUser.getExample());
	}
}
