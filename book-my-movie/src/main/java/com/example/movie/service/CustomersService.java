package com.example.movie.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.movie.controller.CustomersController;
import com.example.movie.repository.CustomersRepository;

@Service
public class CustomersService

{
	private static final Logger logger = LoggerFactory.getLogger(CustomersController.class);
     @Autowired
	 CustomersRepository customersrepository;
     
     public  Map<String,Object> saveCustomer(Map<String,Object> Customer)
     {
    	 Map<String,Object> cs=new HashMap<>();
    	 
    	 String name=(String) Customer.get("user_name");
    	 String Number=(String) Customer.get("phone_number");
    	 String password=(String)Customer.get("cus_Password");
    	 	logger.info(name);
    	 	logger.info(Number);
    	 	logger.info(password);
    	 Long number=Long.valueOf(Number);
    	    List<Map<String, Object>> result = customersrepository.getPhoneNumber(number);
    	   logger.info("check" + number);
      	  if(result.isEmpty())
      	  {
      		customersrepository.getCustomers(name, number, password);
      		 cs.put("Success", result);
      		 
      	  }
      	  else {
      	     cs.put("status","201");
      	  }
      	  return cs;	 
     }
     public Map<String,Object> loggedCustomers(Map<String,Object> cusVerify)
     {
    	  Map<String,Object> rs=new HashMap<>(); 
    	  
    	 String Number=(String) cusVerify.get("phone_number");
    	 String Password=(String) cusVerify.get("cus_Password");
    	 Long number=Long.valueOf(Number);
    	 Map<String,Object> data= customersrepository.getLogged(number ,Password);
    	 logger.info("check"+data);
    	 if(data.isEmpty())
    	 {
    		 rs.put("check", data);
    		 
    	 }
    	 else
    	 {
    		 rs.put("name", data.get("user_name"));
    		 rs.put("id", data.get("customer_id"));
    		 rs.put("status", "201");
    	 }
    	 return rs;
     }
  
       public Map<String,Object> movieDetails()
       {
    	   List<Map<String,Object>> result=customersrepository.allMoviesDetails();
    	   Map<String,Object> data=new HashMap<>();
    	   data.put("movies",result);
    	   logger.info("Check" +data);
    	   return data;
    	   
       }
       
       public Map<String,Object> getMovie(@RequestBody Map<String,Object> movies)
       {
    	   String Movie=(String) movies.get("movie_id");
    	   Long movieId=Long.valueOf(Movie);
    	   logger.info("Check" + movieId);
    	   Map<String,Object> getRs=new HashMap<>();
    	  List<Map<String,Object>> data=customersrepository.getMovies(movieId);
    	   getRs.put("allMovie", data);
    	   
    	   logger.info("Check" +getRs);
    	   return getRs;
       }
       public Map<String,Object> TheatersData()
       {
    	   List<Map<String,Object>> ts=customersrepository.getTheaterData();
    	   Map<String,Object> Results=new HashMap<>();
    	   Results.put("Theaters", ts);
    	   logger.info("Checking"+Results);
    	   return Results;
       }
       
		/*
		 * public Map<String,Object> ordersData(@RequestBody Map<String,Object>
		 * ordersDetails) {
		 * 
		 * return data; }
		 */
}
	
    

 	

  

	
	
