package com.jueyunqi.service;

import java.util.List;
import java.util.Map;

import com.jueyunqi.exception.ServiceException;
import com.jueyunqi.simple.entity.Employee;

public interface EmployeeService {
	Long addEmployee(Employee employee) throws ServiceException;
	Employee findById(Long id);
	List<Employee> queryEmployees(Map<String, Object> params);
}
