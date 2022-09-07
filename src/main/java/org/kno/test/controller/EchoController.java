package org.kno.test.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EchoController {
	
	private static final Logger log = LoggerFactory.getLogger(EchoController.class);
	
	
	@GetMapping("/hello")
	public String hello() {
		MDC.put("trace", UUID.randomUUID().toString());
		log.info("say hi to client!");
		MDC.clear();
		return "hello!";
	}
	
	@PostMapping("/echo")
	public String echo(@RequestBody String body) {
		MDC.put("trace", UUID.randomUUID().toString());
		log.info("receive: {}",body);
		MDC.clear();
		return body;
	}
	
	@GetMapping("/bye")
	public String bye() {
		MDC.put("trace", UUID.randomUUID().toString());
		log.info("bye bye to client!");
		MDC.clear();
		return "see you again!";
	}
	
	@GetMapping("/say-today")
	public String sayToday() {
		MDC.put("trace", UUID.randomUUID().toString());
		String nowDate = DateTimeFormatter.ISO_DATE.format(LocalDateTime.now());
		log.info("say: {}",nowDate);
		MDC.clear();
		return String.format("Today is %s", nowDate);
	}
	
	

}
