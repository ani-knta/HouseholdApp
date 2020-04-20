package com.sample.app;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import com.sample.app.controller.HouseholdController;
import com.sample.app.model.HouseholdItem;
import com.sample.app.repository.HouseholdItemRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
class HouseholdControllerTest {
	
	@Mock
	private HouseholdItemRepository HouseholdItemRepository;
	
	@Mock
	private HouseholdController householdController;
	
	@Mock
	private Model model;
	
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	private MockMvc mockMvc;
	@MockBean
	private HouseholdItem householdItem;
	
	@Test
	public void test_getAllItems() {		
		HouseholdItem item =  new HouseholdItem("10001", "brand3", "model3", "status3", 
				new java.sql.Date(new java.util.Date().getTime()));
		
		model.addAttribute("items",item);
		
		when(householdController.getAllItems(model)).thenReturn(item.toString());
		when(householdController.getAllItems(null)).thenReturn(null);
	}
	@Test
	public void test_getAll() {		
		HouseholdItem item =  new HouseholdItem("10002", "brand2", "model2", "status2", 
				new java.sql.Date(new java.util.Date().getTime()));
		
		model.addAttribute("items",item);
		
		when(householdController.getAll(model)).thenReturn(item.toString());
		when(householdController.getAll(null)).thenReturn(null);	
	}
	
	@Test
	public void test_deleteItems() {		
		HouseholdItem item =  new HouseholdItem("10003", "brand3", "model3", "status3", 
				new java.sql.Date(new java.util.Date().getTime()));
		
		model.addAttribute("items",item);
		
		when(householdController.deleteItem(1L, model)).thenReturn(null);
	}
	@Test
	public void test_getAllI() {		
		HouseholdItem item =  new HouseholdItem("10004", "brand2", "model2", "status2", 
				new java.sql.Date(new java.util.Date().getTime()));
		
		model.addAttribute("items",item);
		
		when(householdController.getAll(model)).thenReturn(item.toString());
		when(householdController.getAll(null)).thenReturn(null);	
	}

	
	@Before 
	public void setup() { 
		this.mockMvc =
			MockMvcBuilders.standaloneSetup(new HouseholdController()).build(); 
	}
 

    @Test
    public void testHomePage() throws Exception {
		/*
		 * mockMvc.perform(MockMvcRequestBuilders.get("/items"))
		 * .andExpect(status().isOk()) .andExpect(view().name("index"))
		 * .andDo(MockMvcResultHandlers.print()) .andReturn();
		 */
    }
}
