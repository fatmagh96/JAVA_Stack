package com.codingdojo.dojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojos.models.Dojo;
import com.codingdojo.dojos.repositories.DojoRepository;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepository dojoRepo;
	
	// returns all the books
    public List<Dojo> allDojos() {
        return dojoRepo.findAll();
    }
    // creates a book
    public Dojo createDojo(Dojo b) {
        return dojoRepo.save(b);
    }
    // retrieves a book
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepo.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }

}
