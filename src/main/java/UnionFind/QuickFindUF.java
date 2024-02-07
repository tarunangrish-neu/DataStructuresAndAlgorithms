package UnionFind;

public class QuickFindUF {
    private int[] id;
    public QuickFindUF(int N){
        // Set ID of each object to itself
        // N Array Accesses
        id = new int[N];
        for(int i=0; i<N; i++){
            id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        // Check whether p and q are in the same component
        // 2 Array Accesses
        return id[p] == id [q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        //Change all entries with id[p] to id[q]
        //At most 2N+2 array accesses
        for(int i=0; i<id.length; i++){
            if (id[i] == pid) id[i] = qid;
        }
    }
}
