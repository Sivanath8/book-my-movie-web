package com.example.movie;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.example.movie.entity.Customers;
import com.example.movie.repository.CustomersRepository;

@SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class BookMyMovieApplicationTests {

	/*
	 * @Autowired private CustomersRepository customersRepository;
	 * 
	 * @Autowired private TestEntityManager entityManager;
	 * 
	 * @Test public void testCreateCustomers() { Customers customers=new
	 * Customers(); customers.setCustomer_id(10);
	 * customers.setUser_name("manikandan"); customers.setPhone_number(1357924680);
	 * customers.setCusPassword("siva1234");
	 * 
	 * Customers savedCustomers=customersRepository.save(customers);
	 * 
	 * Customers existCustomers=entityManager.find(Customers.class,savedCustomers.
	 * getCustomer_id());
	 * 
	 * assertThat(existCustomers.getPhone_number()).isEqualTo(savedCustomers.
	 * getPhone_number()); }
	 */
	 

}
