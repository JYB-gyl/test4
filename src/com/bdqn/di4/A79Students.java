package com.bdqn.di4;

import java.util.Random;

public class A79Students {

	public static void main(String[] args) {
	String []Students= {"��A","��B","��C","��D","��E","��F","��G","��H","��I",
			"��J","��K","��L","��M","��N","��O","��P","��Q","��R","��S","��T"};
	//ʹ�����������������±꣬�������ȡѧ������
	Random random =new Random();
	System.out.println(Students[random.nextInt(Students.length)]);
	}
}
