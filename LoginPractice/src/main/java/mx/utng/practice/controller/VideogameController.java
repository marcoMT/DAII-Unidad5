package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Customer;
import mx.utng.practice.model.Videogame;
import mx.utng.practice.repository.VideogameRepository;

@Named
@ViewScoped
public class VideogameController {

	@Autowired
	private VideogameRepository videogameRepository;
	
	private Videogame videogame = new Videogame();
	private List<Videogame> videogames;
	
	private boolean editMode = false;
	
	
	@PostConstruct
	public void init(){
		setVideogames(videogameRepository.findAll());
	}
	
	
	public void save(){
		videogameRepository.save(videogame);
		if(!editMode){
			getVideogames().add(videogame);
		}
		videogame = new Videogame();
		setEditMode(false);
	}
	
	public void delete(Videogame videogame){
		videogameRepository.delete(videogame);
		videogames.remove(videogame);
	}
	
	public void update(Videogame videogame){
		setVideogame(videogame);
		setEditMode(true);
	}
	
	public void cancel(){
		videogame = new Videogame();
		setEditMode(false);
	}
	

	public Videogame getVideogame() {
		return videogame;
	}

	public void setVideogame(Videogame videogame) {
		this.videogame = videogame;
	}

	public List<Videogame> getVideogames() {
		return videogames;
	}

	public void setVideogames(List<Videogame> videogames) {
		this.videogames = videogames;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
}
