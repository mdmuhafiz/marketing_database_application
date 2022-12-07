package com.marketingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp.entity.Lead;
import com.marketingapp.repository.LeadRepository;

@RestController
@RequestMapping("/leads")
public class LeadRestController1 {
	@Autowired
	private LeadRepository leadRepo;
	@PostMapping
	public void saveOneLead(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	@PutMapping
	public void updateOneLead(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") long id) {
		leadRepo.deleteById(id);
	}

}
