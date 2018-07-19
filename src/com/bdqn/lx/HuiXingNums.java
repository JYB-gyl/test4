package com.bdqn.lx;
import java.util.*;
public class HuiXingNums {
public static void main(String []args){
	Scanner input = new Scanner (System.in);
//	//boolean类型判断是否为回形数字
//	boolean ok=true;
	System.out.println("*************判断输入是否为回形数字*************");
	System.out.println("请输入一个整数：");
	String in=input.next();
	//识别是否为正确的整数
	if(in.indexOf('0')==0||in.indexOf('.')!=-1||in.indexOf('-')>=0){
		System.out.println("你是不是傻逼？这是正整数？？");
	}else{
	//将输入的数字转换成StringBuffer，再调用reverse方法将输入值颠倒
	StringBuffer a=new StringBuffer(in);
	StringBuffer b=a.reverse();
//	for(int i=0;i<in.length();i++){
//			if(!in.substring(i, i+1).equals(b.substring(i, i+1))){
//				System.out.println("不是回文数");
//				ok=false;
//				break;
//				
//		}
//	}
//	if(ok==true){
//		System.out.println("是回文数字");
//	}
	if(in.contentEquals(b)){
		System.out.println("是回文数字");
	}else {
		System.out.println("不是回文数字");
	}
	}
}
}
