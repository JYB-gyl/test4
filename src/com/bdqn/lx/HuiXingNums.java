package com.bdqn.lx;
import java.util.*;
public class HuiXingNums {
public static void main(String []args){
	Scanner input = new Scanner (System.in);
//	//boolean�����ж��Ƿ�Ϊ��������
//	boolean ok=true;
	System.out.println("*************�ж������Ƿ�Ϊ��������*************");
	System.out.println("������һ��������");
	String in=input.next();
	//ʶ���Ƿ�Ϊ��ȷ������
	if(in.indexOf('0')==0||in.indexOf('.')!=-1||in.indexOf('-')>=0){
		System.out.println("���ǲ���ɵ�ƣ���������������");
	}else{
	//�����������ת����StringBuffer���ٵ���reverse����������ֵ�ߵ�
	StringBuffer a=new StringBuffer(in);
	StringBuffer b=a.reverse();
//	for(int i=0;i<in.length();i++){
//			if(!in.substring(i, i+1).equals(b.substring(i, i+1))){
//				System.out.println("���ǻ�����");
//				ok=false;
//				break;
//				
//		}
//	}
//	if(ok==true){
//		System.out.println("�ǻ�������");
//	}
	if(in.contentEquals(b)){
		System.out.println("�ǻ�������");
	}else {
		System.out.println("���ǻ�������");
	}
	}
}
}
