package com.mindtree.ima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ima.dto.UserDto;
import com.mindtree.ima.exception.InventoryManagementApplicationException;
import com.mindtree.ima.service.IProductService;

@RestController
@RequestMapping(value="/product")
@CrossOrigin
public class ProductController {

	@Autowired 
	IProductService productService;
	
	@PostMapping("/add")
    public ResponseEntity<?>addInventory(@RequestBody UserDto user) throws InventoryManagementApplicationException {
       String message=productService.addProduct(user);
        System.out.println(message);
        return new ResponseEntity<>(message,HttpStatus.ACCEPTED);
    }
 
	

}
