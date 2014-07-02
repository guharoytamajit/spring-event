package com;

public class MyEvent {
String message=null;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public MyEvent() {
	super();
}

public MyEvent(String message) {
	super();
	this.message = message;
}


}
