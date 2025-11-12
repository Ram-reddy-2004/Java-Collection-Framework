# Java Collection Framework 

<img width="1427" height="833" alt="image" src="https://github.com/user-attachments/assets/1279d9bb-765e-4299-aa58-bfb556957bf7" />

## Overview

This repository demonstrates the core concepts and practical usage of the major **Java Collection Framework interfaces and classes**. It covers:
- `Iterable` Interface
- `Collection` Interface
- `List` Interface
- `ArrayList` Class
- `LinkedList` Class
- `Vector` Class
- `Stack` Class

**Each concept is explained with easy-to-understand examples and method calls, making it perfect for beginners, interview prep, or revision.**

---

## File Structure

- **Collections.java:** Main code file containing all examples for interfaces/classes.
- Each concept is implemented in its own class for separation and clarity.

---

## Concepts & Code Structure

### 1. Iterable Interface

- **Class:** `Iterable_Super_Interface`
- **Key Methods:**
  - `forEach()`: Performing actions on each element.
  - `iterator()`, `hasNext()`, `next()`, `remove()`: Iterating manually.

**Highlights:**  
Shows basic iteration, streaming, and element access methods.

---

### 2. Collection Interface

- **Class:** `Collection_Interface_Implemetation`
- **Key Methods:**
  - `add()`, `addAll()`, `remove()`, `removeAll()`, `removeIf()`, `retainAll()`
  - `contains()`, `containsAll()`, `isEmpty()`, `size()`
  - `stream()`: Basic filtering and streaming

**Highlights:**  
Demonstrates collection-wide features, batch operations, and filtering.

---

### 3. List Interface

- **Class:** `List_interface_Implementation`
- **Key Methods:**
  - Inherits all Collection methods.
  - **Unique List Methods:**
    - `add(index, element)`, `addFirst()`, `addLast()`
    - `get(index)`, `getFirst()`, `getLast()`, `set(index, element)`
    - `remove(index)` / `remove(object)`, `removeFirst()`, `removeLast()`
    - `indexOf()`, `lastIndexOf()`, `sort()`, `reversed()`, `subList()`, `clear()`

**Highlights:**  
All positional and special operations on lists; sorting, sublist, and element indexing.

---

### 4. ArrayList Class

- **Class:** `ArrayList_Class_Implementation`
- **Key Methods:**
  - `clone()`: Copying lists.
  - Demonstrates fast lookup, random access, and all List features.

**Highlights:**  
Perfect for demonstrations on dynamic arrays and quick access scenarios.

---

### 5. LinkedList Class

- **Class:** `LinkedList_Class_Implementation`
- **Key Methods for Deque/Queue Operations:**
  - `offer()`, `offerFirst()`, `offerLast()`
  - `poll()`, `pollFirst()`, `pollLast()`
  - `peek()`, `peekFirst()`, `peekLast()`
  - `push()`, `pop()`

**Highlights:**  
Efficient insertions/deletions at any position—demonstrates LinkedList-specific queue/deque operations.

---

### 6. Vector Class

**Class:** `Vector_Class_Implementation`

**Key Methods:**
- `addElement()`, `removeElement()`, `copyInto()`, `insertElementAt()`, `setElementAt()`
- `firstElement()`, `lastElement()`, `removeAllElements()`

**Example:**
```
Vector<Integer> list = new Vector<>(Arrays.asList(1,2,3));
list.addElement(10);
list.copyInto(array);
list.firstElement();
```
---

### 7. Stack Class

**Class:** `Stack_Class_Implementation`

**Key Methods:**
- `push()`, `pop()`, `peek()`
- Inherits Vector & List methods (LIFO stack)

**Example:**
```
Stack<Integer> stack = new Stack<>();
stack.push(10);
stack.push(20); 
System.out.println(stack.pop());
```
---
##  Set Implementation
Now let’s explore the Set Interface and its classes from the Java Collection Framework. 
---
## 1. Collection Interface using HashSet

`Class`: Collection_Intrface_Implementation_Using_HashSet

`Key Points`:

Demonstrates how HashSet inherits Collection methods.

`Methods used`: addAll(), remove(), contains(), size()

`Highlights:`
Removes duplicates automatically even though it implements the Collection interface.

---
## 2.Set Interface

`Class:` Set_Interface_Implementation

`Key Points:`

- Represents unordered and unique collection.
- No indexing support.
- Duplicate elements are not allowed.

`Example:`
```
Set<Integer> set = new HashSet<>();
set.addAll(Arrays.asList(9,7,6,5,4,3,2));
set.add(10);
System.out.println(set);
```
---
## 3.HashSet Class

`Class:` HashSet_Class_Implementation

`Key Methods:`

add(), addAll(), remove(), clear(), clone(), contains()

`Highlights:`

Stores unique and unordered elements.

Demonstrates cloning and duplicate handling.

`Example:`
```
HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,2,1,0,100,10));
HashSet<Integer> set1 = (HashSet<Integer>) set.clone();
System.out.println(set1);
```
---
## 4.LinkedHashSet Class

`Class:` LinkedHashSet_Class_Implementation

`Key Features:`

- Maintains insertion order.
- Eliminates duplicates.
- Ideal when order + uniqueness are both required.

`Example:`
```
LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,2));
System.out.println(set); // [1, 2, 3, 4]
```
---
## 5.SortedSet Interface

`Class:` SortedSet_Interface_Implementation

`Key Methods:`

first(), last(), subSet(), headSet(), tailSet()

`Highlights:`
- Allows working with subsets and ranges of elements in sorted order.
---
## 6.TreeSet Class

`Class:` TreeSet_Class_Implementation

`Key Features:`

- Maintains sorted order.
- Implements NavigableSet and SortedSet.
- Does not allow null elements.
```
TreeSet<Integer> set = new TreeSet<>(Arrays.asList(5,1,8,3,9));
System.out.println(set); // [1, 3, 5, 8, 9]
System.out.println(set.first()); // 1
System.out.println(set.last());  // 9
```
---
# 🧩 Queue and Collection Implementations in Java

This repository demonstrates the **implementation and behavior of Java Queue, Deque, and Collection interfaces** using classes like  
➡️ `PriorityQueue`  
➡️ `ArrayDeque`  
➡️ `LinkedList`  

Each class showcases how these collections work internally and how various methods from their interfaces behave in real examples.

---

## 📘 Overview

In Java, the **Queue**, **Deque**, and **Collection** interfaces define how elements can be stored, accessed, and removed in an organized manner.

### ✅ Key Points:
- **Queue** → Follows **FIFO (First In, First Out)**  
- **Deque (Double-Ended Queue)** → Elements can be added or removed **from both ends**
- **PriorityQueue** → Follows a **heap structure** (by default Min-Heap)
- **ArrayDeque** → A **resizable array-based implementation** of Deque (faster than LinkedList)
- **LinkedList** → Implements both **Queue** and **Deque**, supports dynamic memory

---

### 1️⃣ `Collection_Implements_Using_Priority_Class`
**Purpose:** Demonstrates how `PriorityQueue` can implement the `Collection` interface.

**Key Features:**
- Implements `Collection` interface.
- Stores elements in a **min-heap order**.
- Elements are added **level-by-level** (heap property maintained automatically).

**Main Methods Used:**
```java
add(), addAll(), remove()

---
### 2️⃣ Queue_Interface_Implementation_Using_PriorityQueue

***Purpose:*** Demonstrates Queue interface using a PriorityQueue.

***Key Features:***

- Implements Queue interface.

- Elements are organized according to natural ordering (min-heap).

- remove() deletes the highest priority (smallest) element.

***Main Methods Used:***
```
add(), addAll(), remove()
```

***Concept Reminder:***

- PriorityQueue does not maintain insertion order — it maintains heap order.
---
### 3️⃣ Priority_Queue_Implementation

***Purpose:*** Explains the working of PriorityQueue directly.

***Highlights:***

- Internal structure is a heap (by default a min-heap).

- Elements are arranged in ascending order automatically.

***Example Methods Used:***
```
addAll()

```
---
### 4️⃣ Deque_Implementation_Using_ArrayDequeue

***Purpose:*** Demonstrates Deque behavior using ArrayDeque.

***Key Features:***

- Implements Collection, Queue, and Deque interfaces.

- Supports stack and queue operations.

- Elements are stored in insertion order.

- Faster than LinkedList.

***📍 Queue Operations:***
```
add(), addAll(), element(), peek(), poll()
```

***📍 Deque Operations:***
```
addFirst(), addLast(), getFirst(), getLast()
```

***📍 Stack Operations:***
```
push(), pop(), peek()
```

📍 ***Offer & Poll Methods:***
```
offer() → // Adds at the end

offerFirst() / offerLast() → // Adds at front or end

poll() / pollFirst() / pollLast() → // Removes and returns first/last elements
```
📍*** Remove Methods:***
```
remove() → // Removes first element

removeFirstOccurrence() → // Removes first matching element

removeLastOccurrence() → // Removes last matching element
```
---
### 5️⃣ ArrayDeque_Class_Implementation

***Purpose: ***Shows cloning and additional operations of ArrayDeque.

***Key Features:***

- Supports cloning (Shallow copy of queue).

- Shows how two queues operate independently after cloning.

***Example Methods Used:***
```
clone()
```
---
### 6️⃣ Deque_Implementation_Using_LinkedList

***Purpose:*** Demonstrates that LinkedList can implement both Deque and Queue.

***Key Features:***

- Dynamic size (no fixed capacity).

- Supports all Deque methods.

- Provides Queue behavior with FIFO structure.

***Example Methods Used:***
```
addAll(), add(), peek(), remove()
```
---
## How to Run

1. **Clone the repository**
2. Compile and run `Collections.java`:
    ```
    javac Collections.java
    java List_Collections
    ```
3. Compile and run `Set_Interface_Implementation.java`:
   ```
   javac Set_Implementation.java
   java Set_Interface_Implementation
   ```
3. Observe the console output for example results of each concept.

---

## Sample Output (What You'll See)

- Demonstrations of each interface/class.
- Console printouts for each operation showing:
  - How methods work with real examples
  - Effects of adding/removing/updating elements
  - Sorting and reversing lists
  - Differences between ArrayList and LinkedList

---

## Why Use This Repo?

- **Interviews:** Quick revision of collection interface methods.
- **Learning:** See code and output side-by-side.
- **Projects:** Copy-paste ready snippets for your own use.

---

## Author

**Ram Reddy**  
- Aspiring Full Stack Developer | AI & Automation Enthusiast | Final Year CSE Student

---

## Suggestions

Feel free to fork, raise issues, or contribute improvements!

---

