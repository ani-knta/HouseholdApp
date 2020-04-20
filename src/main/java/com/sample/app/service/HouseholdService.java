package com.sample.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.app.model.HouseholdItem;
import com.sample.app.repository.HouseholdItemRepository;

@Component
public class HouseholdService {
	/*
	 * private static List<HouseholdItem> items = new ArrayList<HouseholdItem>();
	 * 
	 * @Autowired private static HouseholdItem item; private static int itemsCount =
	 * 4;
	 * 
	 * static { items.add(new HouseholdItem(101, "Huggies"));
	 * 
	 * items.add(new HouseholdItem(102, "Pampers"));
	 * 
	 * items.add(new HouseholdItem(103, "Merries"));
	 * 
	 * items.add(new HouseholdItem(101, "MamyPoko")); }
	 * 
	 * public List<HouseholdItem> findAll() { return items; }
	 * 
	 * public HouseholdItem saveItem(HouseholdItem item) { if
	 * (item.getSerialNumber() == null) { item.setSerialNumber(++itemsCount); }
	 * items.add(item); return item; }
	 * 
	 * 
	 * public HouseholdItem findOneItem(int serialNumber){ for(HouseholdItem
	 * item:items){ if(item.getSerialNumber()==serialNumber) { return item; } }
	 * return null; }
	 * 
	 * public HouseholdItem deleteByItem(int serialNumber){ Iterator<HouseholdItem>
	 * iterator = items.iterator(); while (iterator.hasNext()) { HouseholdItem item
	 * = iterator.next(); if(item.getSerialNumber()==serialNumber) {
	 * iterator.remove(); return item; } }
	 * 
	 * 
	 * 
	 * return null; }
	 * 
	 */}
