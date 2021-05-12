package com.bh.JobSystem.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private double salary;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@Singular
	private List<Job> jobs = new ArrayList<>();

	@Override
	public String toString() {
		return "| " + id + "\t| " + name + "\t\t| " + salary + "\t| "
				+ jobs.stream().map(c -> c.getDescription()).collect(Collectors.toList()) + "\t\t\t";
	}

}
