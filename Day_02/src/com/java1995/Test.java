package com.java1995;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	/*	Child one=new Child();
		one.setName("婷婷");
		System.out.println(one.getName());
		one.setAddr("驻马店泌阳");
		System.out.println(one.getAddr());
		Time time=new Time();
		System.out.println("输入小时：");
		time.setHour(in.nextInt());
		if(time.getHour()==-1){
			System.out.println("输入有误");
		}
		else{
			System.out.println(time.getHour());
		}*/
		System.out.println("请输入一个数");
		String line=in.nextLine();
		System.out.println(Integer.parseInt(line));
	}
}
