package unitn.introsde.lifecoach.Client;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;


public class UserClient {

	public static void main(String[] args) {
		
		new UserClient().demo();
	}
	
	private  void demo() {
		String protocol = "http://";
		String port = ":5910";
		String hostname="";
		
		try {
			hostname = InetAddress.getLocalHost().getHostAddress();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(hostname.equals("127.0.0.1"))
			hostname = "localhost";
		
		String baseUrl = protocol + hostname + port;
		
		ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
		WebResource resource = client.resource(baseUrl);
		
		String url = baseUrl + "/user/1";
		resource = client.resource(url);
		getUser(resource);
	}
	
	private void getUser(WebResource resource){
		System.out.println(resource.getURI());
		String response = 
			resource.accept(MediaType.APPLICATION_JSON)
					.get(String.class);
		
		if(!response.equalsIgnoreCase("null"))
			report("Details of the user task : ", response);
		else 
			report("Details of the user task :","Not found. Check the URI and Parameters !");
	}
	private void report(String msg, String response) {
		System.out.println("\n" + msg + response);
	}
}
