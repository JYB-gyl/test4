package MVP;
/**
 * �ҳ�һ��������ҫ�е�MVP
 * @author hp
 * 
 */
public class MVP {
	public static void main(String[] args) {
		String []names= {"��һ","Ǯ��","����","����","����","����",
				"֣��","����","���","��ʮ"};//ʮ���������
		int[] kills={14,15,11,8,2,8,4,10,7,2};//ʮ����ҵ�ɱ����
		int []zhugong= {1,7,3,5,6,8,8,8,7,2};//ʮ�����������	
		int []beisha= {2,2,1,2,2,2,2,4,11,1};//ʮ�����������		
		/*
		 * ʹ�ô���̨�ķ���
		 * */
		int max=3*kills[0]+2*zhugong[0]-3*beisha[0];//��һ����̨�ķ���
		int index=0;//������߷֣�MVP�����±�
		for(int i=1;i<10;i++) { //����̨
			if(3*kills[i] + 2*zhugong[i] - 3*beisha[i] == max && kills[i]>kills[index]){//���������ȣ��Ƚ�ɱ����			
						max=3*kills[i]+2*zhugong[i]-3*beisha[i];
						index=i;
			}else if(3*kills[i] + 2*zhugong[i] - 3*beisha[i] > max) {//������ͬ����Ƚ�ɱ����
				max=3*kills[i]+2*zhugong[i]-3*beisha[i];
				index=i;
			}
		}
		System.out.println("���MVP��"+names[index]);
	}

}
