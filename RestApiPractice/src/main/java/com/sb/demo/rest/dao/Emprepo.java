package com.sb.demo.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.demo.rest.emp.Employee;

public interface Emprepo extends JpaRepository<Employee,Integer> {

}
