package webservice;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {

	//webservice is  a package name
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		  URL url = new URL("http://localhost:7772/webservice/lakshman?wsdl");  
		   
	        //1st argument service URI, refer to wsdl document above  
	    //2nd argument is service name,  refer to wsdl document above  
	        QName qname = new QName("http://webservice/", "HelloWorldImplService");  
	        Service service = Service.create(url, qname);  
	        HelloWorld hello = service.getPort(HelloWorld.class);  
	        System.out.println(hello.printinfo("YOU GOT A JOB IN ORACLE INDIA BANGALORE"));  
	}

}
