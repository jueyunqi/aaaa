package com.jueyunqi.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jueyunqi.exception.ServiceException;
import com.jueyunqi.simple.entity.Employee;

@Repository
public interface EmployeeDao {
	int insert(Employee employee) throws ServiceException;
	Employee find(long id);
	List<Employee> query(Map<String, Object> params);
}
