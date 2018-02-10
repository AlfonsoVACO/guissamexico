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
		http.authorizeRequests()
		.antMatchers("/**","/inicio/**","/image/**",
				"/menuss/**","/categorias/**",
				"/ubicacion/**","/negocios/**",
				"/productos/**","/eventos/**",
				"/precios/**","/contacto/**",
				"/registro/**","/historias/**","/solicitud/**","/indexmodel/**","/vistaform/**","/addcontacto/**",
				
				"/administrador/css/*",
				"/administrador/font-awesome/css/*",
				"/administrador/font-awesome/fonts/*",
				"/administrador/fonts/*",
				"/administrador/img/*",
				"/administrador/img/friends/*",
				"/administrador/img/portfolio/*",
				"/administrador/js/*",
				"/administrador/js/bootstrap-inputmask*",
				"/administrador/js/chart-master/*",
				"/administrador/js/fancybox/*",
				"/administrador/js/fullcalendar/*",
				"/administrador/js/gritter/css/*",
				"/administrador/js/gritter/images/*",
				"/administrador/js/gritter/js/*",
				"/administrador/js/jquery-easy-pie-chart*",
				"/administrador/lineicons/*",
				"/administrador/lineicons/fonts/*",
				"/cliente/ckeditor/adapters/*",
				"/cliente/ckeditor/lang/*",
				"/cliente/ckeditor/plugins/*",
				"/cliente/ckeditor/samples/*",
				"/cliente/ckeditor/samples/css/*",
				"/cliente/ckeditor/samples/img/*",
				"/cliente/ckeditor/samples/js/*",
				"/cliente/ckeditor/samples/old/*",
				"/cliente/ckeditor/samples/toolbarconfigurator/*",
				"/cliente/ckeditor/skins/*",
				"/cliente/ckeditor/skins/moono/*",
				"/cliente/ckeditor/skins/images/*",
				"/cliente/ckeditor/skins/images/hidpi/*",
				"/cliente/css/*",
				"/cliente/fonts/*",
				"/cliente/img/*",
				"/cliente/img/faces/*",
				"/cliente/js/*",
				"/cliente/sass/*",
				"/cliente/sass/lbd/*",
				"/cliente/sass/lbd/mixins/*",
				"/principal/alertifyjs/*",
				"/principal/alertifyjs/css/*",
				"/principal/alertifyjs/css/themes/*",
				"/principal/ckeditor_sta/*",
				"/principal/ckeditor_sta/adapters/*",
				"/principal/ckeditor_sta/lang/*",
				"/principal/ckeditor_sta/plugins/*",
				"/principal/ckeditor_sta/samples/*",
				"/principal/ckeditor_sta/samples/css/*",
				"/principal/ckeditor_sta/samples/img/*",
				"/principal/ckeditor_sta/samples/js/*",
				"/principal/ckeditor_sta/samples/old/*",//mAS
				"/principal/ckeditor_sta/samples/toolcinfigurator/*", //mas
				"/principal/ckeditor_sta/skins/moono-lisa/*",
				"/principal/ckeditor_sta/skins/moono-lisa/images/*",
				"/principal/ckeditor_sta/skins/moono-lisa/images/hidpi/*",
				"/principal/css/*",
				"/principal/font-awesome/css/*",
				"/principal/font-awesome/fonts/*",
				"/principal/font-awesome/less/*",
				"/principal/font-awesome/scss/*",
				"/principal/images/*",
				"/principal/images/menu/*",
				"/principal/images/menu/thumbnails/*",
				"/principal/js/*",
				"/principal/js/fancybox-3.0/*",
				"/principal/js/fancybox-3.0/docs/*",
				"/principal/js/fancybox-3.0/src/*",
				"/principal/js/fancybox-3.0/src/css/*",
				"/principal/js/fancybox-3.0/src/js/*",
				"/principal/js/vistajs/*").permitAll()
		.anyRequest().authenticated()
		.and().formLogin().loginPage("/login/sesion/login").loginProcessingUrl("/login")
		.usernameParameter("username").passwordParameter("password")
		.defaultSuccessUrl("/login/sesion/loginsuccess").permitAll()
		.and()
		.logout().logoutUrl("/login/sesion/logout").logoutSuccessUrl("/login?logout").permitAll();
	}
}
