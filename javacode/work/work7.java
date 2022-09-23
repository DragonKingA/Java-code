import java.util.Scanner;
public class work7{
	public static void main (String[] args){
	
	Scanner sc = new Scanner(System.in);
	int exersize;
	System.out.print("请输入对应练习题题号：");
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
	        	System.out.println("请依次输入"+i+"班的5名同学的成绩:");
	        	for(int i0 = 1 ; i0 <= 5 ; i0++){        		
	        		score = sc.nextDouble();//加个范围
	        		if(score < 0.0 || score > 100.0){
	        			System.out.println("输入错误，请重新运行");
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
	        	System.out.println(i+"班的平均分为"+average+"分");
	                System.out.println(i+"班的及格人数为"+amount+"人");
	                sum = 0;
	                amount = 0;
	        }
			if(error0 == false){
			average0 = sum0 / 15.0;
			System.out.println("全部班级的平均分为"+average0+"分");
			System.out.println("全部班级的及格人数为"+amount0+"人");			
			}
        
        }else if(exersize == 2){
//exersize 2 ==================================================================================================
		//输出九九乘法表
		for(int i = 1; i <= 9; i++){
			for(int j = 1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.print("\n");
		}                





	}else if(exersize == 3){
//exersize 3 ==================================================================================================                
                System.out.print("请选择金字塔样式（1为实心，2为空心）：");
                int pattern = sc.nextInt();
                System.out.print("请输入金字塔层数：");
                int stars,space,total;
                int level = sc.nextInt();//总格(星星)数total= 2*level - 1，每行星星数stars=2*i - 1,每行空格数space=总格数-每行星星数=total - stars
                total = 2*level - 1;
                A:for (int i = 1; i <= level; i++){
                	stars = 2*i - 1;
                	space = total - stars;//取半 分别输出
                	B:for(int z = 1; z <= total;z++){//每格分别执行
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
                			System.out.println("输入错误，请重新运行");
                			break A;
                		}

                	}
                	System.out.print("\n");
 
                }

//每行先输出 space/2 个空格，后输出stars个星星，再输出space/2 个空格。随后换行进行下一行输出



		}else if(exersize == 4){
//exersize 4 ==================================================================================================
		//画菱形
		int stars,space,total;
		System.out.print("请输入菱形长度：");
		int length = sc.nextInt();
		total = 2*length - 1;
		int i = 1;
                A1:for (; i <= length; i++){
                	stars = 2*i - 1;
                	space = total - stars;//取半 分别输出
                	B1:for(int z = 1; z <= total;z++){//每格分别执行
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
                	for(int z = 1; z <= total;z++){//每格分别执行
	                	stars = 2*i - 1;
	                	space = total - stars;//取半 分别输出
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
        	System.out.println("并未查询到此题号，请重新运行");
        }
	}

}