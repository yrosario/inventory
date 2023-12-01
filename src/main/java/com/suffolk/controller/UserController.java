package com.suffolk.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suffolk.model.User;
import com.suffolk.service.UserServiceImp;


@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	private UserServiceImp userService;
	private Logger logger = LoggerFactory.getLogger(UserController.class);

	public UserController(UserServiceImp userService) {
		this.userService = userService;
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUser(@PathVariable Long id){
		User user = this.userService.getReferenceById(id);
		this.logger.info("USER ------- Value --- " + user);
		return user != null? new ResponseEntity<User>(user,HttpStatus.OK): new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/user")
	public ResponseEntity<?> saveUser(@RequestBody User user){
		logger.info("NEW USER -> " + user.toString());
		User newUser = this.userService.save(user);
		return newUser != null? 
				new ResponseEntity<User>(newUser,HttpStatus.CREATED)
				:new ResponseEntity<>("Unable to create user",HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/user")
	public ResponseEntity<?> getAllUsers(){
		return new ResponseEntity<>(this.userService.findAll(), HttpStatus.OK);
	}

}
