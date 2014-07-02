package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("aaa")
public class Main2 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Main2 m=(Main2)context.getBean("aaa");
		m.hello();
	}
public void hello() {
	System.out.println("hello world");
}
}
