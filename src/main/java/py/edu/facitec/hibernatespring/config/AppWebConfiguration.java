package py.edu.facitec.hibernatespring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.hibernatespring.controller.ClienteController;
import py.edu.facitec.hibernatespring.controller.HomeController;
import py.edu.facitec.hibernatespring.model.ClienteDao;


   @EnableWebMvc
   @ComponentScan(basePackageClasses={HomeController.class,ClienteDao.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter{
	
	   
	   @Bean
	   public InternalResourceViewResolver internalResourceViewResolver(){
		   InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		   resolver.setPrefix("/WEB-INF/views/");
		   resolver.setSuffix(".jsp");
		   return resolver;
	   }
		
	
}