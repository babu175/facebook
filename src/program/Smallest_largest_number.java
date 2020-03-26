package program;

public class Smallest_largest_number {

	public static void main(String[] args) {
int numArray[]=new int[] {50,60,70,80};
int smallNo=numArray[0];
int largeNo=numArray[0];
for(int i=1;i<numArray.length;i++) {
	/*if(numArray[i]>largeNo)
		largeNo=numArray[i];
	else if(numArray[i]<smallNo)
		smallNo=numArray[i];*/
}
System.out.println("Largest number "+largeNo);
System.out.println("Smallest number "+smallNo);
int maximunNumber=numArray[numArray.length-1];
System.out.println("maximunNumber is "+maximunNumber);
int SecondNumber=numArray[numArray.length-2];
System.out.println("SecondNumber is "+SecondNumber);
int ThirdNumber=numArray[numArray.length-3];
System.out.println("ThirdNumber is "+ThirdNumber);


	}
	

}
