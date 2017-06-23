package task;
import java.util.*;
public class Exception8 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		a=s.nextInt();
		System.out.println("enter b value");
		b=s.nextInt();
		try{
			if(b==0)
			{
				return;
			}
			else{
				c=a/b;
				System.out.println("c="+c);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occured"+e);
		}
		finally
		{
			System.out.println("finally block executed");
			
		}
		System.out.println("this statement is from main block");
	}

}
