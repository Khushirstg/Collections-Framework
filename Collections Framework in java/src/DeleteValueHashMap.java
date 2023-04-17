import java.util.*;

public class DeleteValueHashMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put( "Adrika",1);
		hm.put("Srishti",2);
		hm.put( "Stuti",3);
		hm.put("Drishti",4);
		hm.put("Riya",5);
	
		System.out.println(hm);
		
		System.out.println("Enter the value to remove");
		int v=sc.nextInt();
		String s=null;
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
		if(entry.getValue()==v)
		{
	    s=entry.getKey();
	    break;
		}
		}
		if(s!=null)
		{
			hm.remove(s);
		}
		System.out.println(hm);
		
	}

}
