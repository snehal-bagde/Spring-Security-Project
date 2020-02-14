package com.snehal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snehal.model.Role;

public interface RoleRepository extends JpaRepository<Role, String>{

}
