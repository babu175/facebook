package program;

import java.util.Scanner;

//print Average and Sum of given two numbers
public class Avg_sum {

	public static void main(String[] args) {
		int a,b, sum;
		float avg;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		a=input.nextInt();
		System.out.println("Enter second number");
		b=input.nextInt();
		sum=a+b;
		avg=(a+b)/2;
		System.out.println("sum"+sum+"\navg"+avg);
		

	}

}
