package com.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.entities.Category;
import com.project.demo.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
