package program;
//calculate Compound Interest
import java.util.Scanner;

public class Compound_interest {

	public static void main(String[] args) {
double Principal_Amount=0.0;
double Interest_rate=0.0;
double Time_Period=0.0;
double CompoundInterest=0.0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Principal Amount :");
Principal_Amount=sc.nextDouble();
System.out.println("Enter the Interest rate :");
Interest_rate=sc.nextDouble();
System.out.println("Enter the Time Period :");
Time_Period=sc.nextDouble();
CompoundInterest=Principal_Amount*Math.pow((1+Interest_rate/100),Time_Period);
System.out.println("");
System.out.println("Compound Interest :"+CompoundInterest);

	}

}
