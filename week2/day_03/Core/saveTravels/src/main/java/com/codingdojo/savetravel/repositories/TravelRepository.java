package com.codingdojo.savetravel.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.savetravel.models.Travel;

public interface TravelRepository extends CrudRepository<Travel, Long> {
	
	List<Travel> findAll();
}
