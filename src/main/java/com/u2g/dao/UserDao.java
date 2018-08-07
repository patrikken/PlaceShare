package com.u2g.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.u2g.entities.User;

public interface UserDao extends JpaRepository<User, Long> {
	@Query("select u from User u where u.phone = :p")
	public User findUserByPhone(@Param("p") String tel);
}
