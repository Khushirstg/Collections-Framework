import java.util.*;

public class SublistArraylist {
	
	public static void main(String[] args) {
		
		 ArrayList<Integer> ar= new ArrayList<>();
		 
		 ar.add(40);
		 ar.add(50);
		 ar.add(60);
		 ar.add(70);
		 ar.add(80);
		 ar.add(90);
		
		 int k=400;
		 for(int i=0;i<ar.size();i++)
		 {
			 for(int j=i+1;j<ar.size();j++)
			 {
				 ArrayList<Integer> sublist = new ArrayList<>(ar.subList(i, j));
				 int s=0;
				 for(int value : sublist) {
					 s+=value;
					 
				 }
			 
				 if(s>k) {
					 System.out.println("Sublist " + sublist + " has a sum greater than " + k);
				 }
			 }
		 }
	}
}




