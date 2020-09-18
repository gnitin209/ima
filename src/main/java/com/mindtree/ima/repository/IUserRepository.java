package com.mindtree.ima.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.ima.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer> {
	public Optional<User> findByuserEmail(String email);

}
