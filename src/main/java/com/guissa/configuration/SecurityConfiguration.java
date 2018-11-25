package com.guissa.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	@Qualifier("servicioSesion")
	private UserDetailsService servicioSesion;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth )throws Exception{
		auth.userDetailsService(servicioSesion).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/webjars/**").permitAll();
		
		http.authorizeRequests().antMatchers("/**","/api/*","/api/**","/inicio/**","/image/**",
				"/menuss/**","/categorias/**","/ubicacion/**","/negocios/**","/productos/**",
				"/eventos/**","/precios/**","/contacto/**","/registro/**","/historias/**",
				"/solicitud/**","/indexmodel/**","/vistaform/**","/addcontacto/**").permitAll();
		
		http.authorizeRequests().antMatchers("/administracion/inicio/*","/administracion/inicio/**").permitAll();
		http.authorizeRequests().antMatchers("/administracion/slides/*","/administracion/slides/**").permitAll();
		http.authorizeRequests().antMatchers("/principal/*","/principal/**").permitAll();
		http.authorizeRequests().antMatchers("/administrador/*","/administrador/**").permitAll();
		http.authorizeRequests().antMatchers("/cliente/*","/cliente/**").permitAll();		
	
		http.authorizeRequests().anyRequest().authenticated()
		.and().formLogin().loginPage("/login/sesion/login").loginProcessingUrl("/login")
		.usernameParameter("username").passwordParameter("password")
		.defaultSuccessUrl("/login/sesion/loginsuccess").permitAll()
		.and()
		.logout().logoutUrl("/login/sesion/logout").logoutSuccessUrl("/login?logout").permitAll();
	}
}
