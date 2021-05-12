package com.bh.JobSystem.Service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bh.JobSystem.beans.Employee;
import com.bh.JobSystem.beans.Job;
import com.bh.JobSystem.exceptions.EmployeeException;
import com.bh.JobSystem.repository.EmployeeRepository;
import com.bh.JobSystem.repository.JobRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

	private final EmployeeRepository employeeRepository;
	private final JobRepository jobRepository;

	@Override
	public void AddEmployee(Employee employee) {
		employeeRepository.save(employee);

	}

	@Override
	public void updateEmployee(Employee employee) {

		employeeRepository.saveAndFlush(employee);

	}

	@Override
	public Employee GetEmployee(int id) throws EmployeeException {

		return employeeRepository.findById(id).orElseThrow(() -> new EmployeeException("Id not found."));

	}

	@Override
	public List<Employee> GetEmployeesByName(String name) {
		return employeeRepository.findByName(name);
	}

	@Override
	public List<Employee> GetAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Job> GetAllJobs() {
		return jobRepository.findAll();
	}

	@Override
	public List<Job> GetJobsByEndDate(Date date) {
		return jobRepository.findByEndDate(date);
	}

	@Override
	public List<Job> GetJobsBetweenDates(Date date1, Date date2) {
		return jobRepository.findByEndDateBetween(date1, date2);
	}

}
