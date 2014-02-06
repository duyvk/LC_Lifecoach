package unitn.introsde.lifecoach.Resource;

import java.rmi.RemoteException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.*;

import unitn.introsde.storage_service.ws.StorageProxy;
import unitn.introsde.storage_service.ws.User;


@Path("/user")
public class test {

	@GET
	@Path("{user_Id}")
	@Produces({MediaType.APPLICATION_JSON})
	public User getUserById(@PathParam("user_Id") int user_Id){
		
		StorageProxy storage = new StorageProxy();
		try {
			User user = storage.readUser(user_Id);
			return user;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new User();
		
	}
}

