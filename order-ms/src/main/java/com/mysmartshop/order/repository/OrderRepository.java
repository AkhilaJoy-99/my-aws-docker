package com.mysmartshop.order.repository;

import com.mysmartshopt.order.model.Order;


public class OrderRepository extends MongoRepository<Order, Integer>{
	public Order findByOrderId(String orderId);

}
