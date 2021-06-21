package com.anderson.algorithms.sorting;

public class ShellSort extends SortingBase {
    public static void Sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        // compute the last value of h
        while (h < N / 3) h = 3*h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j > 0 && less(a[j], a[j - h] ); j-=h)
                    exchange(a,j, j - h);
            }
            h = h /3 ; // go lower until you reach 1
        }
    }
}
