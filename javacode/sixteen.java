//������
class Human {
	//����
	String name;
	String character;
	int age;

	public void Self_Introduction(){// ()��ʾ�β��б����Ժ�����βΣ��ö��Ÿ��������ڽ����û����������
									// public��ʾ����Ȩ�޷�ΧΪ��������protected��ʾ���ܿ�����ʣ�private��ʾ������ɷ��ʣ�void�ؼ��ֱ�ʾ�÷����޷���ֵ
		System.out.println("name="+name+",age="+age+",charater="+character);
	}

	public int GetSum(int sum1,int sum2){
		int sum0 = sum1 + sum2;
		return sum0;
	}//������һ�����飬����Է��ض���������
}


class Tools{
	public void PrintArray_2D(int array_accept[][]){
		//���� ��ϸ�ڣ�
		//public void Print(){} X �����ڷ��������ٶ��巽�����������䲻��Ƕ��
		//ͬ�෽�����ã�ͬһ�����еĲ�ͬ�������Ի���ֱ�ӵ��ã�������Tools�ٶ���һ���������÷��������ֱ��PrintArray_2D()����
		//   ����أ�ͬ���У���̬��Ա������main�������������������ķǾ�̬�����ͱ���
		//���෽�����ã���ͨ�������������������ã����ȴ������󣬶������ ������.������(�β��б�) �Ե���
		System.out.println("��ά����Ԫ��Ϊ��");
		for (int i = 0; i < array_accept.length;i++){
			for(int j = 0; j < array_accept[i].length;j++){
				System.out.print(array_accept[i][j]+" ");
			}
		}

	}
}






public class sixteen{


	//���д�����Ա����
	public boolean Ifodd(int num0){
		// if(num0 % 2 == 0){
		// 	return false;
		// }else{
		// 	return true;
		// }
		//�����д�����£�
		return num0 % 2 != 0;
	}
	//mainΪ��̬������java�о�̬��Ա�����в��������������ĵķǾ�̬�����ͱ���
	public void PrintBurstOfNumbers(int lines,int columns,char char0){
		for(int i = 1;i<=lines;i++){
			for(int j = 1;j<=columns;j++){
				System.out.print(char0);
			}
			System.out.println();
		}
	}



	//���д�����̬��Ա����main
	public static void main(String[] args){
		//�������ʵ������
		Human p1 = new Human();
		p1.name = "LZL";
		p1.age = 18;
		p1.character = "warm-hearted";

		/***���������ڴ���䣨�Զ���p1Ϊ������
		 * ������jdk�汾�У��������String�����ԵĴ��淽ʽ��
		 * 1.ջ��
		 * 	p1 ---> 0x0101(����ָ��õ�ַ)
		 * 2.�ѣ�
		 * 	0x0101�ռ��ں���
		 * 	��ַ�洢��0x0022��0x0033  �������������ݴ洢������18
		 * 3.��������
		 * 	�ַ��������أ�	0x0022 ---> LZL    0x0033 ---> warm-hearted
		 * 
		 *  //�����ط�Ϊ ��̬�����أ�����ʱ������ �� �ַ���������
		 * 	//jdk7֮ǰ �ַ��������� ������ ����ʱ�����أ�jdk7֮��ת���� �� ��
		 * 	//https://blog.csdn.net/m0_70109670/article/details/124576031?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522166096966816782425141106%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=166096966816782425141106&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_ecpm_v1~pc_rank_34-1-124576031-null-null.142^v42^pc_rank_34,185^v2^control&utm_term=java%E5%B8%B8%E9%87%8F%E6%B1%A0%E5%8F%98%E6%9B%B4&spm=1018.2226.3001.4187
		 * 	//https://blog.csdn.net/weixin_33216825/article/details/114787275?ops_request_misc=&request_id=&biz_id=102&utm_term=java%E5%B8%B8%E9%87%8F%E6%B1%A0%E5%8F%98%E6%9B%B4&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduweb~default-1-114787275.142^v42^pc_rank_34,185^v2^control&spm=1018.2226.3001.4187
		*/

		Human p2 = new Human();
		p2 = p1;
		System.out.println("name="+p2.name+",age="+p2.age+",charater="+p2.character);
		p2 = null;

		p1.Self_Introduction();
		System.out.println("sum0 = "+p1.GetSum(100,432));//sum0 = 532
		//Ҳ�����Ƚ�����ֵ����һ��������������ñ���ֵ
		
		//System.out.println("name="+p2.name+",age="+p2.age+",charater="+p2.character); �ᷢ���쳣����Ϊp2�Ѿ������ã�����ָ���κ��ڴ�ռ�
		//ͬ���أ�p2 = p1ʹ��p2 ָ�� p1 ���ڴ��ַ�����߹���ͬһ���ڴ�ռ䣬��ʱΨһ�Ĳ�ֻͬ��p1��p2�����������ͬ�����õĿռ�һ��

		/***�������ڴ���䣨��GetSum����Ϊ����
		 * ջ��
		 * 	mainջ������p1�����ִ��GetSum����ʱ�ᴴ��GetSumջ�������ռ���ջ�У�
		 * 	GetSumջ����p1.GetSum(100,432)ִ��ʱ��sum1������ֵ100��sum2������ֵ432��sum0������ֵ532,���ִ�з���
		 * �������ִ�к�GetSumջ�ͻᱻ���٣�ֱ��mainջ���ټ������������
		 * 
		 * ��������С�᣺
		 * 1.������ִ�е�����ʱ���ͻῪ��һ�������Ŀռ䣨ջ�ռ䣩
		 * 2.������ִ����ϻ���ִ�е�return���ʱ���ͻ᷵��
		 * 3.���ص����÷����ĵط�
		 * 4.���غ󣬼���ִ�и÷�������Ĵ���
		 * 5.ֱ��main������mainջ��ִ����ϣ����������˳�

		/**Java�ڴ�Ľṹ������
		 * ջ��һ�����ڴ�� �����������͵����ݣ��ֲ������� �� ������ ����ָ�� �� �ĵ�ַ
		 * �ѣ���Ŷ����Զ�����Ķ�������ȣ�
		 * �������������أ����ַ����ȳ��������汾������������ͬ�����������Ϣ
		 * 
		 * Java����������ڴ����̣�
		 * 1.�ȼ���Human����Ϣ�������Ժͷ�����Ϣ��ֻ�����һ�Σ�
		 * 2.�ڶ��з���ռ䣬����Ĭ�ϳ�ʼ������˼�Ǹ�δ��ֵ�����Խ��ж�Ӧ�������͵�Ĭ��ֵ��ֵ���ο���ǰ�����飩
		 * 3.Ȼ����ڴ��ַ����p1 ��p1��ָ����еĶ���
		 * 4.����ָ����ʼ��������д���p1.age = 18����Щ Ϊ��������Ծ��帳ֵ����� ��õ�ִ��
		 * 
		 * �ر�أ����������������nullֵ����ö��������������޷�ָ��ԭ�����ڴ�ռ䡣
		 * ��Ϊ����������ڴ��ַ����������nullֵ���㲻��ָ���κε�ַ�������õĶ�������
		 */

		Tools tool1 = new Tools();
		int array_2d[][] ={{1,2,3,4},{5,6,7,8,9},{10,11,12,13,14,15},{16,17}};
		tool1.PrintArray_2D(array_2d);
		//����������Ĵ����÷�����װ��������ߴ��븴���ԣ������û�����

		//**��̬��������ͬ��Ǿ�̬���������贴������
		sixteen t = new sixteen();
		System.out.println("\n"+t.Ifodd(12));

		t.PrintBurstOfNumbers(20,40,'&');
	}

}



