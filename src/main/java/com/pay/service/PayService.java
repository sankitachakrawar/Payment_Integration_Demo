package com.pay.service;

import java.math.BigInteger;

import com.razorpay.Order;

public interface PayService {

	Order createRazorPayOrder(BigInteger amount) throws Exception;

}
