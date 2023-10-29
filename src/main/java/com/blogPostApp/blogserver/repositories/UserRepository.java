package com.blogPostApp.blogserver.repositories;

import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogPostApp.blogserver.entities.Users;


@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

	User save(User user);

	Optional<Users> findById(Long id);

	void deleteById(Long id);

}
