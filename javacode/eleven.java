import java.util.Scanner;
public class eleven{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		// int x = 7;
		// int y = 4;
        int x,y;
        System.out.println("x=");
        x=sc.nextInt();
        System.out.println("y=");
        y=sc.nextInt();
        if(x>5){
        	if(y>5){
        		System.out.println("x+y="+(x+y));
        	}
        	System.out.println("x>5 true");
        }else{
        	System.out.println("x<5,x="+x);
        }



        double d0,d1;
        d0 = 20;
        d1 = 15;
        if(d0 > 10 && d1 < 20){
            System.out.println("d0+d1="+(d0+d1));
        }else{
            System.out.println("false");
        }



        int i0,i1;
        System.out.println("i0=");
        i0=sc.nextInt();
        System.out.println("i1=");
        i1=sc.nextInt();
        int mix = i0 + i1;
        if((mix % 3 == 0) && mix % 5 == 0){
            System.out.println("两数之和可以被3和5整除,该和为"+mix);
        }else{
            System.out.println("两数之和不可以被3和5同时整除,该和为"+mix);
        }



        int year;//2400是闰年
        System.out.println("year=");
        year=sc.nextInt();
        if( (year % 400 == 0) || ((year % 4 == 0)&&(year % 100 != 0)) ){
            System.out.println("该年份为"+year+",是闰年");
        }else{
            System.out.println("该年份为"+year+",是平年");
        }


        int credit;
        System.out.println("请输入您的信用分");
        credit = sc.nextInt();
        if(credit < 0 || credit > 100){
            System.out.println("输入错误,请重新输入！");
        }else if(credit > 80 && credit <= 99){
            System.out.println("信用优秀");
        }else if(credit > 60 && credit <= 80){
            System.out.println("信用一般");        
        }else if(credit == 100){
            System.out.println("信用极好");
        }else{
            System.out.println("信用不合格");
        }
        //也可以if套if(嵌套分支)，最外层if用于判定范围是否符合然后else来执行不符合的情况,
        //而内层if用于实际判断各个信用等级
        //若输入文字或小数（非整数）会报错，因此以后会用到 异常


        boolean b = true;
        if(b = false){
            System.out.println("a");
        }else if (b){
            System.out.println("b");
        }else if (!b){
            System.out.println("c");
        }else{
            System.out.println("d");
        }

        

	}
}