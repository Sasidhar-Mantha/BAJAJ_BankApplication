package practise;
import java.util.*;
interface EvenOdd {
	void check(int num);
}
interface Uppercase{
	void check(String s);
}

public class lamda {
	public static void main(String[] args) {
		EvenOdd evenOdd = (int num) -> {
			if(num>0) {
				System.out.println("Number "+num+" is Positive");
			}else if(num<0) {
				System.out.println("Number "+num+" is Negative");
			}
			if(num%2==0){
				System.out.println("Number "+num+" is even.");
			}else{
				System.out.println("Number "+num+" is odd.");
			}
		};
		Uppercase uppercase = (String s) ->{
			System.out.println(s+ " IN UPPER CASE IS "+s.toUpperCase());
			System.out.println("LENGTH OF STRING "+s+" IS "+s.length());
		};
		//Check numbers
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter a string ");
		String k = sc2.nextLine();
		evenOdd.check(n);
		uppercase.check(k);
		
	}
} 
