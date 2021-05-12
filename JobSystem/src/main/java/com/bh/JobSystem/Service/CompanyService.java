package com.bh.JobSystem.Service;

import java.sql.Date;
import java.util.List;

import com.bh.JobSystem.beans.Employee;
import com.bh.JobSystem.beans.Job;
import com.bh.JobSystem.exceptions.EmployeeException;

public interface CompanyService {

	public void AddEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public Employee GetEmployee(int id) throws EmployeeException;

	public List<Employee> GetEmployeesByName(String name);

	public List<Employee> GetAllEmployees();

	public List<Job> GetAllJobs();

	public List<Job> GetJobsByEndDate(Date date);

	public List<Job> GetJobsBetweenDates(Date date1, Date date2);

}
