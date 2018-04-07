package com.idservice.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idservice.model.ConsumerResponse;
import com.idservice.model.IdModel;
import com.idservice.service.IdService;

@RestController

public class RestAPI {
	// public static final Logger logger = LoggerFactory.getLogger(RestAPI.class);

	@Autowired
	IdService idService;

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "Hello again!";
	}

	@RequestMapping(value = "/consumers/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> createContract(@PathVariable("id") String id) throws SQLException {
		//idmodel.setConsumerID(id);
		//ConsumerResponse consumerResponse = idService.createContract(id);
		String contractID = idService.createContract(id);
		return new ResponseEntity<String>(contractID, HttpStatus.OK);

	}

}