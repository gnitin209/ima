package com.mindtree.ima.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.ima.dto.UserDto;
import com.mindtree.ima.entity.DepartmentRequest;
import com.mindtree.ima.entity.Product;
import com.mindtree.ima.entity.User;
import com.mindtree.ima.exception.service.InventoryManagementServiceException;
import com.mindtree.ima.exception.service.custom.UserNotFound;
import com.mindtree.ima.repository.IDepartmentRequestRepository;
import com.mindtree.ima.repository.IProductRepository;
import com.mindtree.ima.repository.IUserRepository;
import com.mindtree.ima.service.IProductService;

public class ProductServiceImpl implements IProductService {

	@Autowired
	IDepartmentRequestRepository deptRepo;
	@Autowired
	IUserRepository userRepo;
	@Autowired
	IProductRepository productRepo;
	@Override
	public String addProduct(UserDto user) throws InventoryManagementServiceException {
		// TODO Auto-generated method stub
		User currentUser=userRepo.findByuserEmail(user.getUserEmail()).orElseThrow(()->new UserNotFound());
		if(currentUser.isUserRole()==false)
		{
			User tempUser=null;
			tempUser.setUserEmail(user.getUserEmail());
			DepartmentRequest deptRequest=new DepartmentRequest(user.getProductId(), false, tempUser);
			deptRepo.save(deptRequest);
			Product product=new Product(user.getProductId(), user.getProductName(), user.getProductVendor(), user.getProductPrice(), user.getProductQuantity(), user.getBatchNumber(), user.getBatchDate(), false);
         productRepo.save(product);
         return "Request Send For Adding Products";
		}
		
		return null;
	}

}
