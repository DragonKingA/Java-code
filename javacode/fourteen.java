import java.util.Scanner;
public class fourteen{
	public static void main(String [] args){
        Scanner sc = new Scanner(System.in);




		int arr[] = {1,2,3,4,5,6};
		//也可这么写：int []arr = {1,2,3,4,5,6}; 即数组标识符可以有两种位置写法
		//但是仅能在定义时出现两种写法，访问数组时只能 arr[索引]
		System.out.println(arr.length);//长度为6，即有6个元素
		for (int i = 0 ; i < arr.length ; i++){//而arr[索引]取元素时是从0开始编号，即有编号0~编号5共六个元素
			//故 索引/编号 = 长度 - 1
			System.out.println(arr[i]);

		}
		//1.第一种动态分配（初始化）方式：声明和分配同时进行
		double score1[] = new double[5];

        //2.第二种动态分配（初始化）方式：先声明，再分配内存空间
		double score2[];//声明数组，此时score为null空集，输出score则会出现相应异常
		score2 = new double[5];//为数组分配具体的内存空间，使其可以存放数据


        System.out.println(score2[0]);//若初始化后未赋值，则会输出默认值，此处为 0.0
        /**默认值如下：int 0, short 0, byte 0, long 0, float 0.0,double 0.0,char \u0000,
		boolean false,String null 
		*/


		//3.静态分配（初始化）方式：数组元素内容及个数已知，系统自动分配相应内存
		int a0 = 6;
		//重点：数组内元素可以发生数据类型的自动转换，使所有元素数据类型统一
		double score3[] = new double[] {1,2,3,4,5,a0};
		//或简化写成double score3[] = {1,2,3,4,5,a0};

        
        //***（重点理解）数组的 赋值机制：
        //不同于基本数据类型的变量间赋值，属于 值传递(值拷贝)
        //数组的赋值属于引用传递，赋的值是 地址(地址拷贝)
        //jvm的内存大致组成：栈，堆，方法区
        //栈：假设arr1指向地址0x001010,将arr1地址赋值给arr2后
        //    arr2也指向地址0x001010
        //堆：地址0x001010占有独一的内存空间，栈中数据可以通过指向同一个地址
        //    来对 堆中同一个内存空间的数据 操作
        //因此，此时共享同一地址的arr1和arr2,对其中任一进行操作，都将
        //对同一内存空间的数据操作，此时arr1和arr2所引出的数据将完全相同，
        //所进行的操作也将相同地影响arr1和arr2(实质就是只有一个内存空间参与)
        int arr1[] = {1,2,3};
        int arr2[] = arr1;//*赋值操作，此时边声明边赋值(而没有手动分配空间)
                          //会使得arr2不会获得新地址指向,并且所分配的空间即arr1的空间
                          //地址拷贝后，原地址(arr1原地址)指向的内存空间将被销毁,
                          //因为此时没有任何变量指向该空间，不存在意义
        arr2[0] = 10;
        System.out.print("arr1的元素为：");
        for(int i = 0; i<arr1.length;i++){
        	System.out.print(arr1[i]+" ");
        }//arr1[]此时为{10,2,3}，由于地址统一，arr2[]此时也为{10,2,3}


        //*元素拷贝（区别于地址拷贝，只替换元素）：
        //元素拷贝的重点是 手动给新数组array_2分配空间，便可将array_1中指定位置的元素替换arr2中指定位置的元素
        int array_1[] = {10,20,30};
        int array_2[] = new int[array_1.length];//手动分配空间，需考虑拷贝元素的数量进行合理分配
        for(int i = 0; i<array_1.length; i++){
            array_2[i]=array_1[i];//此操作将两者元素完全统一，
        //但是，两者虽元素完全相同，却指向不同的地址（不同的内存空间）
        }

        array_2[0] = 100;//现在修改array_2并不会影响array_1

        System.out.print("array_1的元素为：");//{10,20,30}
        for(int i = 0; i<arr1.length;i++){
            System.out.print(array_1[i]+" ");
        }

        System.out.print("array_2的元素为：");//{10,20,30}
        for(int i = 0; i<arr1.length;i++){
            System.out.print(array_2[i]+" ");
        }

        System.out.println();
//exersize：===================================================================================
		// char array1[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		// for(int i = 0;i < array1.length;i++){
		// 	System.out.print(array1[i]);
		// } 
        char array1[] = new char[26];
        for(int i = 0;i < array1.length; i++){
        	array1[i] = (char)('A' + i);//易错：不能正确使用强转
        	System.out.print(array1[i]);
        }



        int array2[] = {1,-99,1000,-20,-9,110,223};//--->max = 1000
        //int array2[] = {100,-29,99,30,53};--->max = 100
        int max = array2[0] ;//先以首个元素为初始值，使其具有具体意义，便于后续判断
        int indexMax = -1;
        // for(int i = 1; i < array2.length; i++){
        // 	if(max < array2[i] || max < array2[i-1]){
        // 		if(array2[i] >= array2[i-1]){
        // 		max = array2[i];
        // 		indexMax = i;
        // 		}else if(array2[i] < array2[i-1]){
        // 		max = array2[i-1];
        // 		indexMax = i - 1;
        // 		}
        // 	}

        // }//写法复杂了!!!!!!!!!
        for(int i = 1; i < array2.length; i++){
        	if(max < array2[i]){
        		max = array2[i];
        		indexMax = i;
        	}
        }
        System.out.println("\n最大值是索引位置为"+indexMax+"的"+max);//1000



        //反转数组元素
        int arr3[] = {11,22,33,44,55,66,77};
        int temp = -1;
        for(int i = 0 , j = arr3.length - 1 ; i < arr3.length / 2 ; i++ , j--){
            temp=arr3[j];
            arr3[j]=arr3[i];
            arr3[i]=temp;//奇偶个元素均可
        }
        System.out.println("arr3的元素为：");
        for(int i = 0; i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }




        int arr4[] = {11,22,33,44,55,66,77};
        int arrOpp[] = new int[arr4.length];
        for(int i = 0; i < arr4.length; i++){
            arrOpp[i]=arr4[arr4.length - 1 - i];
        }
        arr4 = arrOpp;//地址拷贝
        System.out.println("arr4的反转后为：");
        for(int i = 0; i<arr4.length;i++){
            System.out.print(arr4[i]+" ");
        }




        int arr5[] = {1,2,3};
        int arrNew[]=new int[4];
        for(int i = 0 ; i < arr5.length;i++){
            arrNew[i]=arr5[i];
        }
        arrNew[arrNew.length - 1] = 4;
        arr5 = arrNew;//采用地址拷贝后，arr5原来的内存空间会被销毁
        
        System.out.println("arr5为：");
        for(int i = 0; i<arr5.length;i++){
            System.out.print(arr5[i]+" ");
        }



        int arr6[] = {1,2,3,4,5,6,7,8,9,10};
        while(true){
            if(arr6.length == 1){
                System.out.println("\n不能再进行缩减了");
                break;
            }
            System.out.println("\n是否进行缩减？y/n");
            char yes_or_no = sc.next().charAt(0);
            if(yes_or_no == 'y'){
                int arrtemp[] = new int[arr6.length - 1];
                for(int i = 0 ; i < arrtemp.length ; i++){
                    arrtemp[i]=arr6[i];
                }
                arr6 = arrtemp;

                System.out.println("arr6为：");
                for(int i = 0; i<arr6.length;i++){
                    System.out.print(arr6[i]+" ");
                }

            }else if(yes_or_no == 'n'){
                break;
            }else {
                System.out.println("输入错误，请重新输入");
                continue;
            }


        }





	}
}