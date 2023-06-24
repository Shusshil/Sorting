package Sorting;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,2,5,6,9,8};
		QuickSort(a, 0, a.length-1);
	    print(a);
	}
	public static void swap(int[] a,int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
   }
   public static int partition(int[] a,int low,int high) {
       int partn=low;
       int pivot=a[high];
       for(int i=low;i<high;i++){
           if(a[i]<=pivot){
               swap(a,i,partn);
               partn++;
           }
       }
       swap(a,partn,high);
       return partn;
   }
   public static void QuickSort(int[] arr, int start, int end) {
	   if(start>=end)
		   return;
	   
	   int partnIndex=partition(arr,start,end);
	   QuickSort(arr, start, partnIndex-1);//left half
	   QuickSort(arr, partnIndex+1, end);//right half
   }
   public static void print(int[] arr) {
	    for(int i=0;i<arr.length;i++) {
	    System.out.print(arr[i]+" ");
	    }
	}
}
