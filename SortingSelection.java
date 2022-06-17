/******************************************************************************
Selection Sort:
It works by repeatedly selecting the smallest element.

In selection sort, entire array is divided into two parts i.e sorted array at the left & unsorted array at the right end.
Initially, sorted array is empty & unsorted array is the entire array.

Smallest element is selected from the unsorted array & swapped with the leftmost element.
That selected element becomes a part of sorted array.This process continues moving the unsorted array boundary by one element to the right.

Time Complexity:
Worst & Average case performance : O(n^2),  Swaps: O(n)
Best case performance            : O(n^2),  Swaps: O(n)

Space Complexity: O(1)
*******************************************************************************/
public class SortingSelection{
	public void usingSelectionSort(int unsortedArray[],int size){
	    int minIndex,temp;
	    for(int i=0;i<size-1;++i){
	        minIndex=i;
	        for(int j=i+1;j<size;++j){
	            if(unsortedArray[j]<unsortedArray[minIndex])
	                minIndex=j;
	        }      
	       temp=unsortedArray[i];
	       unsortedArray[i]=unsortedArray[minIndex];
	       unsortedArray[minIndex]=temp;
	    }
	}
	
	public static void main(String[] args) {
	     SortingSelection sortingSelection = new SortingSelection();
	     
	     int unsortedArray[] = {7,4,9,3,10,5,2,0,1,6,8};
	     System.out.println("Unsorted Array");
	     printArray(unsortedArray);
	     
	     sortingSelection.usingSelectionSort(unsortedArray, unsortedArray.length);
	     System.out.println("Array After Selection Sort");
	     printArray(unsortedArray);
	}
	
	public static void printArray(int unsortedArray[]){
	    for(int i=0;i<unsortedArray.length;++i)
	     System.out.print(unsortedArray[i]+" ");
	     System.out.println();
	}
}
