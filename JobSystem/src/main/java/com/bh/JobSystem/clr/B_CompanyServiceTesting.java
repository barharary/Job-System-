package com.bh.JobSystem.clr;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.bh.JobSystem.Service.CompanyService;
import com.bh.JobSystem.beans.Employee;
import com.bh.JobSystem.utils.ArtUtils;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@Order(2)
public class B_CompanyServiceTesting implements CommandLineRunner {

	private final CompanyService companyService;

	@Override
	public void run(String... args) throws Exception {

		ArtUtils.printCompanyServiceHeadline();

		String nameToAdd = "Shalom Hanoch";
		Employee employee = Employee.builder().name(nameToAdd).salary(12000).job(null).build();
		companyService.AddEmployee(employee);
		ArtUtils.insertToTable("Add employee name: " + nameToAdd, companyService.GetAllEmployees());

		double newSalary = 99001;
		employee.setSalary(newSalary);
		companyService.updateEmployee(employee);
		ArtUtils.insertToTable("update employee name: " + employee.getName() + " with new salary of: " + newSalary,
				companyService.GetAllEmployees());

		int employeeId = 2;
		Employee employeeToGet = companyService.GetEmployee(employeeId);
		System.out.println(employeeToGet);

		String name = "Yehuda Keisar";
		ArtUtils.insertToTable("get employees by name: " + name, companyService.GetEmployeesByName(name));

		ArtUtils.insertToTable("Get all jobs", companyService.GetAllJobs());

		Date date1 = Date.valueOf(LocalDate.now().plusWeeks(2));
		ArtUtils.insertToTable("Get jobs by DEADLINE of: " + date1,
				companyService.GetJobsByEndDate(Date.valueOf(LocalDate.now().plusWeeks(2))));

		Date date2 = Date.valueOf(LocalDate.now().plusDays(1));
		Date date3 = Date.valueOf(LocalDate.now().plusWeeks(1).plusDays(2));
		ArtUtils.insertToTable("Get jobs between " + date2 + " and " + date3, //
				companyService.GetJobsBetweenDates(date2, date3));

		System.out.println("End");

	}

}
