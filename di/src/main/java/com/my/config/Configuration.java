package com.my.config;

import org.springframework.context.annotation.Bean;

import com.my.product.dao.ProductDAOInterface;
import com.my.product.dao.ProductDAOOracle;
import com.my.product.service.ProductService;

@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean
	public ProductDAOInterface  pDAO(){		
		return new ProductDAOOracle();
     }
	@Bean
	public ProductService pService(){
		//ProductService s = new ProductService();
		//s.setDao(pDAO());
  		return new ProductService(pDAO());
	}
}