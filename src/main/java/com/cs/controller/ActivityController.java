package com.cs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cs.entity.Activity;
import com.cs.service.ActivityService;

@RestController
@RequestMapping("/activities")
@CrossOrigin("*")
public class ActivityController {

	@Autowired
	private ActivityService activityService;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(produces = { "application/json" })
	public List<Activity> getActivities() {
		return this.activityService.getActivities();
	}
	
}
