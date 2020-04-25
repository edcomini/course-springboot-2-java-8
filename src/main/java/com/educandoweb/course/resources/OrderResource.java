package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;

@RestController // pra falar que essa classe é um controlador web rest
@RequestMapping(value = "/orders") //nome do recurso com o caminho do recurso
public class OrderResource {

	@Autowired
	private OrderService service;
	
	//ResponseEntity retorna requisição web
	@GetMapping       //pra informar que esse metodo responde a requisição get do http
	public ResponseEntity<List<Order>> findAll(){
		     
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")// passar o id na url. pra falar que a url vai ter um parametro
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
