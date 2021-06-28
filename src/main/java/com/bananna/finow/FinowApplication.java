package com.bananna.finow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//禁用SpringSecurity默认配置
@EnableAutoConfiguration(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
public class FinowApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinowApplication.class, args);
	}

}
