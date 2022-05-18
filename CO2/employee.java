import java.util.*;
class Employeee
{
	int empid;
	String empname;
	Employeee(int id,String name)
	{
		empid=id;
		empname=name;
	}
	void display()
	{
	System.out.println("employee id"+empid);
	System.out.println("employee name"+empname);
	}
	public static void main(String[] args)
	{
		int id1;
		String name1;
		Employeee[] emp=new Employeee[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			id1=sc.nextInt();
			name1=sc.next();
			emp[i]=new Employeee(id1,name1);
		}
		System.out.println("employee details/n");
		for(int i=0;i<2;i++)
		{
			emp[i].display();
		}
	}
}
