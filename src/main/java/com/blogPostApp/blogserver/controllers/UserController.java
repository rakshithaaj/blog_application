package com.blogPostApp.blogserver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogPostApp.blogserver.entities.Users;
import com.blogPostApp.blogserver.services.UserService;

@RestController
	@RequestMapping("/users")
	 
	public class UserController {
	     UserService userService;

	    @Autowired
	    public UserController(UserService userService) {
	        this.userService = userService;
	    }

	    @GetMapping("/")
	    public List<Users> getAllUsers() {
	        return userService.getAllUsers();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Users> getUserById(@PathVariable Long id) {
	        Users user = userService.getUserById(id);
	        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
	    }

	    @PostMapping("/")
	    public ResponseEntity<Users> createUser(@RequestBody Users user) {
	        Users createdUser = userService.createUser(user);
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Users> updateUser(@PathVariable Long id, @RequestBody Users updatedUser) {
	        Users user = userService.updateUser(id, updatedUser);
	        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	        return ResponseEntity.noContent().build();
	    }
	}


