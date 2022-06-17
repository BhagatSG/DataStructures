/******************************************************************************
Important properties of an algorithm:

1)Time Complexity of an algortihm:
it's a measure of rate of growth of time taken by an algorithm with respect to the input size.
Basically, finding how many times each statement of code executing.

While analysing an algorithm, we consider O-notation because it gives the upper value of the execution time and we ignore lower order terms also.
O-notation:
denotes asymptotic upper bound.

Omega-notation:
denotes asymptotic lower bound.

theta-notation:
denotes asymptotic tight bound.


2)Space Complexity/Memory Usage in an algorithm:
      i) in-place comparison algorithm:
                  Constant amount of extra memory used using temporary variables.
      ii)Memory usage grows with the input size like in merge sort.
 
 
3)Stability of an algorithm: 
Relative order of elements with equal key preserved or not.


4)Internal/External algorithm:
       i) internal algorithm: Data on which algorithm applied is in main memory/RAM.
       ii)external algorithm: Data on which algorithm applied is in auxilliary storage like disks, tapes etc.
       
 
5)Recursive/Non-recursive algorithm:
Recursion is a function calling itself.


Sorting:
It is arranging the elements in a list or collections in increasing or decreasing order.

Why sorting?
Unsorted case:
   Linear/Sequential Search: for size n, n comparisons takes place.
   if n=2^64 then 2^64 comparisons will take place and 
   suppose 1 comparison takes 1 ms 
   then 2^64 comparisons will take 2^64 ms.
   
Sorted case:
   Binary Search: for size n, log n comparisons takes place.
   if n=2^64 then 64 comparison will take place only and
   suppose 1 comparison takes 1ms
   then 64 comparisons will take only 64 ms.
*******************************************************************************/
public class Introduction{
	public static void main(String[] args) {
		System.out.println("Hello Guys, Welcome to the DS World");
	}
}
