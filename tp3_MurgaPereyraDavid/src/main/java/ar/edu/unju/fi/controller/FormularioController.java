package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormularioController {

	@GetMapping("/form-cliente")
	
	public String getForm() {
		return "form-cliente";
	}
}
