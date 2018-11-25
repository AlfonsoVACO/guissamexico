package com.guissa.configuration;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.guissa.guissa.components.RequestTimeInterceptor;

@SuppressWarnings("deprecation")
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter{
	
	@Autowired
	@Qualifier("requestTime")
	private RequestTimeInterceptor interceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor);
	}
	
	/*@Bean
    public MultipartResolver multipartResolver() throws IOException {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize((1024 * 1024) * 10);
        return multipartResolver;
    }*/
	
	@Bean
    public SimpleMailMessage templateSimpleMessage() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setText("This is the test email template for your email:\n%s\n");
        return message;
    }
}
