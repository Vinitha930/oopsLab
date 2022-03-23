import java.util.*;
class Complex
  {
   public static void main(String [] args)
    {
      int a,b,c,d,e,f;
      Scanner s1=new Scanner(System.in);
 System.out.println("enter real part of first number");
  a=s1.nextInt();
 System.out.println("enter img part of first number");
  b=s1.nextInt();
 System.out.println("enter real part of second number");
  c=s1.nextInt();
 System.out.println("enter img part of second number");
  d=s1.nextInt();
 System.out.println("the sum is");
  e=a+c;
  f=b+d;
System.out.println(e+"+"+f+"i");
}
}