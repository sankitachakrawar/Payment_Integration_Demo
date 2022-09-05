package com.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pay.entities.OrderRequest;
import com.pay.entities.OrderResponse;
import com.pay.service.PayService;
import com.razorpay.Order;

@RestController
@RequestMapping("/api")
public class PayController {

	@Autowired
	private PayService payService;
	
	
	private static final String SECRET_ID="rzp_test_R9M7Z1BLAK9M6i";
	private static final String SECRET_KEY="rgjrq8doiivTeAdDhl4yzOK6";
	
	@PostMapping("/createOrder")
	public OrderResponse createOrder(@RequestBody OrderRequest orderRequest) throws Exception {
		
		OrderResponse orderResponse=new OrderResponse();
		System.out.println("Response>>"+orderResponse);
		Order order=payService.createRazorPayOrder(orderRequest.getAmount());
		System.out.println("order>>"+orderRequest.getAmount());
		
		String orderId=order.get("id");
		orderResponse.setRazorPayOrderId(orderId);
		
		orderResponse.setSecret_id(SECRET_ID);
		orderResponse.setSecret_key(SECRET_KEY);
		return orderResponse;
	}
}
