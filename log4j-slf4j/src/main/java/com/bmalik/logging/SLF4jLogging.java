package com.bmalik.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SLF4jLogging {

	public static Logger logger = LoggerFactory.getLogger(SLF4jLogging.class);
	
	public void logData(String msg) {
		logger.debug(msg);
	}
}
