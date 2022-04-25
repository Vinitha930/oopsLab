import java.util.*;
class Symmetric
 {
   public static void main(String[] args)
    {
          int a[][]=new int[10][10];
          int b[][]=new int[10][10];
          int i,j,n,m,flag=0;
Scanner s1=new Scanner(System.in);
 System.out.println("enter the no of rows");
 n=s1.nextInt();
System.out.println("enter the no of columns");
 m=s1.nextInt();
System.out.println("enter the elements");
 for(i=0;i<n;i++)
   for(j=0;j<m;j++)
      {
         a[i][j]=s1.nextInt();
      }

 for(i=0;i<m;i++)
   for(j=0;j<n;j++)
      {
         b[i][j]=a[j][i];
      }
for(i=0;i<n;i++)
   for(j=0;j<m;j++)
      {

         if(a[i][j]==b[i][j])
             flag=1;
         else
            flag=0;
     }
if(flag==1)
System.out.println("symmetric");
else

System.out.println("not symmetric");

}

}