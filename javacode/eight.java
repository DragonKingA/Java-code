public class eight{
	public static void main (String[] args){
		//������ֵ�����"="
		//���ϸ�ֵ�������+= ��-= ��*= ��/= ��%= ��ͬ��
		int n1 = 10;
		n1 += 4;// �ȼ���n1 = n1 + 4
		System.out.println("n1="+n1);
		n1 /= 3;// �ȼ���n1 = n1 / 3  ===> 4
		System.out.println("n1="+n1);
		//����ͬ��ȼ���: op1 = op1 ������� op2 

		//�����ϸ�ֵ������ ��op1 = op1 ������� op2 �� ��ͬ��
		//���ϸ�ֵ���㻹�����ǿ������ת��
		// ++��--Ҳ�����ǿ������ת��
		byte b = 125;
		//double b =3.0;���ʹ�� b+=2�е�2��ǿת���2.0��b++�е�1��ǿת���1.0
		b += 2;
		//*��� b += 2 ��ȫ���� b = (byte)(b + 2) 
		System.out.println("b="+b);//b=127
		b++;
		System.out.println("b="+b);//���ڳ���byte��Χ��b=-128
		//С���ۣ���������ǿת�������ԭ����b����ԭ��������ʼ�ձ��ֲ���
		//b=b+2;����������ᱨ����Ϊ�����ͱ��int��Υ���Զ�����ת���ľ��ȹ���

//===============================================================================
		//��Ԫ�������

		int i1 = 10;
		int i2 = 99;
		int result = i1>i2 ? i1++ : i2--;//i1>i2���ʽ����false��ȡֵ2,
		//�����Ǻ��Լ�,i2�ȸ�ֵ��result���Լ�
		System.out.println("result="+result);//result=99 , i1=10 , i2=98
		System.out.println("i1="+i1);
		System.out.println("i2="+i2);

        //��ʱ������ֵΪresult=99 , i1=10 , i2=98
		result = i1<i2 ? i1++ : i2--;
		System.out.println("result="+result);//result=10 , i1=11 , i2=98
		System.out.println("i1="+i1);
		System.out.println("i2="+i2);
        //��Ԫ����������㷨��ֵ1��ֵ2������ ���ܱ��������� �� �ɽ����Զ�ת��������
        //������Ϊ���� ǿ������ת�� ʹ���� ���ܱ������� ƥ��
		int i3 = 3;
		int i4 = 8;
		int res= i3 > i4 ? (int)1.1 : (int)4.8;//ǿתʹ������ܱ�������ƥ��
		double d= i3 > i4 ? i3+2.1 : i4 + 10;//���ܱ������;��ȸߣ�ֵ1��ֵ2���Զ�ת������
		System.out.println("res="+res+"\td="+d);//res=4 , d=18.0

//Exercise:=======================================================================
		//�ó��������е������
		int one = 1231;
		int two = 52;
		int three= 23331;
		// int max0;
        // int max1 = (max0 = one > two ? one : two) > three ? max0 : three;
        // Ҳ��������Ƕ�룬���ɶ��Բ�
		int max0 = one > two ? one : two;
        int max1 = max0 > three ? max0 : three;
        System.out.println("�����Ϊ"+max1);
        

       
	}
}