/*Time Complexity
Worst Case - O(n^2)
Best Case  - O(nlogn)
Average Case - O(nlogn)
In place sorting algorithm
Compared to Merge sort, Prefer for arrays as it required no auxilliary space for storing additional arrays.
Most practical implementations of Quick Sort use randomized version. The randomized version has expected time complexity of O(nLogn) in which we pick random index as pivot
 */
class QuickSort{
  public static void main(String[] args)
  {
    int[] arr=new int[]{5,2,18,3,1,4,20};
    quickSort(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++)
    System.out.println(arr[i]);
  }

  private static void quickSort(int[] arr, int low, int high) {
    if(low<high)
    {
      // pi is the pivot element index.Elements smaller than pivot comes before pivot and elements greater than pivot comes after pivot.
      int pi=partition(arr,low,high);
      quickSort(arr,low,pi-1);
      quickSort(arr,pi+1,high);
    }
  }

  private static int partition(int[] arr, int low, int high) {
    // choosing last element as pivot element
    int pivot=arr[high];
    int i=low-1;
    while(low<high)
    {
      if(arr[low]<pivot)
      {
        i++;
        int temp=arr[low];
        arr[low]=arr[i];
        arr[i]=temp;
      }
      low++;
    }
    arr[high]=arr[i+1];
    arr[i+1]=pivot;
    return i+1;
  }


}
