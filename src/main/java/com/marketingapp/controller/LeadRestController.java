package com.marketingapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp.entity.Lead;
import com.marketingapp.repository.LeadRepository;

@RestController
public class LeadRestController {
	@Autowired
	private LeadRepository leadRepo;
	@RequestMapping("/lead/{id}")
	public Lead getLeads(@PathVariable("id") long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@RequestMapping("/leads")
	@GetMapping
	public List<Lead> getAllLeads(){
		List<Lead> lead = leadRepo.findAll();
		return lead;
	}
	

}
