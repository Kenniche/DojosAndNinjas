package com.kenniche.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kenniche.models.Dojo;
import com.kenniche.repositories.DojoRepository;



@Service
public class DojoService {
	
	private DojoRepository dojoRepo;
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public ArrayList<Dojo> getAll() {
		return (ArrayList<Dojo>) dojoRepo.findAll();
	}
	
	public Dojo create(Dojo newDojo) {
		return dojoRepo.save(newDojo);
	}

	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;			
		}
	}
	
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
	}
}
