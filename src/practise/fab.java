package practise;
import java.util.Scanner;
public class fab {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x = ");
		int x = sc.nextInt();
		System.out.println("Enter y = ");
		int y = sc.nextInt();
		System.out.println("Enter z = ");
		int z = sc.nextInt();
		if (x>y) {
			if(x>z) {
				System.out.println("x is larger");
			}else {
				System.out.println("z is larger");
			}
		}else {
			if (y>z) {
				System.out.println("y is larger");
			}else {
				System.out.println("z is larger");
			}
		}
	// LEAP YEAR
		int year = 1996;
	    boolean leap = false;
	    if (year % 4 == 0) {
	      if (year % 100 == 0) {
	        if (year % 400 == 0) {
	          leap = true;
	        }
	        else {
	          leap = false;
	        }}
	        else {
	        leap = true;
	    }}
	    else {
	      leap = false;
	    }
	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");
	  
	
	}
	
}

