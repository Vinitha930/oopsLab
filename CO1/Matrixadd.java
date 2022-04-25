import java.util.*;
class Matrixadd
{
 public static void main(String []args)
   {
     int a[][]=new int[10][10];
     int b[][]=new int[10][10];
     int c[][]=new int[10][10];
     int i,j,n,m;
Scanner s1=new Scanner(System.in);
   System.out.println("enter the number of rows");
    n=s1.nextInt();
System.out.println("enter the number of columns");
    m=s1.nextInt();

System.out.println("enter elemts 1 matrix ");
 for(i=0;i<n;i++)
   {
      for(j=0;j<m;j++)
       {
         a[i][j]=s1.nextInt();
       }
  }
System.out.println("enter elemts 2 matrix ");
for(i=0;i<n;i++)
   {
      for(j=0;j<m;j++)
       {
         b[i][j]=s1.nextInt();
       }
  }

for(i=0;i<n;i++)
   {
      for(j=0;j<m;j++)
       {
         c[i][j]=a[i][j]+b[i][j];
       }
  }
  System.out.println("the array is");
  


    for(i=0;i<n;i++)
   {
      for(j=0;j<m;j++)
       {
         System.out.print("\t"+c[i][j]);
       }
System.out.println("");
  }

}
}
     
     