package program;

import java.util.Scanner;

//calculate the area of a circle
public class Area_circle {

	public static void main(String[] args) {
		int radius;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		radius=in.nextInt();
		double Area=Math.PI *radius*radius;
		System.out.println("Area of the circle is "+Area);

	}

}
