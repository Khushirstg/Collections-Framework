import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
              
        Integer lower = set.lower(35);
       
        System.out.println("Element strictly less than 35: " + lower); 
    }
}