package com.cs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.entity.Activity;
import com.cs.repository.ActivityRepository;

@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityRepository activityRepository; 
	
	@Override
	public List<Activity> getActivities() {
		return this.activityRepository.findAll();
	}
	
}
