package com.my.product.service;

import java.util.List;

import com.my.exception.FindException;
import com.my.product.vo.Product;
import com.my.product.dao.ProductDAOInterface;
public class ProductService {
	private ProductDAOInterface dao; 
	public ProductService() {}
	public ProductService(ProductDAOInterface dao) {
		this.dao = dao;
		System.out.println("ProductService()생성자호출");
	}
	
	public void setDao(ProductDAOInterface dao) {
		this.dao = dao;
		System.out.println("setDAO()호출");
	}
	public List<Product> findAll() throws FindException{
		return dao.findAll();
	}
	public Product findByNo(String prodNo) throws FindException{
		return dao.findByNo(prodNo);
	}
}
