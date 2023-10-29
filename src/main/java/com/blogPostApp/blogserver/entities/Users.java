package com.blogPostApp.blogserver.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="User_id")
	private Long id;
	
	@Column(name="User_Name")
	private String username;
	
	@Column(name="User_Email")
	private String email;
	
	@Column(name="User_Password")
	private String password;
	
	@Column(name="User_Bio")
	private String bio;
	
	@Column(name="User_role")
	private String Role;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(Long id, String username, String email, String password, String bio, String role) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.bio = bio;
		Role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", bio="
				+ bio + ", Role=" + Role + "]";
	}
	public Object getProfilePicture() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setProfilePicture(Object profilePicture) {
		// TODO Auto-generated method stub
		
	}
	
	

}
