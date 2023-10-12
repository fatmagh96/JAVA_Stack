package com.codingdojo.dojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojos.models.Ninja;
import com.codingdojo.dojos.repositories.NinjaRepository;


@Service
public class NinjaService {

	@Autowired
	private NinjaRepository ninjaRepo;
	
	// returns all the books
    public List<Ninja> allNinjas() {
        return ninjaRepo.findAll();
    }
    // creates a book
    public Ninja createNinja(Ninja b) {
        return ninjaRepo.save(b);
    }
}
