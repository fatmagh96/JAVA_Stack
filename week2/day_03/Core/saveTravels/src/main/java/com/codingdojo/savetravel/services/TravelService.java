package com.codingdojo.savetravel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.savetravel.models.Travel;
import com.codingdojo.savetravel.repositories.TravelRepository;

@Service
public class TravelService {
	
	@Autowired
	private TravelRepository travelRepository;
	
	public List<Travel> findAll(){
		return travelRepository.findAll();
	}
	
	public Travel create(Travel t) {
		return travelRepository.save(t);
	}
	
	public Travel findById(Long id) {
		Optional<Travel> travel= travelRepository.findById(id);
		if(travel.isPresent()) {
			return travel.get();
		}
		return null;
	}
	
	public Travel update(Travel t) {
		return travelRepository.save(t);
	}
	
	public void delete(Long id) {
		travelRepository.deleteById(id);
	}

}
