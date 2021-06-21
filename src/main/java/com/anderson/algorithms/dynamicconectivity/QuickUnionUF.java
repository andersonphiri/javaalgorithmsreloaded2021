package com.anderson.algorithms.dynamicconectivity;

/**
 * Lazy approach
 * id[i] is the immediate parent of i in a tree
 * the root of i is id[id[id[...id[i]...] ] ]
 * Find: checks if p and q have the same root
 * merge or union(p,q) set the id of the root of p to the root of q
 *
 * Init - O(N) operations
 * */
public class QuickUnionUF {
    private int[] id;
    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    /** O(N)
     * Go up the tree while the parent is not equal to the number itself we are checking
     * */
    private int root(int i) {
        int root = i;
        while(root != id[root]) {
            root = id[root];
        }
        return  root;
    }

    public Boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    public void union(int p, int q) {
        id[root(p)] = root(q);
    }
}
