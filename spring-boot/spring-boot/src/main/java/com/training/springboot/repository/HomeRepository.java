package com.training.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springboot.model.Employee;
import com.training.springboot.model.Product;

public interface HomeRepository extends JpaRepository<Product, Integer> {
	
	//List<Employee> findByEmpName(String empName);
}