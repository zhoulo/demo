package com.zhouli.service;

public class ServiceImpl implements Service {

	public void sayHello() {
		
		System.out.println("Sayhello д����־3333");
	}

	public void satHi() {
		
		System.err.println("setHi д����־");
		
	}

	public void sayOthe() {
		System.out.println("sayOthe д����־");
		System.out.println("sayOthe");
		
	}

	public static void before(){
		System.out.println("����д����־");
		
	}
	
	public static void after(){
		
		System.out.println("����д����־");
	}
}
