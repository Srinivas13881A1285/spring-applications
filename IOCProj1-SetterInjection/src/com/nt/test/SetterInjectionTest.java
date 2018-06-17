package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMesageGenerator;

public class SetterInjectionTest {
	
	public static void main(String[] args) {
		Resource res = null;
		BeanFactory factory = null;
		Object object = null;
		WishMesageGenerator wishMesageGenerator = null;
		//locate spring bean config file.
		res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create ioc container bean factory.
		factory = new XmlBeanFactory(res);
		//get bean (main bean)
		object = factory.getBean("wish");
		//type casting
		wishMesageGenerator = (WishMesageGenerator) object;
		// invoke method
		System.out.println(wishMesageGenerator.generateWishMesage("srinivas"));
		
		
		
	}

}
