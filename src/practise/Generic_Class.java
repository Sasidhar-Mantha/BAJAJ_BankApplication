package practise;

//Generic Class --pass data type as paramters to class
//wrapper classes
class Employees<T,V,Z>
{
//fixed int
private T id;
//fixed String
private V name;
private Z salary;

Employees(T id, V name,  Z salary)
{
	this.id=id;
	this.name=name;
	this.salary=salary;
}
}



public class Generic_Class {
	
	public static void main(String args[])
	{
                          //long        //long
     Employee<Long,String,Long> e2=new Employees(100,"Ansar",100);
  
     Employee<Double,String,Long> e3=new Employees(100.00,"Ansar",100);
     
     
     
	}

}
