package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class MyGenerator {
	@Autowired(required=false)
	 private MyEventListener[] listeners;

	  public  void generateEvent()
	  {
	    MyEvent me = new MyEvent("Hello World");

	    for (MyEventListener mel: listeners)
	    {
	      mel.onMyEvent(me);
	    }
	  }

	  public void setMyEventListeners(MyEventListener[] listeners)
	  {
	    this.listeners = listeners;
	  }
	  public static void main(String[] args) {
		  ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		  MyGenerator m=(MyGenerator)context.getBean("myGenerator");
		  m.generateEvent();
	}

}
