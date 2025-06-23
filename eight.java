package one;

public class eight {
	
	public double square(double side)
	//Argument with return type
	{
	  double area = side*side;
	  return area;
      //Returning a value
	}
	public void rectangle(int length, int breath)
	//Argument with No return type
	{
		int area01 = length*breath;
		System.out.print("Area of rectangle =");
		System.out.println(area01);
	}
	public double circle()
	//No argument with return type
	{
		int radius=600;
		return 22/7*radius*radius;
	}
	public void triangle()
	//No return type No Argument
	{
		double base= 10.0, height = 8.0;
		double areaofT = 0.5*base*height;
		System.out.print("Area of triangle = ");
		System.out.println(areaofT);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sqside = 10.1; // side of a square
		int length, breath; //length and breath of a rectangle
		eight obj1=new eight();
		eight obj2=new eight();
		eight obj3=new eight();
		eight obj4=new eight();
		//Defining an Object for the class eight
		double areaofsq= obj1.square(sqside);
		//Saving the return type value under datatype double
		System.out.print("Area of square = ");
		System.out.println(areaofsq);
		length = 10; breath =9;
		obj2.rectangle(length, breath);
		double areaofcircle = obj3.circle();
		//Saving the return type value under datatype double
		System.out.print("Area of circle = ");
		System.out.println(areaofcircle);
		obj4.triangle();
	

	}

}
