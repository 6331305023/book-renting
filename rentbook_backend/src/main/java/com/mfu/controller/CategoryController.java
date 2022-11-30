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
public class CategoryController {
  
  @Autowired
  private CategoryRepository categoryRepo;
  
  @GetMapping("/category")
  public ResponseEntity<List<Category>> getAllCategorys() {
	  try {
		  List<Category> categoryList = new ArrayList<>();
		  categoryRepo.findAll().forEach(categoryList::add);
		  
		  if(categoryList.isEmpty()) {
			  return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		  }
		  return new ResponseEntity<>(categoryList, HttpStatus.OK);
	  }catch(Exception e) {
		  return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	  }
  }
  
  @GetMapping("/category/{id}")
  public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
	  Optional<Category> categoryData = categoryRepo.findById(id);
	  
	  if(categoryData.isPresent()) {
		  return new ResponseEntity<>(categoryData.get(), HttpStatus.OK);
	  }
	  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  
  @PostMapping("/category")
  public ResponseEntity<Category> addCategory(@RequestBody Category category) {
	  Category categoryObj = categoryRepo.save(category);
	  
	  return new ResponseEntity<>(categoryObj, HttpStatus.OK);
  }
  
  @PostMapping("/category/{id}")
  public ResponseEntity<Category> updateCategoryById(@PathVariable Long id, @RequestBody Category newCategoryData) {
	  Optional<Category> oldCategoryData = categoryRepo.findById(id);
	  
	  if(oldCategoryData.isPresent()) {
		  Category updatedCategoryData = oldCategoryData.get();
		  updatedCategoryData.setCategoryName(newCategoryData.getCategoryName());
		  
		  Category categoryObj = categoryRepo.save(updatedCategoryData);
		  return new ResponseEntity<>(categoryObj, HttpStatus.OK);
	  }
	  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  
  @DeleteMapping("/category/{id}")
  public ResponseEntity<HttpStatus> deleteCategoryById(@PathVariable Long id) {
	  categoryRepo.deleteById(id);
	  return new ResponseEntity<>(HttpStatus.OK);
  }
}