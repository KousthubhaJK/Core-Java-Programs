package task;
import java.util.TreeMap;  
class Collectiontreemap{  
 public static void main(String args[]){  
  TreeMap<Integer,String> tm=new TreeMap<Integer,String>();  
  tm.put(1,"kavya");
  tm.put(3,"meera");  
  tm.put(2,"vimal");  
  System.out.println("values before removal"+tm);
  tm.remove(2);
  tm.remove(1);
  System.out.println("values after removal"+tm);
 // for(Map.Entry m:hm.entrySet()){  
   //System.out.println(m.getKey()+" "+m.getValue()); for line by line view of values.
  }  
 }  

