package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Users;

public interface UserRepositories extends JpaRepository<Users, Integer> {
	//Intialzing the find finding email
	public Users findByEmail(String email);
	
}
