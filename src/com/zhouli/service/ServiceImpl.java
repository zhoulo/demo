package com.zhouli.service;

public class ServiceImpl implements Service {

	public void sayHello() {
		
		System.out.println("Sayhello 写入日志3333");
	}

	public void satHi() {
		
		System.err.println("setHi 写入日志");
		
	}

	public void sayOthe() {
		System.out.println("sayOthe 写入日志");
		System.out.println("sayOthe");
		
	}

	public static void before(){
		System.out.println("又是写入日志");
		
	}
	
	public static void after(){
		
		System.out.println("还是写入日志");
	}
}
