import java.util.Scanner;
public class back{
	public static void main(String[] args){
		System.out.println("�����������ͣ�\n1.��ֵ�ͣ���������-byte[1] short[2] int[4] long[8]����������(float[4] double[8])��\n2.�ַ���(char[2]��ŵ����ַ�)\n3.�����ͣ�boolean[1]���true,false��\n������������\n1.��class 2.�ӿ�interface 3.����[]");
	/**
	 * *����ʹ��GBK�������ִ����е��������룺
	 * *ʹ��Ctrl+Zʹ�䷵��������ǰ���ٱ��棬�����ڱ����һ˲���������л���Ŀ
	 * *
	*/
 		System.out.println("10/3*3="+10/3*3);//10/3���3���������9
 		System.out.println("10.0/3*3="+10.0/3*3);//���10.0

 		Scanner sc = new Scanner(System.in);
 		System.out.print("num1=");
 		int num1 = sc.nextInt();
 		System.out.print("num2=");
 		int num2 = sc.nextInt();
 		double average = (num1 + num2)/2.0;
 		//�ٶ�num1=9,num2=10
 		//������2������2.0,������average=9.0
 		//������2.0,������average= 9.5
 		System.out.println("average="+average);

	}
}