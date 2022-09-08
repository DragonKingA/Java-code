public class eight{
	public static void main (String[] args){
		//基本赋值运算符"="
		//复合赋值运算符：+= ，-= ，*= ，/= ，%= 均同理
		int n1 = 10;
		n1 += 4;// 等价于n1 = n1 + 4
		System.out.println("n1="+n1);
		n1 /= 3;// 等价于n1 = n1 / 3  ===> 4
		System.out.println("n1="+n1);
		//其余同理等价于: op1 = op1 运算操作 op2 

		//但复合赋值运算与 “op1 = op1 运算操作 op2 ” 不同：
		//复合赋值运算还会进行强制类型转换
		// ++、--也会进行强制类型转换
		byte b = 125;
		//double b =3.0;则会使得 b+=2中的2被强转变成2.0，b++中的1被强转变成1.0
		b += 2;
		//*因此 b += 2 完全等于 b = (byte)(b + 2) 
		System.out.println("b="+b);//b=127
		b++;
		System.out.println("b="+b);//由于超了byte范围，b=-128
		//小结论：上述类型强转并不针对原变量b，而原变量类型始终保持不变
		//b=b+2;而这个操作会报错，因为其类型变成int，违反自动类型转换的精度规则

//===============================================================================
		//三元运算符：

		int i1 = 10;
		int i2 = 99;
		int result = i1>i2 ? i1++ : i2--;//i1>i2表达式返回false，取值2,
		//由于是后自减,i2先赋值给result再自减
		System.out.println("result="+result);//result=99 , i1=10 , i2=98
		System.out.println("i1="+i1);
		System.out.println("i2="+i2);

        //此时各变量值为result=99 , i1=10 , i2=98
		result = i1<i2 ? i1++ : i2--;
		System.out.println("result="+result);//result=10 , i1=11 , i2=98
		System.out.println("i1="+i1);
		System.out.println("i2="+i2);
        //三元运算必须满足法则：值1和值2必须是 接受变量的类型 或 可进行自动转换的类型
        //可以人为进行 强制类型转换 使其与 接受变量类型 匹配
		int i3 = 3;
		int i4 = 8;
		int res= i3 > i4 ? (int)1.1 : (int)4.8;//强转使得与接受变量类型匹配
		double d= i3 > i4 ? i3+2.1 : i4 + 10;//接受变量类型精度高，值1和值2可自动转换类型
		System.out.println("res="+res+"\td="+d);//res=4 , d=18.0

//Exercise:=======================================================================
		//得出三个数中的最大数
		int one = 1231;
		int two = 52;
		int three= 23331;
		// int max0;
        // int max1 = (max0 = one > two ? one : two) > three ? max0 : three;
        // 也可以如上嵌入，但可读性差
		int max0 = one > two ? one : two;
        int max1 = max0 > three ? max0 : three;
        System.out.println("最大数为"+max1);
        

       
	}
}