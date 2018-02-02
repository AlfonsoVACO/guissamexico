package com.guissa.guissa.components;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.guissa.guissa.controllers.InicioController;
import com.guissa.guissa.models.entidades.Auditorias;
import com.guissa.guissa.repositorys.AuditoriaRepository;

@Component("requestTime")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	@Qualifier("auditoriaRepository")
	private AuditoriaRepository auditoriaRepository;

	private static final Log LOGGER = LogFactory.getLog(InicioController.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute("setTime", System.currentTimeMillis());
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception{
		long startTime = (long) request.getAttribute("setTime");
		String url = request.getRequestURL().toString();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username ="";
		if(auth != null && auth.isAuthenticated()) {
			username = auth.getName();
		}
		Auditorias auditoria = new Auditorias(auth.getCredentials().toString(), new Date(), auth.getDetails().toString(), username);
		auditoriaRepository.save(auditoria);
		
		LOGGER.info("Request: " + url +" time: '"+  startTime + "' ms");
	}

}
