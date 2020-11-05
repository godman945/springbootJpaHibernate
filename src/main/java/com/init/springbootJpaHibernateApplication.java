package com.init;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.*"})
//@EntityScan("com.entry")
@MapperScan(value = {"com.dao"})
public class springbootJpaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(springbootJpaHibernateApplication.class, args);
	}

}
