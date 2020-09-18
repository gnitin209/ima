package com.mindtree.ima.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.ima.entity.User;
import com.mindtree.ima.exception.service.InventoryManagementServiceException;
import com.mindtree.ima.exception.service.custom.UserNotFound;
import com.mindtree.ima.repository.IUserRepository;
import com.mindtree.ima.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Autowired 
	IUserRepository userRepo;
	@Override
	public String loginUser(String userEmail, String userPassword) throws InventoryManagementServiceException {
		// TODO Auto-generated method stub
		User user =userRepo.findByuserEmail(userEmail).orElseThrow(()->new UserNotFound("User Not Found"));
   		
		return "Succesfully Logged in!";
	}

}
