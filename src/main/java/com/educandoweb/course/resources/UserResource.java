package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController // pra falar que essa classe é um controlador web rest
@RequestMapping(value = "/users") //nome do recurso com o caminho do recurso
public class UserResource {

	//ResponseEntity retorna requisição web
	@GetMapping       //pra informar que esse metodo responde a uma requisição do http
	public ResponseEntity<User> findAll(){
		     
		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
		
	}
}
