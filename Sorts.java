
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
            if(list.get(j) > list.get(j + 1)) {
                int temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
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
                if( list.get(j) < list.get(minIndex) )
                {
                    minIndex = j;
                }
            }
            
            // swap arr[k] with arr[minIndex]
            int temp = list.get(k);
            list.set( k, list.get(minIndex) );
            list.set( minIndex, temp );
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
      while (j > 0 && list.get(j-1) > index)
      {
           list.set(j,list.get(j-1));
           j--;
      }
      list.set(j, index);
  }
  
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
