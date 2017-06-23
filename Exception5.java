package task;
import java.util.*;
public class Exception5 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a,b,c,i;
	int x[]=new int[5];
	System.out.println("enter a value for a:");
	a=s.nextInt();
	System.out.println("enter a value for b:");
	b=s.nextInt();
	try{
		c=a/b;
		System.out.println("result:"+c);
		System.out.println(" enter array values");
		for(int j=0;j<x.length;j++)
		{
			System.out.println("enter a value for x["+j+"]:");
			x[j]=s.nextInt();
		}
		System.out.println("entr index number to display array value");
		i=s.nextInt();
		System.out.println("array value x["+i+"]="+x[i]);
	}
	catch(ArithmeticException e)
	{
		System.out.println("arithmetic Exception occured");
		System.out.println("hello user you have an error"+e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array Index Out Of Bounds Exception occured");
		System.out.println("hello user you have an error"+e);
	}
	catch(InputMismatchException e)
	{
		System.out.println("input array value is not in a correct format");
		System.out.println("hello user you have an error"+e);
	}
	System.out.println("welcome to java");
		
	}
}

