/******************************************************************************

Quick Sort:
1)Practical choice for an efficient sorting Algorithm.
2)Sort function given to us by most of the language libraries are implementations of Quick sort only.

Partioning:
It's a process where we select a pivot and rearranges the list in such a way that 
all the elements smaller than the pivot are towards the left and
all the elements greater than the pivot are towards the right.

Properties:
1)In Place Sorting Algorithm:
  Constant amount of extra memory used.
  
2)Divide & Conquer Algorithm:
its an algorithm design paradigm in which we break a problem into sub-problems & 
then from solutions to the sub problems we construct a solution to the actual problem.

3)Recursive:
Recursion is a function calling itself.

4)Not stable

Time Complexity:
Average & Best Case Peformance:O(nlogn)
Worst Case Peformance  :O(n^2)

Randomised version of Quick Sort avoids worst case running time.
Randomized Quick Sort give us O(nlogn) running time with very high probability.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int unSortedArray[]={9,7,2,6,1,7,5,3,8};
		quickSort(unSortedArray,0,unSortedArray.length-1);
		System.out.println("Array After QuickSort Implementation");
		printArray(unSortedArray);
	}
	
	public static void printArray(int arrayToPrint[]){
	    for(int i=0;i<arrayToPrint.length;++i)
	       System.out.print(arrayToPrint[i]+" ");
	    System.out.println();
	}
	
	public static void quickSort(int unSortedArray[],int low, int high){
	    if(low<high){
	        int pIndex = partition(unSortedArray,low,high);
	        quickSort(unSortedArray,low,pIndex-1);
	        quickSort(unSortedArray,pIndex+1,high);
	    }
	}
	
	public static int partition(int unSortedArray[],int low, int high){
	    random(unSortedArray,low,high);
	    int pivot = unSortedArray[high];
	    int pIndex=low;
	    int temp;
	    for(int i=low;i<high;++i){
	        if(unSortedArray[i]<=pivot){
	            temp=unSortedArray[i];
	            unSortedArray[i]=unSortedArray[pIndex];
	            unSortedArray[pIndex]=temp;
	            pIndex++;
	        }
	    }
	    temp=unSortedArray[high];
	    unSortedArray[high]=unSortedArray[pIndex];
	    unSortedArray[pIndex]=temp;
	    return pIndex;
	}
	
	public static void random(int unSortedArray[],int low, int high){
	    Random rand= new Random();
	    int randIndex= rand.nextInt(high-low)+low;
	    
	    int temp=unSortedArray[high];
	    unSortedArray[high]=unSortedArray[randIndex];
	    unSortedArray[randIndex]=temp;
	}
}






