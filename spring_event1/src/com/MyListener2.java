package com;

import org.springframework.stereotype.Component;
@Component
public class MyListener2 implements MyEventListener {

	
	public void onMyEvent(MyEvent me) {
		System.out.println("from second listener  "+me.getMessage());

		
	}

}
