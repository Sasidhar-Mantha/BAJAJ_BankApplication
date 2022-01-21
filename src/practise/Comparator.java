package practise;
import java.util.*;
class MyComparator implements Comparable<MyStudent>{
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
	public MyComparator(int id, String name, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public int compareTo(MyStudent stu) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(stu.getName());
		/*if(this.getId()>stu.getId()) {
			return 1;
		}else if(this.getId()<stu.getId()) {
			return -1;
		}else {
			return 0;
		}*/
		/*if(this.getFees()>stu.getFees()) {
			return 1;
		}else if(this.getFees()<stu.getFees()) {
			return -1;
		}else {
			return 0;
		}*/
	}
	
	
}
 public class Comparator {
	 public static void main(String args[]) {
		 List<MyComparator> lst1 =new ArrayList<MyComparator>();
			lst1.add(new MyComparator(1,"Sas",100000));
			lst1.add(new MyComparator(2,"Adi",25000));
			lst1.add(new MyComparator(3,"Tri",75000));
			lst1.add(new MyComparator(4,"Ziy",95000));
			lst1.add(new MyComparator(5,"Mes",20000));
			Collections.sort(lst1,new SortByName());
			for(MyStudent s:lst1) {
				System.out.println(s);
			}
	 }
}
