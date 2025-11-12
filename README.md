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
## 🧩 Queue and Collection Implementations in Java

This repository demonstrates the **implementation and behavior of Java Queue, Deque, and Collection interfaces** using classes like  
➡️ `PriorityQueue`  
➡️ `ArrayDeque`  
➡️ `LinkedList`  

Each class showcases how these collections work internally and how various methods from their interfaces behave in real examples.

---

## 📘 Overview

In Java, the **Queue**, **Deque**, and **Collection** interfaces define how elements can be stored, accessed, and removed in an organized manner.

## ✅ Key Points:
- **Queue** → Follows **FIFO (First In, First Out)**  
- **Deque (Double-Ended Queue)** → Elements can be added or removed **from both ends**
- **PriorityQueue** → Follows a **heap structure** (by default Min-Heap)
- **ArrayDeque** → A **resizable array-based implementation** of Deque (faster than LinkedList)
- **LinkedList** → Implements both **Queue** and **Deque**, supports dynamic memory

---

## 1️⃣ `Collection_Implements_Using_Priority_Class`
**Purpose:** Demonstrates how `PriorityQueue` can implement the `Collection` interface.

**Key Features:**
- Implements `Collection` interface.
- Stores elements in a **min-heap order**.
- Elements are added **level-by-level** (heap property maintained automatically).

**Main Methods Used:**
```java
add(), addAll(), remove()
```
---
## 2️⃣ Queue_Interface_Implementation_Using_PriorityQueue

**Purpose:** Demonstrates Queue interface using a PriorityQueue.

**Key Features:*

- Implements Queue interface.

- Elements are organized according to natural ordering (min-heap).

- remove() deletes the highest priority (smallest) element.

**Main Methods Used:**
```
add(), addAll(), remove()
```

**Concept Reminder:**

- PriorityQueue does not maintain insertion order — it maintains heap order.
---
## 3️⃣ Priority_Queue_Implementation

**Purpose:** Explains the working of PriorityQueue directly.

**Highlights:**

- Internal structure is a heap (by default a min-heap).

- Elements are arranged in ascending order automatically.

**Example Methods Used:*
```
addAll()

```
---
## 4️⃣ Deque_Implementation_Using_ArrayDequeue

**Purpose:** Demonstrates Deque behavior using ArrayDeque.

**Key Features:**

- Implements Collection, Queue, and Deque interfaces.

- Supports stack and queue operations.

- Elements are stored in insertion order.

- Faster than LinkedList.

**📍 Queue Operations:**
```
add(), addAll(), element(), peek(), poll()
```

**📍 Deque Operations:**
```
addFirst(), addLast(), getFirst(), getLast()
```

**📍 Stack Operations:**
```
push(), pop(), peek()
```

📍 **Offer & Poll Methods:**
```
offer() → // Adds at the end

offerFirst() / offerLast() → // Adds at front or end

poll() / pollFirst() / pollLast() → // Removes and returns first/last elements
```
📍**Remove Methods:**
```
remove() → // Removes first element

removeFirstOccurrence() → // Removes first matching element

removeLastOccurrence() → // Removes last matching element
```
---
### 5️⃣ ArrayDeque_Class_Implementation

**Purpose:** Shows cloning and additional operations of ArrayDeque.

**Key Features:**

- Supports cloning (Shallow copy of queue).

- Shows how two queues operate independently after cloning.

**Example Methods Used:**
```
clone()
```
---
## 6️⃣ Deque_Implementation_Using_LinkedList

**Purpose:** Demonstrates that LinkedList can implement both Deque and Queue.

**Key Features:**

- Dynamic size (no fixed capacity).

- Supports all Deque methods.

- Provides Queue behavior with FIFO structure.

**Example Methods Used:**
```
addAll(), add(), peek(), remove()
```
---

# 🗺️ Java Map Interface Implementations

This repository provides a **complete guide and implementation of Java’s `Map` interface** and its subclasses — including `HashMap`, `Hashtable`, `LinkedHashMap`, `TreeMap`, and `SortedMap`.  

Each class in this project demonstrates:
- How these maps store and access data (key-value pairs)
- The difference between various Map types
- The usage of **all major methods** with clear comments and real outputs

---

## 📘 Overview

In Java, the **Map Interface** represents a collection of key-value pairs.  
It **does not allow duplicate keys** — each key can map to **only one value**.

### ✅ Key Concepts:
- `Map` stores **unique keys** and **associated values**
- `HashMap` → Fast, non-synchronized map (unordered)
- `Hashtable` → Thread-safe map (synchronized)
- `LinkedHashMap` → Maintains **insertion order**
- `TreeMap` → Maintains **sorted order of keys**
- `SortedMap` → Interface implemented by `TreeMap`, keeps keys in **natural order**

---

## 🧩 Classes Explained

### 1️⃣ `Map_Interface_Implementation_using_Hashtable`
**Purpose:** Demonstrates complete usage of `Map` interface using the `Hashtable` class.  
**Key Concept:** Stores key-value pairs in a **thread-safe** and **unordered** manner.

#### 🔹 Methods Used and Explained:
- `put(key, value)` → Adds a key-value pair
- `putAll(map)` → Adds all entries from another map
- `putIfAbsent(key, value)` → Adds a key-value pair only if key is missing
- `get(key)` → Retrieves value for given key
- `getOrDefault(key, defaultValue)` → Returns default value if key doesn’t exist
- `compute(key, (k,v) -> expression)` → Updates existing value using a function
- `computeIfAbsent(key, k -> value)` → Adds entry if key missing
- `computeIfPresent(key, (k,v) -> newValue)` → Modifies value if key present
- `containsKey(key)` / `containsValue(value)` → Checks if key/value exists
- `entrySet()` → Returns all key-value pairs
- `forEach((k,v) -> ...)` → Iterates through all pairs using lambda
- `equals(map)` → Compares two maps
- `isEmpty()` → Checks if map has any entries
- `keySet()` → Returns all keys
- `merge(key, value, (k,v) -> function)` → Combines old and new values
- `remove(key)` / `remove(key, value)` → Removes by key or both
- `replace(key, value)` → Updates a single value
- `replace(key, oldValue, newValue)` → Updates only if old value matches
- `replaceAll((k,v) -> expression)` → Updates all values
- `size()` → Returns number of entries
- `values()` → Returns all values as a collection
- `clear()` → Removes all entries

🧠 *Demonstrates every major method of the `Map` interface clearly with examples.*

---

### 2️⃣ `Hashtable_Class_Implementation`
**Purpose:** Shows internal methods of the `Hashtable` class.  
**Key Concept:** Synchronized version of `HashMap`, thread-safe but slower.

#### 🔹 Additional Methods:
- `clone()` → Creates a shallow copy of Hashtable
- `contains()` → Legacy method, same as `containsValue()`
- `keys()` → Returns `Enumeration` of all keys
- `Enumeration.hasMoreElements()` → Checks next element
- `Enumeration.nextElement()` → Returns next key

🧠 *Shows how enumeration works (like iterators) and cloning behavior.*

---

### 3️⃣ `HashMap_Class_Implementation`
**Purpose:** Demonstrates `HashMap` which is **unsynchronized** and **faster** than `Hashtable`.

#### 🔹 Key Points:
- `put()` → Adds entries
- `new HashMap<>(capacity)` → Initializes with a capacity
- `getOrDefault()` → Retrieves existing value or returns default
- `HashMap<Integer, ArrayList<String>>` → Demonstrates complex values (object as value)

#### 🔹 Example Concepts:
- Creating nested map with lists as values
- Understanding uniqueness of keys and flexibility of values

🧠 *Used widely for most non-threaded applications because of its efficiency.*

---

### 4️⃣ `LinkedHashMap_Class_Implementation`
**Purpose:** Demonstrates the **LinkedHashMap**, which maintains **insertion order**.  
**Key Concept:** Extends `HashMap` but maintains a doubly linked list of entries.

#### 🔹 Methods Used:
- `put()` → Adds entries in insertion order
- `clone()` → Creates a shallow copy
- `firstEntry()` → Returns the first inserted key-value pair
- `lastEntry()` → Returns the last key-value pair
- `sequencedEntrySet()` → Returns entries in order
- `sequencedKeySet()` / `sequencedValues()` → Ordered view of keys/values
- `pollFirstEntry()` / `pollLastEntry()` → Removes first or last entries

🧠 *Best used when you need predictable iteration order of elements.*

---

### 5️⃣ `SortedMap_Interface_Implementation`
**Purpose:** Demonstrates `SortedMap` (interface) using `TreeMap`.  
**Key Concept:** Stores keys in **sorted (ascending)** order by default.

#### 🔹 Methods Used:
- `put()` / `putIfAbsent()` → Add elements
- `firstKey()` / `lastKey()` → Returns first and last keys
- `firstEntry()` / `lastEntry()` → Returns first and last pairs
- `pollFirstEntry()` / `pollLastEntry()` → Removes first/last pair
- `reversed()` → Returns reverse order map
- `sequencedEntrySet()` / `sequencedKeySet()` / `sequencedValues()` → Ordered sets
- `subMap(fromKey, toKey)` → Returns range of key-value pairs
- `headMap(toKey)` / `tailMap(fromKey)` → Partial views of map
- `new TreeMap<>(Collections.reverseOrder())` → Creates descending order TreeMap

🧠 *Ideal for automatically sorted data or range-based operations.*

---

### 6️⃣ `TreeMap_Class_Implementation`
**Purpose:** Demonstrates full functionality of `TreeMap` (implements `NavigableMap`, `SortedMap`, and `Map`).  
**Key Concept:** Keeps keys sorted in ascending order (or by custom comparator).

#### 🔹 Map Methods Demonstrated:
- `put()` / `getOrDefault()` → Adds or updates frequency
- `forEach()` → Prints key-value pairs using lambda

#### 🔹 TreeMap-Specific Methods:
- `ceilingEntry(key)` / `ceilingKey(key)` → Returns entry/key ≥ given key
- `descendingKeySet()` / `descendingMap()` → Reverse order of keys/map
- `floorKey(key)` → Returns key ≤ given key
- `higherEntry(key)` / `higherKey(key)` → Entry/key greater than given key
- `lowerEntry(key)` / `lowerKey(key)` → Entry/key less than given key
- `navigableKeySet()` → Returns all keys in sorted order
- `clone()` → Creates copy of TreeMap
- `comparator()` → Checks ascending/descending sorting order

🧠 *TreeMap is best for ordered, navigable map structures where sorted traversal is required.*

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

