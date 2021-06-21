package com.anderson.algorithms.sorting;
/**
 * O(N^2)
 * */
public class SelectionSort extends SortingBase {
    /**
     * O(N^2)
     * */
    public static void Sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++)
                if (less(a[j], a[minIndex]))
                    minIndex = j;

            exchange(a, minIndex, i);
        }
    }

}
