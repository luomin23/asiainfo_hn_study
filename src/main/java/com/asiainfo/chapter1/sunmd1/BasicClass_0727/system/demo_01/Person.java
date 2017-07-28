package com.asiainfo.chapter1.sunmd1.BasicClass_0727.system.demo_01;

public class Person {

	private int age;
	private String username;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private Person() {
		super();
	}
	
	private Person(String username,int age){
		super();
		this.username = username;
		this.age = age; 
	}
	
	public static Person getPerson(String username,int age){
		return new Person(username,age);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Person对象被回收了");
		super.finalize();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person:[username = "+this.getUsername()+",age="+this.getAge()+"]";
	}

	
	
	
	
}
