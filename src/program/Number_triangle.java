package program;

import java.util.Scanner;
//generate a number triangle
public class Number_triangle {

	public static void main(String[] args) {

Scanner in=new Scanner(System.in);
System.out.println("Enter num:");
int num=in.nextInt();
for(int i=1;i<=num;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(" "+i+" " );
	}
	System.out.print("\n");
}

	}

}
