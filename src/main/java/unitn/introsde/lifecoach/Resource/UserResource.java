package unitn.introsde.lifecoach.Resource;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import unitn.introsde.storage_service.ws.Storage;
import unitn.introsde.storage_service.ws.StorageProxy;
import unitn.introsde.storage_service.ws.User;


@Path("/user")
public class UserResource {

	StorageProxy storage = new StorageProxy();
	
	@GET
	@Path("{user_Id}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public User getUserById(@PathParam("user_Id") int user_Id){
		
		try {
			User user = storage.readUser(user_Id);
			return user;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new User();
	}

	@POST
	@Produces({MediaType.TEXT_PLAIN})
	public Response addUser (		@FormParam("user_first_name") String firstname,
									@FormParam("user_last_name")String lastname,
									@FormParam("user_email") String email,
									@FormParam("user_birth_date") String Userbirthday,
									@FormParam("user_gender") String usergender){
		 
		StorageProxy storage = new StorageProxy();
		String msg = null;

		//no inserted data
		if (firstname == null || lastname == null || email == null
				|| Userbirthday == null || usergender == null)
			msg = "NOT IMPLEMENTED: no data is given: nothing to add";
		
		User u = new User();
		u.setUserFirstName(firstname);
		u.setUserLastName(lastname);
		u.setUserGender(usergender);
		u.setUserEmail(email);
		if(Userbirthday!=null){
			if (!Userbirthday.matches("\\d{4}-\\d{2}-\\d{2}")){
				System.out.println("not match");
				msg="NOT IMPLEMENTED: wrong Date format. It should be yyyy-MM-dd";
			}else{
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date;
				try {
					date = formatter.parse(Userbirthday);
					/*Calendar c = Calendar.getInstance();
					c.setTime(date);
					u.setUserBirthDate(c);*/
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
		if (msg != null){
			return Response.status(Response.Status.BAD_REQUEST).
	        entity(msg).
	        type(MediaType.TEXT_PLAIN).
	        build();
		}
		
		// Add to database
		try {
			int userid = storage.createUSer(u);
			if (userid == -1)
				return Response.status(Response.Status.BAD_REQUEST).
				        entity("user is not created").
				        type(MediaType.TEXT_PLAIN).
				        build();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.ok(msg, "text/plain").entity("done").build();
	}
		

	
	/*
	@Path("{idPerson: \\d+}")
	@PUT
	@Produces({MediaType.TEXT_PLAIN})
	public Response updateUser (@PathParam("user_id") int id,
									@FormParam("user_first_name") String firstname,
									@FormParam("user_last_name")String lastname,
									@FormParam("user_email") String email,
									@FormParam("user_birth_date") String Userbirthday,
									@FormParam("user_gender") String usergender){
		
		String msg = null;
		
		// no inserted data
		if (firstname == null & lastname == null && email == null
				&& Userbirthday == null && usergender == null)
			msg = "NOT IMPLEMENTED: no data is given: nothing to edit";
				
		// no person with id
		User u=null;
		try {
			u = storage.readUser(id);
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(u==null)
			msg = "NOT IMPLEMENTED: no person with ID: "+id;
		else
			{
				//update
				if(firstname!=null)u.setUserFirstName(firstname);
				if(lastname!=null)u.setUserLastName(lastname);
				if(usergender!=null)u.setUserGender(usergender);
				if(email!=null)u.setUserEmail(email);
				if(Userbirthday!=null){
					if (!Userbirthday.matches("\\d{4}-\\d{2}-\\d{2}")){
						System.out.println("not match");
						msg="NOT IMPLEMENTED: wrong Date format. It should be yyyy-MM-dd";
					}else{
						SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
						Date date;
						try {
							date = formatter.parse(Userbirthday);
							Calendar c = Calendar.getInstance();
							c.setTime(date);
							
							u.setUserBirthDate(c);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}	
				}
			}
		if (msg != null){
			return Response.status(Response.Status.BAD_REQUEST).
            entity(msg).
            type(MediaType.TEXT_PLAIN).
            build();
		}
		
		// update to database
		try {
			storage.updateUser(u);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Response.ok(msg, "text/plain").entity("User with ID: "+id).build();
	}
	

		@Path("{idPerson: \\d+}")
		@DELETE
		@Produces(MediaType.TEXT_PLAIN)
		public Response removeUser(@PathParam("idUser") int id) {
			String msg=null;
			
			
			// get person
			User u=null;
			try {
				u = storage.readUser(id);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(u.getUserEmail());
			// check person
			if(u==null){
				msg = "NOT IMPLEMENTED: no person with ID: "+id;
			}
			if(msg!=null){
				return Response.status(Response.Status.BAD_REQUEST)
							.entity(msg)
							.build();
			}
		
			
			// remove person
			
			try {
				storage.removeUser(id);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return Response.ok("text/plain").entity("User with id:"+id).build();
		}
	*/
	public static void main(String[] args) {
		StorageProxy proxy = new StorageProxy();
		User u = new User();
		u.setUserEmail("a");
		u.setUserFirstName("a");
		u.setUserGender("male");
		u.setUserLastName("a");
		u.setUserBirthDate(new Date());
		u.setUserId(0);
		
		int i=0;
		try {
			i = proxy.createUSer(u);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
	}
}
