import java.util.*;

public class NumOfElementsHashset {
	
	public static void main(String args[]) {
		
	HashSet<String> hs = new HashSet<String>();
	
	hs.add("Agrima");
	hs.add("Ritika");
	hs.add("Abhay");
	hs.add("Sonal");
	hs.add("Priya");
	hs.add("Agrita");
	hs.add("Abhay"); 
	
	//duplicate item so size of hasset remains constant
	int i=hs.size();
	
	System.out.println(i);
	}

}
	
