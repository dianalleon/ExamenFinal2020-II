package com.example.demoParcial.controler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Index {
	@GetMapping("/Listar")
	public String index(Model model) {
		model.addAttribute("list", sorteoServiceAPI.getAll());
		return "sorteo/index";
	}
}
