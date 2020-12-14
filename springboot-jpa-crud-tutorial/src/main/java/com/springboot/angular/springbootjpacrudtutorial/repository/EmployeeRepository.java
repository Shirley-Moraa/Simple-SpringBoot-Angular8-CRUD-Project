package com.springboot.angular.springbootjpacrudtutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.angular.springbootjpacrudtutorial.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}