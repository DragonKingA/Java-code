public class three{
	public static void main(String[] args){
		System.out.println(100 + 98);
		System.out.println("100" + 98);
		System.out.println(100 + "hello");
		System.out.println(100 + 3 + "hello");
		System.out.println("hello" + 3 + 100);

		//关系（逻辑）运算符：== , != , > , >= , < , <=
		//关系运算符的优先级
		System.out.println(5>3 == 6>4);
		//输出true
		//故 ==、!=的优先级低于其他关系运算符
		//连续的关系逻辑运算是 从左到右 进行的

		int i = 1;
		do{
			i += 5;
		}while(i<17);
		System.out.println("i="+i);
		//i=21

		int sum = 124;
		int times = 9;
		//double average= sum/times;
		double average = 1.0*sum/times;
		//只能先转换右侧表达式类型，在进行除法时输出小数而不是整数
		//才能使得average的值为正确的小数
		System.out.println("average="+average);

		System.out.println("1"+'\n');
	}
}