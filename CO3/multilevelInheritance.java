import java.util.*;
class Employeeco3
{
int empid;
String name;
double salary;
String address;
Employeeco3()
{
Scanner sc2=new Scanner(System.in);
System.out.println("enter employee   id:");
empid= sc2.nextInt();

System.out.println("enter employee  name:");
name= sc2.next();

System.out.println("enter employee  salary:");
salary= sc2.nextDouble();

System.out.println("enter employee  address:");
address= sc2.next();
}
}
class Teacher extends Employeeco3
{
String department;
String subject;
Teacher()
{
Scanner sc3=new Scanner(System.in);
System.out.println("enter  department:");
department= sc3.next();

System.out.println("enter  subject:");
subject= sc3.next();
}
void display()
{
System.out.println("................................");
System.out.println("id:" +empid);
System.out.println("NAME :" +name);
System.out.println("SALARY :" +salary);
System.out.println("ADDRESS :" +address);
System.out.println("DEPARTMENT:" +department);
System.out.println("SUBJECT :" +subject);
System.out.println("...............................");
}

}
class multilevelInheritance
{
public static void main(String args[])
{
int n;
Scanner sc1=new Scanner(System.in);
System.out.println("enter number of employees:");
n=sc1.nextInt();
Teacher t[]= new Teacher[n];
for(int i=0;i<n;i++)
{
t[i]=new Teacher();
