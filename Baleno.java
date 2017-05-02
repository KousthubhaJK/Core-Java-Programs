package task;
class Car1{
	public void color()
	{
		System.out.println("color is white");
	}
	public void windows()
	{
		System.out.println("normal windows");
	}
	public void seating()
	{
		System.out.println("4 seater");
	}
	 static class Baleno extends Car1
	{
		public void color()
		{
			System.out.println("red");
		}
		public void windows()
		{
			System.out.println("power windows");
		}
		public void seating()
		{
			System.out.println("6 seater");
		}
		public static void main(String[]args) {
			Baleno b=new Baleno();
			b.color();
			b.windows();
			b.seating();
		}
	}
}
