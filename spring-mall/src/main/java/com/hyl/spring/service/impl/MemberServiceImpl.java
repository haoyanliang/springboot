package com.hyl.spring.service.impl;

import org.springframework.stereotype.Service;

import com.hyl.spring.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Override
	public void addEntity() {
		System.out.println("Member entity has added!");
	}
	
}
