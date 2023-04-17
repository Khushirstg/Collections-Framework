import java.util.*;
public class SumOfValueHashmap {
	
	public static void main(String args[]) {
	
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	
	hm.put("A", 109);
	hm.put("B", 265);
	hm.put("C", 370);
	hm.put("D", 408);
	hm.put("E", 519);
	
	int s=0;
	for(int value : hm.values())
	{
		s+=value;
	}
System.out.println("Sum of values in hashmap is: "+s);
	}
	
}
