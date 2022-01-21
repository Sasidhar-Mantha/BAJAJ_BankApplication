package practise;

import java.util.*;

 class MyStudent implements Comparable<MyStudent>{
	private int id;
	private String name;
	private int fees;
	@Override
	public String toString() {
		return "Employee [ ID : "+this.getId()+" NAME : "+this.getName()+" FEES : "+this.getFees()+"]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public MyStudent(int id, String name, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public int compareTo(MyStudent stu) {
		// TODO Auto-generated method stub
		//return this.getName().compareTo(stu.getName());
		/*if(this.getId()>stu.getId()) {
			return 1;
		}else if(this.getId()<stu.getId()) {
			return -1;
		}else {
			return 0;
		}*/
		if(this.getFees()>stu.getFees()) {
			return 1;
		}else if(this.getFees()<stu.getFees()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
}
 
 public class Student {
		public static void main(String[] args) {
			List<MyStudent> lst =new ArrayList<MyStudent>();
			lst.add(new MyStudent(10,"Sasidhar",100000));
			lst.add(new MyStudent(25,"Aditya",25000));
			lst.add(new MyStudent(35,"Trinath",75000));
			lst.add(new MyStudent(65,"Ziyech",95000));
			lst.add(new MyStudent(30,"Messi",20000));
			Collections.sort(lst);
			for(MyStudent s:lst) {
				System.out.println(s);
			}
			
		}
		

	}