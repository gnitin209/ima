package com.mindtree.ima.service;

import com.mindtree.ima.exception.service.InventoryManagementServiceException;

public interface IUserService {

	String loginUser(String userEmail, String userPassword) throws InventoryManagementServiceException;

}
