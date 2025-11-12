import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.SortedMap;
import java.util.Hashtable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.TreeMap;


class Map_Interface_Implementation_using_Hashtable{
	void implementation() {
		Map<Integer,String> map = new Hashtable<>();
		String[] names = {"ram","raja","rani","roja","rahim","seetha","Geetha"};
		for(int i=0;i<names.length;i++) {
			map.put(i+1, names[i]); // store key value pairs
		}
		System.out.println(map);
		System.out.println();
		map.put(8,"Meena");
		Map <Integer,String> map1 = new HashMap<>();
		map1.put(9,"hari");
		map1.put(10,"kiran"); // add key value pairs
		map.putAll(map1); // add map1 key value pairs with another map
		map.putIfAbsent(1, "kamala"); // add key value pairs if absent in map
		System.out.println(map);
		System.out.println(map.get(2)); // get a value if key presents otherwise returns null
		System.out.println(map.getOrDefault(6, null));//get a value if key presents otherwise returns the user defined default value that u provided..
		System.out.println(map.getOrDefault(11, "Value not presented" ));
		
		map.compute(1, (k,v) -> v.toUpperCase()); // Update key or value with string methods if it is a string
		map.computeIfAbsent(11, k -> "Rai"); // If key is not present , key-value pair is created.. 
		map.computeIfPresent(1, (k,v) -> "Ramkumar"); // if key is present value changes 
		System.out.println(map);
		System.out.println();
		
		System.out.println(map.containsKey(10)); // checks whether key present map or not
		System.out.println(map.containsValue("Ram")); // checks whether value present or not
		
		System.out.println();
		for(Map.Entry<Integer, String> entry : map.entrySet()) { // entry set used to loop through key and value in a map
			System.out.println(entry.getKey() +" : "+entry.getValue()); //getKey() return key, getValue() returns Value
		}
		System.out.println(map.equals(map1)); // checks weather 2 maps are equal or not 
		System.out.println();
		
		map.forEach((k,v)-> System.out.println(k+"->"+v)); // to loop through key value pairs
		
		System.out.println();
		System.out.println(map.isEmpty()); // checks map is empty
		
		Collection<Integer> keys = map.keySet(); // returns collection keys of map
		for(int i : keys) System.out.println(i+"---> "+map.get(i));
		
		map.merge(3,"rani",(k,v) -> v+" Kumari"); // its is used for add or update key- value pairs
		
		System.out.println(map);
		
		map.remove(5); // removes key value pair by key
		map.remove(6,"seetha"); // removes key value pair by both key-value matched
		
		System.out.println(map);
		System.out.println();
		map.replace(1,"kumar"); // update values based on keys
		map.replace(3, "rani Kumari", "Rani"); // update old value to new value based on key
		map.replaceAll((k,v) -> v.toUpperCase());// update multiple values at a time 
		
		System.out.println(map);
		
		System.out.println(map.size()); // returns no of keys in a map
		System.out.println(map.values()); // returns Collection of values
		
		System.out.println(map1.size());// returns size of the map 
		
		map1.clear(); // clears all keys and values
		System.out.println(map1);
		
		
	}
}
class Hashtable_Class_Implementation{
	void implementation() {
		// Conists of all methods in Map Interface + below all..
		Hashtable<String,Integer> map2 = new Hashtable<>();
		map2.put("ram",21);
		map2.put("ranga", 20);
		map2.put("siva", 19);
		map2.put("sadik",21);
		Hashtable<String,Integer> map1 = (Hashtable<String,Integer>)map2.clone(); // makes a shallow copy of map and store it in map1
		System.out.println(map1);
		Hashtable<String,Integer> map3 = new Hashtable<>();
		map3.put("ram",21);
		map3.put("ranga", 20);
		
		System.out.println(map2.contains(map3)); // contains old method like equals
		System.out.println();
		Enumeration<String> ke = map2.keys(); // Returns enumeration of keys it is like iterator..
		while(ke.hasMoreElements()) { // checks it has more elements
			System.out.println(ke.nextElement()); // return next element
		}
	}
}
class HashMap_Class_Implementation{
	void implementation() {
		//Map Interface methods... Not synchronized faster than hash table
	Map<Integer,String> map = new HashMap<>();
	map.put(1,"ram");
	map.put(2, "kumar");
	map.put(3, "raja");
	System.out.println(map);
	HashMap<Integer,String> map1 = new HashMap<>();
	map1.put(1, "Raja");
	map1.put(2,"bhanu");
	map1.put(3,"rai");
	System.out.println(map1);
	HashMap<String,Integer> map2 = map1.newHashMap(5);// creates a new map with the inital capacity and it grows when capacity reaches 
	map2.put("ram",1);
	map2.put( "kumar",2);
	map2.put("raja",3);
	map2.put("suhi",4);
	map2.put("geetha",5);
	map2.put("bunny",6);
	System.out.println(map2);
	
	HashMap<Integer,ArrayList<String>> map3 = new HashMap<>(); // keys has to be unique and values can be unique or we can use objects
	map3.put(1, new ArrayList(Arrays.asList("radha","Yamini","Moni")));
	map3.put(2, new ArrayList(Arrays.asList("vasu","hema")));
	System.out.println(map3);
	}
	
}
class LinkedHashMap_Class_Implementation{
	void implementation() {
		// Consists of all methods in map interface + below all ... 
		LinkedHashMap<Integer,String> map = new LinkedHashMap();
		map.put(1,"Veena");
		map.put(2, "reeta");
		System.out.println(map);
		Map<Integer,String> map2 = (Map<Integer,String>)map.clone(); // LinkedList class implements Map Interface consists of Map method only
		System.out.println(map2);
		
		// LinkedList Class Methods...
		System.out.println(map.firstEntry()); // gives first pair
		System.out.println(map.lastEntry()); // gives last pair
		System.out.println(map.sequencedEntrySet()); // gives sequenced set of key value pairs 
		System.out.println(map.sequencedKeySet()); // gives sequenced set of keys
		System.out.println(map.sequencedValues()); // gives sequenced set of values
		map.pollFirstEntry(); // removes first entry pairs
		map.pollLastEntry();// removes last entry pairs
		System.out.println(map);
	}
}
class SortedMap_Interface_Implementation{
	void implementation() {
		// Conisits of all methods of Map interface + below all
		
		SortedMap<Integer,String> map = new TreeMap<>();
		map.put(1,"subbu");
		map.put(3, "kiran");
		map.put(2,"leo");
		map.put(0, "seetha");
		System.out.println(map);
		
		System.out.println(map.firstKey()); // returns first key of sorted map
		System.out.println(map.lastKey()); // return last key
		System.out.println(map.firstEntry()); // return first key value pairs
		System.out.println(map.lastEntry());// return last key value pairs
		
		map.putIfAbsent(4, "rana"); // add pair if key absent in map
		System.out.println(map); // 
		
		map.pollFirstEntry(); // remove first key value pair 
		map.pollLastEntry(); //remove last key value pair
		
		System.out.println(map.reversed()); // returns reversed map of key value pairs
		
		System.out.println(map.sequencedEntrySet()); // retuns sequence of key value pairs
		System.out.println(map.sequencedKeySet());// returns sequence of keys
		System.out.println(map.sequencedValues()); // returns sequence of values
		
		System.out.println(map.subMap(0, 3)); // returns sub map key value pairs in  given range if present
		
		map.put(4, "raju");
		System.out.println(map);
		System.out.println(map.headMap(2)); // reaturnd 0 to 1 key value pairs if present
		System.out.println(map.tailMap(2)); // retuns 2 to last key value pairs 
		
		SortedMap<Integer,String> map3 =new TreeMap<>(Collections.reverseOrder()); // sorts tree in descending order
		map3.put(1, "hari");
		map3.put(0,"geetha");
		map3.put(5, "Neena");
		System.out.println(map3);
	}
}
class TreeMap_Class_Implementation{
	void implementation() {
		// TreeMap class implements Map Interface it consists of map methods
		Map<Integer,Integer> map = new TreeMap<>();
		map.put(10,1);
		map.put(20, 1 );
		map.put(30,1);
		map.put(10,map.getOrDefault(10, 0)+1); // updates value if key already present other wise it craetes a new key value pair
		map.put(40, map.getOrDefault(40, 0)+1); // it is mostely used of counting related problems
		map.put(30, map.getOrDefault(30,0)+1);
		
		map.forEach((k,v) -> System.out.println(k + " -> "+v));	
		
		// It consists of all Map methods() + Sorted Map methods() + below all
		
		TreeMap<Integer,Character> map1 = new TreeMap<>();
		map1.put(1, 'A');
		map1.put(2, 'B');
		map1.put(3, 'C');
		map1.put(4, 'D');
		map1.put(5, 'E');
		System.out.println(map1);
		System.out.println(map1.ceilingEntry(3)); //returns key value pair if key is presented that key value pair is returned if key not present greater key value pair is returned 
		map1.ceilingKey(3); //return key , if key presents otherwise greater key is returned
		
		TreeMap<Integer,Character> map2 = (TreeMap<Integer,Character>)map1.clone();
		System.out.println(map2);
		
		System.out.println(map1.descendingKeySet());// returns keys in descending order
		System.out.println(map1.descendingMap()); //returns key value pairs in descending order
		
		System.out.println(map1.floorKey(3)); // returns key if present otherwise returns less than the floor key is returned
		TreeMap<Integer,Integer> map3 = new TreeMap<>(Comparator.reverseOrder());
		map.put(1, 10);
		map.put(5,50);
		map.put(3, 30);
		map.put(4, 40);
		System.out.println(map1.comparator()); // tells whether map sorted in ascending or descending order
		System.out.println(map3.comparator());
		
		System.out.println(map1);
		System.out.println(map1.higherEntry(3)); // returns one key value pair higher than given key value
		System.out.println(map1.lowerEntry(3)); // returns one key value pair lower than key given key
		System.out.println(map1.higherKey(3)); // returns one key higher than given key
		System.out.println(map1.lowerKey(3)); // returns one key lower than given key
		
		System.out.println(map1.navigableKeySet()); // returns keys of a map
		
		
	}
}

public class Map_Interface_Implementation {

	public static void main(String[] args) {
		Map_Interface_Implementation_using_Hashtable miiuh = new Map_Interface_Implementation_using_Hashtable();
		miiuh.implementation();
		System.out.println();
		
		Hashtable_Class_Implementation hci = new Hashtable_Class_Implementation();
		hci.implementation();
		System.out.println();
		
		HashMap_Class_Implementation hmci = new HashMap_Class_Implementation();
		hmci.implementation();
		System.out.println();
		
		LinkedHashMap_Class_Implementation lci = new LinkedHashMap_Class_Implementation();
		lci.implementation();
		System.out.println();
		
		SortedMap_Interface_Implementation sii = new SortedMap_Interface_Implementation();
		sii.implementation();
		System.out.println();
		
		TreeMap_Class_Implementation tci = new TreeMap_Class_Implementation();
		tci.implementation();
		System.out.println();
	}

}
