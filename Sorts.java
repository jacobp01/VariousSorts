
import java.util.*;

public class Sorts{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public Sorts(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
    for(int i = list.size()-1; i >= 0; i--) {
        for(int j = 0; j < i; j++) {
            steps += 3;
            if(list.get(j) > list.get(j + 1)) {
                int temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
                steps += 4;
            }
        }
    }
      
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Integer> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Selection Sort");
    System.out.println();
    for( int k=0; k<list.size()-1; k++ )
        {
            // find the smallest value in arr[k..size-1]
            int minIndex = k;
            for( int j=k+1; j<list.size(); j++ )
            {
                steps += 1;
                if( list.get(j) < list.get(minIndex) )
                {
                    minIndex = j;
                    steps += 3;
                }
            }
            
            // swap arr[k] with arr[minIndex]
            int temp = list.get(k);
            list.set( k, list.get(minIndex) );
            list.set( minIndex, temp );
            steps += 2; 
        }
    
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Integer> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
    for (int i=1; i < list.size(); i++)
   {
      int index = list.get(i); int j = i;
      steps += 4;
      while (j > 0 && list.get(j-1) > index)
      {
           list.set(j,list.get(j-1));
           j--;
           steps += 1;
      }
      list.set(j, index);
  }
  
}
  public void mergeSort(ArrayList <Integer> list, int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if( low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            //System.out.print ("low " + low + "middle " + middle + " high " + high);
            // Sort the left side of the array
            mergeSort(list, low, middle);
            // Sort the right side of the array
            mergeSort(list, middle + 1, high);
            // Combine them both
            merge(list, low, middle, high);
        }
    }

    private void merge(ArrayList <Integer> list, int low, int middle, int high) {
        ArrayList <Integer> helper = new ArrayList <Integer> ();

        int i = low;
        int j = middle + 1;
        // Copy the smallest values from either the left or the right side
        // to the helper
        while (i <= middle || j <= high) {
            if (i > middle) {
                helper.add(list.get(j));
                j++;
                steps += 2;
            }
            else if (j > high){
                helper.add(list.get(i));
                i++;
                steps += 3;
            }
            else if (list.get(i) <= list.get(j)) {
                helper.add(list.get(i));
                i++;
                steps += 4;
            } else {
                helper.add(list.get(j));
                j++;
                steps += 5;
            }
        }
        int m = low;
        // Copy the merged part back into the original list from low to high index
        for(int l = 0; l < helper.size(); l++) {
            list.set(m, helper.get(l));
            m++;
            steps += 2;
        }
    }
  int sequentialSearch(ArrayList <Integer> list, int value){
      
        for (int i = 0; i < list.size(); i++)
        {
            // Return the index of the element if the element is found
            steps++;
            if (list.get(i) == value)
                return i;
        }
  
        // return -1 if the element is not found
        return -1;
    }
  
  int binarySearch(ArrayList <Integer> list, int value, int imin, int imax){
      if (imax < imin){
          System.out.print("Error");
    }
    else{
        int imid = imax + (imin - 1) / 2;
        if(list.get(imid) > value){
            steps++;
            return binarySearch(list, value, imin, imid - 1);
        }
        else if(list.get(imid) < value){
            steps++;
            return binarySearch(list, value, imid + 1, imax);
        }
        else{
            return imid;
        }
        }
    return -1;
}
  /**
   *  Accessor method to return the current value of steps
   *
   */
  public long getStepCount(){
    return steps;
  }

  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
  public void setStepCount(long stepCount){
    steps = stepCount;
  }
}
