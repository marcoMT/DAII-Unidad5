package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Videogame;

@Repository
public interface VideogameRepository extends JpaRepository<Videogame, Long>{

	
	@Query("select vid from Videogame vid")
	public List<Videogame> findAll();
}
