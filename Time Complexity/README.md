Time Complexity: It is the relation between Input size and the Running time taken or No.of Operations Performed. This relation can be linear, Quadratic, Logarithmic etc.

Time Complexity of a code is represented using 3 Notations: Omega, Theta and Big O.
1. Omega- used to represent the Time Complexity of the Best Case Scenario (Input size is small)
2. Theta- used to represent the Time Complexity of the Average Case Scenario (Input size is average)
3. Big O- used to represent the Time Complexity of the Worst Case Scenario(Input size is large). Big O notation is the most used notation because Time Complexity of a code is always defined considering the Worst Case Scenario.

Things to Keep in mind while defining the Time Complexity of a Code:

   1.Only consider the part of code which takes the maximum time to represent the Overall time complexity of the code. Expressions of    other parts of the code will be ignored as these are considered negligible when compared to the Maximum time taken.
   
   2.Always consider the Worst Case scenario. Hence, use Big O notation to represent the Time Complexity.
   
   3.While representing the expression of time complexity ignore the multiplicative and additive constants as they are considered             negligible.


Frequently observed Time Complexities:

1. Constant (Represented as O(1) ) : The time taken does not depend on the Input Size. This relation is the considered the BEST ONE.     Observed in: Fetching a value from an Array through its indexed value, Now in this case we don’t have to iterate through every element of an array instead we have to directly land on the defined index value and fetch the value, hence no matter how big is the array in size, we have our predefined Index in place and we directly go to that index. 

2. Logarithmic (Represented as O(log n) ): As the input is multiplied(increased in size), the no. of operations or Time taken is added.For eg: For input 10: Time taken= 1 , Input 100: Time Taken=2, Input 1000: Time Taken = 3, Input 10000: Time Taken =4 . Therefore here, as Input size is increased by multiplying with 10, Time taken is increased by just Addition of 1.
   Observed in: Binary Search

3. Linear (Represented as O(n) ): As the Input size increases, the Time taken/ no. of operations       performed also increases. For eg.: If input size increases by 10, the time taken also increases by 10. Observed in: Linear Search of an element present in an Array. In order find the defined element stored in an array, we iterate through all elements in the entire length of an array searching for the defined array. Hence in this case, the longer is the array, the longer time will be taken to iterate through its length and find the element. As we increase the length, the Time taken will also increase.

4. Quadratic  (Represented as O(n^m) ): As input is increased, Time increases quadratically. For eg: if Input Size is doubled, Time increases by 4 times. Observed in: Nested loops.

5. Loglinear (Represented as O(nlog n) ): Log n appears n times. Observed in: Sorting Algorithms.

6. Exponential (Represented as O(Base^n) ): As the input size is added (increased), the time taken is multiplied(exact opposite of Logarithmic Complexity). This is the considered the Worst complexity.For eg: \n
For input 1: Time taken= 10 , Input 2: Time Taken=100, Input 3: Time Taken = 100, Input 4: Time Taken =10000 . Therefore here, as Input size is increased by just addition of 1, Time taken is increased by a power of 10.
  Observed in: Recursion algorithms.In exponential complexities, the Base is equal to the no. of branches from each node.


Order of time Complexities:
CONSTANT< LOGARITHMIC<LINEAR< QUADRATIC < LOGLINEAR < EXPONENTIAL \n
Greater the Time Complexity, Less efficient is the Code. 






