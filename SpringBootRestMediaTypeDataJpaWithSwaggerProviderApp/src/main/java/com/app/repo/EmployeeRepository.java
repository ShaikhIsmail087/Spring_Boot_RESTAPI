package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
