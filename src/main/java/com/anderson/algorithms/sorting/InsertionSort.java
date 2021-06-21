package com.anderson.algorithms.sorting;

public class InsertionSort extends  SortingBase {
    public static void Sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1] ); j--)
                exchange(a,j, j - 1);
        }
    }
    public static void Sort(Comparable[] a, int startIndex, int endIndex) {
        int N = a.length;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1] ); j--)
                exchange(a,j, j - 1);
        }
    }
}
