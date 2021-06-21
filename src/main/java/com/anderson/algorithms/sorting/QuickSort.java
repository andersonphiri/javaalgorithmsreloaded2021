package com.anderson.algorithms.sorting;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Plan:
 * 1. shuffle the array
 * 2. Partition so that, for some j
 *  - every entry a[j] is in place
 *  - no larger entry to the left of J
 *  - no smaller entry to the right of j
 * 3. Sort the each piece recursively
 * */
public class QuickSort extends SortingBase {

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (less(a[++i], a[lo])) // find item on the left to swap
                if (i == hi) break;

            while (less(a[lo], a[--j])) // find item on the right to swap
                if (j == lo) break;
            if (i >= j) break; // check if pointers have crossed then stop

            exchange(a, i, j);
        }
        exchange(a, lo, j); // swap with the partitioning item
        return j;
    }

        /**
         * best case: O(NlgN)
         * worst case: (1/2)N^2 , but with random shusffling, this is unlikely
         * */
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }
}
