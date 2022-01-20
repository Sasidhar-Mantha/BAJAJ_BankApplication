package practise;
import java.util.*;
public class input_p {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	String s = sc.next();
	float float1 = sc.nextFloat();
	
	if (num%2 == 0) {
		System.out.println("Even");
	}else {
		System.out.println("Odd");
	}
}
}

