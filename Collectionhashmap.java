package task;
import java.util.*;  
class Collectionhashmap{  
 public static void main(String args[]){  
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  hm.put(1,"kavya");
  hm.put(3,"meera");
  hm.put(2,"vimal");    
  System.out.println("values before removal"+hm);
  hm.remove(2);
  hm.remove(1);
  System.out.println("values after removal"+hm);
 // for(Map.Entry m:hm.entrySet()){  
   //System.out.println(m.getKey()+" "+m.getValue()); for line by line view of values.
  }  
 }  

