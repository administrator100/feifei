package com.java1995;

public class Animal {
	private String type;
	private int age;
	private String sex;
	protected void rest(){
		System.out.println("动物需要休息！");
	}
	public void eat(){
		System.out.println("动物正在吃东西!");
	}
	protected String getType() {
		return type;
	}
	protected void setType(String type) {
		this.type = type;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	protected String getSex() {
		return sex;
	}
	protected void setSex(String sex) {
		this.sex = sex;
	}
	
}
