/******************************************************************************

Merge Sort:
1)Divide & Conquer Algorithm:
It is an algorithm design paradigm in which we break a problem into sub-problems and 
then from solution of a sub problem we construct solution to the actual problem.

2)Memory Usage grows with the input size.

3)Stable sorting algorithm

4)Not in place comparison algorithm

Time Complexity:
Worst,Average & Best Case Performance: O(nlogn)

Space Complexity:O(n)

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int unSortedArray[]={3,5,7,9,2,8,4,6,1};
		
		mergeSort(unSortedArray,unSortedArray.length);
		printArray(unSortedArray);
	}
	
	public static void printArray(int sortedArray[]){
	    for(int i=0;i<sortedArray.length;++i)
	      System.out.print(sortedArray[i]+" ");
	    System.out.println(); 
	}
	
	public static void mergeSort(int unSortedArray[],int size){
	    int mid,i;
	    if (size > 1){
	        mid=size/2;
	       int leftSideArray[]=new int[mid];
	       int rightSideArray[]=new int[size-mid];
	       for(i=0;i<mid;++i)
	         leftSideArray[i]=unSortedArray[i];
	       for(i=mid;i<size;++i)
	         rightSideArray[i-mid]=unSortedArray[i];
	       
	       mergeSort(leftSideArray,leftSideArray.length);
	       mergeSort(rightSideArray,rightSideArray.length);
	       merge(unSortedArray,leftSideArray,rightSideArray);
	    }
	}
	
	public static void merge(int sortedArray[],int leftSideArray[],int rightSideArray[]){
	    int i=0,j=0,k=0;
	    while(i<leftSideArray.length && j<rightSideArray.length){
	        if(leftSideArray[i]<rightSideArray[j]){
	            sortedArray[k]=leftSideArray[i];
	            ++i;
	        }else{
	            sortedArray[k]=rightSideArray[j];
	            ++j;
	        }
	        ++k;
	    }
	    while(i<leftSideArray.length){
	        sortedArray[k]=leftSideArray[i];
	        ++k;++i;
	    }
	    while(j<rightSideArray.length){
	        sortedArray[k]=rightSideArray[j];
	        ++k;++j;
	    }
	}
}




