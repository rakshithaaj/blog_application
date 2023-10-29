package com.blogPostApp.blogserver.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogPostApp.blogserver.entities.Users;
import com.blogPostApp.blogserver.repositories.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	   UserRepository userRepository;

	    @Autowired
	    public UserServiceImpl(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    @Override
	    public List<Users> getAllUsers() {
	        return userRepository.findAll();
	    }

	    @Override
	    public Users getUserById(Long id) {
	        return userRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Users createUser(Users user) {
	        // Validation and password hashing can be done here
	        return userRepository.save(user);
	    }

	    @Override
	    public Users updateUser(Long id, Users updatedUser) {
	        Users existingUser = userRepository.findById(id).orElse(null);
	        if (existingUser != null) {
	            // Update user properties
	            existingUser.setUsername(updatedUser.getUsername());
	            existingUser.setEmail(updatedUser.getEmail());
	            existingUser.setPassword(updatedUser.getPassword());
	            existingUser.setProfilePicture(updatedUser.getProfilePicture());
	            existingUser.setBio(updatedUser.getBio());
	            existingUser.setRole(updatedUser.getRole());

	            return userRepository.save(existingUser);
	        } else {
	            return null;
	        }
	    }

	    @Override
	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }
	}


