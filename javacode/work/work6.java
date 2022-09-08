import java.util.Scanner;
public class work6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int exersize;
		System.out.println("请输入对应练习题题号：");
		exersize = sc.nextInt();
		if (exersize == 1){
//exersize 1 ==================================================================================================
			double score;
	        char gender;
	        int i1 = 0;
	        System.out.println("请输入你的初赛成绩:");
	        while(i1 <= 99){
	            score = sc.nextDouble();
	            if (score >= 0.0 && score <= 10.0){
	                if(score > 8.0){
	                    System.out.println("恭喜晋级成功，请输入您的性别:");
	                    for(int i=0;i<=99;i++){                   
	                        gender = sc.next().charAt(0);//charAt(0)指的是返回第一个字符，0为索引首位即第一个字符                
	                        if(gender == '男'){                        
	                            System.out.println("请进入男子组比赛");
	                            i1 = 100;//这条语句必须放在break语句前面，否则无法执行而异常
	                            break;                           
	                        }else if(gender == '女'){
	                            System.out.println("请进入女子组比赛");
	                            i1 = 100;//这条语句必须放在break语句前面，否则无法执行而异常
	                            break;                            
	                        }else{
	                            System.out.println("请重新输入您的性别");
	                        }
	                    }
	                }else{
	                    System.out.println("不好意思，你被淘汰了");
	                    break;
	                }
	            }else{
	                System.out.println("输入错误，请重新输入你的初赛成绩:");
	            }
	            i1++;
	        }



        }else if(exersize == 2){
//exersize 2 ==================================================================================================
            int month,age,price;
        	System.out.println("请输入该月月份：");
            for (int i2 = 0 ;i2 <= 99;i2++){	            
	            month = sc.nextInt();
	            if(month >= 1 && month <= 12){
		            System.out.println("请输入您的年龄：");
		            age = sc.nextInt();
	            	if(age >= 0 && age <= 128){
		            	if(month >= 4 && month <= 10){
		            		//旺季票价
	                        if(age >= 18 && age <= 60){
	                        	price = 60;
	                        }else if(age < 18){
	                            price = 30;
	                        }else{
	                        	price = 20;
	                        }
		            	}else{
		            		//淡季票价
	                        if(age >= 18 && age <= 60){
	                            price = 40;
	                        }else{
	                        	price = 20;
	                        }
		            	}
		            	System.out.println("您需要支付"+price+"元");
                        break;
                    }else{
                    	System.out.println("请重新输入正确的年龄：");
                    }
	            }else{
	            	System.out.println("请重新输入正确的月份：");
	            }
            }
        



		}else if(exersize == 3){
//exersize 3 ==================================================================================================
/*          int num = 10;
            switch(num){
                case 99:
                    System.out.println("1"); 
                case 10://一旦匹配就会执行到底，直到遇到break,因此break语句存否相当重要
                	System.out.println("2");
                	//break;
                case 22:
                	System.out.println("3");
                default:
                	System.out.println("4");
            }//输出了 2 3 4
*/
            System.out.println("请输入字母：");        
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
            System.out.println("请输入学生成绩：");
            double grade = sc.nextDouble();
            if(grade >= 0 && grade <= 100){
	            switch ((int)(grade/60)){
	                case 1:
	                	System.out.println("合格");
	                	break;
	                case 0:
	                	System.out.println("不合格");
	                	break;
	            }
            }else{
            	System.out.println("输入有误！");
            }






		}else if(exersize == 5){
//exersize 5 ==================================================================================================
            System.out.println("请输入月份：");
            int month0 = sc.nextInt();
            switch(month0){
            	case 3:
                case 4:
                case 5:
                	System.out.println("春季");
                	break;
                case 6:
                case 7:
                case 8:
                	System.out.println("夏季");
                	break;
                case 9:
                case 10:
                case 11:
                	System.out.println("秋季");
                	break;
                case 12:
                case 1:
                case 2:
                	System.out.println("冬季");
                	break;
                default:
                    System.out.println("输入有误");
                	break;
            }









		}else{
        	System.out.println("并未查询到此题号，请重新运行");
        }
	}

}