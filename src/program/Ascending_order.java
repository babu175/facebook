package program;
//Ascending Order 
import java.util.Scanner;

public class Ascending_order {

	public static void main(String[] args) {
     int n,temp;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter no. of elements you want:");
     n=s.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the elements:");
     for(int i=0;i<n;i++) {
    	 a[i]=s.nextInt();
     }
     for(int i=0;i<n;i++) {
    	 for(int j=i+1;j<n;j++) {
    		 if(a[i]>a[j]) {
    			 temp=a[i];
    			 a[i]=a[j];
    			 a[j]=temp;
    		 }
    	 }
     }
     System.out.println("Ascending Order is :");
     for(int i=n-1; i>0; i--) {
    	 System.out.println(a[i]+",");
     }
     System.out.println(a[0]);
	}

}
