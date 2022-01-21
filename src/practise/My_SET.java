package practise;

import java.util.*;

public class My_SET {
	public static void main(String args[]) {
		Set<String> Stu_set =new TreeSet<String>();
		Stu_set.add("Sasidhar");
		Stu_set.add("Aditya");
		Stu_set.add("Trinath");
		Stu_set.add("Ziyech");
		Stu_set.add("Messi");
		Stu_set.forEach(
				(str)->System.out.println(str));
	}
}
