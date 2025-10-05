package com.bny.se.gittest;

import com.bny.se.gittest.dto.EmployeeDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestOneApplication.class, args);
		System.out.println("---Application Started---");

		EmployeeDto dto = new EmployeeDto();
		dto.setName("Test");
		System.out.println(dto.getName());
	}

}
