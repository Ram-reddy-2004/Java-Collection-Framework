import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Vector;

class Iterable_Super_Interface{
	void implementation() {
		System.out.println("Iterable Interface Implementaion and Its methods ...");
		System.out.println();
		Iterable<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		list.forEach(num -> System.out.println(num +10)); // forEach();
		System.out.println(list);
		System.out.println(list.equals(Arrays.asList(1,2,3,4))); // equals()
		Iterator<Integer> it = list.iterator(); // iterator()
		while(it.hasNext()) { // hasnext()
			System.out.println(it.next()); // next()
			
		} 
		it.remove(); // remove()
		System.out.println(list);
		
	}
}

class Collection_Interface_Implemetation{
	void implementation() {
		// All methods() in Iterable Implementation + below all
		System.out.println("Collection Interface Implementaion and Its methods ...");
		System.out.println();
		
		Collection<Integer> list = new ArrayList<>(); // ArrayList implements Collection interface so it consists only Collection methods + Iterable methods
		list.add(1); // add element at end
		list.addAll(Arrays.asList(2,3,4,5)); // add list of elements at a time
		
		System.out.println(list.contains(5)); // whecks whether an element present or not
		System.out.println(list.containsAll(Arrays.asList(1,2,3,4))); // checks a list of elements are present in other list or not
		
		System.out.println(list.isEmpty()); // checks a list is empty or not
		
		list.remove(6); // removes element by index
		System.out.println(list);
		list.removeAll(Arrays.asList(1,2)); // removes list of elements
		System.out.println(list);
		list.removeIf(num -> num % 2 == 0); // removes elements with the satisfied condition
		System.out.println(list);
		
		list.retainAll(Arrays.asList(1,5)); // replaces list with elements present in both lists & other elements are removed
		System.out.println(list);
		
		System.out.println(list.size()); // sreturns size of the list
		
		list.stream().forEach(System.out::println); // converts a list in to stream which can be helpful for more methods like below
		int[] res = list.stream()
				.filter(num -> num % 2 ==1) // filters elements based on condition
				.mapToInt(Integer :: intValue) // stream to integers
				.toArray();// converts whole integers into array
		System.out.println(Arrays.toString(res)); // convert object to string method to display array as list of elements
		
	}
}
class List_interface_Implementation{
	void implementation() {
		System.out.println("List Interface Implementaion and Its methods ...");
		System.out.println();
		
		// All methods() in Collection Implementation + below all
		
		
		 List<String> list = new ArrayList<>(Arrays.asList("ram","raja","rani","rahim")); // ArrayList implemnts List so it consists only List methods+Collection Methods + Iterable methods
		 list.add(1,"Seetha"); // add at index
		 list.addFirst("Rakul"); //add first
		 list.addLast("Preethi"); // add last
		 list.addAll(2,Arrays.asList("suhi","veena"));
		 System.out.println(list);
		 
		 System.out.println("0Th element : "+list.get(0)); //get()
		 System.out.println("First element : "+list.getFirst());//getFirst()
		 System.out.println("Last Element : "+ list.getLast());// getLast()
		 
		 list.set(1, "NTR"); // update value at index 1 ith NTR
		 System.out.println(list);
		 
		 String removed_element = list.remove(2); // remove by index;
		 System.out.println("Removes the 2nd index element : "+removed_element);
		 list.remove("ram"); // remove by object
		 System.out.println("ram String is removed : " +list);
		 list.removeFirst(); // remove first object
		 System.out.println(list);
		 list.removeLast(); // removes last object
		 System.out.println(list);
		 
		 System.out.println(list.indexOf("rahim")); // get index value of object
		 System.out.println(list.indexOf(removed_element)); // value not presented returns -1
		 
		 list.sort(null); // sort lexiografic order overall list changes
		 System.out.println(list);
		 //list.sort(Comparator.reverseOrder()); // sort reverse lexiographic order
		 System.out.println(list);
		 
		 List<Integer> list0 = new ArrayList<>(Arrays.asList(10, 20, 30));
		 System.out.println(list0.reversed()); // returns reversed list
		 System.out.println(list0); // does not effect original list0
		 
		 List<Integer> list1 = new ArrayList<>(Arrays.asList(8,7,6,5,4,3,2,1,8));
		 System.out.println(list1.indexOf(3));
		 System.out.println(list1.lastIndexOf(8));
		 
		 list1.sort(null); // ascending order
		 System.out.println(list1);
		 list1.sort((a,b) -> b-a); // decending order works only for integers
		 System.out.println(list1);
		 System.out.println(list1.subList(0, 3)); // get sublist 0->2
		 list1.clear();
		 System.out.println(list1);
		 
		
		 		 
		 
	}
}
class ArrayList_Class_Implementation{
	void implementation() {
		
		System.out.println("ArrayList Class Implementaion and Its methods ...");
		System.out.println();
		// ArrayList is used for Fast look up and random access to element
		
		// All methods() in List Implementation + below all
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2));
		ArrayList<Integer> list1 = (ArrayList<Integer>)list.clone(); // copies elements from list to list1
		list1.add(10);
		System.out.println(list);
		System.out.println(list1);
	}
}
class LinkedList_Class_Implementation{
	void implementation() {
		System.out.println();
		System.out.println("LinkedList Class Implementaion and Its methods ...");
		System.out.println();
		// All methods() in List Implementation + below all
		// used of dequeue and linkedlist implementation
		// Fast and efficient insertions and deletions at middles,start,ends
		
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,7,8,9));
		list.offer(10); // adds element at last
		list.offerFirst(5); // adds element at first
		list.offerLast(6); // adds element at first
		System.out.println(list);
		int removed_first = list.poll(); // remove & returns first element
		System.out.println(removed_first);
		int removed_first1 = list.pollFirst(); //remove & returns first element
		System.out.println(removed_first1);
		int removed_last1 = list.pollLast(); //remove & returns last element
		System.out.println(removed_last1);
		System.out.println(list);
		System.out.println(list.peek()); // show top element in the queue which is first
		System.out.println(list.peekFirst());// show first element
		System.out.println(list.peekLast()); // show last element
		list.push(100); // add element at first
		System.out.println(list);
		System.out.println(list.pop()); // removes first element
		System.out.println(list);

		List<Integer> list2 = new LinkedList<>(Arrays.asList(1,2,3,4,5); // LinkedList implements List Interface so it has only List Interface methods only
		System.out.println(list2);
		
	}
}
class Vector_Class_Implementation{
	void implementation() {
		System.out.println();
		System.out.println("Vector Class Implementaion and Its methods ...");
		System.out.println();
		// All methods() in List Implementation + below all
		
		Vector <Integer> list = new Vector<>(Arrays.asList(1,2,3,4,5));
		list.addElement(10); // adds elements ad end
		
		Integer[] copyed_list = new Integer[list.size()];
		list.copyInto(copyed_list); // list elements are copied to  another array
		System.out.println(Arrays.toString(copyed_list));
		
		System.out.println(list.elementAt(0)); // returns element at given index
		list.insertElementAt(19, 2); // insert element at given index;
		System.out.println(list);
		
		System.out.println(list.firstElement()); // returns first element in a list
		System.out.println(list.lastElement()); // returns last element in a list
		
		list.removeElement(0); // removes element at given index
		System.out.println(list);
		list.removeElement(Integer.valueOf(4)); // remove element by value 
		System.out.println(list);
		
		
		Vector<Integer> list1 = new Vector<>(Arrays.asList(1,2,3,4,5));
		list1.removeAllElements(); // remove all elements from a list
		System.out.println(list1);
		
		
		list.setElementAt(100,1); // updated values with provided value  at given index 
		System.out.println(list);

		List<Integer> list2 = new Vector<>(Arrays.asList(1,2,3,4,5)); // Vector implements List interface and it has only list methods
		System.out.println(list2);
		
		
		
	}
}
class Stack_Class_Implementation{
	void implementation() {
		System.out.println();
		System.out.println("Stack Class Implementaion and Its methods ...");
		System.out.println();
		// All methods() in List Implementation + All methods() in Vector + below all
		Stack<Integer> list = new Stack<>();
		
		list.push(10); // adds elements at end
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);
		System.out.println(list);
		System.out.println("Remove last element : "+list.pop()); // remove and return element at end
		System.out.println(list);
		System.out.println(list.peek()); //top element in stack
		
		Vector<Integer> list2 = new Stack<>(); // Stack implements Vector only Vector Methods are there in the list2
		list2.add(10);
		list2.add(30);
		System.out.println(list2);
		
		List<Integer> list3 = new Stack<>(); // Stack implements List only List methods are available
		list.add(10);
		list.add(20);
		System.out.println(list3);
		
		
		
	}
}
public class List_Collections {

	public static void main(String[] args) {
		
		Iterable_Super_Interface isi = new Iterable_Super_Interface();
		isi.implementation();
		System.out.println();
		
		Collection_Interface_Implemetation cii = new Collection_Interface_Implemetation();
		cii.implementation();
		System.out.println();
		
		List_interface_Implementation lii = new List_interface_Implementation();
		lii.implementation();
		System.out.println();

		ArrayList_Class_Implementation aci = new ArrayList_Class_Implementation();
		aci.implementation();
		
		LinkedList_Class_Implementation lci = new LinkedList_Class_Implementation();
		lci.implementation();
		
		Vector_Class_Implementation vci = new Vector_Class_Implementation();
		vci.implementation();
		
		Stack_Class_Implementation sci = new Stack_Class_Implementation();
		sci.implementation();
		
	}

}

