package Sorting;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={6,5,2,3,9,8};
		a=selectionsort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print((a[i]));
		}
	}
	public static int[] selectionsort(int[] a) {
		  
	    for(int i =0; i<a.length-1; i++){

         int minIdx = i;

         for(int j=i+1; j<a.length; j++){

          if (a[j]<a[minIdx]){

          minIdx = j;

        }

        }
        if(minIdx != i) {
            
        int temp = a[minIdx];

         a[minIdx] = a[i];

        a[i] = temp;
        }
      //  System.out.print(a[i]);
        }
	    return a;
	}
}
