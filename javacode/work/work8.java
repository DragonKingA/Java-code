import java.util.Scanner;
public class work8{
	public static void main (String[] args){

	Scanner sc = new Scanner(System.in);
	int exersize;
	System.out.print("请输入对应练习题题号：");
	exersize = sc.nextInt();
	if (exersize == 1){
//exersize 1 ==================================================================================================
		int money = 100000;
		int times = 0;
		while(true){
			if(money > 50000){
				money *= 0.95;
				System.out.println("money="+money);
			}else if(money <= 50000 && money >= 1000){
				money -= 1000;
				System.out.println("money="+money);
			}else{			
	            System.out.println("此人共经过"+times+"次路口");
	            break;
			}
			times++;

		}


    }else if(exersize == 2){
//exersize 2 ==================================================================================================
    	//判断一个3位数是否为水仙花数
    	int one,two,three,one0,two0,three0;
    	int num0 = 1;
    	System.out.println("以下为三位水仙花数");
    	while(num0 <= 1000){
    		
    		three0 = num0 / 100;
    		two0 = (num0 % 100) / 10;
    		one0 = num0 % 10;
    		if(num0 == one0*one0*one0 + two0*two0*two0 + three0*three0*three0 && num0 <= 999 && num0 >= 100){
    			System.out.println(num0);
    		}
    		num0++;
    	}
    	while(true){
	    	System.out.print("请输入一个3位整数：");
	    	int num = sc.nextInt();	    	
	    	if(num <= 999 && num >= 100){
	    		three = num / 100;
	    		two = (num % 100) / 10;
	    		one = num % 10;
	    		// System.out.println(three);
	    		// System.out.println(two);
	    		// System.out.println(one);
	    		if(num == one*one*one + two*two*two + three*three*three){
	    			System.out.println(num+"="+one+"*"+one+"*"+one+"+"+two+"*"+two+"*"+two+"+"+three+"*"+three+"*"+three);
	    			System.out.println(num+"为水仙花数");
	    			break;
	    		}else{
	    			System.out.println(num+"不是水仙花数");
	    		}
	    	}else{
	    		System.out.println("整数输入错误");
	    		continue;
	    	}

    	}


	}else if(exersize == 3){
//exersize 3 ==================================================================================================
		//a~z Z~A
		char a_To_z = 97;//97 -->122
		char Z_To_A = 90;//90 -->65
		for(;a_To_z <= 122; a_To_z++){
			System.out.print(a_To_z);
		}
		System.out.println();
		for(;Z_To_A >= 65;Z_To_A--){
			System.out.print(Z_To_A);
		}

        //求和1
        double sum = 0;
        for(int i = 1; i<=100;i++){
        	if(i % 2 == 0){
        		sum -= 1.0 / i;
        	}else{
        		sum += 1.0 / i;
        	}
        	
        }
        System.out.println("1-1/2+1/3-1/4+······-1/100="+sum);

        //求和2
        int sum0 = 0;
        for(int i = 1; i <= 100 ; i++){
        	for(int j = 1; j <= i ;j++){
        		sum0 += j;
        	}
        }
        System.out.println("1+(1+2)+(1+2+3)+···+(1+2+···+100)="+sum0);












	}else{
        	System.out.println("并未查询到此题号，请重新运行");
        }
	}

}