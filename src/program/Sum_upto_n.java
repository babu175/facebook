package program;

import java.util.Scanner;

//Sum upto n numbers
public class Sum_upto_n {

	public static void main(String[] args) {
int n;
int temp=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the value");
n=in.nextInt();
for(int i=0;i<=n;i++) {
	temp=temp+i;
}
System.out.println("The sum upto "+temp);
	}

}
