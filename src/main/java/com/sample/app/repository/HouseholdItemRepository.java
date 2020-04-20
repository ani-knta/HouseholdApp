package com.sample.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.app.model.HouseholdItem;

public interface HouseholdItemRepository extends JpaRepository<HouseholdItem, Long>{

}
