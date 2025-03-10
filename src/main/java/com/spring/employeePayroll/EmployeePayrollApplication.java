package com.spring.employeePayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class EmployeePayrollApplication {

	public static void main(String[] args) {
		Dotenv.configure()
				.systemProperties()
				.load();

		SpringApplication.run(EmployeePayrollApplication.class, args);
	}

}
