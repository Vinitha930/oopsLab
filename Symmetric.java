import java.util.*;
class Symmetric
{
	public static void main(String[] args)
	{
		int a[][]=new int[10][10];
		int b[][]=new int[10][10],i,j,n,m;
		int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Entar the size of matrix");
		n=s.nextInt();
		m=s.nextInt();
		System.out.println("Enter the elements ");
		for(i=0;i<n;i++)
		    for(j=0;j<m;j++)
			a[i][j]=s.nextInt();
		for(i=0;i<m;i++)
		    for(j=0;j<n;j++)
			b[i][j]=a[j][i];
		for(i=0;i<n;i++)
		    for(j=0;j<m;j++)
		    {
			if(a[i][j]==b[i][j])
			   flag=1;
			else
			   flag=0;

		    }
		if(flag==0)
			 System.out.println("matrix is nonsymmetric");
		else
			 System.out.println("matrix is symmetric");
	}
}
			   
		
		