package com.tpt.budgetbucket.customer.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tpt.budgetbucket.customer.server.Repository.CustomerRepository;

@SpringBootApplication
public class CustomerServiceApplication implements CommandLineRunner{

	@Autowired
	CustomerRepository customerRepository;

	public static void main(String args[]){

		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Override
	public void run(String...strings) throws Exception{
		customerRepository.createCustomer();
	}
}
