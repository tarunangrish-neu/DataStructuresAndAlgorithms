package ElementarySort;

public class ShellSort extends HelperFunctions{
    public static void shellSort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while(h < N/3) h = 3*h + 1;
        while(h >= 1){
            for(int i = h; i<N; i++){
                for(int j=i; j>=h && less(a[j], a[j-h]); j-=h){
                    exchange(a, j,j-h);
                }
            }
            h=h/3;
        }
    }

    public static void main(String[] args){
        Integer a[] = {11, 2, 24, 6, 1, 3, 5, 9};
        shellSort(a);
        show(a);
    }
}
