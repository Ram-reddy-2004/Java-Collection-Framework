import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Collections;

class Collection_Intrface_Implementation_Using_HashSet{
	public void implementation() {
		Collection<Integer> set = new HashSet<>(); // HashSet implements Collection methods so it conisists onlyu collection methods
		set.addAll(Arrays.asList(1,3,4,5,5,6,7));
		System.out.println(set);
		
		set.remove(5); // removes by object or by value
		System.out.println(set);
	}
}
class Set_Interface_Implementation{
	void implementation() {
		// all Collection methods are included 
		
		/*
		 * Set is Collection of Unordered  and Unique elements
		 * It does allow duplicate values
		 * It doesn't have indexes because of unordered in nature
		 * */
		
		Set<Integer> set = new HashSet<>(); // HashSet implemets Set interface
		set.addAll(Arrays.asList(9,7,6,5,4,3,2));
		set.add(10);
		System.out.println(set);
		
	}
}
class HashSet_Class_Implementation{
	void implementation() {
		// HashSet cosists of Collection methods + Set methods + below all
		
		// Stores Unordered,unique elements
		
		HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,2,1,0,100,10));
		HashSet<Integer> set1 = (HashSet<Integer>)set.clone();
		System.out.println(set1);
		
	}
}
class LinkedHashSet_Class_Implementation{
	void implementation() {
		// LinkedHashSet is used or ordered collection of elements
		// its stores values as in inserted Order
		// Even though it is ordered collection of elements it does not have indexed operartions
		// It consists of all Collection methods + Set Methods
		
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(Arrays.asList(1,2,3,4,5,0));
		System.out.println(set);
		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		set1.addAll(set);
		System.out.println(set1);
	}
}
class SortedSet_Interface_Implementation{
	void implementation() {
		
		//Sortedset set ensures that inserted elements are in stored in a sorted way 
		//it consists of Collection methods + Set Methods + below methods
		// it uses red black tree implemnation behind the scenes for sorting
		// takes O(log n) time complexity for operations
		
		SortedSet<Integer> set = new TreeSet<>(); // TreeSet Class implements SortedSet Interface
		set.addAll(Arrays.asList(2,5,3,7,5,1,0));
		System.out.println(set);
		
		System.out.println(set.first()); // returns first element in sorted set
		System.out.println(set.last()); // returns last element in sorted set
		
		System.out.println(set.subSet(0, 5)); // return elements present between first element and last element
		
		SortedSet<Integer> set1 = new TreeSet<>(Collections.reverseOrder()); // sort in reverse Order 
		set1.addAll(Arrays.asList(1,5,32,2,7,0));
		System.out.println(set1);
		
		set.removeFirst();// removes first element from set
		System.out.println(set);
		set.removeLast(); // removes last elemnt ffrom set
		System.out.println(set);
		set.removeIf((num) -> num % 2 == 0); // removes by condition
		System.out.println(set);
		System.out.println(set.reversed()); // returns reversed set elements without changing set elements
		
		
	}
}
class TreeSet_Class_Implementation{
	void implementation() {
		// consists of Collection methods + Set methods +  sortedset methods + below all
		
		TreeSet<Integer> set = new TreeSet<>();
		set.addAll(Arrays.asList(1,3,4,5,8,6,7,0,10));
		System.out.println(set);
		
		System.out.println(set.descendingSet()); // to print descending set of elements not changes actual set
		
		System.out.println(set);
		System.out.println(set.ceiling(9)); // returns nearer value of given value compares with set values gives >= values if not present returns null
		System.out.println(set.floor(9)); // returns nearer value <= given value comapred with  sored set values 
		
		System.out.println(set.higher(10)); // return higher than that given value if present if not return null
		System.out.println(set.lower(6)); // returns lower than that given value if present else return null
		
		System.out.println(set.headSet(5)); // returns set of elements below given value present in the set
		System.out.println(set.tailSet(6)); // return set of elements <= given value present in set of elements 
		
		set.pollFirst();// removes first element
		System.out.println(set); 
		set.pollLast();
		System.out.println(set);// removes last element
		
		
		
	}
}
public class Set_Implementation {

	public static void main(String[] args) {
		System.out.println("Collection Interface Implementations with HashSet ");
		System.out.println();
		Collection_Intrface_Implementation_Using_HashSet ciiuhs = new Collection_Intrface_Implementation_Using_HashSet();
		ciiuhs.implementation();
		System.out.println();
		
		System.out.println("Set Interface Implementation  with HashSet");
		System.out.println();
		Set_Interface_Implementation sii = new Set_Interface_Implementation();
		sii.implementation();
		System.out.println();
		
		System.out.println("Hashset Class Implemnation...");
		System.out.println();
		HashSet_Class_Implementation hi = new HashSet_Class_Implementation();
		hi.implementation();
		System.out.println();
		
		System.out.println("LinkedHashSet Class Implemenatation...");
		System.out.println();
		LinkedHashSet_Class_Implementation li = new LinkedHashSet_Class_Implementation();
		li.implementation();
		System.out.println();
		
		System.out.println("SortedSet Interface implementation with Tree Set Class  ");
		System.out.println();
		SortedSet_Interface_Implementation ssii= new SortedSet_Interface_Implementation();
		ssii.implementation();
		System.out.println();
		
		System.out.println("TreeSet Class Implementation...");
		System.out.println();
		TreeSet_Class_Implementation tci = new TreeSet_Class_Implementation();
		tci.implementation();

	}

}
