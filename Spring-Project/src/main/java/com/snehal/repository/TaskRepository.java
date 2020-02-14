package com.snehal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snehal.model.Task;
import com.snehal.model.User;

public interface TaskRepository extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user);

}
