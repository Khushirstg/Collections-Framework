import java.util.*;

public class CompareHashSet {
    public static void main(String[] args) {
  
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
     
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        
        
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        
        boolean result = set2.containsAll(set1);
        
        if(result) {
            System.out.println("All elements of set1 are present in set2");
        } else {
            System.out.println("All elements of set1 are not present in set2");
        }
    }
}