package task;
import java.util.*;
class Employee1
{

int id;
int age;
int salary;
String name;
Employee1(int i,String n,int a,int s)
{
this.id=i;
this.name=n;
this.age=a;
this.salary=s;

}

}

public class Employeesalary {

	public static void main(String []args)
	{
	ArrayList<Employee1> k = new ArrayList<Employee1>();
	k.add(new Employee1(5,"javed",21,1000));
	k.add(new Employee1(2,"apporva",22,1500));
	k.add(new Employee1(4,"sumit",18,1200));
	k.add(new Employee1(3,"itika",25,5000));
	k.add(new Employee1(1,"latika",20,3000));
	//System.out.println(k.);

	Iterator<Employee1> i = k.iterator();
	int maxsalary=0;
	String name = null;
	if(i.hasNext())
	{
	Employee1 e=i.next();
	maxsalary=e.salary;
	}

	Iterator<Employee1> i1 = k.iterator();
	while(i1.hasNext())
	{

	Employee1 e1 = i1.next();
	if(maxsalary<=e1.salary)
	{
	maxsalary=e1.salary;
	name=e1.name;
	}

	}

	System.out.println("the person name is " + name + " who is having the max salary " + maxsalary);
	}




	}
	


