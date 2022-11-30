package com.mfu.rentbook_backend.controller;

import com.mfu.rentbook_backend.repository.*;
import com.mfu.rentbook_backend.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
  
  @Autowired
  private UserRepository userRepo;
  
  @GetMapping("/user")
  public ResponseEntity<List<User>> getAllUsers() {
	  try {
		  List<User> userList = new ArrayList<>();
		  userRepo.findAll().forEach(userList::add);
		  
		  if(userList.isEmpty()) {
			  return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		  }
		  return new ResponseEntity<>(userList, HttpStatus.OK);
	  }catch(Exception e) {
		  return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	  }
  }
  
  @GetMapping("/user/{id}")
  public ResponseEntity<User> getUserById(@PathVariable Long id) {
	  Optional<User> userData = userRepo.findById(id);
	  
	  if(userData.isPresent()) {
		  return new ResponseEntity<>(userData.get(), HttpStatus.OK);
	  }
	  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  
  @PostMapping("/user")
  public ResponseEntity<User> addUser(@RequestBody User user) {
	  User usrObj = userRepo.save(user);
	  
	  return new ResponseEntity<>(usrObj, HttpStatus.OK);
  }
  
  @PostMapping("/user/{id}")
  public ResponseEntity<User> updateUserById(@PathVariable Long id, @RequestBody User newUserData) {
	  Optional<User> oldUserData = userRepo.findById(id);
	  
	  if(oldUserData.isPresent()) {
		  User updatedUserData = oldUserData.get();
		  updatedUserData.setUsername(newUserData.getUsername());
		  updatedUserData.setPassword(newUserData.getPassword());
		  
		  User usrObj = userRepo.save(updatedUserData);
		  return new ResponseEntity<>(usrObj, HttpStatus.OK);
	  }
	  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  
  @DeleteMapping("/user/{id}")
  public ResponseEntity<HttpStatus> deleteUserById(@PathVariable Long id) {
	  userRepo.deleteById(id);
	  return new ResponseEntity<>(HttpStatus.OK);
  }
}