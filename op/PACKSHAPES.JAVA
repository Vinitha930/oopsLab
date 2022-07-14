import graphics.*;
public class graphicsimp 
{
public static void main(String[] args)
 {
circle c1=new circle(3);
System.out.println("Area of circle with radius 3");
c1.area();
rectangle r1=new rectangle(2,3);
System.out.println("Area of rectangle with length 2 and 
breadth 3");
r1.area();
triangle t1=new triangle(5,3);
System.out.println("Area of triangle with b=5 and 
heigth 3");
t1.area();
square s1=new square(5);
System.out.println("Area of square with side 5");
s1.area();
}
}



circle.java package graphics;
public class circle implements inter
{
int r;
public circle(int i)
{
r=i;
}
public void area()
{
System.out.println(3.14*r*r);
}
}


rectangle.java package graphics;
public class rectangle implements inter
{
int l,b;
public rectangle(int i,int j)
{
l=i;
b=j;
}
public void area()
{
System.out.println(l*b);
}
}


square.java package graphics;
public class square
 {
int a;
public square(int i)
{
a=i;
}
public void area()
{
System.out.println(a*a);
}
}
triangle.java package graphics;
public class triangle 
{
int b,h;
public triangle(int i,int j)
{
h=j;
b=i;
}
public void area()
{
System.out.println(0.5*b*h);
}
}

inter.java package graphics;
public interface inter 
{
void area();
}
