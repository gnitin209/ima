package com.mindtree.ima.service;

import com.mindtree.ima.dto.UserDto;
import com.mindtree.ima.exception.service.InventoryManagementServiceException;

public interface IProductService {

	String addProduct(UserDto user) throws InventoryManagementServiceException;

}
