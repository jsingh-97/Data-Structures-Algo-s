/*
It is Divide and Conquer Algorithm. 
Time Complexity is O(nlogn) for all cases i.e best,worst,average.
Space is O(n) in arrays(Auxilliary space used to make 2 arrays),O(1) in linked List
MergeSort is used in Sorting Linked List because in Merge sort we don't need random access which is needed in quick sort which makes quick sort slow for linkedlist.
Merge Sort is used to count number of inversions needed to make array sorted. */
class MergeSort{
  public static void main(String[] args)
  {
    int[] arr=new int[]{5,2,18,3,1};
    mergeSort(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++)
    System.out.println(arr[i]);
  }

  private static void mergeSort(int[] arr, int low, int high) {
    if(low<high)
    {
      int mid=low+(high-low)/2;
      mergeSort(arr,low,mid);
      mergeSort(arr,mid+1,high);
      mergeSortedArrays(arr,low,mid,high);
    }
  }

  private static void mergeSortedArrays(int[] arr, int low, int mid, int high) {
    // number of elements in arr[low,mid]
    int n1=mid-low+1;
    // number of elements in arr[mid+1,high]
    int n2=high-mid;
    // x contains all the elements from arr[low,mid]
    int[] x=new int[n1];
    // y contains all the elements from arr[mid+1,high]
    int[] y=new int[n2];
    for(int i=0;i<n1;i++)
      x[i]=arr[low+i];
    for(int i=0;i<n2;i++)
      y[i]=arr[mid+i+1];
    int k=low;
    int i=0,j=0;
    while(i<n1 && j<n2)
    {
      if(x[i]<y[j])
      {
        arr[k++]=x[i++];
      }
      else
      {
        arr[k++]=y[j++];
      }
    }
    while(i<n1)
    {
      arr[k++]=x[i++];
    }
    while (j<n2)
    {
      arr[k++]=y[j++];
    }
  }
}
