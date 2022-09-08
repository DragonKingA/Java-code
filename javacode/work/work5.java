public class work5{
	public static void main(String[] args){
		System.out.println(10/3);//3
		System.out.println(10/5);//2
		System.out.println(10%2);//0
		System.out.println(-10.5%3);//-1.5但实际是近似值

		int i = 66;
		System.out.println(++i+i);//67+67=134

		String s1 = "18.0";
		char c = 97;
		String s2 = c + "";
		double d = Double.parseDouble(s1);
		System.out.println(d);
		System.out.println(s2);
	}
}