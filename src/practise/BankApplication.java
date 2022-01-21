package practise;
// Git Clone
import java.util.*;
class Employee{
	private String ename;
	private int id;
	Scanner sc=new Scanner(System.in);
	public void enter() {
		System.out.println("enter employee name :");
		ename =sc.next();
		System.out.println("enter employee id :");
		id=sc.nextInt();
	}
	public void display() {
		System.out.println("Name of the employee : "+ename);
		System.out.println("id of the employee : "+id);
	}
	public void update(int id,Employee employee[]) {
		int n1=getId(id,employee);
		System.out.println("Enter the updated name ");
		employee[n1].ename=sc.next();
		employee[n1].display();
		
	}
	public int getId(int id,Employee[] employee) {
		for(int i=0;i<employee.length;i++) {
			if(id==employee[i].id) {
				return i;
			}
		}
		return 0; 
	}
	public int getName(String name,Employee[] employee) {
		for(int i=0;i<(employee.length);i++) {
			if(name == employee[i].ename) {
				return i;
			}
		}
		return 0;
	}
	public void getDetails(String name,Employee employee[]) {
		int n=getName(name,employee);
		employee[n].display();
	}
	public void asc(Employee[] employee) {
		int n;
		for(int i=0;i<employee.length;i++) {
			n=i;
			
		}
	}
	
	
	
}
public class BankApplication{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employess you want to enter?");
		int n=sc.nextInt();
		Employee employee[]=new Employee[n];
		for(int i=0;i<n;i++) {
			employee[i]=new Employee();
			employee[i].enter();
		}
		
	int ch;
	System.out.println("SELECT YOUR CHOICE OF MODIFICATION");
	
	 System.out.println("Enter 1 for display");
	 System.out.println("Enter 2 for delete");
	 System.out.println("Enter 3 for update");
	 System.out.println("Enter 4 for Search by name");
	 System.out.println("Enter 5 for sort ASC");
	 System.out.println("Enter 6 for sort DESC");
	 System.out.println("Enter 7 for Exit");
	 ch=sc.nextInt();
	 switch(ch) {
	 case 1:
		 for(int i=0;i<employee.length;i++) {
			 employee[i].display();
		 }
		 break;
	 case 2:
		 int id2;
		 System.out.println("Enter the ID to be deleted");
		 id2 = sc.nextInt();
		 break;
	 case 3:
	 {
		 System.out.println("Enter the id you want to update ");
		 int num=sc.nextInt();
		 employee[num].update(num,employee);
		 break;
	 }
	 case 4:
	 {
		 System.out.println("Enter the name you want to search");
		 String name = sc.next();
		 int id;
		 id = employee[n-1].getName(name,employee);
		 System.out.println(id);
		 employee[id].display();
		 break;
	 }
	 case 5:{
		 //Employee.asc(employee);
		 break;
	 }
	 case 7:{
		 System.out.println("EXIT");
		 break;
	 }
		 
	 }	
	

}
}