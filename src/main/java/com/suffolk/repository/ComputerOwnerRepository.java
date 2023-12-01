package com.suffolk.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.suffolk.model.ComputerOwner;

public interface ComputerOwnerRepository extends JpaRepository<ComputerOwner, Long>, ComputerRepositoryExtended{

}
