package com.example.movie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Movies")
public class Movies 
{
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="movie_id")
	private Long movie_id;
	
	@Column(name="movie_names")
	private String  movie_names;
	
	@Column(name="movie_Images")
	private String movie_Images;
	
	@Column (name="movie_count")
	private String movie_count;
	
	@Column (name="star_count")
	private Float star_count;
	
	@Column (name="movie_type")
	private String movie_type;
	
	@Column(name="movie_background")
	private String movie_background;
	
	@Column(name="movie_about")
	private String movie_about;
	
	@Column(name="movie_date")
	private String movie_date;
	
	@Column(name="movie_category")
	private String movie_category;
	
	@Column(name="cast")
	private String cast;
	
	

	public Movies()
	{
		
	}
	
	public Movies(String movie_names, String movie_Images, String movie_count, Float star_count, String movie_type,
			String movie_background, String movie_about, String movie_date, String movie_category, String cast) {
		super();
		this.movie_names = movie_names;
		this.movie_Images = movie_Images;
		this.movie_count = movie_count;
		this.star_count = star_count;
		this.movie_type = movie_type;
		this.movie_background = movie_background;
		this.movie_about = movie_about;
		this.movie_date = movie_date;
		this.movie_category = movie_category;
		this.cast = cast;
	}

	public Long getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Long movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_names() {
		return movie_names;
	}

	public void setMovie_names(String movie_names) {
		this.movie_names = movie_names;
	}

	public String getMovie_Images() {
		return movie_Images;
	}

	public void setMovie_Images(String movie_Images) {
		this.movie_Images = movie_Images;
	}

	public String getMovie_count() {
		return movie_count;
	}

	public void setMovie_count(String movie_count) {
		this.movie_count = movie_count;
	}

	public Float getStar_count() {
		return star_count;
	}

	public void setStar_count(Float star_count) {
		this.star_count = star_count;
	}

	public String getMovie_type() {
		return movie_type;
	}

	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}

	public String getMovie_background() {
		return movie_background;
	}

	public void setMovie_background(String movie_background) {
		this.movie_background = movie_background;
	}

	public String getMovie_about() {
		return movie_about;
	}

	public void setMovie_about(String movie_about) {
		this.movie_about = movie_about;
	}

	public String getMovie_date() {
		return movie_date;
	}

	public void setMovie_date(String movie_date) {
		this.movie_date = movie_date;
	}

	public String getMovie_category() {
		return movie_category;
	}

	public void setMovie_category(String movie_category) {
		this.movie_category = movie_category;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}
	

}
