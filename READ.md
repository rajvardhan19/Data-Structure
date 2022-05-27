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
