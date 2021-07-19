package com.ynz.demo.springconfigurationproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ClientHostInfo.class})
public class SpringConfigurationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigurationPropertiesApplication.class, args);
	}

}
