package webservice;

import javax.jws.WebService;


@WebService(endpointInterface="webservice.HelloWorld")
public class HelloWorldImpl  implements HelloWorld{

	@Override
	public String printinfo(String name) {
		// TODO Auto-generated method stub
		return "Hi Lakshman" +name;
	}

}
