package com.suffolk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suffolk.model.Computer;

public interface ComputerRepository extends JpaRepository<Computer, String> {

}
