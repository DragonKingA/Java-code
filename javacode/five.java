public class five{
	public static void main(String[] args){
		char n1 = 'a';
		char n2 = '2';
		char n3 = '我';
		//诸如'2'由单引号括起来的表示单个字符，
		//而如“2”由双引号括起来的表示字符串。
		char n4 = 99;
		//字符类型可以存放一个数，当输出如n4这样存放了具体数字的字符时，
		//会输出99所表示的字符 ===>编码的概念
		char n5 = '\n';
		//char类型可以存放单个转义字符，\t作为一个整体，为单个字符
		System.out.println(n1 + n5 + n2 + n5 + n3 + n5 + n4);
		//char类型变量间可以以其对应unicode直接运算，相当于整数间运算
        System.out.println((int)n3);
        System.out.println((char)25105);
        //以上两句为强类型转换，注意格式 ：（类型）变量或值
        char c1 = 'b' + 1; // 98 + 1 = 99
        System.out.println((int)c1);//输出99这个数
        System.out.println(c1);//此时c1仍为char类型，char类型输出数字时，
        //会转换成其编码表中对应的字符。故输出99对应的字符 “c”
        int i1 = 10;
        System.out.println('b' + 10); //输出108，98 + 10 = 108
        //总结：char类型变量在进行char型变量之间、char型变量与数值型变量间的运算时，
        //直接以其对应整数进行运算。
//————————————————————————————————————————————————————————————————————————————————
        //布尔类型只有两种值true和false，并不能用0或1等代替
        boolean Pass = false;
        if(Pass == true){
        	System.out.println("牛");
        }
        else{
        	System.out.println("sb");
        }
//————————————————————————————————————————————————————————————————————————————————
        //关于自动(隐式)类型转换，按精度（容量）大小排列从左到右越大：
        //1. char[2]-->int[4]-->long[8]-->float[4]-->double[8]
        //2. byte[1]-->short[2]-->int[4]-->long[8]-->float[4]-->double[8]
        //精度小者可转化为精度大者，理解为5可以在更精的小数维度中看作5.0，
        //而5本可以在个位级中取得，也可以在容量更大的万级范围内取得，因此可以转换至大容量者
        
        char r1 = 'a';//97
        int r2 = r1;
        System.out.println(r2);

        byte b0 = 0;
        short bx = b0;
        System.out.println(bx);
        
        // byte h1 = -129;
        // char h2 =(char)h1;
        // System.out.println(h2);//直接报错，无法输出。因为-129不符合byte类型范围
        byte m1 = -128;
        char m2 =(char)m1;
        long lon = (long) m2;//lon输出65408 **********那么m2到底是以什么数据存储?************
        System.out.println(m2 +"\t"+ lon);//输出错误字符，因为char类型只能存放0~65536的整数
        byte m3 = 97;
        char m4 =(char)m3;
        System.out.println(m4);//符合char类型取值范围，这样的转化不会发生错误
        /**byte类型不能转换为char类型的原因：
         * 虽然容量大小上符合转换要求，的确是由低容量至高容量
         * 但是特殊地，byte类型为有符号型，而char类型为无符号型
         * 若是进行转换：        
         * byte b1 = 66;
         * char b2 = b1;
         * System.out.println(b2);
         * 则byte中符号位会出错,解决如下：
         * 
         * java中的数值类型都为有符号类型。从文件读取流中获取的数据为byte数组，
         * 其中部分值为大于127的ascii值，这样在向char数组中转换时符号位会出错,
         * 解决方法：如果该值大于127（也就是小于0）,那么为该值加256，从而校正符号位。
         * ____________________________________________________________________
         * 如何理解????????????
         * ____________________________________________________________________
         * 示例代码如下：
         *byte[] ab = new byte[len];
         *ab = str.getBytes();
         *for (int i=0; i<len; i++)
         * {
         * if (ab[i] < 0)
         *  System.out.print((char)(ab[i]+256));
         * else
         *  System.out.print((char)(ab[i]));
         *}
         *System.out.println();
         */
        

        /**以下为易错点：
         * byte b1 = 10; //对。
         * 
         * int n2  = 10;
         * byte b2 = n2;//反而错
         * 总结：上述b1被赋值为10，10为具体数/常量，该语句只判断10这个数是否符合byte范围
         * 而将10存入n2中成为int类型变量，就不可以自动转换为byte类型,即变量的赋值会判断类型 
         */ 

//#重点：凡是涉及byte、short、char的运算，无论是byte与byte之间的同级运算，
      //还是三者或二者混合运算，在计算时会首先转换为int类型，故接收变量类型精度必然大于或等于int
      //所用精度能等于int，是因为int之间能够相互运算即可以同级运算，精度在int之上的类型也可 。
        byte q1 = 1;
        short q2= 2;
        char q3 = 'a';//97
        int q0 = q1 + q2 + q3;
        int k1=2,k2=5,k3=3;
        int k0=k1+k2+k3;


        //只要精度大于或等于int类型均可
        // long l0 = q1 + q2 + q3;
        // float p0 = q1 + q2 + q3;
        // double d0 = q1 + q2 + q3;
        System.out.println(q0);//100
//————————————————————————————————————————————————————————————————————————————————
        
        //int y0 = (int)2*3.6;//会报错，因为强转换只是将2变成int类型，而最终结果7.2是double型
        int y1 = (int)(2*3.6);//用小括号提高优先级，使2*3.6优先进行变成7.2再整体进行强转换，
        //这样其最终结果才会被转换成int，才能赋值给y1
        //int y2 = (int)(2*3.6)+ 3*2.4;//同样报错，因为后面的3*2.4结果为double型
        int y3 = (int)(2*3.6 + 3*2.4); //14.4---->14 = y3
        int y4 = (int)(2*3.6)+ (int)(3*2.4);

        System.out.println(y1+"\n"+y3+"\n"+y4);//由于精度损失，则y1 = 7 , y3 = 14 
        


	}
}