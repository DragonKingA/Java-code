public class seven{
     static int x = 100;
     public static void main(String[] args ){
     	System.out.println(x);//100
     	//==============================================================
     	double x = 0.1;
     	System.out.println(x);//0.1����ʱ��̬����x�����أ�ȡ����֮�Ǿֲ�����x
     	//==============================================================
     	int a0 = 12 % 10;//������Arithmetic�������(operator) % ��������ȡ��������ȡģ��
     	System.out.println("12����10��"+ a0);//2
          System.out.println(10.0 / 4);//2.5
          //�˴���10.0��Ĭ��Ϊdouble�ͣ���������Ϊdouble�ͣ����2.5
          System.out.println(10 / 4);//2
          //�˴��ġ�10/4������������int�͹�������ҲΪint�ͣ���С��������ֱ�Ĩ��
          System.out.println(10 % 3);//1
          System.out.println(10 - 10/3*3);//1
          System.out.println(10 % 3.2);//0.39999999999999947
          System.out.println(10 - (int)(10/3.2)*3.2);//0.3999999999999986,���в��
          //�պ����̽��javaȡ���Դ�뼴����ԭ������17�;�18�Ĳ���
          
          //==============================================================
          int i0 = 10;
          i0++;//���� �ȼ��� i0 = i0 + 1,��ʱi0���11
          ++i0;//��Ϊ�������ʱ��ȫͬ�ϼ�i0=i0+1�������12
          System.out.println("i0 = " + i0);

          /*******************************************************************
          ����Ϊ���ʽʹ��ʱ��                                                *
          ǰ++ �� ++i ��������ֵ������߼��ж�                               *
          ��++ �� i++ �ȸ�ֵ������߼��жϺ�����                               *
          �����������Ƕ��ڱ���i����                                           *
          *******************************************************************/
          int i1 = 8;
          int i2 = i1++;//�ȼ��� ��i2 = i1��i1=i1 + 1 ==>i1=9,i2=8
          // int i2 = ++i1;//�ȼ��� ��i1=i1 + 1��i2 = i1 ==>i1=9,i2=9
          System.out.println("i1="+i1 +"\n"+"i2="+i2);
//Exercise(1)�����⣺ ============================================================
          int i3 = 1;
          i3=i3++;
          //*�˴������ʹ����ʱ����temp�����⣩������i3�Ĵ������У��˴�����˳��Ϊ��
          //*��1��temp=i3,��i3����temp��ʹ��temp = 1 (2) i3������ i3 = i3 + 1����ʱi3=2  
          //#��3��i3=temp ��temp���ظ�i3,��ôi3��ֵ�ֱ��1
          //�������㣺https://blog.csdn.net/qq_45402917/article/details/121040882?ops_request_misc=&request_id=&biz_id=102&utm_term=java%E8%BF%90%E7%AE%97%E4%B8%AD%E7%9A%84%E4%B8%B4%E6%97%B6%E5%8F%98%E9%87%8F&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduweb~default-1-121040882.142^v33^new_blog_pos_by_title,185^v2^control
          System.out.println("i3="+i3);

          int i4 = 1;
          i4=++i4;
          System.out.println("i4=" + i4);
          //(1)����,i4=i4 + 1 (2)temp = i4 (3) i4 = temp
          //��ʱ�������ٻ��������������(������ͬһ������ֵͬ��)����ֵʱ����

//Exercise(2):===================================================================
          int i5 = 10;
          int i6 = 20;
          int i7 = i5++;//  i7 = 10 , i5 = 11
          System.out.print("i7=" + i7 +"\t"+"i5="+i5+"\t");
          System.out.println("i6=" + i6 );
          i7 = --i6;//i6 = 19, i7 = 19
          System.out.print("i7=" + i7 + "\t");
          System.out.println("i6=" + i6);
//Exercise(2):===================================================================
          System.out.println("59���"+(int)(59/7) +"��������" +59%7 +"��" );

          float f1,f2;
          f1 = 1234.6f;
          f2 = 5.0f/9*(f1 - 100.0f);
          //�״�㣺 5 / 9 ������int������õ����������㼸��������Ϊint���ͣ�ֱ�����0
          //�ʻᵼ�²���f1Ϊ��ֵ��f2��float���ͣ���Ϊ0.0
          //���Ҫʹ5 �� 9 ��һ���float���ͣ���Ȼ����Ҳ��
          System.out.println(f2);



//===============================================================================
          //�Ƚ������(Relational Operators)

          Object lzl = new seven();
          //��һ���ؼ���Ϊinstanceof
          System.out.println(lzl instanceof seven);//true

          int a = 11;
          int b = 8;
          System.out.println(a>b);
          System.out.println(a<b);
          System.out.println(a==b);
          System.out.println(a>=b);
          System.out.println(a<=b);
          System.out.println(a!=b);
          //true,false,false,true,false,true

//===============================================================================
          //�߼��������LogicOperator��

          int a1 = 4;
          int a2 = 9;
          int a3 = 9;
          
          //1.�߼��롰&&��&������������Ϊ��ȫ��Ϊ�棬һ�����
          if (a1 > 10  && ++a2 < 50 ){
               //���ڶ�·�롰&&�����жϳ���˱��ʽΪfalseʱ������ִ�л��жϺ������ʽ��
               //����ֱ�����������Ӷ���ʡ������жϴ���������ж�Ч��
               //ֵ��ע����ǣ���ִ�к������ʽ����ʹ�������ʽ�����㲻�����壬
               //���������ʽ�����ܸı����ֵ��������˱��ʽΪtrue
               //=====> a1 = 4 , a2 = 9
               System.out.println("&&true\n" + "a1=" + a1 + "\ta2=" + a2);
          } else{
               System.out.println("&&false\n"+ "a1=" + a1 + "\ta2=" + a2);
          }
                    
                    if (a1 < 10  && ++a3 < 50 ){
               //��ʱ��˱��ʽΪtrue,��ִ�к������ʽ,ʹ��a3������ִ��
               //=====> a1 = 4 , a3 = 10
               System.out.println("����˱��ʽΪtrueʱ");
               System.out.println("&&true\n" + "a1=" + a1 + "\ta3=" + a3);
          } else{
               System.out.println("����˱��ʽΪtrueʱ");
               System.out.println("&&false\n"+ "a1=" + a1 + "\ta3=" + a3);
          }
               
               
          if (a1 > 10  & ++a2 < 50 ){
               //��ͨ�߼��롰&���Ὣ���˱��ʽ��ִ�����жϣ���˱����ĸı䲻��Ӱ��
               //=====> a1 = 4 , a2 = 10
               System.out.println("&true\n" + "a1=" + a1 + "\ta2=" + a2);
          } else{
               System.out.println("&false\n"+ "a1=" + a1 + "\ta2=" + a2);
          }


          //2.�߼���||��|������������Ϊ��ȫ��Ϊ�٣�һ��Ϊ��

          int age = 50;

          if(age > 20 || ++age < 30){
               //���ڶ�·��||�����жϳ���˱��ʽΪtrueʱ������ִ�л��жϺ������ʽ
               //ͬ����Ϊ�˽�ʡ������������Ч�ʣ����Һ������㲻��ִ��
               //=====> age = 50
               System.out.println("||true\tage=" + age);
          }else{
               System.out.println("||false\tage=" + age);
          }
          
          if(age > 20 | ++age < 30){
               //��ͨ�߼���|���Ὣ���˱��ʽ��ִ�����жϣ���˱����ĸı䲻��Ӱ��
               //=====> age = 51
               System.out.println("|true\tage=" + age);
          }else{
               System.out.println("|false\tage=" + age);
          }

          //3.�߼��ǣ�ȡ����"!"   �Լ�  �߼����"^"
          System.out.println(60 > 20);//true
          System.out.println(!(60>20));//ȡ��,true��false,�����false

          boolean bn1 = 0 > -9  ^  10 < 20 ;//�����������ֵ��Ϊtrue
          boolean bn2 = ( 9 < 6 ) ^ ( 0 > 10 );//�����������ֵ��Ϊfalse
          boolean bn3 = ( 10 > 8 ) ^ ( 9 < 8 );//һ��Ϊtrue��һ��Ϊfalse������ͬ
          System.out.println("bn1=" + bn1 + "\tbn2=" + bn2 + "\tbn3=" + bn3);
          //�߼��������������ʽ�����ͬ���Ż����true����֮Ϊfalse
          //�������ж�������ʽ����Ƿ���ͬ������true��ͬ��false














     }


}