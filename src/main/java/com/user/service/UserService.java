package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.UserDetails;
import com.user.repository.UserRepo;
@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public UserDetails saveDataService(UserDetails user) {
		UserDetails save = userRepo.save(user);
		return save;
		
	}
	
	public UserDetails getData(Long userId) {
		return userRepo.findById(userId).get();
	}
		
	
		
	

}
