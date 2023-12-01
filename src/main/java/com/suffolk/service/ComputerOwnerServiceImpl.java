package com.suffolk.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suffolk.model.ComputerOwner;
import com.suffolk.repository.ComputerOwnerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ComputerOwnerServiceImpl implements GenericService<ComputerOwner, Long>, ComputerOwnerService{
	
	@Autowired
	private ComputerOwnerRepository computerOwnerRepository;
	
	private Logger logger = LoggerFactory.getLogger(ComputerOwnerServiceImpl.class);
	
	
	public ComputerOwnerServiceImpl(ComputerOwnerRepository computerOwnerRepository) {
		this.computerOwnerRepository = computerOwnerRepository;
	}

	@Override
	public ComputerOwner getReferenceById(Long id) {
		return this.computerOwnerRepository.getReferenceById(id);
	}

	@Override
	public List<ComputerOwner> findAll() {
		return this.computerOwnerRepository.findAll();
	}

	@Override
	public ComputerOwner save(ComputerOwner computerOwner) {
		return this.computerOwnerRepository.save(computerOwner);
	}

	@Override
	public void delete() {
		
		
	}

	@Override
	public List<ComputerOwner> findByUserCid(Long cid) {
		this.logger.info("CALLING FROCM COMPUTER OWNER SERVICE " + cid);
		return this.computerOwnerRepository.findByUserCid(cid);
	}

	@Override
	public void delete(Long cid, String sn) {
		// TODO Auto-generated method stu
		
	}

	@Override
	public List<ComputerOwner> findByComputerSn(String sn) {
		return this.computerOwnerRepository.findByComputerSn(sn);
	}

}
