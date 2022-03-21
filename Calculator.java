import java.util.*;
class Calculator
  {
    public static void main(String[] args)
      {
        int a,b,c;
        String ch;
        Scanner s1=new Scanner(System.in);
        System.out.println("enter 2 nos");
        a=s1.nextInt();
        b=s1.nextInt();
        System.out.println("enter ur choice");
        ch=s1.nextLine();
        System.out.println("\n + Addition \n - substraction\n* multiplication\n/ division");
         ch=s1.nextLine();
switch(ch)
  {
case "+": c=a+b;
  System.out.println("sum is " +c);
   break;
case "-" : c=a-b;
  System.out.println("sub is " +c);
   break;
case "*":c=a*b;
  System.out.println("mul is " +c);
   break;
case "/" :c=a/b;
  System.out.println("div  is " +c);
   break;
default:  System.out.println("invalid");
break;

  }
 }
}
 