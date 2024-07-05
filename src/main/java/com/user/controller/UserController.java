package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.UserDetails;
import com.user.service.UserService;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	
	private UserService userService;
	@PostMapping("/postdata")
	public UserDetails saveData(@RequestBody UserDetails user) {
		
		UserDetails saveDataService = userService.saveDataService(user);
				return saveDataService;
	}
	
	
	@GetMapping("/get{userId}")
	public UserDetails getData(@PathVariable Long userId) {
		return userService.getData(userId);
	}
	

}
