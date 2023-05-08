package com.staipa.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.staipa.webapp.services.ArticoliService;

@RestController
public class CachingController 
{
	@Autowired
	private ArticoliService articoliService;
	
	@GetMapping("clearAllCaches")
	public void clearAllCaches() 
	{
		this.articoliService.CleanCaches();
	}
	
}
