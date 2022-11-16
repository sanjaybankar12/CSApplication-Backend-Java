package com.cs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cs.entity.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity,Integer> {

	
}
