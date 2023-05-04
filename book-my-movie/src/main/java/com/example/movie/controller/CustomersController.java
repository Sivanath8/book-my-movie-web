package com.example.movie.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.movie.repository.CustomersRepository;
import com.example.movie.service.CustomersService;
import com.google.gson.Gson;

@Controller
public class CustomersController 
{
	@Autowired
	CustomersService customersservice;

	@Autowired
	CustomersRepository customersRepository;

	private static final Logger logger = LoggerFactory.getLogger(CustomersController.class);

		@GetMapping("/Customers")
		public String listCustomers() 
		{
			return "Customers";
		}
	    
	 @GetMapping("/Movies") 
	 public String listMovies()
	  {   
	  return "Movies";
	  }
	 
	 @CrossOrigin
	 @PostMapping("/Customers")
	 @ResponseBody
	  public String saveCustomer(@RequestBody Map<String,Object> customer)
	  {
		  Map<String,Object> rs= customersservice.saveCustomer(customer);
		  String data = new Gson().toJson(rs);
		  logger.info("rs registercustomers"+ data);
		  return data;
	  }
	 
	 @CrossOrigin
	 @PostMapping("/Movies")
	 @ResponseBody
	 public String login(@RequestBody Map<String,Object> cusVerify)
	 {
		 Map<String,Object> verifyData=customersservice.loggedCustomers(cusVerify);
		 String value=new Gson().toJson(verifyData);
		 logger.info("siva"+value);
		 return value;
	 }
	 
	 @CrossOrigin
	 @PostMapping("/AllMovies")
	 @ResponseBody
	 public String allMovie()
	 {
		 Map<String,Object> getAllData=customersservice.movieDetails();
		 String value=new Gson().toJson(getAllData);
		 logger.info(value);
		 return value;
	 }
	 @GetMapping("/MovieDetails")
	 public String aboutMovie() 
     {
		return "MovieDetails";
	}
	 @GetMapping("/FinalPage")
	 public String confirmPage() 
     {
		return "FinalPage";
	}

	@CrossOrigin	
	@PostMapping("/MovieDetails")
	@ResponseBody
	public String allMovies(@RequestBody Map<String,Object> movies)
	{
		Map<String,Object> data=customersservice.getMovie(movies);
		String value=new Gson().toJson(data);
		logger.info("namecheck"+value);
		return value;
	}
	 @GetMapping("/theaters")
	 public String theater()
	 {
		 return"theaters";
	 }
	 
	 @CrossOrigin
	 @PostMapping("/showTheaters")
	 @ResponseBody
	 public String allTheaters()
	 {
		 Map<String,Object> rs= customersservice.TheatersData();
		 String alltheaters=new Gson().toJson(rs);
		 logger.info("inner Join" +alltheaters);
		 return alltheaters;
	 }
	@PostMapping("/Orders")
	@ResponseBody
	public String allOrders(@RequestBody Map<String,Object>ordersDetails)
	{
     return "";
	}


}
