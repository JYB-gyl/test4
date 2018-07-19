package com.bdqn.di4;

import java.util.Random;

public class A79Students {

	public static void main(String[] args) {
	String []Students= {"大A","大B","大C","大D","大E","大F","大G","大H","大I",
			"大J","大K","大L","大M","大N","大O","大P","大Q","大R","大S","大T"};
	//使用随机数生成数组的下标，来随机获取学生姓名
	Random random =new Random();
	System.out.println(Students[random.nextInt(Students.length)]);
	}
}
