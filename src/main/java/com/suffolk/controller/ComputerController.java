package com.suffolk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suffolk.model.Computer;
import com.suffolk.service.ComputerServiceImpl;

@RestController()
@RequestMapping("/api/v1")
public class ComputerController {
	
	private ComputerServiceImpl  computerService;
	private Logger logger = LoggerFactory.getLogger(ComputerController.class);
	
	@Autowired
	public ComputerController(ComputerServiceImpl computerService) {
		super();
		this.computerService = computerService;
	}


	@GetMapping("/computer/{id}")
	public ResponseEntity<?> getComputer(@PathVariable String id){
		Computer computer =  this.computerService.getReferenceById(id);
		
		logger.info("COMPUTER IN CONTROLLER " + computer.toString());
		
		return  new ResponseEntity<>(computer, HttpStatus.OK);
			//new ResponseEntity<>("Computer not found", HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/computer")
	public ResponseEntity<?> getComputers(){
		return new ResponseEntity<>(this.computerService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/computer")
	public ResponseEntity<?> saveComputer(@RequestBody Computer computer){
		Computer newComputer = this.computerService.save(computer);
		
		return newComputer != null ? new ResponseEntity<>(newComputer, HttpStatus.CREATED): 
			new ResponseEntity<>("Error Creating computer object", HttpStatus.BAD_REQUEST);
		
		
		
		
	}

}
