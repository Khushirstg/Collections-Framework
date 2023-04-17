import java.util.LinkedHashSet;

public class linkedHashSetoperations {

public static void main(String args[]) {

		LinkedHashSet<String> ls=new LinkedHashSet<String>();
		 ls.add("Apple");
	     ls.add("Banana");
	     ls.add("Carrot");
	     ls.add("Papaya");
	     ls.add("Kiwi");
	     System.out.println(ls);
	     
	     int s=ls.size();
	     System.out.println("Size of LinkedHashSet is : "+s);	
	     
	      ls.remove("Banana");
	      System.out.println("After deleting value Banana the hashset will look like-");
	      System.out.println(ls);
	      
	      boolean g=ls.contains("Kiwi");
	      System.out.println("Set contains Kiwi :"+g);
	      
	      ls.clear();
	
	}

}


