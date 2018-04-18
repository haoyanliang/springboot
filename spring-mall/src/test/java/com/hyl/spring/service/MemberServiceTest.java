package com.hyl.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.hyl.spring.configration.PropertiesConfig;
import com.hyl.spring.configration.model.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class MemberServiceTest {
	@Autowired
	private MemberService memberService;
	@Autowired
	private PropertiesConfig propertiesConfig;
	@Autowired
	private Student student;
	
	@Test
	public void testAddEntity(){
		memberService.addEntity();
	}
	
	@Test
	public void testConfig(){
		System.out.println(student.toString());
		System.out.println(propertiesConfig.toString());
	}
}
