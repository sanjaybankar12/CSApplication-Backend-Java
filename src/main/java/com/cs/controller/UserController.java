package com.cs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.entity.User;
import com.cs.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping(value ="/{username}",produces={ "application/json" })
	public ResponseEntity<User> getUser(@PathVariable("username") String username) {
		
		return ResponseEntity.ok(this.userService.getUser(username));
	}
	
}
