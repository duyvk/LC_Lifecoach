package unitn.introsde.lifecoach.Client;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;


public class QuoteClient {

	public static void main(String[] args) {
		
		new QuoteClient().demo();
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
		
		String url = baseUrl + "/quote";
		resource = client.resource(url);
		System.out.println("GET QUOTE: ");
		System.out.println(getQuote(resource));
	}
	
	private String getQuote(WebResource resource){
		System.out.println(resource.getURI());
		String response = 
			resource.accept(MediaType.TEXT_PLAIN)
					.get(String.class);
		report("", response);
		
		return null;
	}
	private void report(String msg, String response) {
		System.out.println("\n" + msg + response);
	}
}
