package com.cs.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.cs.entity.Program;
import com.cs.service.ProgramService;

@RestController
@RequestMapping("/programs")
@CrossOrigin("*")
public class ProgramController {
	
	@Autowired
	private ProgramService programService;

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(consumes="application/json")
	public void createProgram(@RequestBody Program program) {
		this.programService.createProgram(program);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value="/{username}", produces = { "application/json" })
	public List<Program> getProgramsByUser(@PathVariable("username") String username) {
		return this.programService.getProgramsByUser(username);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(produces = { "application/json" })
	public List<Program> getPrograms() {
		return this.programService.getPrograms();
	}

	@ResponseStatus(HttpStatus.OK)
	@PutMapping(consumes = { "application/json" })
	public void updateProgram(@RequestBody Program program) {
		this.programService.updateProgram(program);
	}
}

