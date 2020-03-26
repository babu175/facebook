package program;

import java.util.Scanner;

public class Swappingnumwithout {

	public static void main(String[] args) {
int a,b;
Scanner sw = new Scanner(System.in);
System.out.println("number");
a=sw.nextInt();
b=sw.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("swapping number");
System.out.println(a);
System.out.println(b);

	}

}
