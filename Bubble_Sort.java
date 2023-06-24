package Sorting;

public class Bubble_Sort {
	public static void main(String[] args) {
		int a[]={5,6,9,3,2,5,7,41};
		a=bubblesort(a);
		for(int i=0;i<a.length;i++) {
		    System.out.print(a[i]+" ");
		}
	}
	public static int[] bubblesort(int[] a) {
	    int n=a.length;
	    for(int i=0;i<n-1;i++) {
	        for(int j=0;j<n-i-1;j++) {
	            if(a[j]>a[j+1]) {
	                swap(a,j,j+1);
	            }
	        }
	    }
	    return a;
	}
	public static void swap(int[] a,int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
}
}
