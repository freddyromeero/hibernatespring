package py.edu.facitec.hibernatespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//gestionar las peticiones
@Controller

public class HomeController {
	
	
	@RequestMapping("/")
	
	public String index(){
		
		System.out.println("Bienvenido a la web");
		return "hello-world";
	}

}
