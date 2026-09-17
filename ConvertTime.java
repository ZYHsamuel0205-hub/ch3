import java.util.Scanner;

public class ConvertTime {
	public static void main (String[] arg) {
	final int S_PER_H = 3600;
	final int S_PER_M = 60;
	
	Scanner in = new Scanner (System. in);
	
	System.out.print ("Enter total number of seconds: ");
	int secondsEntered = in.nextInt(); 

	int H = secondsEntered / S_PER_H;
	//seconds left after /hour
	int secondsLeft1 = secondsEntered % S_PER_H;
	int M = secondsLeft1 / S_PER_M;
	//seconds left after /min
	int S = secondsLeft1 % S_PER_M;
	
	System.out.print (H + " hours : " + M + " minutes : " + S + " seconds");
	}
}
