package com.abraham.sistema.controller;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abraham.sistema.model.Usuario;
import com.abraham.sistema.service.UsuarioService;
@Controller
@RequestMapping("menu/rest/alta")
public class PrubaController {

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private SessionFactory sessionFactory;

	 @RequestMapping(method = RequestMethod.GET)
    public String displayUsers() {
	
		 BasicConfigurator.configure();
			Logger log = Logger.getLogger("Logger de Ejemplo");
			log.warn("un warning");
    	Usuario usuario= new Usuario();
    	usuario.setIduser(30);
    	usuario.setLogin("El abraham");
			log.warn(usuario.getIduser());
			log.warn(usuario.getLogin());
			log.warn("un warning");
			log.warn(sessionFactory);
		usuarioService.register(usuario);
			//log.warn(usuarioService.register(usuario));


		return "vista";
    }
}
