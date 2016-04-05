package py.edu.facitec.hibernatespring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.hibernatespring.model.Cliente;
import py.edu.facitec.hibernatespring.model.ClienteDao;

@Transactional
@Controller //en vez del archivo .xml
public class ClienteController {
	
	@Autowired //crea o inyecta un objeto
	private ClienteDao clienteDAO;
	
	
	//YA VIENE CON LOS DATOS CARGADOS
	//MEDIANTE SPRING
	@RequestMapping("/clientes")
	public String save(Cliente cliente){
		
		
		System.out.println(cliente.toString());
		clienteDAO.save(cliente);
		
		return "/clientes/ok";
	}
	
	@RequestMapping("clientes/formularios")
	public String formulario(){
		return "clientes/formularios";
	}
}
