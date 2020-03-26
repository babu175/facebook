package program;

import java.util.Scanner;
//find given Factorial of given number
public class Factoricalnumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int input=sc.nextInt();
         int   result=1;
         while(input>0) {
        	 result =result*input;
        	 input--;
          }      
         System.out.println("factorial of the given no is "+result);
	}

}
