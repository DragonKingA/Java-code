import java.util.Scanner;
public class twelve{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 5;
		for(int i = 0,j = 0 ; i < count + j && i != 5 ; i++ , j+=2){
			System.out.println("i="+i+"\t"+"j="+j);

		}//���Գ�ʼ��������������Թ涨���ѭ��������ֻ���������巵��һ������ֵ���ɣ���
		//�����ж��������������
	    int sum = 0;
	    int count0 = 0;
	    for(int i = 1; i <= 100; i++){
	    	if(i % 9 == 0){
	    		System.out.println("i="+i);
	    		sum = sum + i;
                count0++;
	    	}
	    }
        System.out.println("����Ϊ"+count0+"��\n"+"�ܺ�Ϊ"+sum);

        for(int i = 0,j = 5;i<=5 && j>=0;i++,j--){
        	System.out.println(i+"+"+j+"="+(i+j));
        }
        
        int i0 = 40;
        while (i0 <= 200){
        	if(i0 % 2 == 0){
        		System.out.println(i0);
        	}
        	i0++;
        }

        int i1 = 0;
        int sum1 = 0;
        do{
        	if(i1 % 5 == 0 && i1 % 3 != 0){
        		sum1++;
        	}
            i1++;
           
        }while(i1<=200);
        System.out.println(sum1);
        
        char choice;
        do{
        	System.out.println("ͬ���� ��/��");
            choice = sc.next().charAt(0);
        }while(choice != '��');//�����String���գ���Ҫ��equal�ж��ַ����Ƿ����




	}
}