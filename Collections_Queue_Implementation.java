import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collection;
import java.util.Deque;
class Collection_Implements_Using_Priority_Class{
	void implementation() {
		// consists of all methods in Collection Interface
		//follows minheap tree
		//takes elements and stores elements level by level
		
		Collection<Integer> queue = new PriorityQueue<>();
		queue.add(10);
		queue.addAll(Arrays.asList(1,2,3,4,5));
		queue.add(15);
		System.out.println(queue);
        queue.remove(15);
        System.out.println(queue);
	}
}

class Queue_Interface_Implementation_Using_PriorityQueue{
	void implementation() {
		// Queue implementation using Prioty Queue Class
		// Consists all methods in Collection methods
		// follows maxheap tree construction of elements 
		// considers level by level as elements
		
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(10);
		queue.addAll(Arrays.asList(20,30,40,50,60,10));
		System.out.println(queue);
		queue.remove();//removes highest prioity elemnt and that is root element and makes it min heap tree
		System.out.println(queue);
	}
}

class Priority_Queue_Implementation{
	void implementation() {
		// PriorityQueue implementation ...
		// Consists all methods in Collection methods
		// follows maxheap tree construction of elements 
		// considers level by level as elements
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.addAll(Arrays.asList(5,10,15,20,25,30,35,40,1,3));
		System.out.println(queue);
		
	}
}
class Deque_Implementation_Using_ArrayDequeue{
	void implementation() {
		// ArrayDeque Class implenets Collection interface
		// conists of all collection methods
		//stores elements in inserted order
		
		Collection<Integer> queue = new ArrayDeque<>();
		queue.addAll(Arrays.asList(1,3,2,5,7,8));
		queue.add(1);
		queue.addAll(Arrays.asList(10,2));
		System.out.println(queue);
		
		Queue<Integer> queue1 = new ArrayDeque<>();
		queue1.addAll(Arrays.asList(1,3,4,5,6,0));
		System.out.println(queue1);
		System.out.println(queue1.element()); // returns first element from queue which is peek element amd throw an exception if queue is empty	 
		System.out.println(queue1.peek());// return top element of queue which is first element returns null if queue is empty
		System.out.println(queue1.poll()); // removes and returns  peek element or first elemnt in the queue
		System.out.println(queue1);
		
		Deque<Integer> queue2 = new ArrayDeque<>();
		queue2.addAll(Arrays.asList(1,2,3,4,5,6,7));
		queue2.addFirst(8); // adds element at first
		queue2.addLast(10); // adds element at last
		System.out.println(queue2);
		System.out.println(queue2.element()); // return first elemnt that is top element
		System.out.println(queue2.getFirst()); // return first element
		System.out.println(queue2.getLast());// return last element
		System.out.println();
		
		System.out.println("Stack Operations...in ArrayDeque");
		queue2.push(10); 
		queue2.push(15);// add element at first  
		System.out.println(queue2); 
		System.out.println(queue2.pop());// remove and returns first element
		System.out.println(queue2);
		System.out.println(queue2.peek()); // returns top element queue, first element 
		System.out.println(queue2.peekFirst()); // returns first element
		System.out.println(queue2.peekLast()); //returns last element
		System.out.println();
		
		System.out.println(queue2);
		
		System.out.println(queue2.reversed());
		
		System.out.println("Queue_Operations on Array Deque...");
		queue2.offer(10); // add element at end
		queue2.offerFirst(5); // add element at first
		queue2.offerLast(100); // add element last
		System.out.println(queue2);
		
		System.out.println(queue2.poll()); // remove and returns first element
		System.out.println(queue2.pollFirst()); // remove and returns first element
		System.out.println(queue2.pollLast());// remove and returns last element
		System.out.println(queue2);
		System.out.println();
		
		queue2.addAll(Arrays.asList(8,1,9,10,1,8));
		System.out.println(queue2);
		queue2.remove(); // removes first element of queue
		System.out.println(queue2);
		queue2.removeFirstOccurrence(1); // removes first occurance of element in two or more same values
		queue2.removeLastOccurrence(8); // removes last occurance of element in two or more same values
		queue2.removeFirst(); // remove first element 
		queue2.removeLast();// remove last element
		System.out.println(queue2);
		System.out.println();
		
		
	}
}
class ArrayDeque_Class_Implementation{
	void implementation() {
		// It consits of all methods in Deque methods() + Collection methods() + below All ..
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.addAll(Arrays.asList(1,3,4,5,6,7));
		System.out.println(queue);
		ArrayDeque<Integer> cloned_queue = (ArrayDeque<Integer>)queue.clone();
		System.out.println(cloned_queue);
		cloned_queue.add(10);
		System.out.println(cloned_queue);
		System.out.println(queue);
	}
}
class Deque_Implementation_Using_LinkedList{
	void implementation() {
		// Linkedlist implements Dequeue interface..
		// it consists of Collection methods() + Deque methods() 
		Deque<Integer> queue = new LinkedList<Integer>();
		queue.addAll(Arrays.asList(1,2,3,4,5,6));
		System.out.println(queue); 
		
		// Linkedlist implements Queue Interface...
		Queue<Integer> que = new LinkedList<>(Arrays.asList(1,2,3,4));
		System.out.println(que);
		
		
	}
}
public class Queue_Implementation {

	public static void main(String[] args) {
		System.out.println("Collection implementation using PriorityQueue class..");
		Collection_Implements_Using_Priority_Class ciupc = new Collection_Implements_Using_Priority_Class();
		ciupc.implementation();
		System.out.println();
		
		System.out.println("Queue Implemenatation using Priority Queue...");
		Queue_Interface_Implementation_Using_PriorityQueue qiiupq = new Queue_Interface_Implementation_Using_PriorityQueue();
		qiiupq.implementation();
		System.out.println();
		
		System.out.println("PriorityQueue Class Implementation ...");
		Priority_Queue_Implementation pqi=new Priority_Queue_Implementation();
		pqi.implementation();
		System.out.println();
		
		System.out.println("Deque Implementation using ArrayDeque...");
		Deque_Implementation_Using_ArrayDequeue diuad = new Deque_Implementation_Using_ArrayDequeue();
		diuad.implementation();
		System.out.println();
		
		System.out.println("ArrayDeque Class Implementation ...");
		ArrayDeque_Class_Implementation aci = new ArrayDeque_Class_Implementation();
		aci.implementation();
		System.out.println();
		
		System.out.println("Deque Implementation using LinkedList...");
		Deque_Implementation_Using_LinkedList diul  = new Deque_Implementation_Using_LinkedList();
		diul.implementation();
		System.out.println();
		
	}

}
