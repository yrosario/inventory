package com.suffolk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.suffolk.model.Os;
import com.suffolk.repository.OsRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OsServiceImpl implements GenericService<Os, Long> {
	
	private OsRepository osRepository;

	
	public OsServiceImpl(OsRepository osRepository) {
		this.osRepository = osRepository;
	}

	@Override
	public Os getReferenceById(Long id) {
		return this.osRepository.getReferenceById(id);
	}

	@Override
	public List<Os> findAll() {
		return this.osRepository.findAll();
	}

	@Override
	public Os save(Os os) {
		return this.osRepository.save(os);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
