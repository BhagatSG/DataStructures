/******************************************************************************
Insertion Sort:
It works the way we sort playing cards in our hand.

Time Complexity:
Worse & Average Case Performance: O(n^2), Swaps:O(n^2)
Best Case Performance: O(n),              Swaps:O(1)

Space Complexity: O(1)
*******************************************************************************/
public class SortingInsertion{
    public void sortUsingInsertionSort(int unSortedArray[], int size){
	    int key,j;
	    for(int i=1;i<size;++i){
	        key=unSortedArray[i];
	        j=i-1;
	        while(j>=0 && unSortedArray[j]>key){
	            unSortedArray[j+1]=unSortedArray[j];
	            j=j-1;
	        }
	        unSortedArray[j+1]=key;
	    }
	}
	
	public static void main(String[] args) {
	    SortingInsertion insertionSort = new SortingInsertion();
	    
	    int unSortedArray[] = {5,10,8,6,2,1,0,4,9,12,7,3,11};
	    System.out.println("Array before Insertion Sort");
	    printArray(unSortedArray);
	    
	    insertionSort.sortUsingInsertionSort(unSortedArray,unSortedArray.length);
	    System.out.println("Array after Insertion Sort");
	    printArray(unSortedArray);
	}
	
	public static void printArray(int ArrayToBePrinted[]){
	    for(int i=0;i<ArrayToBePrinted.length;++i)
	     System.out.print(ArrayToBePrinted[i]+" ");
	    System.out.println(); 
	}
}
