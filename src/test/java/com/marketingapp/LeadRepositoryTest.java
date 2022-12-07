package com.marketingapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.marketingapp.entity.Lead;
import com.marketingapp.repository.LeadRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class LeadRepositoryTest {
	@Autowired
	private LeadRepository leadRepo;
	@Test
	public void saveOneData() {
		Lead l = new Lead(2,"md","ali","ali@gmail.com","sangareddy","1010976316");
		leadRepo.save(l);
	}

}
