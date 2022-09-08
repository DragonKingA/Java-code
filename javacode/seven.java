public class seven{
     static int x = 100;
     public static void main(String[] args ){
     	System.out.println(x);//100
     	//==============================================================
     	double x = 0.1;
     	System.out.println(x);//0.1，此时静态变量x被隐藏，取而代之是局部变量x
     	//==============================================================
     	int a0 = 12 % 10;//算术（Arithmetic）运算符(operator) % 的作用是取得余数（取模）
     	System.out.println("12除以10余"+ a0);//2
          System.out.println(10.0 / 4);//2.5
          //此处“10.0”默认为double型，故输出结果为double型，输出2.5
          System.out.println(10 / 4);//2
          //此处的“10/4”两个数都是int型故输出结果也为int型，其小数点后数字被抹掉
          System.out.println(10 % 3);//1
          System.out.println(10 - 10/3*3);//1
          System.out.println(10 % 3.2);//0.39999999999999947
          System.out.println(10 - (int)(10/3.2)*3.2);//0.3999999999999986,略有差别
          //日后可以探讨java取余的源码即真正原理，体会句17和句18的差异
          
          //==============================================================
          int i0 = 10;
          i0++;//自增 等价于 i0 = i0 + 1,此时i0输出11
          ++i0;//作为独立语句时完全同上即i0=i0+1，故输出12
          System.out.println("i0 = " + i0);

          /*******************************************************************
          当作为表达式使用时，                                                *
          前++ 即 ++i 先自增后赋值或进行逻辑判断                               *
          后++ 即 i++ 先赋值或进行逻辑判断后自增                               *
          上述自增均是对于变量i而言                                           *
          *******************************************************************/
          int i1 = 8;
          int i2 = i1++;//等价于 先i2 = i1后i1=i1 + 1 ==>i1=9,i2=8
          // int i2 = ++i1;//等价于 先i1=i1 + 1后i2 = i1 ==>i1=9,i2=9
          System.out.println("i1="+i1 +"\n"+"i2="+i2);
//Exercise(1)面试题： ============================================================
          int i3 = 1;
          i3=i3++;
          //*此处运算会使用临时变量temp（自拟），并将i3寄存于其中，此处运算顺序为：
          //*（1）temp=i3,将i3赋给temp，使得temp = 1 (2) i3自增即 i3 = i3 + 1，此时i3=2  
          //#（3）i3=temp 将temp赋回给i3,那么i3的值又变回1
          //关于运算：https://blog.csdn.net/qq_45402917/article/details/121040882?ops_request_misc=&request_id=&biz_id=102&utm_term=java%E8%BF%90%E7%AE%97%E4%B8%AD%E7%9A%84%E4%B8%B4%E6%97%B6%E5%8F%98%E9%87%8F&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduweb~default-1-121040882.142^v33^new_blog_pos_by_title,185^v2^control
          System.out.println("i3="+i3);

          int i4 = 1;
          i4=++i4;
          System.out.println("i4=" + i4);
          //(1)自增,i4=i4 + 1 (2)temp = i4 (3) i4 = temp
          //临时变量至少会存在于两个变量(可以是同一变量不同值量)交换值时产生

//Exercise(2):===================================================================
          int i5 = 10;
          int i6 = 20;
          int i7 = i5++;//  i7 = 10 , i5 = 11
          System.out.print("i7=" + i7 +"\t"+"i5="+i5+"\t");
          System.out.println("i6=" + i6 );
          i7 = --i6;//i6 = 19, i7 = 19
          System.out.print("i7=" + i7 + "\t");
          System.out.println("i6=" + i6);
//Exercise(2):===================================================================
          System.out.println("59天合"+(int)(59/7) +"个星期零" +59%7 +"天" );

          float f1,f2;
          f1 = 1234.6f;
          f2 = 5.0f/9*(f1 - 100.0f);
          //易错点： 5 / 9 是两个int数运算得到结果本是零点几但是由于为int类型，直接输出0
          //故会导致不论f1为何值，f2（float类型）都为0.0
          //因此要使5 或 9 其一变成float类型，当然都变也行
          System.out.println(f2);



//===============================================================================
          //比较运算符(Relational Operators)

          Object lzl = new seven();
          //其一，关键字为instanceof
          System.out.println(lzl instanceof seven);//true

          int a = 11;
          int b = 8;
          System.out.println(a>b);
          System.out.println(a<b);
          System.out.println(a==b);
          System.out.println(a>=b);
          System.out.println(a<=b);
          System.out.println(a!=b);
          //true,false,false,true,false,true

//===============================================================================
          //逻辑运算符（LogicOperator）

          int a1 = 4;
          int a2 = 9;
          int a3 = 9;
          
          //1.逻辑与“&&、&”，输出规则均为：全真为真，一假则假
          if (a1 > 10  && ++a2 < 50 ){
               //由于短路与“&&”当判断出左端表达式为false时，将不执行或判断后续表达式，
               //而是直接输出结果，从而节省计算机判断次数，提高判断效率
               //值得注意的是，不执行后续表达式会致使后续表达式中运算不具意义，
               //即后续表达式将不能改变变量值，除非左端表达式为true
               //=====> a1 = 4 , a2 = 9
               System.out.println("&&true\n" + "a1=" + a1 + "\ta2=" + a2);
          } else{
               System.out.println("&&false\n"+ "a1=" + a1 + "\ta2=" + a2);
          }
                    
                    if (a1 < 10  && ++a3 < 50 ){
               //此时左端表达式为true,故执行后续表达式,使得a3自增被执行
               //=====> a1 = 4 , a3 = 10
               System.out.println("当左端表达式为true时");
               System.out.println("&&true\n" + "a1=" + a1 + "\ta3=" + a3);
          } else{
               System.out.println("当左端表达式为true时");
               System.out.println("&&false\n"+ "a1=" + a1 + "\ta3=" + a3);
          }
               
               
          if (a1 > 10  & ++a2 < 50 ){
               //普通逻辑与“&”会将两端表达式均执行且判断，因此变量的改变不受影响
               //=====> a1 = 4 , a2 = 10
               System.out.println("&true\n" + "a1=" + a1 + "\ta2=" + a2);
          } else{
               System.out.println("&false\n"+ "a1=" + a1 + "\ta2=" + a2);
          }


          //2.逻辑或“||、|”，输出规则均为：全假为假，一真为真

          int age = 50;

          if(age > 20 || ++age < 30){
               //由于短路或“||”当判断出左端表达式为true时，将不执行或判断后续表达式
               //同样是为了节省计算次数，提高效率，并且后续运算不被执行
               //=====> age = 50
               System.out.println("||true\tage=" + age);
          }else{
               System.out.println("||false\tage=" + age);
          }
          
          if(age > 20 | ++age < 30){
               //普通逻辑或“|”会将两端表达式均执行且判断，因此变量的改变不受影响
               //=====> age = 51
               System.out.println("|true\tage=" + age);
          }else{
               System.out.println("|false\tage=" + age);
          }

          //3.逻辑非（取反）"!"   以及  逻辑异或"^"
          System.out.println(60 > 20);//true
          System.out.println(!(60>20));//取反,true变false,故输出false

          boolean bn1 = 0 > -9  ^  10 < 20 ;//两侧操作数的值均为true
          boolean bn2 = ( 9 < 6 ) ^ ( 0 > 10 );//两侧操作数的值均为false
          boolean bn3 = ( 10 > 8 ) ^ ( 9 < 8 );//一侧为true，一侧为false，即不同
          System.out.println("bn1=" + bn1 + "\tbn2=" + bn2 + "\tbn3=" + bn3);
          //逻辑异或下若两侧表达式结果不同，才会输出true，反之为false
          //即用于判断两侧表达式结果是否相同，异则true，同则false














     }


}