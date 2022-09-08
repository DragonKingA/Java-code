public class thirteen{
	public static void main (String[] args){
		int a;
		int sum = 0;
		int i = 1 ;
		A:for(int j = 1 ; j <= 999999; j++){
			B:for(; i <= 3;i++,sum++){
				a = (int)(Math.random()*100000)+1;//1~100000
				System.out.println(a);
				if(a == 97){
					
					if(i == 1){
						System.out.println("此时一次即成功输出97");
						System.out.println("共循环次数为"+sum);
						break A;
					}
					
					break B;
				}
			    


			}
            System.out.println(" ");
			i = 1;
		}

	}
}