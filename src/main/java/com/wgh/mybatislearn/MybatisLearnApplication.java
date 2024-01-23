package com.wgh.mybatislearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisLearnApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(MybatisLearnApplication.class, args);

	}

	@Autowired
	private EmployeeMyBatisRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		employeeRepository.insert(new Employee(10011L, "Ramesh", "Fadatare", "ramesh@gmail.com"));
	}
}
