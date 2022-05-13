package com.LizEjemplo.Ejemplo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

@GetMapping("/")
	public String Saludo() {
		return "Ejemplo";
	}

@GetMapping("/Ejemplo1")
public String Ejemplo1() {
	return "Ejemplo1";
}
}