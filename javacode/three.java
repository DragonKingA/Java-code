public class three{
	public static void main(String[] args){
		System.out.println(100 + 98);
		System.out.println("100" + 98);
		System.out.println(100 + "hello");
		System.out.println(100 + 3 + "hello");
		System.out.println("hello" + 3 + 100);

		//��ϵ���߼����������== , != , > , >= , < , <=
		//��ϵ����������ȼ�
		System.out.println(5>3 == 6>4);
		//���true
		//�� ==��!=�����ȼ�����������ϵ�����
		//�����Ĺ�ϵ�߼������� ������ ���е�

		int i = 1;
		do{
			i += 5;
		}while(i<17);
		System.out.println("i="+i);
		//i=21

		int sum = 124;
		int times = 9;
		//double average= sum/times;
		double average = 1.0*sum/times;
		//ֻ����ת���Ҳ���ʽ���ͣ��ڽ��г���ʱ���С������������
		//����ʹ��average��ֵΪ��ȷ��С��
		System.out.println("average="+average);

		System.out.println("1"+'\n');
	}
}