package com.guissa.guissa.components;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.guissa.guissa.controllers.InicioController;

@Component("exComonent")
public class ExComonent {
	
	private static final Log LOGGER = LogFactory.getLog(InicioController.class);

	public void sayHell() {
		LOGGER.info("Hola mens");
	}
}
