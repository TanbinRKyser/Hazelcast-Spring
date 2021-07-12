package com.tusker.hazelcastSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

// Spring by default uses concurrent hashmap. You need to add Hazelcast in pom.xml
@EnableCaching
@SpringBootApplication
public class HazelcastSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HazelcastSpringApplication.class, args);
	}
}
