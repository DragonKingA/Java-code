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

  //       System.out.println("arr0�����������Ϊ��");
  //       for(int i = 0; i<arr0.length;i++){
  //           System.out.print(maxTemp[i]+" ");
  //       }
//��⣡˼·����=========================================================================
		
//�ص���⣺ð������*���Ƚ���������Ԫ�أ������������򽻻���ʹ�ϴ�����������ƶ���
		int arr0[] = {24,69,80,57,13,1,2,-3,40,900,100};
	
		int temp = -1;
		int indexmax = -1;
		for(int j = 0 ;j < arr0.length - 1; j++){// ��(arr0.length - 1)������,
			for(int i = 0; i < arr0.length - 1 - j; i++){//ÿ������ɨ��һ���ϴ�ֵ
		    	if(arr0[i] > arr0[i + 1] ){					
					//*��Ҫ˼·�����ǰһ�������ں�һ�����ͻ���λ�ã��������Խ��ϴ�����ɨ�����				
					temp = arr0[i];			
					arr0[i] = arr0[i + 1];
					arr0[i + 1] = temp;
				}
				
			}
		
		}
	
        System.out.println("arr0�����������Ϊ��");
        for(int i = 0; i<arr0.length;i++){
            System.out.print(arr0[i]+" ");
        }


		System.out.println();


		//��ά����
		//��Ԫ�ؼ���һά����,�䳤�ȼ�һά����ĸ���
        int[][] arr1 = {{0 ,0 ,0 ,0 ,0 },{0 ,0 ,0 ,0 ,0 },{0 ,0 ,0 ,0 ,0 },{0 ,0 ,0 ,0 ,0 }};
        for(int i = 0;i <arr1.length;i++){
        	for(int j = 0; j<arr1[i].length;j++){//arr[i].length�൱�ڶ�ά����������λ��Ϊi��һά����(Ԫ��)
        		System.out.print(arr1[i][j]+" ");//��������λ��Ϊi��һά�����е�����λ��Ϊj��Ԫ��
        	}
        	System.out.println();
        }

//�������:============================================================================================
        int[] y0[];//��ά����һ����ֵ�������ʽ
        int[] x,y[];//�����������x��һά���飬y�Ƕ�ά���飡����������������
        //���Կ��� int[] x �� int[] y[] 
        // x = y //����int [][] --> int[] �޷�ִ��
        //int[] x,y[][];��ͬ���Ͼ�
        int[] x1[][],x2[][];
        //x1ά��Ϊ1+2=3ά��x2ά��Ϊ1+2=3ά
        y0 = new int[2][2];
        x  = new int[2];
        x1 = new int[2][2][2];
        x2 = new int[2][2][2];
        //�ܽ᣺int[] �������ʶ��[]����int��������ǰ����������ں����������飬����������ά����1


        //String[] str = new String[2]{"a"};//ͬʱʹ��ά���ʽ�ͳ�ʼ�����������ǷǷ���
        String[] str = new String[]{"a"};//��ȷ
//================================================================================================







     	int arr2[][] = new int[10][];
     	for(int i = 0 ;i<arr2.length;i++){
     		arr2[i] = new int[i+1];
     		for(int j = 0;j<arr2[i].length;j++){
     			arr2[i][j] = j+1;
     		}
     	}
     	//����:
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
//������ǣ�=============================================================================
     	//�߼�ʵ�֣�
     	System.out.print("������������ǲ���(<35):");
     	int lines;
     	lines = sc.nextInt();
     	if(lines > 0 && lines < 35){
	        int arrYangHui[][] = new int[lines][];//ѭ���ֱ𿪱ٿռ䣬��ʡ�ڴ�
	     	for(int n = 1; n <= lines ; n++){//10�У�n��
	     		arrYangHui[n-1] = new int[n];
	     		for(int m = 1; m <= n ;m++){//ÿ�е�һ��Ϊ1����n��Ϊ1
	     			arrYangHui[n-1][0] = arrYangHui[n-1][n-1] = 1;
	     			if(n >= 3 && m > 0 && m < n-1 ){
	     				arrYangHui[n-1][m] = arrYangHui[n-2][m-1] + arrYangHui[n-2][m];
	     			}
	     		}
	     	}	
	     	//������
	     	for(int i = 0; i <arrYangHui.length;i++){
	     		//�ȴ�ӡ�ո�
	     		for(int z = 1; z <= lines - 1 - i;z++){
     				System.out.print(" ");//��6��������ǿ�ʼ��״����
     			}

	     		for(int j = 0;j<arrYangHui[i].length;j++){
	     			System.out.print(arrYangHui[i][j]+" ");
	     		}
	     		System.out.println();
	     	}
     	}else{
     		System.out.print("�������������");
     	}
//=======================================================================================
     	














	}


}