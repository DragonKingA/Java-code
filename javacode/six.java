public class six{
	public static void main (String[] args){
		int i1 = 100;
		float f1 = 1.1f;
		double d1 = 4.6;
		boolean b1 = true;
		String s1 = i1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		//写法如此规定，便于将变量直接转为字符串，防止变量名可变成字符串的冲突，如写为"i1"输出"i1"
		System.out.println(s1 + s2+ s3 +  s4);
		System.out.println(s1 +"\t"+ s2+ "\t" + s3 + "\t" + s4);

		String str1 = "这样写1";
		String str2 = "这样写2" + "也行";
		String str3 = "\n"+str1 + str2 + "也可以";
		String str4 = "\n"+str1 +'\t'+ str2 + "也可以";
		//转义字符作为单个字符本身可容纳于String类型或Char类型，故可以直接拼接
		System.out.println(str1+"\n"+str2+str3);

		//关于 字符串String类型 转换成 基本数据类型
		String s5 = "123";
		String s6 = "true";
		int num1 = Integer.parseInt(s5);
		//将字符串s5中的数字转换成对应int类型，
		//并将数据返回，然后再赋值给num1，如下同理：
        byte num2 = Byte.parseByte(s5);
        short num3 = Short.parseShort(s5);
        long num4 = Long.parseLong(s5);
        float num5 = Float.parseFloat(s5);//123.0
        double num6 = Double.parseDouble(s5);//123.0
        boolean b0 = Boolean.parseBoolean(s6);
        //而唯有char c0 = Character.parseCharacter(s5);是错误的，原因是
        //字符串本身包含多个字符，将多个字符转成单个字符本身不具意义也不能实现，
        //所以在Character类中并没有转换方法parseCharacter
        //本身Byte,Short,Integer等等称为各基本数据类型的对应的包装类，
        //类下面各有用于转换的方法，parse=解析~转换

        //上述转换需满足：
        //确保该String类型数据能够转换成有效的对应类型数据，比如"hello"不能转成整数等
        //以及如s5的实际数值不能大于转换后变量类型取值范围，否则造成抛出异常，程序终止
        //（若存在抛出异常点，程序编译时并不会报错，而会在运行之时报错并使后续程序直接终止,不再运行异常点后代码）
        
/** 当然的，可以从字符串中取出相应位置的单个字符，这样就能存入char类型数据中
 * 格式如下 变量.charAt(某字符所在位置整数值)  其中键入0则为第一位 (硬性规定0为初始位置即第一位字符) 
 */
        char c0 = s5.charAt(1);//"123"中取第二位，输出字符'2'
        char c1 = s5.charAt(0);//"123"中取第一位，输出字符'1'
        
        System.out.println(c0+"\n"+c1);




	}
}