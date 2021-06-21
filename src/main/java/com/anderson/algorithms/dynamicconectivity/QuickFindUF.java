package com.anderson.algorithms.dynamicconectivity;

/**
 * Eager approach
 * intialize takes N + constant
 * Note: It takes N*N operations to perform n Unions on N number of elements
 * Conclusion: N*N Algorithms are not efficient in solving large problems
 * */
public class QuickFindUF {
    private int[] id;
    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    /**
     * takes constant time
     * THis is the Find operation
     * */
    public Boolean connected(int p, int q) { return id[p] == id[q] ; }
    /**
     * set id of all elements with qid to pid
     * Takes at most 2N+2 operations
     * Note: it takes
     * */
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for(int i = 0; i < id.length; i++) {
            if (id[i] == qid) {
                id[i] = pid;
            }
        }
    }
}
