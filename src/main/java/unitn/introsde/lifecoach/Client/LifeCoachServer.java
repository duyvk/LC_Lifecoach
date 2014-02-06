package unitn.introsde.lifecoach.Client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.ClasspathResourceConfig;
import com.sun.net.httpserver.HttpServer;

// TODO: Auto-generated Javadoc
/**
 * The Class StandaloneServer.
 */
public class LifeCoachServer {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String protocol = "http://";
		String port = ":5910/";
		String hostname;
		try {
			hostname = InetAddress.getLocalHost().getHostAddress();
			if(hostname.equals("127.0.0.1"))
				hostname = "localhost";
			
			String baseUrl = protocol + hostname + port;
			
			String[] path = {"."};
			ClasspathResourceConfig cp = new ClasspathResourceConfig(path);
			
			final HttpServer server = HttpServerFactory.create(baseUrl, cp);
			server.start();
			System.out.println("server start on "+baseUrl);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
