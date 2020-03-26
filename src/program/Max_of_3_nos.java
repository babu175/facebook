package program;

import java.util.Scanner;
//print the maximum of 3 numbers
public class Max_of_3_nos {

	public static void main(String[] args) {
     int a,b,c;
     Scanner in = new Scanner(System.in);
     System.out.println("Enter value a:");
     a=in.nextInt();
     System.out.println("Enter value b:");
     b=in.nextInt();
     System.out.println("Enter value c:");
     c=in.nextInt();
     if(a>b && a>c ) {
    	 System.out.println("a is big number");
     }
    	 else if(b>a&&b>c) {
    		 System.out.println("b is big number");
    	 }
    	 else
    		 System.out.println("c is big number");
     }
	}

