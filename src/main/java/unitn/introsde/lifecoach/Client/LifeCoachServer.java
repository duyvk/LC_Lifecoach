package unitn.introsde.lifecoach.Client;


import java.io.IOException;
import java.net.InetAddress;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

public class LifeCoachServer {

	public LifeCoachServer() throws IllegalArgumentException, IOException {

		String protocol = "http://"; // of course...
		String port = ":5910/"; // you can use any other as long as it is not in
								// use
		String hostname = InetAddress.getLocalHost().getHostAddress();
		if (hostname.equals("127.0.0.1")) {
			hostname = "localhost";
		}
		String baseUrl = protocol + hostname + port;
		final HttpServer server = HttpServerFactory.create(baseUrl);
		server.start();
		System.out.println("Server starts on " + baseUrl
				+ "\n [kill the process to exit]");
	}
	public static void main(String[] args) {
		try {
			new LifeCoachServer();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}