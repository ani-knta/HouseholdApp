package com.sample.app.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sample.app.model.HouseholdItem;
import com.sample.app.repository.HouseholdItemRepository;
import com.sample.app.service.HouseholdService;

@Controller
@RequestMapping("/items")
public class HouseholdController {
	@Autowired
	private HouseholdService householdService;
	@Autowired
	private HouseholdItemRepository householdItemRepository;

	@Value("Household Appliances")
	private String title;

	@GetMapping("/list")
	public String getAllItems(Model model) {
		model.addAttribute("items", householdItemRepository.findAll());
		return "index";
	}

	@GetMapping("")
	public String getAll(Model model) {
		model.addAttribute("items", householdItemRepository.findAll());
		return "index";
	}
	
	@GetMapping("/add")
	public String showSignUpForm(HouseholdItem item, Model model) {
		model.addAttribute("item",item);
		return "add-item";
	}	
	 @PostMapping("/create") 
	 public String createItem(@Valid HouseholdItem item,BindingResult result,Model model){
	  
		 if (result.hasErrors()) { 
			 //return "add-item";  
			 return "redirect:list";
		 }
	  
		model.addAttribute("item",item); 
		householdItemRepository.save(item); 
		return	"redirect:list"; 
		//return "add-item"; 
	}
	
    @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Optional<HouseholdItem> item = householdItemRepository.findById(id);
        model.addAttribute("item", item.get());
        return "update-item";
    }
	
	@PostMapping("/update/{id}")
	public String updateItemById(HouseholdItem item, @PathVariable("id") Long id,BindingResult result,Model model) {
		if (result.hasErrors()) { 
			item.setId(id);
            return "update-item";
		}
		householdItemRepository.save(item);		
		//model.addAttribute("item", item);
		model.addAttribute("items",householdItemRepository.findAll());
		return "redirect:../list";
	}
	
	@GetMapping("delete/{id}")
    public String deleteItem(@PathVariable("id") Long id, Model model) {
        Optional<HouseholdItem> item = householdItemRepository.findById(id);
        if (!item.isPresent()) { 
            return "index";
		}
        householdItemRepository.deleteById(id);
        //model.addAttribute("items", item.get());
        model.addAttribute("items",householdItemRepository.findAll());
        return "redirect:../list";
    }
}
