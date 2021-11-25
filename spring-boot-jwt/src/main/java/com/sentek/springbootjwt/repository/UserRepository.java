package com.sentek.springbootjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sentek.springbootjwt.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
