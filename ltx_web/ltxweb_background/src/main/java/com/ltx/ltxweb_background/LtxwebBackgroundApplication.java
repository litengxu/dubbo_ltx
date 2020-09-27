package com.ltx.ltxweb_background;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableDubbo

public class LtxwebBackgroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtxwebBackgroundApplication.class, args);
	}

}
