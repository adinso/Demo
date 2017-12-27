package com.offcn.service;

import java.util.Date;

import com.offcn.bean.User;

public class UserServiceImpl implements UserService{

	@Override
	public User get(String id) {

		  System.out.println("GET方法，id=" + id);   
          User user = new User();   
          user.setUserId("get");   
          user.setUserName("sunny");   
          user.setUserPwd("123");   
          user.setSex(1);   
          user.setSal(32F);   
          user.setBirthday(new Date());   
          return user;  
		
	}

	@Override
	public User put(String id, User u) {
		 System.out.println("PUT方法，id=" + id);   
         User user = new User();   
         user.setUserId("get");   
         user.setUserName("sunny");   
         user.setUserPwd("123");   
         user.setSex(1);   
         user.setSal(32F);   
         user.setBirthday(new Date());   
         return user;
	}

	@Override
	public User post(String id, User u) {
		 System.out.println("POST方法，id=" + id);   
         User user = new User();   
         user.setUserId("get");   
         user.setUserName("sunny");   
         user.setUserPwd("123");   
         user.setSex(1);   
         user.setSal(32F);   
         user.setBirthday(new Date());   
         return user;
	}

	@Override
	public User delete(String id, User u) {
		 System.out.println("DELETE方法，id=" + id);   
         User user = new User();   
         user.setUserId("get");   
         user.setUserName("sunny");   
         user.setUserPwd("123");   
         user.setSex(1);   
         user.setSal(32F);   
         user.setBirthday(new Date());   
         return user;
	}

}
