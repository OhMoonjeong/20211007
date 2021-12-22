package com.my.order.service;

import java.util.List;

import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.order.dao.OrderDAOOracle;
import com.my.order.vo.OrderInfo;

public class OrderService {
	private static OrderService service = new OrderService();
	private OrderDAOOracle dao = OrderDAOOracle.getInstance();
	public static OrderService getInstance() {
		return service;
	}
	public void add(OrderInfo info) throws AddException{
		dao.add(info);
	}
	public List<OrderInfo> findById(String orderId) throws FindException{
		return dao.findById(orderId);
	}
}
