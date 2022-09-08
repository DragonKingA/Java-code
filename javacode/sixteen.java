//创建类
class Human {
	//属性
	String name;
	String character;
	int age;

	public void Self_Introduction(){// ()表示形参列表，可以含多个形参，用逗号隔开，用于接收用户输入的数据
									// public表示访问权限范围为整个程序，protected表示不能跨包访问，private表示仅本类可访问，void关键字表示该方法无返回值
		System.out.println("name="+name+",age="+age+",charater="+character);
	}

	public int GetSum(int sum1,int sum2){
		int sum0 = sum1 + sum2;
		return sum0;
	}//若返回一个数组，则可以返回多个变量结果
}


class Tools{
	public void PrintArray_2D(int array_accept[][]){
		//方法 的细节：
		//public void Print(){} X 不能在方法体内再定义方法，即方法间不能嵌套
		//同类方法调用：同一个类中的不同方法可以互相直接调用，如在类Tools再定义一个方法，该方法里可以直接PrintArray_2D()调用
		//   特殊地，同类中，静态成员方法如main，并不能引用其上下文非静态方法和变量
		//跨类方法调用：需通过对象名（类名）调用，则先创建对象，而后输出 对象名.方法名(形参列表) 以调用
		System.out.println("二维数组元素为：");
		for (int i = 0; i < array_accept.length;i++){
			for(int j = 0; j < array_accept[i].length;j++){
				System.out.print(array_accept[i][j]+" ");
			}
		}

	}
}






public class sixteen{


	//类中创建成员方法
	public boolean Ifodd(int num0){
		// if(num0 % 2 == 0){
		// 	return false;
		// }else{
		// 	return true;
		// }
		//更简洁写法如下：
		return num0 % 2 != 0;
	}
	//main为静态方法，java中静态成员方法中不能引用其上下文的非静态方法和变量
	public void PrintBurstOfNumbers(int lines,int columns,char char0){
		for(int i = 1;i<=lines;i++){
			for(int j = 1;j<=columns;j++){
				System.out.print(char0);
			}
			System.out.println();
		}
	}



	//类中创建静态成员方法main
	public static void main(String[] args){
		//创建类的实例对象
		Human p1 = new Human();
		p1.name = "LZL";
		p1.age = 18;
		p1.character = "warm-hearted";

		/***类与对象的内存分配（以对象p1为例）：
		 * 在所有jdk版本中，对象及其非String类属性的储存方式：
		 * 1.栈：
		 * 	p1 ---> 0x0101(假设指向该地址)
		 * 2.堆：
		 * 	0x0101空间内含：
		 * 	地址存储：0x0022、0x0033  非引用类型数据存储：整数18
		 * 3.方法区：
		 * 	字符串常量池：	0x0022 ---> LZL    0x0033 ---> warm-hearted
		 * 
		 *  //常量池分为 静态常量池，运行时常量池 和 字符串常量池
		 * 	//jdk7之前 字符串常量池 存在于 运行时常量池，jdk7之后转移至 堆 中
		 * 	//https://blog.csdn.net/m0_70109670/article/details/124576031?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522166096966816782425141106%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=166096966816782425141106&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_ecpm_v1~pc_rank_34-1-124576031-null-null.142^v42^pc_rank_34,185^v2^control&utm_term=java%E5%B8%B8%E9%87%8F%E6%B1%A0%E5%8F%98%E6%9B%B4&spm=1018.2226.3001.4187
		 * 	//https://blog.csdn.net/weixin_33216825/article/details/114787275?ops_request_misc=&request_id=&biz_id=102&utm_term=java%E5%B8%B8%E9%87%8F%E6%B1%A0%E5%8F%98%E6%9B%B4&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduweb~default-1-114787275.142^v42^pc_rank_34,185^v2^control&spm=1018.2226.3001.4187
		*/

		Human p2 = new Human();
		p2 = p1;
		System.out.println("name="+p2.name+",age="+p2.age+",charater="+p2.character);
		p2 = null;

		p1.Self_Introduction();
		System.out.println("sum0 = "+p1.GetSum(100,432));//sum0 = 532
		//也可以先将返回值赋给一个变量，再输出该变量值
		
		//System.out.println("name="+p2.name+",age="+p2.age+",charater="+p2.character); 会发生异常，因为p2已经被空置，不在指向任何内存空间
		//同样地，p2 = p1使得p2 指向 p1 的内存地址，两者共享同一个内存空间，此时唯一的不同只有p1和p2这个对象名不同，引用的空间一样

		/***方法的内存分配（以GetSum方法为例）
		 * 栈：
		 * 	main栈：创建p1对象后，执行GetSum方法时会创建GetSum栈（独立空间在栈中）
		 * 	GetSum栈：在p1.GetSum(100,432)执行时，sum1被赋予值100，sum2被赋予值432，sum0被赋予值532,随后执行返回
		 * 返回语句执行后GetSum栈就会被销毁，直至main栈销毁即程序结束运行
		 * 
		 * 方法调用小结：
		 * 1.当程序执行到方法时，就会开辟一个独立的空间（栈空间）
		 * 2.当方法执行完毕或者执行到return语句时，就会返回
		 * 3.返回到调用方法的地方
		 * 4.返回后，继续执行该方法后面的代码
		 * 5.直至main方法（main栈）执行完毕，整个程序退出

		/**Java内存的结构分析：
		 * 栈：一般用于存放 基本数据类型的数据（局部变量） 和 对象名 及其指向 堆 的地址
		 * 堆：存放对象（自定义类的对象，数组等）
		 * 方法区：常量池（如字符串等常量，各版本常量池有所不同），类加载信息
		 * 
		 * Java创建对象的内存流程：
		 * 1.先加载Human类信息（即属性和方法信息，只会加载一次）
		 * 2.在堆中分配空间，进行默认初始化（意思是给未赋值的属性进行对应数据类型的默认值赋值，参考以前的数组）
		 * 3.然后把内存地址赋给p1 ，p1就指向堆中的对象
		 * 4.进行指定初始化，比如写入的p1.age = 18等这些 为对象的属性具体赋值的语句 会得到执行
		 * 
		 * 特别地，如果对象名被赋予null值，则该对象名废弃，即无法指向原来的内存空间。
		 * 因为对象名存放内存地址，而被赋予null值，便不再指向任何地址，即空置的对象名。
		 */

		Tools tool1 = new Tools();
		int array_2d[][] ={{1,2,3,4},{5,6,7,8,9},{10,11,12,13,14,15},{16,17}};
		tool1.PrintArray_2D(array_2d);
		//将遍历数组的代码用方法封装起来，提高代码复用性，方便用户调用

		//**静态方法调用同类非静态方法，仍需创建对象
		sixteen t = new sixteen();
		System.out.println("\n"+t.Ifodd(12));

		t.PrintBurstOfNumbers(20,40,'&');
	}

}



