package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingExample {

	static Log log = LogFactory.getLog(CommonsLoggingExample.class);
	static Logger log2 = Logger.getLogger(CommonsLoggingExample.class.getName());

	public static void main(String[] args) {

		log.trace("Commons 1. TRACE level Log"); // 동작의 흐름을 모두 작성
		log.debug("Commons 2. DEBUG level Log");
		log.info("Commons 3. INFO level Log");
		log.warn("Commons 4. WARN level Log");
		log.error("Commons 5. ERROR level Log"); // fatal 다음으로 심각한 레벨
		log.fatal("Commons 6. FATAL level Log"); // 가장 심각한 레벨
		
		log2.log(Level.INFO, "Java standard INFO logger");
		log2.log(Level.WARNING, "Java standard WARNING logger");
		
		log2.setLevel(Level.ALL);
		log.info("-------------------------------------");

	}
}
