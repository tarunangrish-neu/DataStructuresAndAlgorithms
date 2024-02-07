package UnionFind;

public class QuickUnionUF {

    int[] id;

    QuickUnionUF(int N){
        id = new int[N];
        for(int i=0; i<N; i++){
            id[i] = i;
        }
    }

    int root(int i){
        while(i!=id[i]) i=id[i];
        return i;
    }

    boolean connected(int p, int q){
        return root(p) == root(q);
    }

    void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

}
