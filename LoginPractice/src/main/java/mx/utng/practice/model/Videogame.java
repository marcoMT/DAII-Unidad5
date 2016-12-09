package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="videogames")
public class Videogame {
	
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String gender;
	
	public Videogame(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public Videogame() {
		this("","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "VideoGame [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	

}
