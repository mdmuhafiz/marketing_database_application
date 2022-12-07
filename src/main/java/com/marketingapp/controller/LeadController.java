package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.entity.Lead;
import com.marketingapp.services.LeadServices;
import com.marketingapp.utility.EmailServices;

@Controller
public class LeadController {
	@Autowired
	private EmailServices emailServices;
	
	@Autowired
	private LeadServices leadServices;
	
	@RequestMapping("/viewleadpagecontent")
	public String viewLeadPage() {
		
		return "lead_info";
	}
	@RequestMapping("/saveLead")
	public String saveLeadData(Lead lead,ModelMap model) {
		leadServices.saveLead(lead);
		//emailServices.sendSimpleMessage("muhafiz@gmail.com", "Hello Wold", "Hi, how are you");
		model.addAttribute("msg", "Your information is saved");
		return "lead_info";
	}
	@RequestMapping("/listall")
	public String listAllLead(ModelMap model) {
		List<Lead> leads = leadServices.listAllLeads();
		model.addAttribute("lead", leads);
		return "displayLeads";
	}
	@RequestMapping("/delete")
	public String deleteLead(@RequestParam("id") long id,ModelMap model) {
		leadServices.deleteLeadById(id);
		List<Lead> leads = leadServices.listAllLeads();
		model.addAttribute("lead", leads);
		return "displayLeads";
	}
	@RequestMapping("/updateLeadById")
	public String updateLeadById(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadServices.updateLeadById(id);
		model.addAttribute("lead", lead);
		return "updateLead";
	}
	@RequestMapping("/updateLead")
	public String updateLead(Lead lead,ModelMap model) {
		leadServices.saveLead(lead);
		List<Lead> leads = leadServices.listAllLeads();
		model.addAttribute("lead", leads);
		return "displayLeads";
	}

}
