package com.pay.serviceImpl;

import java.math.BigInteger;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pay.entities.OrderRequest;
import com.pay.repository.PayRepository;
import com.pay.service.PayService;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;

@Service
public class PayServiceImpl implements PayService{

	private RazorpayClient client;
	
	@Override
	public Order createRazorPayOrder(BigInteger amount) throws Exception {
			
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("amount", amount.multiply(new BigInteger("100")));
		jsonObject.put("currency","INR");
		jsonObject.put("receipt","txn_123456");
		jsonObject.put("payment_capture",1);
		
		System.out.println("data>> "+jsonObject);
		
		return client.orders.create(jsonObject);
		
	}

	
}
