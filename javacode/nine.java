import java.util.Scanner;//将util包下的Scanner类导入使用
public class nine{
	public static void main (String[] args){
		//用new创建Scanner类的对象scn
		Scanner scn = new Scanner(System.in);
		System.out.println("请输入名字");
		String name = scn.next();//方法next 表示接收用户的输入
		System.out.println("请输入年龄");
		int age = scn.nextInt();
		System.out.println("请输入工资水平");
		double sal = scn.nextDouble();
		System.out.println("名字\t年龄\t工资水平\n"+name+"\t"+age+"\t"+sal);
		//

    
	}
}