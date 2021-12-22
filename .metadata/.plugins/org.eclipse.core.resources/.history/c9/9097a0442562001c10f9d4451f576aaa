package com.my;

import org.springframework.cglib.proxy.Factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.my.exception.FindException;
import com.my.product.service.ProductService;
import com.my.product.vo.Product;

public class SpringApplicationWithJava {

	public static void main(String[] args) {
		Class configClass = com.my.config.Configuration.class;
		ApplicationContext context = new AnnotationConfigApplicationContext(configClass);
		ProductService service = context.getBean("pService", ProductService.class);
		try {
			Product p = service.findByNo("C0001");
			System.out.println(p);
		}catch(FindException e) {
			System.out.println(e.getMessage());
		}
	}

}
