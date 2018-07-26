/*
Random Class
random is to create random numbers

*/
import java.util.Random;

public class RandomDemo{
	public static void main(String[] args){
		Random rnd= new Random();
		// to generate a new random number
		//int r_i=rnd.nextInt(101); // range is between 0 and the provided value (exclude the last)
		//System.out.println(r_i);
		// to generate a new random double
		double r_d=rnd.nextDouble(); // range is between 0 and the provided value (exclude the last)
		System.out.println(r_d);
		
	}
}