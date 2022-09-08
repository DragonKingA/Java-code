import java.util.Scanner;
public class twelve{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 5;
		for(int i = 0,j = 0 ; i < count + j && i != 5 ; i++ , j+=2){
			System.out.println("i="+i+"\t"+"j="+j);

		}//可以初始化多个变量，可以规定多个循环条件（只需满足整体返回一个布尔值即可），
		//可以有多条变量迭代语句
	    int sum = 0;
	    int count0 = 0;
	    for(int i = 1; i <= 100; i++){
	    	if(i % 9 == 0){
	    		System.out.println("i="+i);
	    		sum = sum + i;
                count0++;
	    	}
	    }
        System.out.println("个数为"+count0+"个\n"+"总和为"+sum);

        for(int i = 0,j = 5;i<=5 && j>=0;i++,j--){
        	System.out.println(i+"+"+j+"="+(i+j));
        }
        
        int i0 = 40;
        while (i0 <= 200){
        	if(i0 % 2 == 0){
        		System.out.println(i0);
        	}
        	i0++;
        }

        int i1 = 0;
        int sum1 = 0;
        do{
        	if(i1 % 5 == 0 && i1 % 3 != 0){
        		sum1++;
        	}
            i1++;
           
        }while(i1<=200);
        System.out.println(sum1);
        
        char choice;
        do{
        	System.out.println("同意吗？ 是/否");
            choice = sc.next().charAt(0);
        }while(choice != '是');//如果用String接收，则要用equal判断字符串是否相等




	}
}