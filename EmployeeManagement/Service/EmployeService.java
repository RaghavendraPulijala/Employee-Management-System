package com.example.EmployeeManagement.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.EmployeeManagement.Model.Employee;

public interface EmployeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
    Page<Employee> findPaginated(int pageNo,int pageSize);

	
}
