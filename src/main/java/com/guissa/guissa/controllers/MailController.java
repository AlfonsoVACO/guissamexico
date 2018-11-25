package com.guissa.guissa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.services.EmailService;

@Controller
@RequestMapping("/mail")
public class MailController {
	
	@Autowired
	@Qualifier("servicioMAilsCD")
	private EmailService servicioMAilsCD;
	
	@RequestMapping("/send")
	public void senemail() {
		servicioMAilsCD.sendMail("alvaco_1993@hotmail.com",
				"Pruebas con mail", "Un mensaje corto y descriptivo");
	}

}
