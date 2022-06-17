/******************************************************************************
Bubble Sort Algorithm:
It works by repeatedly swapping the adjacent elements if they are in wrong order.

Time Complexity:
Worst & Average case performance : O(n^2), Swaps:O(n^2)
Best case performance            : O(n),   Swaps:O(1)

Space Complexity: O(1)

Implementation:
Optimized version:if inner loop doesn't swap anything, break the outer loop as all elements are already sorted.
Recursive Implementation has no improvement/performance advantages.
*******************************************************************************/
public class SortingBubble{
  public void sortArrayUsingBubbleSort(int arrayToBeSorted[],int size){
	    int temp;
	    for(int i=0;i<size-1;++i){
	        for(int j=0;j<size-i-1;++j){
	            if(arrayToBeSorted[j]>arrayToBeSorted[j+1]){
	                temp=arrayToBeSorted[j];
	                arrayToBeSorted[j]=arrayToBeSorted[j+1];
	                arrayToBeSorted[j+1]=temp;
	            }
	        }
	    }
	}
	
	public void sortArrayUsingOptimisedBubbleSort(int arrayToBeSorted[],int size){
	    int temp;
	    boolean swapped;
	    for(int i=0;i<size-1;++i){
	        swapped=false;
	        for(int j=0;j<size-i-1;++j){
	           if(arrayToBeSorted[j]>arrayToBeSorted[j+1]){
	               temp=arrayToBeSorted[j];
	               arrayToBeSorted[j]=arrayToBeSorted[j+1];
	               arrayToBeSorted[j+1]=temp;
	               swapped=true;
	           } 
	        }
	        if(swapped==false)
	        break;
	    }
	}
	
	public void sortArrayUsingRecursiveImpl(int arrayToBeSorted[],int size){
	    int temp;
	    if(size == 1)
	     return;
	     
	    for(int i=0;i<size-1;++i){
	        if(arrayToBeSorted[i]>arrayToBeSorted[i+1]){
	            temp=arrayToBeSorted[i];
	            arrayToBeSorted[i]=arrayToBeSorted[i+1];
	            arrayToBeSorted[i+1]=temp;
	        }
	    }
	    sortArrayUsingRecursiveImpl(arrayToBeSorted,size-1);
	}
  
	public static void main(String args[]){
	    SortingBubble sortingBubble = new SortingBubble();
	    
	    int arrayToBeSorted[]= {13,5,3,18,4,11,8,2,6,16,14,1};
	    //int arrayToBeSorted[]= {1,2,3,4,5,6,7,8};
	    
	    sortingBubble.sortArrayUsingBubbleSort(arrayToBeSorted,arrayToBeSorted.length);
	    System.out.println("Printing Sorted Array");
	    printArray(arrayToBeSorted);
	    
	    //Optimised Version
	    int arraySortingOptimized[]= {13,5,3,18,4,11,8,2,6,16,14,1};
	    //int arraySortingOptimized[]= {1,2,3,4,5,6,7,8};
	    
	    sortingBubble.sortArrayUsingOptimisedBubbleSort(arraySortingOptimized,arraySortingOptimized.length);
	    System.out.println("Printing Sorted Array using Optimised");
	    printArray(arraySortingOptimized);
	    
	    //Recursive Implementation
	    int arraySortingRecursively[]={13,5,3,18,4,11,8,2,6,16,14,1};
	    
	    sortingBubble.sortArrayUsingRecursiveImpl(arraySortingRecursively,arraySortingRecursively.length);
	    System.out.println("Printing Sorted Array using Recursive Implementation");
	    printArray(arraySortingRecursively);
	}
	
	public static void printArray(int arrayToBeSorted[]){
	    for(int i=0;i<arrayToBeSorted.length;++i)
	    System.out.print(arrayToBeSorted[i]+" ");
	    System.out.println();
	}
}
