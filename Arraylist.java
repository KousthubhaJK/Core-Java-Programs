package task;
import java.util.*;
public class Arraylist {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("kavya");
	al.add("sheeba");
	al.removeAll(al);
	al.add("A");
   al.remove(0);
	al.add("B");
	al.add("C");
	al.add("D");
	System.out.println(al);
	   System.out.println(al.size());
	  }
}

