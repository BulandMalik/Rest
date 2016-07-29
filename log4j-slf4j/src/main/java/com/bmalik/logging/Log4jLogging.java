package com.bmalik.logging;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Log4jLogging {

	public static Logger logger = Logger.getLogger(Log4jLogging.class);
	
	public void logData(String msg) {
		logger.debug(msg);
	}
}
