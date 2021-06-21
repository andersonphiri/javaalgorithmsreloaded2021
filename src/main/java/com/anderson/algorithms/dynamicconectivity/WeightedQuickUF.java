package com.anderson.algorithms.dynamicconectivity;

import java.util.Arrays;

public class WeightedQuickUF {
    protected int[] id;
    protected int[] sz;
    public WeightedQuickUF(int N) {
        id = new int[N];
        sz = new int[N];
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    /** O(N)
     * Go up the tree while the parent is not equal to the number itself we are checking
     * */
    protected int root(int i) {
        int root = i;
        while(root != id[root]) {
            root = id[root];
        }
        return  root;
    }

    public Boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    /**
     * TO avoid a very tall tree, move the small size tree the root of the larger tree
     * */
    public void union(int p, int q) {
        var rootp = root(p);
        var rootq = root(q);
        if (sz[q] > sz[p]) {
            id[rootp] = rootq;
            sz[q] += sz[p];
        }
        else {
            id[rootq] = rootp;
            sz[p] += sz[q];
        }

    }
}
