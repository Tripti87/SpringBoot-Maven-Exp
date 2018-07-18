package com.tpt.budgetbucket.customer.server.Repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.tpt.budgetbucket.customer.server.CustomerServiceApplication;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {CustomerRepository.class})
@SpringBootTest(classes = CustomerServiceApplication.class)
public class CustomerRepositoryTest {

	private EmbeddedDatabase db;

	@Autowired
	CustomerRepository customerRepository;

	@Mock
	CustomerRowMapper customerRowMapper;

	@Before
	public void setup(){
		db = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
				.addScript("sql/create-table.sql")
				.addScript("sql/insert-table.sql")
				.build();
	}

	@Test
	public void getCustomerTest(){
		// Mocked data
		CustomerRepo customerRepo = new CustomerRepo();
		customerRepo.setFirstName("abc1");

		//Mocked behaviour
		when(customerRowMapper.getCustomerRepo()).thenReturn(customerRepo);

		//SUT
		customerRepository.getCustomer();

		//Assertion
		Assert.assertNotNull(customerRepo);
		Assert.assertEquals( "abc1",customerRepo.getFirstName());
	}
}
