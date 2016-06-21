package webservice;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {
  
	
	// webservice is a package name
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Endpoint.publish("http://localhost:7772/webservice/lakshman", new HelloWorldImpl() );

	}

}
