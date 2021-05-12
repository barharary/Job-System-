package com.bh.JobSystem.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bh.JobSystem.beans.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

	List<Job> findByEndDate(Date endDate);

	List<Job> findByEndDateBetween(Date endDate1, Date endDate2);

}
