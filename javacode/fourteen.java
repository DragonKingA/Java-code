import java.util.Scanner;
public class fourteen{
	public static void main(String [] args){
        Scanner sc = new Scanner(System.in);




		int arr[] = {1,2,3,4,5,6};
		//Ҳ����ôд��int []arr = {1,2,3,4,5,6}; �������ʶ������������λ��д��
		//���ǽ����ڶ���ʱ��������д������������ʱֻ�� arr[����]
		System.out.println(arr.length);//����Ϊ6������6��Ԫ��
		for (int i = 0 ; i < arr.length ; i++){//��arr[����]ȡԪ��ʱ�Ǵ�0��ʼ��ţ����б��0~���5������Ԫ��
			//�� ����/��� = ���� - 1
			System.out.println(arr[i]);

		}
		//1.��һ�ֶ�̬���䣨��ʼ������ʽ�������ͷ���ͬʱ����
		double score1[] = new double[5];

        //2.�ڶ��ֶ�̬���䣨��ʼ������ʽ�����������ٷ����ڴ�ռ�
		double score2[];//�������飬��ʱscoreΪnull�ռ������score��������Ӧ�쳣
		score2 = new double[5];//Ϊ������������ڴ�ռ䣬ʹ����Դ������


        System.out.println(score2[0]);//����ʼ����δ��ֵ��������Ĭ��ֵ���˴�Ϊ 0.0
        /**Ĭ��ֵ���£�int 0, short 0, byte 0, long 0, float 0.0,double 0.0,char \u0000,
		boolean false,String null 
		*/


		//3.��̬���䣨��ʼ������ʽ������Ԫ�����ݼ�������֪��ϵͳ�Զ�������Ӧ�ڴ�
		int a0 = 6;
		//�ص㣺������Ԫ�ؿ��Է����������͵��Զ�ת����ʹ����Ԫ����������ͳһ
		double score3[] = new double[] {1,2,3,4,5,a0};
		//���д��double score3[] = {1,2,3,4,5,a0};

        
        //***���ص���⣩����� ��ֵ���ƣ�
        //��ͬ�ڻ����������͵ı����丳ֵ������ ֵ����(ֵ����)
        //����ĸ�ֵ�������ô��ݣ�����ֵ�� ��ַ(��ַ����)
        //jvm���ڴ������ɣ�ջ���ѣ�������
        //ջ������arr1ָ���ַ0x001010,��arr1��ַ��ֵ��arr2��
        //    arr2Ҳָ���ַ0x001010
        //�ѣ���ַ0x001010ռ�ж�һ���ڴ�ռ䣬ջ�����ݿ���ͨ��ָ��ͬһ����ַ
        //    ���� ����ͬһ���ڴ�ռ������ ����
        //��ˣ���ʱ����ͬһ��ַ��arr1��arr2,��������һ���в���������
        //��ͬһ�ڴ�ռ�����ݲ�������ʱarr1��arr2�����������ݽ���ȫ��ͬ��
        //�����еĲ���Ҳ����ͬ��Ӱ��arr1��arr2(ʵ�ʾ���ֻ��һ���ڴ�ռ����)
        int arr1[] = {1,2,3};
        int arr2[] = arr1;//*��ֵ��������ʱ�������߸�ֵ(��û���ֶ�����ռ�)
                          //��ʹ��arr2�������µ�ַָ��,����������Ŀռ伴arr1�Ŀռ�
                          //��ַ������ԭ��ַ(arr1ԭ��ַ)ָ����ڴ�ռ佫������,
                          //��Ϊ��ʱû���κα���ָ��ÿռ䣬����������
        arr2[0] = 10;
        System.out.print("arr1��Ԫ��Ϊ��");
        for(int i = 0; i<arr1.length;i++){
        	System.out.print(arr1[i]+" ");
        }//arr1[]��ʱΪ{10,2,3}�����ڵ�ַͳһ��arr2[]��ʱҲΪ{10,2,3}


        //*Ԫ�ؿ����������ڵ�ַ������ֻ�滻Ԫ�أ���
        //Ԫ�ؿ������ص��� �ֶ���������array_2����ռ䣬��ɽ�array_1��ָ��λ�õ�Ԫ���滻arr2��ָ��λ�õ�Ԫ��
        int array_1[] = {10,20,30};
        int array_2[] = new int[array_1.length];//�ֶ�����ռ䣬�迼�ǿ���Ԫ�ص��������к������
        for(int i = 0; i<array_1.length; i++){
            array_2[i]=array_1[i];//�˲���������Ԫ����ȫͳһ��
        //���ǣ�������Ԫ����ȫ��ͬ��ȴָ��ͬ�ĵ�ַ����ͬ���ڴ�ռ䣩
        }

        array_2[0] = 100;//�����޸�array_2������Ӱ��array_1

        System.out.print("array_1��Ԫ��Ϊ��");//{10,20,30}
        for(int i = 0; i<arr1.length;i++){
            System.out.print(array_1[i]+" ");
        }

        System.out.print("array_2��Ԫ��Ϊ��");//{10,20,30}
        for(int i = 0; i<arr1.length;i++){
            System.out.print(array_2[i]+" ");
        }

        System.out.println();
//exersize��===================================================================================
		// char array1[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		// for(int i = 0;i < array1.length;i++){
		// 	System.out.print(array1[i]);
		// } 
        char array1[] = new char[26];
        for(int i = 0;i < array1.length; i++){
        	array1[i] = (char)('A' + i);//�״�������ȷʹ��ǿת
        	System.out.print(array1[i]);
        }



        int array2[] = {1,-99,1000,-20,-9,110,223};//--->max = 1000
        //int array2[] = {100,-29,99,30,53};--->max = 100
        int max = array2[0] ;//�����׸�Ԫ��Ϊ��ʼֵ��ʹ����о������壬���ں����ж�
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

        // }//д��������!!!!!!!!!
        for(int i = 1; i < array2.length; i++){
        	if(max < array2[i]){
        		max = array2[i];
        		indexMax = i;
        	}
        }
        System.out.println("\n���ֵ������λ��Ϊ"+indexMax+"��"+max);//1000



        //��ת����Ԫ��
        int arr3[] = {11,22,33,44,55,66,77};
        int temp = -1;
        for(int i = 0 , j = arr3.length - 1 ; i < arr3.length / 2 ; i++ , j--){
            temp=arr3[j];
            arr3[j]=arr3[i];
            arr3[i]=temp;//��ż��Ԫ�ؾ���
        }
        System.out.println("arr3��Ԫ��Ϊ��");
        for(int i = 0; i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }




        int arr4[] = {11,22,33,44,55,66,77};
        int arrOpp[] = new int[arr4.length];
        for(int i = 0; i < arr4.length; i++){
            arrOpp[i]=arr4[arr4.length - 1 - i];
        }
        arr4 = arrOpp;//��ַ����
        System.out.println("arr4�ķ�ת��Ϊ��");
        for(int i = 0; i<arr4.length;i++){
            System.out.print(arr4[i]+" ");
        }




        int arr5[] = {1,2,3};
        int arrNew[]=new int[4];
        for(int i = 0 ; i < arr5.length;i++){
            arrNew[i]=arr5[i];
        }
        arrNew[arrNew.length - 1] = 4;
        arr5 = arrNew;//���õ�ַ������arr5ԭ�����ڴ�ռ�ᱻ����
        
        System.out.println("arr5Ϊ��");
        for(int i = 0; i<arr5.length;i++){
            System.out.print(arr5[i]+" ");
        }



        int arr6[] = {1,2,3,4,5,6,7,8,9,10};
        while(true){
            if(arr6.length == 1){
                System.out.println("\n�����ٽ���������");
                break;
            }
            System.out.println("\n�Ƿ����������y/n");
            char yes_or_no = sc.next().charAt(0);
            if(yes_or_no == 'y'){
                int arrtemp[] = new int[arr6.length - 1];
                for(int i = 0 ; i < arrtemp.length ; i++){
                    arrtemp[i]=arr6[i];
                }
                arr6 = arrtemp;

                System.out.println("arr6Ϊ��");
                for(int i = 0; i<arr6.length;i++){
                    System.out.print(arr6[i]+" ");
                }

            }else if(yes_or_no == 'n'){
                break;
            }else {
                System.out.println("�����������������");
                continue;
            }


        }





	}
}