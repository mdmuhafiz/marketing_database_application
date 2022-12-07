package com.marketingapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.entity.Lead;
import com.marketingapp.repository.LeadRepository;

@Service
public class LeadServicesImpl implements LeadServices {
	@Autowired
	private LeadRepository leadRepo;
	

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}


	@Override
	public List<Lead> listAllLeads() {
		List<Lead> lead = leadRepo.findAll();
		return lead;
	}


	@Override
	public void deleteLeadById(long id) {
		leadRepo.deleteById(id);
		
	}


	@Override
	public Lead updateLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

}
