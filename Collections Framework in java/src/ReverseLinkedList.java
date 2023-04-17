import java.util.*;

public class ReverseLinkedList {
	public static void main(String[] args) {
	
	LinkedList<String> linkedList = new LinkedList<String>();
	System.out.println("The original linked list:-");
	
	linkedList.add("Bob");
	linkedList.add("Akriti");
	linkedList.add("Abhishek");
	linkedList.add("Kriti");
	linkedList.add("Ritika");
	System.out.println(linkedList);
	
	System.out.println("The reversed linked list:-");
	ListIterator<String> iterator=linkedList.listIterator(linkedList.size());
	
	while(iterator.hasPrevious()) {
		String element = iterator.previous();
		System.out.print(" "+element);
	}
	
	
	
	}
	
}
