package com.tencent.service.impl;

import org.springframework.aop.framework.AopContext;
import org.springframework.aop.framework.AopProxy;
import org.springframework.stereotype.Service;

import com.tencent.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void test() {
		System.out.println("test");
		((UserService) AopContext.currentProxy()).add();
	}

	@Override
	public void add() {
		System.out.println("add");
		
	}

}
