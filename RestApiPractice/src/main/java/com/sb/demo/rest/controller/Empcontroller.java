package com.sb.demo.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.sb.demo.empl.Employee;
import com.sb.demo.rest.dao.Emprepo;
import com.sb.demo.rest.emp.Employee;

@RestController
public class Empcontroller {
	@Autowired
Emprepo repo;
	@RequestMapping("/")
	public String home() {
		return "This is restapi example";
	}
	
	@GetMapping("/emps")
	 public List<Employee> getEmps() {
		
		return repo.findAll();
	}
	
	@GetMapping("/emp/{empId}")
	 public Optional<Employee> getEmp(@PathVariable int empId) {
		Optional<Employee> e= repo.findById(empId);
		return e;
	}
	
	@PostMapping("/emp")
	public Employee addanEmp(@RequestBody Employee emp) {
		repo.save(emp);
		return emp;
	}
	
	@DeleteMapping("/emp/{empId}")
	public String delete(@PathVariable int empId) {
		//Optional<Employee> e=repo.findById(empId);
		repo.deleteById(empId);
		return "deleted";
	}
	
	@PutMapping("/emp")
	public Employee update(@RequestBody Employee emp) {
		repo.save(emp);
		return emp;
	}
	
	

}
