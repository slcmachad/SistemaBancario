package com.slm.banco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

}

@RestController
class HttpController{
	@GetMapping("/public")
	String publicRoute(){
		return "<h1>Rota publica</h1>";
	}
	@GetMapping("/private")
	String privateRoute(){
		return "<h1>Rota privada</h1>";
	}
}
