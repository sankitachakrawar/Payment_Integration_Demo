package com.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pay.entities.OrderEntity;
import com.pay.service.PayService;

@RestController
@RequestMapping("/api")
public class PayController {

	@Autowired
	private PayService payService;
	
	@PostMapping("/pay")
	public ResponseEntity<?> createPayment(@RequestBody OrderEntity order){
		return null;
		
		
		
	}
}
