import java.util.Scanner;
public class work7{
	public static void main (String[] args){
	
	Scanner sc = new Scanner(System.in);
	int exersize;
	System.out.print("�������Ӧ��ϰ����ţ�");
	exersize = sc.nextInt();
	if (exersize == 1){
//exersize 1 ==================================================================================================
	        int sum = 0;
		int sum0 = 0;
		int amount = 0;
		int amount0 = 0;
		boolean error0 = false;
		double average,average0,score;
	        AB:for(int i = 1 ; i <= 3 ; i++){
	        	System.out.println("����������"+i+"���5��ͬѧ�ĳɼ�:");
	        	for(int i0 = 1 ; i0 <= 5 ; i0++){        		
	        		score = sc.nextDouble();//�Ӹ���Χ
	        		if(score < 0.0 || score > 100.0){
	        			System.out.println("�����������������");
	        			error0 = true;
	        			break AB;
	        		}else if(score >= 60){
	        			amount++;
	        		}
	                        sum += score;
	        	}
	        	sum0 += sum;
	        	amount0 += amount;
	        	average = sum / 5.0;
	        	System.out.println(i+"���ƽ����Ϊ"+average+"��");
	                System.out.println(i+"��ļ�������Ϊ"+amount+"��");
	                sum = 0;
	                amount = 0;
	        }
			if(error0 == false){
			average0 = sum0 / 15.0;
			System.out.println("ȫ���༶��ƽ����Ϊ"+average0+"��");
			System.out.println("ȫ���༶�ļ�������Ϊ"+amount0+"��");			
			}
        
        }else if(exersize == 2){
//exersize 2 ==================================================================================================
		//����žų˷���
		for(int i = 1; i <= 9; i++){
			for(int j = 1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.print("\n");
		}                





	}else if(exersize == 3){
//exersize 3 ==================================================================================================                
                System.out.print("��ѡ���������ʽ��1Ϊʵ�ģ�2Ϊ���ģ���");
                int pattern = sc.nextInt();
                System.out.print("�����������������");
                int stars,space,total;
                int level = sc.nextInt();//�ܸ�(����)��total= 2*level - 1��ÿ��������stars=2*i - 1,ÿ�пո���space=�ܸ���-ÿ��������=total - stars
                total = 2*level - 1;
                A:for (int i = 1; i <= level; i++){
                	stars = 2*i - 1;
                	space = total - stars;//ȡ�� �ֱ����
                	B:for(int z = 1; z <= total;z++){//ÿ��ֱ�ִ��
                		if(pattern == 1){
	                		if(z <= space/2){
	                			System.out.print(" ");
	                		}else if(z <= (space/2)+stars){
	                			System.out.print("*");
	                		}else{
	                			System.out.print(" ");
	                		}
                		}else if(pattern == 2){
                			if(i == level){
		                		if(z <= space/2){
		                			System.out.print(" ");
		                		}else if(z <= (space/2)+stars){
		                			System.out.print("*");
		                		}else{
		                			System.out.print(" ");
		                		}
                			}else{
	                			if(z <= space/2){
	                				System.out.print(" ");
	                			}else if(z == space/2 + 1 || z == space/2 + stars){
	                				System.out.print("*");
	                			}else{
	                				System.out.print(" ");
	                			}
                			}

                		}else{
                			System.out.println("�����������������");
                			break A;
                		}

                	}
                	System.out.print("\n");
 
                }

//ÿ������� space/2 ���ո񣬺����stars�����ǣ������space/2 ���ո�����н�����һ�����



		}else if(exersize == 4){
//exersize 4 ==================================================================================================
		//������
		int stars,space,total;
		System.out.print("���������γ��ȣ�");
		int length = sc.nextInt();
		total = 2*length - 1;
		int i = 1;
                A1:for (; i <= length; i++){
                	stars = 2*i - 1;
                	space = total - stars;//ȡ�� �ֱ����
                	B1:for(int z = 1; z <= total;z++){//ÿ��ֱ�ִ��
        			if(z <= space/2){
        				System.out.print(" ");
        			}else if(z == space/2 + 1 || z == space/2 + stars){
        				System.out.print("*");
        			}else{
        				System.out.print(" ");
        			}
                	}
                	System.out.print("\n");
                }
                i -= 2;
                A2:while(i >= 1){
                	for(int z = 1; z <= total;z++){//ÿ��ֱ�ִ��
	                	stars = 2*i - 1;
	                	space = total - stars;//ȡ�� �ֱ����
        			if(z <= space/2){
        				System.out.print(" ");
        			}else if(z == space/2 + 1 || z == space/2 + stars){
        				System.out.print("*");
        			}else{
        				System.out.print(" ");
        			}
                	}
                	System.out.print("\n");
                	i--;
                }
 



	


	}else{
        	System.out.println("��δ��ѯ������ţ�����������");
        }
	}

}