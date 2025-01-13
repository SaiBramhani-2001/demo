package com.example.demo;

import com.example.demo.model.employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		employee employee1 = new employee();
		employee1.setFirstname("Sai");
		employee1.setLastname("Bramhani");
		employee1.setEmail("sai@gmail.com");
		employeeRepository.save(employee1);

	}
}
