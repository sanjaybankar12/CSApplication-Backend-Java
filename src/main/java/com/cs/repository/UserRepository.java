package com.cs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cs.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	@Query(value="select u from User u where u.username=:username")
	User getUser(@Param("username") String username);
}
