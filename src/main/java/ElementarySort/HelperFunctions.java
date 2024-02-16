package ElementarySort;

public class HelperFunctions {
    public static boolean less(Comparable x, Comparable y){
        return x.compareTo(y) < 0;
    }

    public static void exchange(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static boolean isSorted(Comparable[] a){
        for(int i=1; i< a.length; i++){
            if(less(a[i], a[i-1])) return false;
        }
        return true;
    }
}
