package com.example.movie.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="Customers")
public class Customers 

{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="customer_id")
	private Long customer_id;
	

    @Column(name="user_name")
	private String user_name;
	
    @Column(name="phone_number" ,unique=true )
	private Long phone_number;
    
    @Column(name="cus_Password" ,length=65)
    private String cus_Password;
  
    
     public Customers() 
     {
		
     }
     
	public Long getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public Long getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}


	public String getCus_Password() {
		return cus_Password;
	}


	public void setCus_Password(String cus_Password) {
		this.cus_Password = cus_Password;
	}
	public boolean isValid() {
        return user_name != null && !user_name.isEmpty();
    }
}
