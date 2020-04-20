package com.sample.app;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sample.app.model.HouseholdItem;
import com.sample.app.repository.HouseholdItemRepository;

@SpringBootApplication
public class HouseholdApplianceAppApplication implements CommandLineRunner {
	
	@Autowired
	private HouseholdItemRepository householdItemRepository;


	public static void main(String[] args) {
		SpringApplication.run(HouseholdApplianceAppApplication.class, args);
	}
	
	/*
	 * @Bean CommandLineRunner init (HouseholdItemRepository
	 * householdItemRepository){ HouseholdItemRepository.save( new
	 * HouseholdItem(10001, "brand1", "model1", "status1", new Date("20/02/2020")));
	 * 
	 * }
	 */
		
	

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		HouseholdItem item1 =  new HouseholdItem("10001", "brand3", "model3", "status3", 
				new java.sql.Date(new java.util.Date().getTime()));
		householdItemRepository.save(item1);
		
		HouseholdItem item2 =  new HouseholdItem("10002", "brand3", "model3", "status3", 
				new java.sql.Date(new java.util.Date().getTime()));
		householdItemRepository.save(item2);
		
		HouseholdItem item3 =  new HouseholdItem("10003", "brand3", "model3", "status3", 
				new java.sql.Date(new java.util.Date().getTime()));
		householdItemRepository.save(item3);
		
		HouseholdItem item4 =  new HouseholdItem("10004", "brand4", "model4", "status4", 
				new java.sql.Date(new java.util.Date().getTime()));
		
		householdItemRepository.save(item4);
	}
	
}
