package com.sentek.springbootjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sentek.springbootjwt.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(String name);
}
