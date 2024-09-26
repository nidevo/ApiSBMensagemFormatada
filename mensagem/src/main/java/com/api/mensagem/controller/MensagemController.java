package com.api.mensagem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MensagemController {

	@GetMapping("/msg")
	public String exibir() {
        return "index";
	}
}
