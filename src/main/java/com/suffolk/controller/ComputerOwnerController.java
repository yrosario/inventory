package com.suffolk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suffolk.service.ComputerOwnerServiceImpl;
import com.suffolk.model.ComputerOwner;

@RestController
@RequestMapping("/api/v1")
public class ComputerOwnerController {
	
	private ComputerOwnerServiceImpl computerOwnerService;
	private Logger logger = LoggerFactory.getLogger(ComputerOwnerController.class);

	public ComputerOwnerController(ComputerOwnerServiceImpl computerOwnerService) {
		this.computerOwnerService = computerOwnerService;
	}
	

	@PostMapping("/user/computer")
	public ResponseEntity<?> saveOwnerComputer(@RequestBody ComputerOwner computerOwner){
		return new ResponseEntity<>(this.computerOwnerService.save(computerOwner), HttpStatus.OK);
	}
	
	
	@GetMapping("/user/{cid}/computer")
	public ResponseEntity<?> getAll(@PathVariable Long cid){
		this.logger.info("LOGGER FROM CoMPuterOWNerController " + cid);
		return new ResponseEntity<>(this.computerOwnerService.findByUserCid(cid), HttpStatus.OK);
	}
	
	@GetMapping("/computer/{sn}/user")
	public ResponseEntity<?> findUserByComputerSn(@PathVariable String sn){
		return new ResponseEntity<>(this.computerOwnerService.findByComputerSn(sn), HttpStatus.OK);
	}

}
