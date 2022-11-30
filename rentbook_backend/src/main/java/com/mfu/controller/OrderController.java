package com.mfu.rentbook_backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mfu.rentbook_backend.repository.*;
import com.mfu.rentbook_backend.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.mfu.rentbook_backend.domain.*;

@RestController
public class RentalController {
  
  @Autowired
  private RentalRepository rentalRepo;
  
  @Autowired
  private BookRepository bookRepo;
  
  @Autowired
  private UserRepository userRepo;
  
  @GetMapping("/rental")
  public ResponseEntity<List<Rental>> getAllRentals() {
	  try {
		  List<Rental> rentalList = new ArrayList<>();
		  rentalRepo.findAll().forEach(rentalList::add);
		  
		  if(rentalList.isEmpty()) {
			  return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		  }
		  return new ResponseEntity<>(rentalList, HttpStatus.OK);
	  }catch(Exception e) {
		  return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	  }
  }
  
  @GetMapping("/rental/{id}")
  public ResponseEntity<Rental> getRentalById(@PathVariable Long id) {
	  Optional<Rental> rentalData = rentalRepo.findById(id);
	  
	  if(rentalData.isPresent()) {
		  return new ResponseEntity<>(rentalData.get(), HttpStatus.OK);
	  }
	  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  
  @PostMapping("/rental")
  public ResponseEntity<Rental> addRental(@RequestBody Rental rental) {
	  Rental rentalObj = rentalRepo.save(rental);
	  
	  return new ResponseEntity<>(rentalObj, HttpStatus.OK);
  }
  
  @PostMapping("/rental/{id}")
  public ResponseEntity<Rental> updateRentalById(@PathVariable Long id, @RequestBody Rental newRentalData) {
	  Optional<Rental> oldRentalData = rentalRepo.findById(id);
	  
	  if(oldRentalData.isPresent()) {
		  Rental updatedRentalData = oldRentalData.get();
		  updatedRentalData.setName(newRentalData.getName());
		  updatedRentalData.setPrice(newRentalData.getPrice());
		  
		  
		  Rental rentalObj = rentalRepo.save(updatedRentalData);
		  return new ResponseEntity<>(rentalObj, HttpStatus.OK);
	  }
	  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  
  @DeleteMapping("/rental/{id}")
  public ResponseEntity<HttpStatus> deleteRentalById(@PathVariable Long id) {
	  rentalRepo.deleteById(id);
	  return new ResponseEntity<>(HttpStatus.OK);
  }
}