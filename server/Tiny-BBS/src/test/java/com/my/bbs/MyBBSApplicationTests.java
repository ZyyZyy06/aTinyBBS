package com.my.bbs;

import com.my.bbs.util.PatternUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class MyBBSApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private DataSource dataSource;

	@Test
	void testDataSource(){
		System.out.println(dataSource!=null);
		System.out.println(dataSource);
	}

	@Test
	void testPatternUtil(){
	}
}
