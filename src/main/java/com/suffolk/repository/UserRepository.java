package com.suffolk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suffolk.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
