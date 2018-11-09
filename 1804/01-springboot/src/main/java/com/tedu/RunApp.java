package com.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//对maybatis接口进行扫描
@MapperScan("com.tedu.mapper")
public class RunApp {

	public static void main(String[] args) {
		SpringApplication.run(RunApp.class, args);
	}
}
