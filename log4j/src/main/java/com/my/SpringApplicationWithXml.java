package com.my;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.exception.FindException;
import com.my.product.dao.ProductDAOInterface;
import com.my.product.dao.ProductDAOOracle;

public class SpringApplicationWithXml {
	private static Logger log= Logger.getLogger(SpringApplicationWithXml.class.getName());
	
	public static void main(String[] args) {
		
		String configLocation = "config.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		
		ProductDAOInterface dao = context.getBean("pDAO", ProductDAOInterface.class);
//		System.out.println(dao == dao1);
		log.info("SpringApplicationWithXml 테스트");
		try {
			dao.findAll();
		}catch(FindException e) {
			System.out.println(e.getMessage());
		}

	}

}
