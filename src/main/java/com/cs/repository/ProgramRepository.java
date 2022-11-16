package com.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cs.entity.Program;

@Repository
public interface ProgramRepository extends JpaRepository<Program,Integer> {

	@Query("select p from Program p where p.username=:username and p.status='YES'")
	public List<Program> getProgramsByUser(@Param("username") String username);
	
	@Query("select p from Program p where p.status='NO'")
	public List<Program> getPrograms();
	
	@Modifying
	@Query("update Program p set p.status=:status where p.id=:id")
	public void updateProgram(@Param("id") Integer id, @Param("status") String status);
}
