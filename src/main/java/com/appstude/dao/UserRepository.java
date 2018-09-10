package com.appstude.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appstude.entities.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
	public User findByPassword(String username);
	
}
