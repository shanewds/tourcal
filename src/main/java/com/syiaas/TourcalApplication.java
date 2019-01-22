package com.syiaas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//扫描根目录下的包
@SpringBootApplication(scanBasePackages ={"com.syiaas"})
//扫描dao包
@MapperScan("com.syiaas.dao")
public class TourcalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourcalApplication.class, args);
	}

}

