package task;
import java.util.*;  
class Collectionset2 {  
 public static void main(String args[]){  
  Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
  
  ht.put(1,"kavya");  
  ht.put(2,"meera");  
  ht.put(3,"ajitha");  
  ht.put(4,"jayakumar");
  ht.put(5, "vimal");
  ht.put(6, "vimala"); 
  //for(Map.Entry m:ht.entrySet()){  
 //System.out.println(m.getKey()+" "+m.getValue()); //for getting values one by one.
  System.out.println("values before removal"+ht);
   ht.remove(1);
   System.out.println("values after removed"+ht);
  } 
}
 

