package practise;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

//Collection--collection is collection of class which help to create ,update , delete ,sort, insert 
//many type of data , int , string , long, object 

//Collections
class Employees 
{
	@Override
	public String toString() {
		System.out.println("Employees [rollno=" + rollno + ", name=" + name + "]");
		return null;
	}
	public Employees(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	
	int rollno;
	String name;
}

public class My_Collections {
	
	public static void main(String args[])
	{
		//Parent //giving the reference of child class of implemeations
		//Array --add , delete , append , create
		//creating the arraylist
		List<Employees> ls=new ArrayList<Employees>();
		
		//add
		
		
		ls.add(new Employees(100,"Ansar"));
		ls.add(new Employees(200,"Mahesh"));
		ls.add(new Employees(201,"Kamreah"));
		ls.add(new Employees(1001,"priya"));
		
		//ls.
		//ls.pe
		
		//ls.add(1);
		
		//ls.add(10.2f);
		
		//display
	//	System.out.println(ls);
		
		//ls.remove(0);
		//  ls.remove("A");
		  
		 // 
			/*
			 * if(ls.contains("Ansar")) { System.out.println("Found"); }
			 */
		//  System.out.println(ls.get(1));
		//  ls.isEmpty();
		 // ls.clear();
		  //ls.size();
		
		//Collections.sort(ls);
		
		//System.out.println(ls);
		for(Employees str:ls)
		{
			//str.toString();
			System.out.println(str.toString());
		}
		//System.out.println(ls.size());
		//ls.
		
	}

}
