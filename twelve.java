//Polymorphism - Inheritance concept
package one;
class sq{
	//super class sq
	public int s=5;
	protected void areaofsq()
	{
		int a =s*s;
		System.out.println("Area of square (Using the variables from the super class and printed in super class method = "+a);
	}
}
class rect extends sq
//sub-class rect
{
	private int b = 6;
	protected void areaofrect()
	{
		int ar = s*b;
		System.out.println("Area of rectangle = "+ar);
		
	}
}

public class twelve extends rect
{
	//sub class twelve inheriting another sub class rect
    private int length, breath;
    //The scope of this variable is limited to class twelve
	public static void main(String[] args) {
		//The sub class has a main method
		// TODO Auto-generated method stub
		twelve obj = new twelve();
		//defining an object obj
		obj.length = 10;
		obj.breath = 12;
		//assigning values to the sub-class variables
		int c = obj.length*obj.breath;
		//defining an integer c inside main method 
		//able to access the sub class variables using obj
		System.out.println("Area of rectangle (Calculated from main method and printed in main method) = "+c);
		obj.areaofsq();
		obj.areaofrect();

	}

}
