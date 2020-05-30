/*Time Complexity = O(nlogn)
In place sorting Algorithm*/
class HeapSort{
  public static void main(String[] args)
  {
    int[] arr=new int[]{8,7,6,5,4,3,2,1};
    heapSort(arr,arr.length);
    for(int i=0;i<arr.length;i++)
    System.out.println(arr[i]);
  }

  private static void heapSort(int[] arr, int n) {
    // make Binary heap (completely filled tree except the last level with all the elements as left as possible)
    // make Binary Max Heap
     for(int i=n/2-1;i>=0;i--)
     {
       heapify(arr,n,i);
     }
     // at this point arr is Max Heap
     for(int i=n-1;i>0;i--)
     {
       // each time swap arr[0] with last element of heap and decrease the size of heap by 1
       int temp=arr[i];//last element of heap
       arr[i]=arr[0];  //max element is moved to last element of heap
       arr[0]=temp;
       heapify(arr,i,0);//again build max heap
     }
  }

  // heapify subtree rooted at i of size n
  private static void heapify(int[] arr, int n, int i) {
    int lchild=2*i+1;
    int rchild=2*i+2;
    int largest=i;
    if(lchild<n && arr[largest]<arr[lchild])
    {
      largest=lchild;
    }
    if(rchild<n && arr[largest]<arr[rchild])
    {
      largest=rchild;
    }
    // if root at i is not maximum of its child
    if(i!=largest)
    {
      int temp=arr[largest];
      arr[largest]=arr[i];
      arr[i]=temp;
      heapify(arr,n,largest);
    }

  }


}
