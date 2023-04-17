import java.util.*;

public class CompareArrayList {
	
	public static void main(String args[]) {
		
		 ArrayList<String> ar1 = new ArrayList<String>();
		 ArrayList<String> ar2=new ArrayList<String>();
		 
		 //adding elements in both arraylists
		  ar1.add("Banana");
		  ar1.add("Apple");  
		  ar1.add("Pears");  
		  ar1.add("Guava");  
		  ar1.add("Mango");  
		  
		  ar2.add("Banana");
		  ar2.add("Apple");  
		  ar2.add("Pears");  
		  ar2.add("Guava");  
		  ar2.add("Mango");  
		  
		  System.out.println(ar1);
		  System.out.println(ar2);
		  
		  boolean b=ar1.equals(ar2);
		  System.out.println( b);
		  ar2.add("Grapes");
		  boolean s=ar1.equals(ar2);
		  System.out.println(s);
		  
	}

}
