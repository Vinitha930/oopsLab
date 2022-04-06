class Circle
{
	int radius;
	Circle(int x)
	{
		radius=x;
	}
 	void cal_area()
	{
		double area;
		area=3.14*radius*radius;
		System.out.println("\nThe area is:"+area);
	}

	public static void main(String args[])
	{
		Circle a1=new Circle(5);
		a1.cal_area();
	}
}




