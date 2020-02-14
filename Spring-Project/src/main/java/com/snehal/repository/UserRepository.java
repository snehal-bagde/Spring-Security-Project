package com.snehal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snehal.model.User;

public interface UserRepository extends JpaRepository<User, String>{

	List<User> findByNameLike(String name);

}
