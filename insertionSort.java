package Sorting;

public class insertionSort {
	public static void main(String[] args) {
	    int a[]={3,2,5,6,9,8};
        intertionsort(a);
	    print(a);
	//	System.out.println("Hello World");
	}
	public static void intertionsort(int[] a) {
	    int n=a.length;
	    for(int i=1;i<n;i++) {
	        int temp=a[i];
	        int j=i-1;
	        while(j>=0 && a[j]>temp) {
	            a[j+1]=a[j];
	            j--;
	        }
	        a[j+1]=temp;
	    }
	    return;
	}
	public static void print(int[] arr) {
	    for(int i=0;i<arr.length;i++) {
	    System.out.print(arr[i]+" ");
	    }
	}
}
