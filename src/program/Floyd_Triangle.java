package program;

import java.util.Scanner;
//print Floyd's triangle
public class Floyd_Triangle {

/**
 * @param args
 */
public static void main(String[] args) {
int n,num=1;
Scanner in= new Scanner(System.in);
System.out.println("Enter the rows for Floyd's triangle");
n=in.nextInt();
System.out.println("Floyd's triangle:");
for(int i=1; i<=n;i++) {
	for(int j=1; j<=i;j++) {
		System.out.print(num+" ");
		num++;
	}
	System.out.println();
}
	}

}
