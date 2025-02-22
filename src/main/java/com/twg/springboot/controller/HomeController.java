package com.twg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twg.springboot.entity.Newtable;
import com.twg.springboot.service.NewtableService;
@RestController
public class HomeController {
   
	@Autowired
	private NewtableService newtableService;
	
	@GetMapping("/")
	public String insertNewtable()
	{
		Newtable newtable=new Newtable();
		newtable.setName("Raju");
		newtable.setDesgination("Manager");
		newtable.setDepartment("Accounts");
		newtable.setExp(30);
		
        Newtable neww=newtableService.saveNewtable(newtable);
		
		return "Newtable "+neww.getName()+" with id "+neww.getId()+" is saved sucessfully";
		
	}
	
}
