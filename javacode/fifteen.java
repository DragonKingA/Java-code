import java.util.Scanner;
public class fifteen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// int maxTemp[] = new int[arr0.length];
		// int max_temp = -1;
		// int max = arr0[0];
		// int indexmax = -1;
		// int indexmax_temp = -1;
		// for(int j = 1; j <= maxTemp.length;j++){
		//     for(int i = 1; i < arr0.length; i++){
		//     	if(indexmax_temp == i || indexmax_temp + 1 == i){
		//     		if(arr0[i-1] < arr0[i+1]){
		//     			max = arr0[i+1];
		//     			indexmax = i+1;
		//     		}else{
		//     			max = arr0[i-1];
		//     			indexmax = i-1;
		//     		}
		//     	}else{
		// 		    	if(max < arr0[i] ){
		// 		    		max = arr0[i];
		// 					System.out.println(max);
		// 		    		indexmax = i;
		// 		    	}
		//     		}
		//     	}

  //   	maxTemp[arr0.length - j] = max;
  //   	max_temp = max;
  //   	max = arr0[0];
  //   	indexmax_temp = indexmax;
		// }

  //       System.out.println("arr0的升序排序后为：");
  //       for(int i = 0; i<arr0.length;i++){
  //           System.out.print(maxTemp[i]+" ");
  //       }
//错解！思路错误=========================================================================
		
//重点理解：冒泡排序*（比较相邻两个元素，若满足条件则交换，使较大者往往向后移动）
		int arr0[] = {24,69,80,57,13,1,2,-3,40,900,100};
	
		int temp = -1;
		int indexmax = -1;
		for(int j = 0 ;j < arr0.length - 1; j++){// 共(arr0.length - 1)次排序,
			for(int i = 0; i < arr0.length - 1 - j; i++){//每次排序，扫出一个较大值
		    	if(arr0[i] > arr0[i + 1] ){					
					//*主要思路：如果前一个数大于后一个数就互换位置，这样可以将较大数均扫到最后				
					temp = arr0[i];			
					arr0[i] = arr0[i + 1];
					arr0[i + 1] = temp;
				}
				
			}
		
		}
	
        System.out.println("arr0的升序排序后为：");
        for(int i = 0; i<arr0.length;i++){
            System.out.print(arr0[i]+" ");
        }


		System.out.println();


		//二维数组
		//其元素即是一维数组,其长度即一维数组的个数
        int[][] arr1 = {{0 ,0 ,0 ,0 ,0 },{0 ,0 ,0 ,0 ,0 },{0 ,0 ,0 ,0 ,0 },{0 ,0 ,0 ,0 ,0 }};
        for(int i = 0;i <arr1.length;i++){
        	for(int j = 0; j<arr1[i].length;j++){//arr[i].length相当于二维数组中索引位置为i的一维数组(元素)
        		System.out.print(arr1[i][j]+" ");//返回索引位置为i的一维数组中的索引位置为j的元素
        	}
        	System.out.println();
        }

//误区理解:============================================================================================
        int[] y0[];//二维数组一种奇怪的声明形式
        int[] x,y[];//如此声明，则x是一维数组，y是二维数组！！！！！！！！！
        //可以看成 int[] x 和 int[] y[] 
        // x = y //错误，int [][] --> int[] 无法执行
        //int[] x,y[][];等同于上句
        int[] x1[][],x2[][];
        //x1维数为1+2=3维，x2维数为1+2=3维
        y0 = new int[2][2];
        x  = new int[2];
        x1 = new int[2][2][2];
        x2 = new int[2][2][2];
        //总结：int[] 中数组标识符[]置于int后，数组名前，则会作用于后续所有数组，即后续数组维数加1


        //String[] str = new String[2]{"a"};//同时使用维表达式和初始化创建数组是非法的
        String[] str = new String[]{"a"};//正确
//================================================================================================







     	int arr2[][] = new int[10][];
     	for(int i = 0 ;i<arr2.length;i++){
     		arr2[i] = new int[i+1];
     		for(int j = 0;j<arr2[i].length;j++){
     			arr2[i][j] = j+1;
     		}
     	}
     	//遍历:
     	for(int i = 0; i <arr2.length;i++){
     		for(int j = 0;j<arr2[i].length;j++){
     			System.out.print(arr2[i][j]+" ");
     		}
     		System.out.println();
     	}




 		int sum = 0;
     	int arr3[][] = {{4,6},{1,4,5,7},{-2}};
     	for(int i = 0 ;i < arr3.length;i++){
     		for(int j = 0 ;j <arr3[i].length;j++){
     			sum += arr3[i][j];
     		}     		
     	}
     	System.out.println("sum="+sum);


     	System.out.println();
//杨辉三角：=============================================================================
     	//逻辑实现：
     	System.out.print("请输入杨辉三角层数(<35):");
     	int lines;
     	lines = sc.nextInt();
     	if(lines > 0 && lines < 35){
	        int arrYangHui[][] = new int[lines][];//循环分别开辟空间，节省内存
	     	for(int n = 1; n <= lines ; n++){//10行，n行
	     		arrYangHui[n-1] = new int[n];
	     		for(int m = 1; m <= n ;m++){//每行第一个为1，第n个为1
	     			arrYangHui[n-1][0] = arrYangHui[n-1][n-1] = 1;
	     			if(n >= 3 && m > 0 && m < n-1 ){
	     				arrYangHui[n-1][m] = arrYangHui[n-2][m-1] + arrYangHui[n-2][m];
	     			}
	     		}
	     	}	
	     	//遍历：
	     	for(int i = 0; i <arrYangHui.length;i++){
	     		//先打印空格
	     		for(int z = 1; z <= lines - 1 - i;z++){
     				System.out.print(" ");//从6层杨辉三角开始形状崩溃
     			}

	     		for(int j = 0;j<arrYangHui[i].length;j++){
	     			System.out.print(arrYangHui[i][j]+" ");
	     		}
	     		System.out.println();
	     	}
     	}else{
     		System.out.print("输入错误，请重试");
     	}
//=======================================================================================
     	














	}


}