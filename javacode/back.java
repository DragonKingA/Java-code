import java.util.Scanner;
public class back{
	public static void main(String[] args){
		System.out.println("基本数据类型：\n1.数值型（整数类型-byte[1] short[2] int[4] long[8]，浮点类型(float[4] double[8])）\n2.字符型(char[2]存放单个字符)\n3.布尔型（boolean[1]存放true,false）\n引用数据类型\n1.类class 2.接口interface 3.数组[]");
	/**
	 * *关于使用GBK保存后出现代码中的中文乱码：
	 * *使用Ctrl+Z使其返回至乱码前，再保存，并且在保存的一瞬间在上面切换项目
	 * *
	*/
 		System.out.println("10/3*3="+10/3*3);//10/3输出3，最终输出9
 		System.out.println("10.0/3*3="+10.0/3*3);//输出10.0

 		Scanner sc = new Scanner(System.in);
 		System.out.print("num1=");
 		int num1 = sc.nextInt();
 		System.out.print("num2=");
 		int num2 = sc.nextInt();
 		double average = (num1 + num2)/2.0;
 		//假定num1=9,num2=10
 		//若除以2，而非2.0,则最终average=9.0
 		//若除以2.0,则最终average= 9.5
 		System.out.println("average="+average);

	}
}