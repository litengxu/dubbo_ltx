package com.ltx.ltxweb_service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("dao")
public class LtxwebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtxwebServiceApplication.class, args);
	}

}
