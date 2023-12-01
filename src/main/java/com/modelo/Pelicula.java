package com.modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table (name="pelicula")
public class Pelicula {

   
  
	@Column(name = "episode_id")
    private String episode_id;
	
	@Column(name = "title")
    private String title;
	
	@Column(name = "release_date")
    private String release_date;



	public String getEpisode_id() {
		return episode_id;
	}




	public void setEpisode_id(String episode_id) {
		this.episode_id = episode_id;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getRelease_date() {
		return release_date;
	}




	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}



    

    
    
    
}