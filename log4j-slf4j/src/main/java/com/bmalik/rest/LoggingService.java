package com.bmalik.rest;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.bmalik.logging.Log4jLogging;
import com.bmalik.logging.SLF4jLogging;

/**
 * A RESTFul Web Service that loggs data using Log4j & slf4j.
 * 
 * @author bmalik
 * 
 */
@Path("logging")
@Resource
public class LoggingService {

	@Autowired
	Log4jLogging log4jlogging;
	
	@Autowired
	SLF4jLogging slf4jLogging;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String logData() {
		//Log4jLogging log4jlogging = new Log4jLogging();
		//SLF4jLogging slf4jLogging = new SLF4jLogging();
		
		log4jlogging.logData("Hello, My Name is Buland");
		log4jlogging.logData("I am logging using Log4j .............");
		
		
		slf4jLogging.logData("Hello, My Name is Buland too");
		slf4jLogging.logData("but I am logging using slf4j .... Yooooo");
		
		return "Hello, Logging Service";
	}
}