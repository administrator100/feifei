package com.java1995;

public class Animal {
	private String type;
	private int age;
	private String sex;
	protected void rest(){
		System.out.println("������Ҫ��Ϣ��");
	}
	public void eat(){
		System.out.println("�������ڳԶ���!");
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
