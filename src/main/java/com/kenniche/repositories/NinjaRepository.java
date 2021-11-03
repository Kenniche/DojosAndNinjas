package com.kenniche.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kenniche.models.Ninja;


@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{

	ArrayList<Ninja> findAll();
	
	Optional<Ninja> findById(Long id);
	
	Ninja save(Ninja ninja);
	
	void deleteById(Long id);
	
}
