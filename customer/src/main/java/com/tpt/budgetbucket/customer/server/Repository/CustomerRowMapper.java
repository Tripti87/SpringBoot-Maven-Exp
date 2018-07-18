package com.tpt.budgetbucket.customer.server.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<CustomerRepo> {

	private CustomerRepo customerRepo = new CustomerRepo();

	@Override
	public CustomerRepo mapRow(ResultSet rs, int rowNum) throws SQLException {
		customerRepo.setCustomerId(rs.getString("id"));
		customerRepo.setFirstName(rs.getString("first_name"));
		customerRepo.setLastName(rs.getString("last_name"));
		customerRepo.setEmail(rs.getString("email"));
		customerRepo.setPhone(rs.getString("phone"));
		customerRepo.setAddressRepoId(rs.getString("addressId"));
		customerRepo.setStatus(rs.getString("status"));

		return customerRepo;
	}

	public CustomerRepo getCustomerRepo(){
		return customerRepo;
	}
}
