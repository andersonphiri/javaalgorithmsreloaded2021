package com.anderson.algorithms.dynamicconectivity;

public class WeightedQuickUFPathCompression extends WeightedQuickUF {
    public WeightedQuickUFPathCompression(int N) {
        super(N);
    }

    @Override
    /** O(N)
     * Go up the tree while the parent is not equal to the number itself we are checking
     * */
    protected int root(int i) {
        int root = i;
        while(root != id[root]) {
            id[root] = id[id[root]]; // PATH COMPRESSION
            root = id[root];
        }
        return  root;
    }

}
