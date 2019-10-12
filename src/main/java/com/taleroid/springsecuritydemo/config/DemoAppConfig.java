package com.taleroid.springsecuritydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.ViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("com.taleroid.springsecuritydemo")
public class DemoAppConfig  implements WebMvcConfigurer{
	@Bean
	public ViewResolver viewResolver(){
		 InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		 
		 viewResolver.setPrefix("/WEB-INF/views/");
		 viewResolver.setSuffix(".jsp");
		 return viewResolver;
     }
}
