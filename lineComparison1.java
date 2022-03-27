package day3Problems;

import java.util.Scanner;

public class lineComparison1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1;
		double y1;
		
		double x2;
		double y2;
		
		double myDouble = 0;
		char myInt = (char) myDouble;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your value");
		x1=scan.nextDouble();
		y1=scan.nextDouble();
		x2=scan.nextDouble();
		y2=scan.nextDouble();
		
		System.out.println(myDouble); // Returns true because they are equal
		System.out.println( myInt);
       
		if(x1==x2 && y1==y2)
		{
			System.out.println("two lines are equal");
		}
		else
	{
		System.out.println("two lines are not equal");
		
		}
//		
	

	}

}
