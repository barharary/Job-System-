package com.bh.JobSystem.clr;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.bh.JobSystem.beans.Employee;
import com.bh.JobSystem.beans.Job;
import com.bh.JobSystem.repository.EmployeeRepository;
import com.bh.JobSystem.repository.JobRepository;
import com.bh.JobSystem.utils.ArtUtils;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@Order(1)
public class A_PrimaryData implements CommandLineRunner {
	private final EmployeeRepository employeeRepository;
	private final JobRepository jobRepository;

	@Override
	public void run(String... args) {
		System.out.println("1");
		Job job1 = Job.builder().description("Finish Coupon Project 3")
				.endDate(Date.valueOf(LocalDate.now().plusWeeks(1))).build();
		Job job2 = Job.builder().description("be great in angular").endDate(Date.valueOf(LocalDate.now().plusWeeks(2)))
				.build();
		Job job3 = Job.builder().description("Get a Job\t\t").endDate(Date.valueOf(LocalDate.now().plusWeeks(2))).build();
		Job job4 = Job.builder().description("Make the Perfect omlet")
				.endDate(Date.valueOf(LocalDate.now().plusWeeks(3))).build();

		Employee employee1 = Employee.builder().name("Haiem Moshe").salary(16000).jobs(Arrays.asList(job1, job2))
				.build();
		Employee employee2 = Employee.builder().name("Yehuda Keisar").salary(16000).jobs(Arrays.asList(job3, job4))
				.build();
		employeeRepository.saveAll(Arrays.asList(employee1, employee2));
		ArtUtils.insertToTable("Get Employees", employeeRepository.findAll());
		// jobRepository.saveAll(Arrays.asList(job1, job2, job3, job4));
		ArtUtils.insertToTable("Get Jobs", jobRepository.findAll());

	}

}
