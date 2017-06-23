package task;
import java.util.*;
public class Exception6 {
public void Hello()
{
System.out.println("welcome to hello method");
}
public static void main(String[] args)
{
	Exception6 e=new Exception6();
	e.Hello();
	try{
		e=null;
		e.Hello();
	}
	catch(NullPointerException ex)
	{
		System.out.println("null Pointer Exception occured"+ex);
	}
}
}

