package com.saravana.simpleapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saravana.simpleapp.Entity.EmplInfo;
import com.saravana.simpleapp.repo.DBRepository;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	DBRepository dbRepo;

	@GetMapping("/getid")
	public Integer getEmplId(@RequestParam("id")  int emplId) {
		return dbRepo.getEmplId(emplId);
	}
	

}
