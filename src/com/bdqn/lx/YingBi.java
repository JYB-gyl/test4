package com.bdqn.lx;

public class YingBi {

	public static void main(String[] args) {
		double []array= {1.9,2.05,2.05,2.5,1.9,
				2.05,1.9,1.5,2.5,2.5,3.5,1.9,2.05};
		int _5jiao=0;//5��
		int _1yuan=0;//1Ԫ
		int _1jiao=0;//1��
		int waiguo1=0;//���1.5
		int waiguo2=0;//���3.5
		for(int i=0;i<array.length;i++){
			if(array[i]==1.9){
				_1jiao=_1jiao+1;
			}else if(array[i]==2.05) {
				_5jiao=_5jiao+1;
			}else if(array[i]==2.5) {
				_1yuan=_1yuan+1;
			}else if(array[i]==1.5) {
				waiguo1=waiguo1+1;
			}else {
				waiguo2=waiguo2+1;
			}
			
		}
		System.out.println("һ��Ӳ���У�"+_1jiao+"��");
		System.out.println("���Ӳ���У�"+_5jiao);
		System.out.println("һԪӲ���У�"+_1yuan);
		System.out.println("���Ӳ�ң�"+waiguo1+"\t"+waiguo2);
	}

}
