public class work2{
	public static void main (String[] args){

     short s1 = 12;
     int i1 = s1 -9;//若直接  s  =  s - 9 则错误，因为右侧结果为int类型
     
     byte b1 = 10;
     int i2 = b1 + 11;//同上
     i2 = (byte)(b1+11);//整体强转，可以

     char c = 'a';
     int i3 = 16;
     float f = .314F;
     double result = c + i3 + f; //对

     byte b2 = 16;
     short s2 = 14;
     int r = s2+ b2;
     //而short r = s + b;是错的

	}
}