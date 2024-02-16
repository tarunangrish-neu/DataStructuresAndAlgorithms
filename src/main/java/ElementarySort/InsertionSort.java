package ElementarySort;

public class InsertionSort extends HelperFunctions{
    public static void insertionSort(Comparable[] a){
        int N = a.length;
        for(int i=1; i<N; i++){
            for (int j=i; j> 0 && less(a[j], a[j-1]); j--)
                exchange(a, j, j-1);
        }
    }

    public static void main(String[] args){
        Integer[] a = {9, 5, 3, 8 , 2, 6};
        insertionSort(a);
        show(a);
    }
}
