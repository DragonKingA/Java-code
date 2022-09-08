import java.util.Scanner;
public class work9{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int exersize;
		System.out.print("请输入对应练习题题号：");
		exersize = sc.nextInt();
		if (exersize == 1){
//exersize 1 ==================================================================================================
		
		int arr1[] = {10,12,45,90};
		int arrAdd[]=new int[arr1.length + 1];//{10,12,23,45,90}
		boolean Ifcontinue = true;
		System.out.print("请输入插入升序数组{10,12,45,90}中的一个数：");
		int AddedElement = sc.nextInt();
		for(int i = 0 ; i<arrAdd.length; i++){
			if(Ifcontinue == true){
				if(i == arrAdd.length - 1){
					arrAdd[i]=AddedElement;
				}else if(arr1[i] >= AddedElement){
					arrAdd[i]=AddedElement;
					arrAdd[i+1]=arr1[i];
					Ifcontinue = false;
				}else{
					arrAdd[i]=arr1[i];
				}
			}else{
				if(i == arrAdd.length - 1){
					arrAdd[i]=arr1[i-1];
				}else{
					arrAdd[i+1]=arr1[i];
				}
			}
		}
		//遍历arrAdd		
		for (int i = 0 ; i < arrAdd.length; i++){
			System.out.print(arrAdd[i]+" ");
		}
		//27行,判断复杂性较高，可读性较差



    }else if(exersize == 2){
//exersize 2 ==================================================================================================
		
		//以下为最优写法：（25行,可读性高）
		//先查出添加数应处的索引位置index，原数组和新数组应使用不同的变量循环，以同步复制原元素
		int arr[] = {10,12,45,90};
		int arrNew[]=new int[arr.length + 1];
		int index = -1;
		System.out.print("请输入要添加的数（优化算法升序）:");
		int addNum = sc.nextInt();
		//遍历寻找插入数应处于的索引位置
		for(int i = 0; i < arr.length; i++){
			if(addNum >= arr[i]){
			//如果条件是addNum <= arr[i]则执行index = i;即可
				index = i + 1;
			}
		}		
		if(index == -1){
			index = 0;
		}
		//将原数组数和添加数输入新数组
		for(int i = 0,j = 0 ; i < arrNew.length; i++){
			if(i == index){
				arrNew[i]=addNum;
			}else{
				arrNew[i]=arr[j];
				j++;//j++为本套代码*精华*,变量j用于存放原数组arr欲发生复制的索引位置!!!
			}
		}
		//遍历arrNew
		for (int i = 0 ; i < arrNew.length; i++){
			System.out.print(arrNew[i]+" ");
		}
		


	}else if(exersize == 3){
//exersize 3 ==================================================================================================
		System.out.print("请输入数组长度：");
		int n = sc.nextInt();
		//取n个随机整数于数组中
		int arr2[] = new int[n];//length = 10		
		for(int i = 0; i < n; i++){
			arr2[i]=(int)(Math.random()*100) + 1;
		}
		//遍历原数组
		System.out.print("原数组为:");
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i]+" ");
		}
		//复制一个相同的数组以供倒序打印
		int arrPrint[] = new int[arr2.length];
		for(int i = 0; i < arr2.length ;i++){
			arrPrint[i] = arr2[i];
		}
		//10个数的倒序排列,9次排序，每排序一次减少一次交换判断
		for(int i = 0 ; i < arrPrint.length - 1; i++){//i 0~8
			for(int temp,j = 0; j < arrPrint.length - 1 - i ; j++){
				if(arrPrint[j] < arrPrint[j+1]){
					temp = arrPrint[j];
					arrPrint[j]=arrPrint[j+1];
					arrPrint[j+1]=temp;
				}
			}
		}
		//遍历倒序数组arrPrint(也可以用foreach语句直接遍历数组)		
		System.out.print("\n倒序后为");
		for(int i = 0; i < arrPrint.length; i++){
			System.out.print(arrPrint[i]+" ");
		}
		//求平均值
		int sum = 0; 	
		for(int i=0; i < arr2.length; i++){
			sum += arr2[i];
		}
		double average = sum / arr2.length;
		System.out.println("\n其平均值为"+average);
		//求最大值及其索引位置
		int max = arr2[0];
		int index_Of_max = -1;
		for(int i = 1; i < arr2.length; i++){
			if(arr2[i] > max){
				max = arr2[i];
				index_Of_max = i;
			}
		}
		System.out.println("原数组最大值是处于索引位置为"+index_Of_max+"的"+max);
		//查找是否存在数字8
		int count_Of_8 = 0;
		for(int i = 0; i < arr2.length ; i++){
			if(arr2[i] == 8){
				count_Of_8++;
			}
		}
		System.out.println("原数组存在"+count_Of_8+"个8");
















	}else{
        	System.out.println("并未查询到此题号，请重新运行");
        }
	}

}