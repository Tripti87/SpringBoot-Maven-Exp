package com.tpt.budgetbucket.customer.server.Repository;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CustomerRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRepository.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void createCustomer(){
		LOGGER.debug("Creating tables");

		jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
		jdbcTemplate.execute("DROP TABLE addresses IF EXISTS");

		jdbcTemplate.execute("CREATE TABLE addresses(id VARCHAR(255), city VARCHAR(255), state VARCHAR(255))");

		jdbcTemplate.execute("CREATE TABLE customers(" +
				"id VARCHAR(255), first_name VARCHAR(255), last_name VARCHAR(255),"
				+ "email VARCHAR(255), phone VARCHAR(255), addressId VARCHAR(255),status VARCHAR(255))");

		jdbcTemplate.batchUpdate("INSERT INTO addresses(id, city, state) VALUES (?,?,?)", Arrays
				.asList(new Object[]{"1","a","D"},new Object[]{"2","b","C"}));

		jdbcTemplate.batchUpdate("INSERT INTO customers(id, first_name, last_name, email, phone, addressId ,status) VALUES (?,?,?,?,?,?,?)", Arrays
						.asList(new Object[]{"1","abc1","xyz1","abc1.xyz1","123","1","Active"}, new Object[]{"2","abc2","xyz2","abc2.xyz2","456","2","NonActive"}));
	}

	public CustomerRepo getCustomer(){
		CustomerRowMapper customerRowMapper = new CustomerRowMapper();
		jdbcTemplate.query(
				"SELECT id, first_name, last_name , email, phone, addressId ,status FROM customers "
						+ "WHERE first_name = ?", new Object[] { "abc1" },
				customerRowMapper);

		CustomerRepo customerRepo = customerRowMapper.getCustomerRepo();

		return customerRepo;
	}
}
