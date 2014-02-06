package unitn.introsde.lifecoach.Resource;

import java.rmi.RemoteException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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

import unitn.introsde.storage_service.ws.Lifestatus;
import unitn.introsde.storage_service.ws.StorageProxy;
import unitn.introsde.storage_service.ws.User;
import unitn.introsde.storage_service.ws.*;


@Path("/LifeStyle")
public class LifeStyleResource {
	

		StorageProxy storage = new StorageProxy();
		
		@GET
		@Path("/{lifeStatus_Id}")
		@Produces({MediaType.APPLICATION_JSON })
		public Lifestatus getLifestatusById(@PathParam("lifeStatus_Id") int lifeStatus_Id){
			
			Lifestatus lifestatus=null;
			try {
				lifestatus = storage.readLifeStatus(lifeStatus_Id);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return lifestatus;
			
		}
		
		/**
		 * Update the life status.
		 * 
		 * Part 4: PUT on /LifeStatus
		 
		 * @param LifeStatus_id the user LifeStatus_id
		 * @param user_id the id of the user
		 * @param MeasureDef_id the id of the measure definition
		 * @param LifeStatus_value the Life status value
		 * 
		 * @return the response
		 */
		
		@PUT
		@Produces({MediaType.TEXT_PLAIN})
		public Response updateLifeStatus (@PathParam("user_id") int user_id,
										
										@FormParam("LifeStatus_id")int LifeStatus_id,
										@FormParam("MeasureDef_id") int MeasureDef_id,
										@FormParam("LifeStatus_value") double LifeStatus_value){
			
			String msg = null;
			
			// no inserted data
			try {
				if (storage.readUser(user_id) == null & storage.readLifeStatus(LifeStatus_id) == null )
					msg = "NOT IMPLEMENTED: no data is given: nothing to edit";
			} catch (RemoteException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			
			
			// no LifeStatus with id
			Lifestatus lifeS=null;
			
			Measurehistory ms=new Measurehistory();
			try {
				lifeS = storage.readLifeStatus(LifeStatus_id);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(lifeS==null)
				msg = "NOT IMPLEMENTED: no person with ID: "+LifeStatus_id;
			else
				{
				/*	//update
				Calendar c = Calendar.getInstance();
				
				lifeS.setUser(storage.readUser(user_id));
				lifeS.setMeasuredefinition(storage.readMeaDef(MeasureDef_id));
				lifeS.setLifeStatus_value(LifeStatus_value);
				lifeS.setLifeStatus_update_time(c);*/
						
						ms.setUser(lifeS.getUser());
						ms.setMeasuredefinition(lifeS.getMeasuredefinition());
						ms.setMeaHis_updated_time(lifeS.getLifeStatus_update_time());
						ms.setMeaHis_value(lifeS.getLifeStatus_value());
						ms.setMeaHis_calories(0.0);
						//storage.crea ???????????
 
						lifeS.setUser(lifeS.getUser());
						lifeS.setMeasuredefinition(lifeS.getMeasuredefinition());
						lifeS.setLifeStatus_update_time(lifeS.getLifeStatus_update_time());
						lifeS.setLifeStatus_value(lifeS.getLifeStatus_value());
						

					
			if (msg != null){
				return Response.status(Response.Status.BAD_REQUEST).
	            entity(msg).
	            type(MediaType.TEXT_PLAIN).
	            build();
			}
			
			// update to database
			try {
				storage.creatMeasureHistory(ms);
				storage.updateLifeStatus(user_id,lifeS);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				}
			return Response.ok(msg, "text/plain").entity("User with ID: "+LifeStatus_id).build();
		}
		
			/**
			 * Adds the life status.
			 * 
			 * Part 4: POST on /LifeStatus
			 
			 * @param user_id the user id
			 * @param MeasureDef_id the id of the measure definition
			 * @param LifeStatus_value the Life status value
			 * 
			 * @return the response
			 * @throws RemoteException 
			 */
			@POST
			@Produces(MediaType.TEXT_PLAIN)
			public Response addLifeStatus (
											@FormParam("user_id") int user_id,
											@FormParam("MeasureDef_id")int MeasureDef_id,
											@FormParam("LifeStatus_value") double LifeStatus_value) throws RemoteException{
				 
				String msg = null;
				
				//no inserted data
				try {
					if ( storage.readUser(user_id) == null  )
						msg = "NOT IMPLEMENTED: no data is given: nothing to add";
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Calendar c = Calendar.getInstance();
				
	if(storage.readMeaDef(MeasureDef_id).getMeaDef_type().equalsIgnoreCase("LifeStatus")){
				
				Lifestatus lifeS = new Lifestatus();
				
				lifeS.setUser(storage.readUser(user_id));
				lifeS.setMeasuredefinition(storage.readMeaDef(MeasureDef_id));
				lifeS.setLifeStatus_value(LifeStatus_value);
				lifeS.setLifeStatus_update_time(c);
				
				    // add to database
					storage.createLifeStatus(lifeS);
	}

	return Response.ok(msg, "text/plain").entity("done").build();	
	}
	/**
	 * Adds the life status.
	 * 
	 * Part 4: POST on /LifeStatus
	 
	 * @param user_id the user id
	 * @param MeasureDef_id the id of the measure definition
	 * @param LifeStatus_value the Life status value
	 * 
	 * @return the response
	 * @throws RemoteException 
	 */
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public Response addActivity (
									@FormParam("user_id") int user_id,
									@FormParam("MeasureDef_id")int MeasureDef_id,
									@FormParam("LifeStatus_value") double LifeStatus_value,
									@FormParam("Activity") String Activity,
									@FormParam("duration") int duration) throws RemoteException{
		 
		String msg = null;
		
		//no inserted data
		try {
			if ( storage.readUser(user_id) == null  )
				msg = "NOT IMPLEMENTED: no data is given: nothing to add";
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Calendar c = Calendar.getInstance();
		
if(storage.readMeaDef(MeasureDef_id).getMeaDef_type().equalsIgnoreCase("Activity")){
	
	
		Measurehistory ms = new Measurehistory();

		ms.setUser(storage.readUser(user_id));
		ms.setMeasuredefinition(storage.readMeaDef(MeasureDef_id));
		ms.setMeaHis_value(LifeStatus_value);
		ms.setMeaHis_updated_time(c);
	    ms.setMeaHis_calories(0);
	
		    // add to database
			storage.creatMeasureHistory(ms);
		
}
				
				if (msg != null){
					return Response.status(Response.Status.BAD_REQUEST).
			        entity(msg).
			        type(MediaType.TEXT_PLAIN).
			        build();
				}
				
			
				
				return Response.ok(msg, "text/plain").entity("done").build();		
					
				}
			
			
			
			
			
			/**
			 * Removes the lifeSatus.
			 * part 3: DELETE on /lifeStatus/{id}
			 *
			 * @param lifeStatus_Id the id
			 * @return the response
			 */
			@Path("{idPerson: \\d+}")
			@DELETE
			@Produces(MediaType.TEXT_PLAIN)
			public Response removeLifeStatus(@PathParam("lifeStatus_Id") int lifeStatus_Id) {
				String msg=null;
				
				
				// get lifeStatus
				Lifestatus lifeS=null;
				try {
					lifeS = storage.readLifeStatus(lifeStatus_Id);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// check person
				if(lifeS==null){
					msg = "NOT IMPLEMENTED: no person with ID: "+lifeStatus_Id;
				}
				if(msg!=null){
					return Response.status(Response.Status.BAD_REQUEST)
								.entity(msg)
								.build();
				}
			
				
				// remove person
				
				try {
					storage.removeLifeStatus(lifeStatus_Id);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return Response.ok("text/plain").entity("User with id:"+lifeStatus_Id).build();
			}
			
}
