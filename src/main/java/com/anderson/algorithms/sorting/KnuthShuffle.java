package com.anderson.algorithms.sorting;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class KnuthShuffle extends SortingBase {
    public static void shuffle(Object[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = StdRandom.uniform(i + 1);
            exchangeObject(a, i, r);
        }
    }
}
