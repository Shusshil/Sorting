package Sorting;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,2,5,6,9,8};
		mergeSort(a);
	    print(a);
	}
	public static void print(int[] arr) {
	    for(int i=0;i<arr.length;i++) {
	    System.out.print(arr[i]+" ");
	    }
	}
	public static void merge(int [] a, int []b, int[] merged){

	    //  int merged[] = new int[a.length+b.length];

	       int i=0, j = 0, k = 0;

	         while(i<a.length && j<b.length){
               if(a[i]<b[j]){
	           merged[k]=a[i];
	           i++;
	           k++;
	        }
	         else{
	         merged[k] = b[j];
	          j++;
	          k++;
	        }
	     }
	      while(i<a.length){
	       merged[k]=a[i];
	        i++;
	        k++;
	        }
	        while(j<b.length){
	          merged[k] = b[j];
	          j++;
	          k++;
	        }
	     //  return merged;
	        }
		public static void mergeSort(int[] arr) {
			int n=arr.length;
		    if(n<2)
		    return;
		    
		    int m=n/2;
		    
		    int[] left=new int[m];
		    int[] right=new int[n-m];
		    
		    for(int i=0;i<m;i++){
		        left[i]=arr[i];
		    }
		    for(int i=m;i<arr.length;i++){
		        right[i-m]=arr[i];
		    }
		    
		    mergeSort(left);
		    mergeSort(right);
		    
		    merge(left, right, arr);
		}
}
