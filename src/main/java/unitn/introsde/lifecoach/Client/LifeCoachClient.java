package unitn.introsde.lifecoach.Client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.representation.Form;

import unitn.introsde.storage_service.ws.StorageProxy;
import unitn.introsde.storage_service.ws.User;

public class LifeCoachClient {

	public static void main(String[] args) {
		
		new LifeCoachClient().demo();
		
	}
	
	private void demo() {
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

			
		String options = "\n-------------------------------------------------------------------\n" +
				"*. CRUD operations provided by the service ! \n" +
				"\t1. GET /user/ should return the user with a specific ID \n" +
				"\t2. POST /User/ should create a new user  \n" +
				"\t3. DELETE /Tasks/{userId}/{taskId} should delet the task  with ID {taskId}  for user with ID {userId} \n" +
				"\t4. POST Tasks/  The user with id user_id add task \n" +
				"\t5. Send   Tasks/Reminder/User/{user_id}  sending reminder for users about the tasks of the day \n" +
				"\t6. Send   Tasks/Reminder/Caregiver/{cg_id}  sending reminder for users about the tasks of the day \n" +
				"0. exit ^_^";
	
		
		ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        WebResource resource = client.resource(baseUrl);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String url;
        int selected = 100;
        try {
            Scanner scanner = new Scanner(System.in);
        	while (selected !=0){

        		String firstname,lastname,gender,email, birthdate;
        		int user_id;
        		
        		switch (selected) {
        			case	1:
        					System.out.print("Enter the user id : ");
        					user_id = Integer.parseInt(br.readLine().toString().trim());
        					url = baseUrl + "/user/"+user_id;
				
        					resource = client.resource(url);
        					getUserbyId(resource);
				break;
        			case	2:			
							url = baseUrl + "/user";
				
							System.out.println("Enter the user firstname ");
							firstname=br.readLine();
       	    	
							System.out.println("Enter the user lastname  ");
							lastname=br.readLine();
                    
							System.out.println("Enter the user birthdate");
							birthdate=br.readLine();
                    
							System.out.println("Enter the user email ");
							email=br.readLine();
                 
							System.out.println("Enter the user gender (Male/Female) ");
							gender=br.readLine();
       	    	 
							
							resource = client.resource(url);
							System.out.println(resource);
				            addUser(resource, firstname, lastname, gender, email, birthdate);
				
				
							break;
        		}
        		if(selected!=0)
        			System.out.println(options);
				System.out.println("Choose the number: ");
				selected = Integer.parseInt(scanner.next().toString());
        			}
    			br.close();
    		} 
        	catch (Exception e) {
    				System.err.println("Something went wrong. Check the URI and Parameters !");
    				e.printStackTrace();
    			}
    		
    	}	

	private void report(String msg, String response) {
		System.out.println("\n" + msg + response);
	}
	
	private void getUserbyId(WebResource resource){
		System.out.println(resource.getURI());
		String response = 
			resource.accept(MediaType.APPLICATION_JSON)
					.get(String.class);
		
		if(!response.equalsIgnoreCase("null"))
			report("Details of the user task : ", response);
		else 
			report("Details of the user task :","Not found. Check the URI and Parameters !");
	}
	
	
	
	/**
	 * Add user 
	 */
	private void addUser(WebResource resource,String firstname, String lastname,
			String gender,String email,String birthdate){
		
		System.out.println(resource.getURI());
		
		Form form = new Form();
		form.add("user_first_name",firstname );
		form.add("user_last_name",lastname );
		form.add("user_gender", gender);
		form.add("user_email", email);
		form.add("user_birth_date",birthdate);
		
		ClientResponse response = 
			resource.type(MediaType.APPLICATION_FORM_URLENCODED_TYPE)
			.accept(MediaType.TEXT_PLAIN_TYPE)
			.post(ClientResponse.class, form);
		
		System.out.println(form);
		System.out.println(response);
				
		report("POST: \n", response.getEntity(String.class));
	}
}
