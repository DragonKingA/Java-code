public class six{
	public static void main (String[] args){
		int i1 = 100;
		float f1 = 1.1f;
		double d1 = 4.6;
		boolean b1 = true;
		String s1 = i1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		//д����˹涨�����ڽ�����ֱ��תΪ�ַ�������ֹ�������ɱ���ַ����ĳ�ͻ����дΪ"i1"���"i1"
		System.out.println(s1 + s2+ s3 +  s4);
		System.out.println(s1 +"\t"+ s2+ "\t" + s3 + "\t" + s4);

		String str1 = "����д1";
		String str2 = "����д2" + "Ҳ��";
		String str3 = "\n"+str1 + str2 + "Ҳ����";
		String str4 = "\n"+str1 +'\t'+ str2 + "Ҳ����";
		//ת���ַ���Ϊ�����ַ������������String���ͻ�Char���ͣ��ʿ���ֱ��ƴ��
		System.out.println(str1+"\n"+str2+str3);

		//���� �ַ���String���� ת���� ������������
		String s5 = "123";
		String s6 = "true";
		int num1 = Integer.parseInt(s5);
		//���ַ���s5�е�����ת���ɶ�Ӧint���ͣ�
		//�������ݷ��أ�Ȼ���ٸ�ֵ��num1������ͬ��
        byte num2 = Byte.parseByte(s5);
        short num3 = Short.parseShort(s5);
        long num4 = Long.parseLong(s5);
        float num5 = Float.parseFloat(s5);//123.0
        double num6 = Double.parseDouble(s5);//123.0
        boolean b0 = Boolean.parseBoolean(s6);
        //��Ψ��char c0 = Character.parseCharacter(s5);�Ǵ���ģ�ԭ����
        //�ַ��������������ַ���������ַ�ת�ɵ����ַ�����������Ҳ����ʵ�֣�
        //������Character���в�û��ת������parseCharacter
        //����Byte,Short,Integer�ȵȳ�Ϊ�������������͵Ķ�Ӧ�İ�װ�࣬
        //�������������ת���ķ�����parse=����~ת��

        //����ת�������㣺
        //ȷ����String���������ܹ�ת������Ч�Ķ�Ӧ�������ݣ�����"hello"����ת��������
        //�Լ���s5��ʵ����ֵ���ܴ���ת�����������ȡֵ��Χ����������׳��쳣��������ֹ
        //���������׳��쳣�㣬�������ʱ�����ᱨ������������֮ʱ����ʹ��������ֱ����ֹ,���������쳣�����룩
        
/** ��Ȼ�ģ����Դ��ַ�����ȡ����Ӧλ�õĵ����ַ����������ܴ���char����������
 * ��ʽ���� ����.charAt(ĳ�ַ�����λ������ֵ)  ���м���0��Ϊ��һλ (Ӳ�Թ涨0Ϊ��ʼλ�ü���һλ�ַ�) 
 */
        char c0 = s5.charAt(1);//"123"��ȡ�ڶ�λ������ַ�'2'
        char c1 = s5.charAt(0);//"123"��ȡ��һλ������ַ�'1'
        
        System.out.println(c0+"\n"+c1);




	}
}