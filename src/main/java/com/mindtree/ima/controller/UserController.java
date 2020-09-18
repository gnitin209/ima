package com.mindtree.ima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ima.exception.InventoryManagementApplicationException;
import com.mindtree.ima.service.IUserService;


@RestController
@RequestMapping(value="/user")
@CrossOrigin
public class UserController {

@Autowired
IUserService userService;
	@GetMapping("/login")
    public ResponseEntity<?>loginUser(@RequestParam String userEmail, @RequestParam String userPassword) throws InventoryManagementApplicationException {
       String message=userService.loginUser(userEmail,userPassword);
        System.out.println(message);
        return new ResponseEntity<>(message,HttpStatus.ACCEPTED);
    }
 


}
