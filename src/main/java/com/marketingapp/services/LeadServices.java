package com.marketingapp.services;

import java.util.List;

import com.marketingapp.entity.Lead;

public interface LeadServices {
	public void saveLead(Lead lead);
	public List<Lead> listAllLeads();
	public void deleteLeadById(long id);
	public Lead updateLeadById(long id);

}
