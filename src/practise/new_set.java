package practise;
import java.util.Scanner;
public class new_set {
	public static void main(String aregs[]) {
		float a = 10.0f;
		float b = 22.3f;
		int asc = 'a';
		System.out.println(a*b);
		System.out.println("Ascii value of a is "+ asc);
		float t;
		t = a;
		a = b;
		b = t;
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("Enter a character");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		switch(c) {
			case 'a':
				System.out.println("Vowel");
				break;
			case 'e':
				System.out.println("Vowel");
				break;
			case 'i':
				System.out.println("Vowel");
				break;
			case 'o':
				System.out.println("Vowel");
				break;
			case 'u':
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonant");
				break;
		}			
		int x = 12,y = 14,z = 10;
		
	}
}
