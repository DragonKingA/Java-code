import java.util.Scanner;
public class work6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int exersize;
		System.out.println("�������Ӧ��ϰ����ţ�");
		exersize = sc.nextInt();
		if (exersize == 1){
//exersize 1 ==================================================================================================
			double score;
	        char gender;
	        int i1 = 0;
	        System.out.println("��������ĳ����ɼ�:");
	        while(i1 <= 99){
	            score = sc.nextDouble();
	            if (score >= 0.0 && score <= 10.0){
	                if(score > 8.0){
	                    System.out.println("��ϲ�����ɹ��������������Ա�:");
	                    for(int i=0;i<=99;i++){                   
	                        gender = sc.next().charAt(0);//charAt(0)ָ���Ƿ��ص�һ���ַ���0Ϊ������λ����һ���ַ�                
	                        if(gender == '��'){                        
	                            System.out.println("��������������");
	                            i1 = 100;//�������������break���ǰ�棬�����޷�ִ�ж��쳣
	                            break;                           
	                        }else if(gender == 'Ů'){
	                            System.out.println("�����Ů�������");
	                            i1 = 100;//�������������break���ǰ�棬�����޷�ִ�ж��쳣
	                            break;                            
	                        }else{
	                            System.out.println("���������������Ա�");
	                        }
	                    }
	                }else{
	                    System.out.println("������˼���㱻��̭��");
	                    break;
	                }
	            }else{
	                System.out.println("�������������������ĳ����ɼ�:");
	            }
	            i1++;
	        }



        }else if(exersize == 2){
//exersize 2 ==================================================================================================
            int month,age,price;
        	System.out.println("����������·ݣ�");
            for (int i2 = 0 ;i2 <= 99;i2++){	            
	            month = sc.nextInt();
	            if(month >= 1 && month <= 12){
		            System.out.println("�������������䣺");
		            age = sc.nextInt();
	            	if(age >= 0 && age <= 128){
		            	if(month >= 4 && month <= 10){
		            		//����Ʊ��
	                        if(age >= 18 && age <= 60){
	                        	price = 60;
	                        }else if(age < 18){
	                            price = 30;
	                        }else{
	                        	price = 20;
	                        }
		            	}else{
		            		//����Ʊ��
	                        if(age >= 18 && age <= 60){
	                            price = 40;
	                        }else{
	                        	price = 20;
	                        }
		            	}
		            	System.out.println("����Ҫ֧��"+price+"Ԫ");
                        break;
                    }else{
                    	System.out.println("������������ȷ�����䣺");
                    }
	            }else{
	            	System.out.println("������������ȷ���·ݣ�");
	            }
            }
        



		}else if(exersize == 3){
//exersize 3 ==================================================================================================
/*          int num = 10;
            switch(num){
                case 99:
                    System.out.println("1"); 
                case 10://һ��ƥ��ͻ�ִ�е��ף�ֱ������break,���break������൱��Ҫ
                	System.out.println("2");
                	//break;
                case 22:
                	System.out.println("3");
                default:
                	System.out.println("4");
            }//����� 2 3 4
*/
            System.out.println("��������ĸ��");        
            char c = sc.next().charAt(0);
            switch(c){
                case 'a':
                	System.out.println("A");
                	break;
                case 'b':
                	System.out.println("B");
                	break;
                case 'c':
                	System.out.println("C");
                    break;                
                case 'd':
                	System.out.println("D");
                	break;
                case 'e':
                	System.out.println("E");
                	break;
                default:
                	System.out.println("other");
            }
    




		}else if(exersize == 4){
//exersize 4 ==================================================================================================
            System.out.println("������ѧ���ɼ���");
            double grade = sc.nextDouble();
            if(grade >= 0 && grade <= 100){
	            switch ((int)(grade/60)){
	                case 1:
	                	System.out.println("�ϸ�");
	                	break;
	                case 0:
	                	System.out.println("���ϸ�");
	                	break;
	            }
            }else{
            	System.out.println("��������");
            }






		}else if(exersize == 5){
//exersize 5 ==================================================================================================
            System.out.println("�������·ݣ�");
            int month0 = sc.nextInt();
            switch(month0){
            	case 3:
                case 4:
                case 5:
                	System.out.println("����");
                	break;
                case 6:
                case 7:
                case 8:
                	System.out.println("�ļ�");
                	break;
                case 9:
                case 10:
                case 11:
                	System.out.println("�＾");
                	break;
                case 12:
                case 1:
                case 2:
                	System.out.println("����");
                	break;
                default:
                    System.out.println("��������");
                	break;
            }









		}else{
        	System.out.println("��δ��ѯ������ţ�����������");
        }
	}

}