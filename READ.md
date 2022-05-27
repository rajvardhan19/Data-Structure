# Data structure

## Definition
**Data structure** is a *data organization*, *management*, and *storage format* that enables efficient access and modification. It is a collection of data values, the relationships among them, and the functions or operations that can be applied to the data, i.e., it is an *algebraic structure* about data.

Example
```
    1->2->3->4                              A
                                           / \
             A                            B    C
           /   \                           \  /
          B     C                            D
         / \   / \                  
        E   F  G  H           [foobar, code, apple, smile]    
              
```
***
## Complexity Analysis
The process of determining how **efficient** an algorithm is. It usually involves finding both the *time complexity* and the *space complexity* of an algorithm.

It is effectively used to determine how "good" an algorithm is and whether it's "better" than another one.

### Time complexity
It is a measure of how fast an algorithm runs

It's expressed using **Big O**  notation.

### Space complexity
It is a measure of how much auxiliary memory an algorithm takes up.

It's expressed using **Big O** notation.
***
## Memory
Memory is the foundational layer of computing, where all data is stored.
Key points
- Data stored in memory is stored in bytes and, by extension, bits.
- Bytes in memory can "point" to other bytes in memory, so as to store references to other data.
- The amount of memory that a machine has is bounded, making it valuable to limit how much memory an algorithm takes up.
- Accessing a byte or a fixed number of bytes (like 4 bytes or 8 bytes in the case of 32-bit and 64-bit integers) is an elementary operation, which can be loosely treated as a single unit of operational work.
***
## Big O Notation
The notation used to describe the **time complexity** and **space complexity** of algorithms.

Variables used in Big O notation denote the sizes of inputs to algorithms. For example, **O(n)** might be the time complexity of an algorithm that traverses through an array of length **n** similarly, **O(n+ m)** might be the time complexity of an algorithm that traverses through an array of length in and through a string of length **m**.

The following are examples of common complexities and their Big O notations, ordered from fastest to slowest:

- **Constant:** O(1)
- **Logarithmic:** O(log(n))
- **Linear:** O(n)
- **Log-linear:** O(nlog(n))
- **Quadratic:** O(n²) 
- **Cubic:** O(n³)
- **Exponential:** O(2^n)
- **Factorial:** O(n!)

Note that in the context of coding interviews, Big O notation is usually understood to describe the **worst-case complexity** of an algorithm, even though the worst-case complexity might differ from the **average-case** complexity.

For example, some sorting algorithms have different time complexities depending on the layout of elements in their input array. In rare cases, their time complexity will be much worse than in more common cases. Similarly, an algorithm that takes in a string and performs special operations on uppercase characters might have a different time complexity when run on an input string of only uppercase characters vs, on an input string with just a few uppercase characters.

Thus, when describing the time complexity of an algorithm, it can sometimes be helpful to specify whether the time complexity refers to the average case or to the worst case (eg. "this algorithm runs in O(nlog(n)) time on average and in O(n²) time in the worse case)

***
## Array

A linear collection of data values that are accessible at numbered Indices, starting at Index 0.

The following are an array's standard operations and their corresponding time complexities:

- Accessing a value at a given index: 0(1)

- Updating a value at a given index: 0(1)

- Inserting a value at the beginning: O(n)

- Inserting a value in the middle: O(n)

- Inserting a value at the end:

    1. amortized O(1) when dealing with a dynamic array

    2. O(n) when dealing with a static array

- Removing a value at the beginning O(n)

- Removing a value in the middle. O(n)

- Removing a value at the end: 0(1)

- Copying the array: O(n)

A static array is an implementation of an array that allocates a fixed amount of memory to be used for storing the array's values. Appending values to the array therefore involves copying the entire array and allocating new memory for it, accounting for the extra space needed for the newly appended value. This is a linear-time operation.

A dynamic array is an implementation of an array that preemptively allocates double the amount of memory needed to store the array's values. Appending values to the array is a constant-time operation until the allocated memory is filled up at which point the array is copied and double the memory is once again allocated for it. This implementation leads to an amortized constant-time insertion-at-end operation.

A lot of popular programming languages like JavaScript and Python implement arrays as dynamic arrays.

```
                 Continuous memory location
             ----------------------------------------->
             200  204  208   212  216 220  224  228
            | 10 | 25 | 65 | 107 | 7 | 63 | 20 | 85 |
               0    1    2    3    4    5    6    7
            <-----------------------------------------
                    Index
```

***
## Linked List

### Singly Linked List

A data structure that consists of nodes, each with some value and a pointer to the next node in the linked list. A linked list node's value and next node are typically stored in `value` and `next` properties respectively

The first node in a linked list is referred to as the head of the linked list, while the last node in a linked list, whose next property
points to the `null` value is known as the tail of the linked list.

Below is a visual representation of a singly linked list whose nodes hold integer values

```
                   0 -> 1 -> 2 -> 3 -> 4 -> 5 -> null
```
A singly linked list typically exposes its head to its user for easy access. While finding a node in a singly linked list involves traversing through all of the nodes leading up to the node in question (as opposed to instant access with an array), adding or removing nodes simply involves overwriting `next` pointers (assuming that you have access to the node night before the node that you're adding or removing).

The following are a singly linked list's standard operations and their corresponding time complexities:

- **Accessing the head:** 0(1)
- **Accessing the tail:** O(n)
- **Accessing a middle node:** O(n)
- **Inserting/Removing the head:** O(1)
- **Inserting/Removing the tail:** O(n) to access O(1) 
- **Inserting/Removing a middle node:** O(n) to access+ 0(1)
- **Searching for a value:** O(n)

### Doubly Linked List

Similar to a singly linked list, except that each node in a doubly linked list also has a pointer to the previous node in the linked list. The previous node is typically stored in a `prev` property.

Just as the `next` property of a doubly linked list's **tail** points to the `null` value, so too does the prev property of a doubly linked list's **head**.

Below is a visual representation of a doubly linked list whose nodes hold integer values:

```
            null <- 0 <-> 1 <-> 2 <-> 3 <-> 4 <-> 5 -> null
```

While a doubly linked list typically exposes both its head and tail to its user, as opposed to just its head in the case of a singly linked list. it otherwise behaves very similarly to a singly linked list.

The following are a doubly linked list's standard operations and their corresponding time complexities:

- **Accessing the head:** 0(1)

- **Accessing the tail:** O(1)

- **Accessing a middle node:** O(n)

- **Inserting/Removing the head:** O(1)

- **Inserting/Removing the tail:** 0(1)

- **Inserting/Removing a middle node:** O(n) to access+ 0(1)

- **Searching for a value:** O(n)

### Circular Linked List

A linked list that has no clear **head** or **tail**, because its "tail" points to its "head." effectively forming a closed circle.

A circular linked list can be either a **singly circular linked list** or a **doubly circular linked list**.

```
                    --> 1 <-> 2 <-> 3 <-> 4 <-> 5 <--
                    |                               |
                    ---------------------------------
```

***

## Hash Table

A data structure that provides fast insertion, deletion, and lookup of key/value pairs.

Under the hood, a hash table uses a `dynamic array` of `linked lists` to efficiently store key/value pairs. When inserting a key/value pair, a hash function first maps the key, which is typically a string (or any data that can be hashed, depending on the implementation of the hash table), to an integer value and, by extension, to an index in the underlying dynamic array. Then, the value associated with the key is added to the linked list stored t that index in the dynamic array, and a reference to the key is also stored with the value

Hash tables rely on highly optimized hash functions to minimize the number of `collisions` that occur when storing values: cases where two keys map to the same index.

Below is an example of what a hash table might look like under the hood:
```
[
    0: (valuel, key1) >> null

    1: (value2, key2) > (value3, key3)-> (value4, key4)

    2: (value5, key5) > null

    3: (value6, key6) -> null

    4: null

    5: (value?, key7)-> (value8, key8)

    6: (value9, key9) -> null
]
```

In the hash table above, the keys **key2, key3,** and **key4** collided by all being hashed to **1**, and the keys **key7** and **key8** collided by both being hashed to **5**.

The following are a hash table's standard operations and their corresponding time complexities:

- **Inserting a key/value pair:** O(1) on average; O(n) in the worse case

- **Removing a key/value pair:** O(1) on average, O(n) in the worse case

- **Looking up a key:** O(1) on average: O(n) in the worse case

The worst-case linear-time operations occur when a hash table experiences a lot of collisions, leading to long linked lists internally. which take O(n) time to traverse.

However, in practice and especially in coding interviews, we typically assume that the hash functions employed by Hash tables are so optimized that collisions are extremely rare and constant-time operations are all but guaranteed.
***