package pe.edu.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.edu.cibertec.model.Usuario;

@Controller
public class UsuarioController {

	@GetMapping("/")
	public String index() {
		return "inicio";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "login";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
}
