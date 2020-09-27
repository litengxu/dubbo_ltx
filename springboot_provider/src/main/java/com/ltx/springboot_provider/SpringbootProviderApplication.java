package com.ltx.springboot_provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableDubbo

public class SpringbootProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProviderApplication.class, args);
	}

}
