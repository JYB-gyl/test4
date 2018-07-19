package MVP;
/**
 * 找出一局王者荣耀中的MVP
 * @author hp
 * 
 */
public class MVP {
	public static void main(String[] args) {
		String []names= {"赵一","钱二","孙三","李四","周五","吴六",
				"郑七","王八","冯九","陈十"};//十名玩家姓名
		int[] kills={14,15,11,8,2,8,4,10,7,2};//十名玩家的杀人数
		int []zhugong= {1,7,3,5,6,8,8,8,7,2};//十名玩家助攻数	
		int []beisha= {2,2,1,2,2,2,2,4,11,1};//十名玩家死亡数		
		/*
		 * 使用打擂台的方法
		 * */
		int max=3*kills[0]+2*zhugong[0]-3*beisha[0];//第一个上台的分数
		int index=0;//保存最高分（MVP）的下标
		for(int i=1;i<10;i++) { //打擂台
			if(3*kills[i] + 2*zhugong[i] - 3*beisha[i] == max && kills[i]>kills[index]){//如果分数相等，比较杀敌数			
						max=3*kills[i]+2*zhugong[i]-3*beisha[i];
						index=i;
			}else if(3*kills[i] + 2*zhugong[i] - 3*beisha[i] > max) {//分数不同不需比较杀敌数
				max=3*kills[i]+2*zhugong[i]-3*beisha[i];
				index=i;
			}
		}
		System.out.println("最后MVP是"+names[index]);
	}

}
