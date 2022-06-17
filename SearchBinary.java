/******************************************************************************
Binary Search:
Binary Search is a fast search algorithm with a run time complexity O(logn).
This algorithm works on the principle of divide & conquer approach.

Condition for Binary Search:
Data Collection should be in sorted form.

Time Complexity: O(logn)
Intially, Length of array : n
after 1st iteration, Length of array : n/2
after 2nd iteration, length of array : (n/2)/2 = n/2^2
after Kth iteration, length of array : n/2^K
and we know that,
after Kth iteration, Length of array = 1

so, n/2^k = 1
n=2^k 
applying log on both sides:
logn = log2^k 
logn= k log2
k=log n                                (log2 =1)

Space Complexity:
In case of iterative implementation:O(1)
In case of recursive implementation:O(logn) recursion call stack space

Implementaion:
i)Iterative implementation
ii)Recursive implementation
iii)Using JavaArrays
iv)Using JavaCollections
*******************************************************************************/
import java.util.*;
public class SearchBinary{
	public int runBinarySearchUsingIterativeImpl(int sortedArray[], int searchElement, int low, int high){
	    int mid;
	    while(low <= high){
	        mid = (low+high)/2;
	        
	        if(sortedArray[mid] == searchElement)
	         return mid;
	        else if(sortedArray[mid] > searchElement)
	         high = mid - 1;
	        else 
	         low = mid + 1;
	       }
	   return -1;    
	}
	
	public int runBinarySearchUsingRecursiveImpl(int sortedArray[], int searchElement, int low, int high){
	    int mid;
	     while(low <= high){
	         mid = (low+high)/2;
	         
	         if(sortedArray[mid] == searchElement)
	          return mid;
	         else if (sortedArray[mid] > searchElement)
	          return runBinarySearchUsingRecursiveImpl(sortedArray, searchElement, low, mid-1);
	         else if(sortedArray[mid] < searchElement)
	          return runBinarySearchUsingRecursiveImpl(sortedArray, searchElement, mid+1, high);
	     }
	    return -1; 
	}
	
	public int runBinarySearchUsingJavaArrays(int sortedArray[], int searchElement){
	    return Arrays.binarySearch(sortedArray, searchElement);
	}
	
	public int runBinarySearchUsingJavaCollections(List<Integer> sortedList, int searchElement){
	    return Collections.binarySearch(sortedList, searchElement);
	}
	
	public static void main(String args[]){
	    SearchBinary searchBinary = new SearchBinary();
	    
	    int sortedArray[] = {1,2,3,4,5,7,8,9,10,11,14,15,16,17,18,19,20};
	    System.out.println("Printing Sorted array");
	    Arrays.stream(sortedArray).forEach(x -> System.out.print(x+" "));
	    System.out.println();
	    
	    int searchElement = 14;
	    int indexPosition = searchBinary.runBinarySearchUsingIterativeImpl(sortedArray, searchElement, 0, sortedArray.length-1);
	    if(indexPosition == -1){
	        System.out.println(String.format("Search Element: %d not found in Array of Length: %d",searchElement, sortedArray.length));
	    }else{
	        System.out.println(String.format("Search Element: %d found at Index: %d having value: %d of Array length: %d",searchElement, indexPosition, sortedArray[indexPosition], sortedArray.length));
	    }
	    
	    searchElement = 22;
	    indexPosition = searchBinary.runBinarySearchUsingRecursiveImpl(sortedArray, searchElement, 0, sortedArray.length-1);
	    if(indexPosition == -1){
	        System.out.println(String.format("Search Element: %d not found in Array of Length: %d",searchElement, sortedArray.length));
	    }else{
	        System.out.println(String.format("Search Element: %d found at Index: %d having value: %d of Array length: %d",searchElement, indexPosition, sortedArray[indexPosition], sortedArray.length));
	    }
	    
	    searchElement = 17;
	    indexPosition = searchBinary.runBinarySearchUsingJavaArrays(sortedArray, searchElement);
	    if(indexPosition == -1){
	        System.out.println(String.format("Search Element: %d not found in Array of Length: %d",searchElement, sortedArray.length));
	    }else{
	        System.out.println(String.format("Search Element: %d found at Index: %d having value: %d of Array length: %d",searchElement, indexPosition, sortedArray[indexPosition], sortedArray.length));
	    }
	    
	    Integer sortedArrayInteger[] = {1,2,3,4,5,7,8,9,10,11,14,15,16,17,18,19,20};
	    searchElement = 3;
	    indexPosition = searchBinary.runBinarySearchUsingJavaCollections(Arrays.asList(sortedArrayInteger), searchElement);
	    if(indexPosition == -1){
	        System.out.println(String.format("Search Element: %d not found in Array of Length: %d",searchElement, sortedArrayInteger.length));
	    }else{
	        System.out.println(String.format("Search Element: %d found at Index: %d having value: %d of Array length: %d",searchElement, indexPosition, sortedArrayInteger[indexPosition], sortedArrayInteger.length));
	    }
	}
}






