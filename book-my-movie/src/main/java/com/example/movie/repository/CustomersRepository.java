package com.example.movie.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.movie.entity.Customers;

@Repository
@Component
public interface CustomersRepository extends JpaRepository<Customers , Long>

{
	@Modifying
	@Transactional
	@Query(nativeQuery=true,value="INSERT INTO customers (user_name, phone_number, cus_Password)\r\n"
			+ "VALUES (?1, ?2, ?3); ")
	public void getCustomers( String name, long number,String password);
	
	
	
	@Query(nativeQuery=true,value="select * from movies")
	public List< Map<String,Object>> allMoviesDetails();
	
	@Query(nativeQuery=true,value="select*from movies where movie_id=?1")
	public List<Map<String,Object>> getMovies(Long movieId);

	@Query(nativeQuery=true,value="select * from customers where phone_number=?1 ")
     public List<Map<String, Object>> getPhoneNumber(long phone_Number);
	@Query(nativeQuery=true,value="select * from customers where phone_number=?1 && cus_Password=?2")
    public Map<String, Object> getLogged(long phone_Number,String Password);
	@Query(nativeQuery=true,value="select movies.movie_names,movies.movie_type,theaters.theater_name,theaters.time_show1,theaters.time_show2,theaters.theater_id,theaters.show_time1,theaters.show_time2,theaters.time_show1,theaters.star_count,theaters.theater_image\r\n"
			+ "from movies inner join theaters on movies.movie_id = theaters.movie_id")
	public List<Map<String,Object>>getTheaterData();
	/* @Query(nativeQuery=true,value = "insert into orders(" ) */
		
}
