package com.cy.pj.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.activity.pojo.Activity;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
public class TestPojo {
	@Test
		public void TestPojo() {
			Activity at=new Activity();
			
		String a = at.getTitle();
		System.out.println(a);
		}
}
