package com.pay.serviceImpl;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pay.entities.OrderEntity;
import com.pay.repository.PayRepository;
import com.pay.service.PayService;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;

@Service
public class PayServiceImpl implements PayService{

	
	@Override
	public Order payment(OrderEntity order) throws Exception {
		
		RazorpayClient client=new RazorpayClient("", "");
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("amount", order.getAmount());
		jsonObject.put("currency",order.getCurrency());
		jsonObject.put("method", order.getMethod());
		jsonObject.put("description", order.getDescription());
		
		Order order1= client.orders.create(jsonObject);
		
		return order1;
		
	}

	
}
