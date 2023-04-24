package com.ust.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class Testlogin {
	
	public static void main(String[] args) {
		
//		Login login = new Login();
//		login.setUsername("johndoe");
//		login.setPassword("winnyminny");
//		String result = login.validate();
//		System.out.println(result);
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		Object obj = factory.getBean("connection");
		
		Connection con=(Connection)obj;
		System.out.println(obj);
		Object obj2 = factory.getBean("Login");
		
		Login login = (Login)obj2;
		login.validate();
	}

}
