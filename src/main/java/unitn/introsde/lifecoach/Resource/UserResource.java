package unitn.introsde.lifecoach.Resource;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
	@Consumes({MediaType.APPLICATION_XML})
	@Produces("application/json")
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
	
	/**
	 * Update person.
	 * part 2: PUT on /person/{id}
	 *
	 * @param user_id the id
	 * @param user_first_name the firstname
	 * @param user_last_name the lastname
	 * @param user_email the email
	 * @param user_birth_date the Userbirthday
	 * @param user_gender the usergender
	 * @return the response
	 */
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
	
		/**
		 * Adds the user.
		 * 
		 * Part 4: POST on /user
		 * @param user_id the id
		 * @param user_first_name the firstname
		 * @param user_last_name the lastname
		 * @param user_email the email
		 * @param user_birth_date the Userbirthday
		 * @param user_gender the usergender
		 * @return the response
		 */
		@POST
		@Produces({MediaType.TEXT_PLAIN})
		public Response addUser (
										@FormParam("user_first_name") String firstname,
										@FormParam("user_last_name")String lastname,
										@FormParam("user_email") String email,
										@FormParam("user_birth_date") String Userbirthday,
										@FormParam("user_gender") String usergender){
			 
			String msg = null;
			
			//no inserted data
			if (firstname == null & lastname == null && email == null
					&& Userbirthday == null && usergender == null)
				msg = "NOT IMPLEMENTED: no data is given: nothing to add";
			
			
			User u = new User();
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
			if (msg != null){
				return Response.status(Response.Status.BAD_REQUEST).
		        entity(msg).
		        type(MediaType.TEXT_PLAIN).
		        build();
			}
			
			// Add to database
			try {
				storage.createUSer(u);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return Response.ok(msg, "text/plain").entity("done").build();
		}
		
		
		/**
		 * Removes the person.
		 * part 3: DELETE on /person/{id}
		 *
		 * @param user_id the id
		 * @return the response
		 */
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
		

	
	
	
}
