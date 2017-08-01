package com.alxtabanas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SayHelloApplication {
	@Autowired
	ConfigBean configBean;

	private static Logger log = LoggerFactory.getLogger(SayHelloApplication.class);

	@RequestMapping(value = "/sayhello")
	public String sayhello() {
		log.info("Path /sayhello");
		return "Now i am in: " + configBean.hello();
	}

	@RequestMapping(value = "/")
	public String home() {
		log.info("Path /");
		return "Up and running";
	}

	@RequestMapping(value = "/rest")
	public String rest() {
		log.info("Path /rest");
		return "Rest URL: " + configBean.getRestAPIUrl();
	}

	public static void main(String[] args) {
		SpringApplication.run(SayHelloApplication.class, args);
	}
}
