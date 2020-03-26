package program;

import java.util.Scanner;
//reverse the given number
public class Reversenumber {
public static void main(String[] args) {
int remainder;
int result=0;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number");
int num = in.nextInt();
while(num>0) {
	remainder=num%10;
	result=result*10+remainder;
	num=num/10;
}
System.out.println("reverse number :"+result);

	}

}
