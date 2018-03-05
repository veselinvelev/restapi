package com.springboot.demo.restapi;

import com.springboot.demo.restapi.topic.Topic;
import com.springboot.demo.restapi.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication {


	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);

	}
}
