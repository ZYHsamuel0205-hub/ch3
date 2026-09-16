import java.util.Scanner;

public class Temperature {
	
	public static void main (String[] arg) {
		final double C_PER_F = 9.0 / 5.0;
	
		Scanner in = new Scanner (System. in);
		
		System.out.print ("Enter a temperature in Celsius: ");	
		double C = in.nextDouble(); 
		
		double celcius = C * C_PER_F + 32;
		System.out.print(celcius + " F");
	}
}
