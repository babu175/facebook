package program;
//generate 5 Random integer numbers 1 to 50 
public class Random_numbers {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println((int)(Math.random()*50));
		}

	}

}
