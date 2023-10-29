package com.blogPostApp.blogserver.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blogPostApp.blogserver.entities.Users;
@Service
public interface UserService {
	
	List<Users> getAllUsers();
    Users getUserById(Long id);
    Users createUser(Users user);
    Users updateUser(Long id, Users updatedUsers);
    void deleteUser(Long id);

}
