package com.training.springboot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.springboot.model.Employee;
import com.training.springboot.model.Product;
import com.training.springboot.repository.HomeRepository;
import com.training.springboot.model.User;


@Service
public class HomeService {
	
	@Autowired
	HomeRepository repo;
	
	/*public boolean isValid(String uname) {
		System.out.println("from page: " + uname);
		List<Employee> employees = repo.findAll();
		boolean valid = false;
		for(Employee emp:employees) {
			System.out.println(emp.getEmpId() + " - " + emp.getEmpName() + " - " + emp.getEmpSal());
			if(uname.equals(emp.getEmpName())){
				valid = true;
			}
			
		}
		
		return valid;
		
	}*/
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public List<Product> getProducts(){
		return repo.findAll();
	}
	
	/*public ResponseEntity<List<Employee>> getEmployeesByName (@RequestParam String empName){
		return new ResponseEntity<List<Employee>> (repo.findByEmpName(empName), HttpStatus.OK);
	}*/
	
	public Product getProduct(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteProduct(int id) {
		repo.deleteById(id);
	}

}