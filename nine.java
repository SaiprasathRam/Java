package one;

public class nine {
	public void sqarea()
	//Area of a square calculated with no return type no argument
	{
		double side = 10;
		double area = side*side;
		System.out.print("Area of square calculated with no return type no argument = ");
		System.out.println(area);
	}
	public void sqarea1(int side1)
	//Area of square calculated with argument and no return type
	{
		int area1=side1*side1;
		System.out.print("Area of square calculated with argument and no return type = ");
		System.out.println(area1);
	}
	public float sqarea2()
	//Area of square calculated with argument and no return type
	{
		float side2 = 4.522f;
		float area2 = side2*side2;
		System.out.print("Area of square calculated with argument and no return type = ");
		return area2;
	}
	public double square3(double side5)
	//Area of square calculated with argument and a return typ
	{
		double area3 = side5*side5;
		System.out.print("Area of square calculated with argument and a return type = ");
		return area3;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nine obj1 = new nine();
		//Object defined
		int sqside = 5;
		double s=2.89999;
		obj1.sqarea();
		obj1.sqarea1(sqside);
		System.out.println(obj1.sqarea2());
		System.out.println(obj1.square3(s));
		//Functions invoked with objects
			
	}

}
