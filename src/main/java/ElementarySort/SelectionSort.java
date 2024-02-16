package ElementarySort;

import ElementarySort.HelperFunctions;

public class SelectionSort extends HelperFunctions{
    public static void selectionSort(Comparable[] a){
        int N = a.length;
        for(int i=0; i<N; i++){
            int min = i;
            for(int j=i+1; j<N; j++){
                if(less(a[j] , a[min])) min = j;
                exchange(a, i, min);
            }
        }
    }

    public static void main(String[] args){
        Integer a[] = {9, 8, 5, 4, 2, 1};
        selectionSort(a);
        show(a);
    }
}
