package com.wjh;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

	@Autowired
	private DataSource ds;
	@Test
	public void contextLoads() {
	}
	@Test
	public void getConnnection() {
		try {
			System.out.println(ds.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
