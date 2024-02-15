package com.vmanage.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.vmanage")
public class BeanConfiguration {
	
	public BeanConfiguration() {
		System.out.println("Bean configuration-Vendor Management Project");
	}
	
	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}
	
	@Bean
	public ViewResolver resolver() {
		ViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean getEntity() {
		
		return new LocalContainerEntityManagerFactoryBean();
	}
	
	
	
}
