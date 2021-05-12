package com.bh.JobSystem.clr;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bh.JobSystem.beans.Employee;
import com.bh.JobSystem.beans.Job;
import com.bh.JobSystem.utils.ArtUtils;

public class NoSpringTeting {

	public static void main(String[] args) {
		
		Job job1 = Job.builder().description("Finish Coupon Project 3")
				.endDate(Date.valueOf(LocalDate.now().plusWeeks(2))).build();
		Job job2 = Job.builder().description("be great in angular").endDate(Date.valueOf(LocalDate.now().plusWeeks(2)))
				.build();
		Job job3 = Job.builder().description("Get a Job             ").endDate(Date.valueOf(LocalDate.now().plusWeeks(2))).build();
		Job job4 = Job.builder().description("Make the Perfect omlet")
				.endDate(Date.valueOf(LocalDate.now().plusWeeks(2))).build();

		Employee employee1 = Employee.builder().name("Haiem Moshe").salary(16000).jobs(Arrays.asList(job1, job2))
				.build();
		Employee employee2 = Employee.builder().name("Yehuda Keisar").salary(16000).jobs(Arrays.asList(job3, job4))
				.build();
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		List<Job> jobs = new ArrayList<>();
		jobs.add(job1);
		jobs.add(job2);
		jobs.add(job3);
		jobs.add(job4);

		
		ArtUtils.insertToTable("Get primary Data", jobs);
		
	}
	
}
