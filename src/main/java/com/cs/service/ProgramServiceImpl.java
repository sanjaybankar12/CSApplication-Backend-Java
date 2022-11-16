package com.cs.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.entity.Program;
import com.cs.repository.ProgramRepository;

@Service
public class ProgramServiceImpl implements ProgramService {
	
	@Autowired
	private ProgramRepository programRepository;
	
	@Override
	@Transactional
	public void createProgram(Program program) {
		program.setStatus("NO");
		program.setDescription(program.getDescription().replace("\n","<BR/>"));
		this.programRepository.saveAndFlush(program);
	}

	@Override
	public List<Program> getProgramsByUser(String username) {
		return this.programRepository.getProgramsByUser(username);
	}

	@Override
	public List<Program> getPrograms() {
		return this.programRepository.getPrograms();
	}

	@Override
	@Transactional
	public void updateProgram(Program program) {
		this.programRepository.updateProgram(program.getProgramId(), program.getStatus());
	}

}
