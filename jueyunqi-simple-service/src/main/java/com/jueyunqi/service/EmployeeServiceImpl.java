package com.jueyunqi.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jueyunqi.dao.EmployeeDao;
import com.jueyunqi.exception.ServiceException;
import com.jueyunqi.simple.entity.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	@Resource
	private EmployeeDao employeeDao;

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Long addEmployee(Employee employee) throws ServiceException {
		try {
			employeeDao.insert(employee);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}
		
		return employee.getId();
	}

	@Override
	public Employee findById(Long id) {
		return employeeDao.find(id);
	}

	@Override
	public List<Employee> queryEmployees(Map<String, Object> params) {
		return employeeDao.query(params);
	}

}
