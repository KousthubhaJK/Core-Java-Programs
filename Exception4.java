package task;
import java.util.Scanner;

public class Exception4 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a:");
		a=s.nextInt();
		System.out.println("enter b:");
		b=s.nextInt();
		try{
		c=a/b;
		System.out.println("result:"+c);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("welcome to java");
		}
	}

}
