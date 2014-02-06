package unitn.introsde.lifecoach.Resource;


import java.rmi.RemoteException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import unitn.introsde.quote_service.ws.QuoteProxy;

@Path("/quote")
public class QuoteResource {
	

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getQuote(){
		
		QuoteProxy quoteService = new QuoteProxy();
		try {
			String returnStr = quoteService.getRandomQuote();
			JsonElement je = new JsonParser().parse(returnStr);
			JsonObject jo = je.getAsJsonObject();
			return ((jo.get("quote").toString().replace("\\n", "\n")
					.replace("\\r", "\r").replace("\\t", "\t")
					.replace("\\b", "\b").replace("\\", "")));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Have a nice day !";
	}


}
