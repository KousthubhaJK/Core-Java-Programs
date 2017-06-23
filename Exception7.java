package task;
import java.util.*;
public class Exception7 {
public static void main(String[] args) {
	int a;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	try{
		a=s.nextInt();
		System.out.println("a:"+a);
	}
	catch(InputMismatchException ex)
	{
		System.out.println("Hello user you have an error"+ex);
	}
}
}
