package com.bdqn.lx;

public class YingBi {

	public static void main(String[] args) {
		double []array= {1.9,2.05,2.05,2.5,1.9,
				2.05,1.9,1.5,2.5,2.5,3.5,1.9,2.05};
		int _5jiao=0;//5角
		int _1yuan=0;//1元
		int _1jiao=0;//1角
		int waiguo1=0;//歪果1.5
		int waiguo2=0;//歪果3.5
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
		System.out.println("一角硬币有："+_1jiao+"个");
		System.out.println("五角硬币有："+_5jiao);
		System.out.println("一元硬币有："+_1yuan);
		System.out.println("外国硬币："+waiguo1+"\t"+waiguo2);
	}

}
