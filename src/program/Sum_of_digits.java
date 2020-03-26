package program;

import java.util.Scanner;

//find sum of digits
public class Sum_of_digits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the value to calculate its sum:");
		int input=in.nextInt();
		int sum=0;
		while(input!=0) {
			int lastdigit=input%10;
			sum=sum+lastdigit;
			input=input/10;
		}
System.out.println("sum of its digit is "+sum);
	}

}
