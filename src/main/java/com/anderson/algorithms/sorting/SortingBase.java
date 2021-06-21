package com.anderson.algorithms.sorting;

public class SortingBase<TItem> {
    protected   boolean lessThan(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    protected   boolean lessGeneric(Comparable<TItem> v, Comparable<TItem> w) {
        return v.compareTo((TItem) w) < 0;
    }
    protected static void exchange(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    protected static void exchangeObject(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    protected static boolean less(Comparable v, Comparable w) {
        return  v.compareTo(w) < 0;
    }
    protected static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }
    protected static boolean isSorted(Comparable[] a, int startIndex, int endIndex) {

        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }
}
