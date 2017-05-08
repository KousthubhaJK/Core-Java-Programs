package task;
class Ramesh{
	public static void eat(){
		System.out.println("Ramesh is eating");
	}
}
	class Suresh extends Ramesh{
		public static void eat(){
		System.out.println("Suresh is eating");
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Suresh s=new Suresh();
		s.eat();
	}
		
	}


	
