package com.suffolk.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suffolk.model.Computer;
import com.suffolk.repository.ComputerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ComputerServiceImpl implements GenericService<Computer, String>{

	private ComputerRepository computerRepository;
    private Logger logger = LoggerFactory.getLogger(ComputerServiceImpl.class);
	@Autowired
	public ComputerServiceImpl(ComputerRepository computerRepository) {
		super();
		this.computerRepository = computerRepository;
	}

	@Override
	public Computer getReferenceById(String id) {
		this.logger.info("THIS IS THE COMPUTER NAME " +id);
		Computer computer = this.computerRepository.getReferenceById(id);
		this.logger.info("COMPUTER INFO " + computer.toString());
		return this.computerRepository.findById(id).get();
	}

	@Override
	public List<Computer> findAll() {
		return this.computerRepository.findAll();
	}

	@Override
	public Computer save(Computer computer) {
		return this.computerRepository.save(computer);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
