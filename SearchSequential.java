/******************************************************************************
Sequential/Linear search checks each element of an array for a target value until a match is found or all elements have been iterated.

Time Complexity:
Worst or Average case performance: O(n)
Best case performance:             O(1)

Space Complexity:O(1)

Types:
i) Unordered Sequential Search(Elements are not sorted)
ii)Ordered Sequential Search(Elemets are sorted)
*******************************************************************************/
import java.util.*;
public class SearchSequential{
  public static int getIndexUnorderedSequentialSearch(int unorderedArray[], int searchElement){
    for(int i = 0; i < unorderedArray.length; ++i){
       if(unorderedArray[i] == searchElement){
          return i;
       }
    }
    return -1;
  }

  public int getIndexOrderedSequentialSearch(int orderedArray[], int searchElement){
    for(int i = 0; i < orderedArray.length; ++i){
       if(orderedArray[i] == searchElement){
          return i;
       }else if(orderedArray[i] > searchElement){
          return -1;     
       }    
    }  
    return -1;
  }
  
  public static void main(String args[]){
    int unorderedArray[] = {45,37,87,48,12,4,67,53,38,24};
    int searchElement = 36;
    
    System.out.println("Printing Unordered Array");
    Arrays.stream(unorderedArray).forEach(x -> System.out.print(x+" "));
    System.out.println();
    
    int index = getIndexUnorderedSequentialSearch(unorderedArray, searchElement);
    if(index>=0){
       System.out.println(String.format("Searched Element: %d found at index: %d having value: %d in an array of length: %d", searchElement, index, unorderedArray[index], unorderedArray.length));
    }else{
       System.out.println(String.format("Searched Element: %d doesn't exist in an array of length: %d", searchElement, unorderedArray.length));
    }
    
    //Object Creation to call non-static methods.
    SearchSequential searchSequential = new SearchSequential();
    int orderedArray[] = {6,13,19,25,30,36,39,45,51,56,60,67,73,78,84,90,94,100};
    searchElement = 78;
    
    System.out.println("Printing Ordered Array");
    Arrays.stream(orderedArray).forEach(x -> System.out.print(x+" "));
    System.out.println();
    
    index = searchSequential.getIndexOrderedSequentialSearch(orderedArray, searchElement);
    if(index>=0){
       System.out.println(String.format("Searched Element: %d found at index: %d having value: %d in an array of length: %d", searchElement, index, orderedArray[index], orderedArray.length));
    }else{
       System.out.println(String.format("Searched Element: %d doesn't exist in an array of length: %d", searchElement, orderedArray.length));
    }
    
    searchElement=55;
    index = searchSequential.getIndexOrderedSequentialSearch(orderedArray, searchElement);
    if(index>=0){
       System.out.println(String.format("Searched Element: %d found at index: %d having value: %d in an array of length: %d", searchElement, index, orderedArray[index], orderedArray.length));
    }else{
       System.out.println(String.format("Searched Element: %d doesn't exist in an array of length: %d", searchElement, orderedArray.length));
    }
        
    searchElement=94;
    index = searchSequential.getIndexOrderedSequentialSearch(orderedArray, searchElement);
    if(index>=0){
       System.out.println(String.format("Searched Element: %d found at index: %d having value: %d in an array of length: %d", searchElement, index, orderedArray[index], orderedArray.length));
    }else{
       System.out.println(String.format("Searched Element: %d doesn't exist in an array of length: %d", searchElement, orderedArray.length));
    }
  }
}
