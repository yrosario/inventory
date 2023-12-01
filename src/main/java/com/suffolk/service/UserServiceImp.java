package com.suffolk.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.suffolk.model.User;
import com.suffolk.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImp implements GenericService<User, Long> {
	
	private UserRepository userRepository;
	private Logger logger = LoggerFactory.getLogger(UserServiceImp.class);
	
	public UserServiceImp(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User getReferenceById(Long id) {
		return this.userRepository.getReferenceById(id);
	}

	@Override
	public List<User> findAll() {
		return this.userRepository.findAll();
	}

	@Override
	public User save(User user) {
		this.logger.info("NEW USER FROM SERVICE -> " + user.toString());
		User newUser = this.userRepository.save(user);
		this.logger.info("After SAVED TO DB FROM SERVICE -> " + newUser.toString());
		return this.userRepository.save(user);
	}

	@Override
	public void delete() {
		
		
	}

}
