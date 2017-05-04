//Constructor is a block of code that allows us to create an object of class.
//This can also be called creating an instance.
//Constructor looks like a method but it’s no.
//Methods can have any return type or no return type (as void) but constructors don’t have any return type not even void.

package task;

public class Constructor {
		int a, b, c;
		
		Constructor() {
			
			System.out.println("Constructor Example");
			
			a = 10;
			b = 20;
			c = a + b;
		}
		
		void display() {
			
			System.out.println(c);
		}
	
		
		public static void main(String args[]) {
			
			Constructor c = new Constructor();
			
			c.display();
		}
}