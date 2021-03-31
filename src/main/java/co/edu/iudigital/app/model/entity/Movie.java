package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "movie_id")
	private int movieId;
	private String name;
	private String description;
	private String image;
	@Column(name = "create_at")
	private LocalDateTime createAt;
	@Column(name = "release_date")
	private LocalDate releaseDate;
	private String actors;
	@ManyToOne
	@JoinColumn(name = "gender_id")
	private Gender genderId;
	private int rating;
	
	public Movie() {
		
	}

	public Movie(int movieId, String name, String description, String image, LocalDateTime createAt,
			LocalDate releaseDate, String actors, Gender genderId, int rating) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.description = description;
		this.image = image;
		this.createAt = createAt;
		this.releaseDate = releaseDate;
		this.actors = actors;
		this.genderId = genderId;
		this.rating = rating;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public Gender getGenderId() {
		return genderId;
	}

	public void setGenderId(Gender genderId) {
		this.genderId = genderId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
	
