package com.kenniche.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kenniche.models.Dojo;


@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
	
	ArrayList<Dojo> findAll();
	
	Optional<Dojo> findById(Long id);
	
	Dojo save(Dojo dojo);
	
	void deleteById(Long id);
	
}
