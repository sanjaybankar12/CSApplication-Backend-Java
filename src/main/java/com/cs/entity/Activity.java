package com.cs.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonGetter;

@Entity
@Table(name="activity")
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "activity_name")
	private String activityName;
	
	@OneToMany(mappedBy = "activity")
	private List<Program> program;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@JsonGetter("title")
	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
}
