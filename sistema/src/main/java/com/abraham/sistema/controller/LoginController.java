package com.abraham.sistema.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.abraham.sistema.data.UsuarioDao;
import com.abraham.sistema.data.UsuarioDaoImpl;
import com.abraham.sistema.model.Usuario;
@Controller
@RequestMapping(value = "/")
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "usuario o contraseña incorrectos!");
		}

		if (logout != null) {
			model.addObject("msg", "Haz salido sin problemas.");
		}
		model.setViewName("login");

		return model;

	}
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String listUsuarios(Model model) {


        return "index";

	}

}
