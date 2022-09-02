package com.pay.service;

import com.pay.entities.OrderEntity;
import com.razorpay.Order;

public interface PayService {
	
	public Order payment(OrderEntity order) throws Exception;

}
