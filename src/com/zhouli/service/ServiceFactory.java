package com.zhouli.service;

public class ServiceFactory {

	public static void before(){
		System.out.println("又是写入日志");
		
	}
	
	public static void after(){
		
		System.out.println("还是写入日志");
	}
}
