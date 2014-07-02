package com;

import org.springframework.stereotype.Component;
@Component
public class MyListener implements MyEventListener {

	
	public void onMyEvent(MyEvent me) {
		System.out.println("from first listener  "+me.getMessage());

		
	}

}
