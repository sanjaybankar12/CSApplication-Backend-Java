package com.cs.service;

import java.util.List;

import com.cs.entity.Program;

public interface ProgramService {

	void createProgram(Program program);

	List<Program> getProgramsByUser(String username);

	List<Program> getPrograms();

	void updateProgram(Program program);
}
