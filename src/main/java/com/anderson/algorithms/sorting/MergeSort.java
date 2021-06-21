package com.anderson.algorithms.sorting;
/**
 * Running time O(N*lgN)
 * */
public class MergeSort extends SortingBase {

    protected static  void merge(Comparable[] a, Comparable[] aux, int low, int mid, int hi) {
        assert isSorted(a, low, mid);
        assert isSorted(a, mid + 1, hi);
        // fill the aux array
        for (int k = low; k <= hi; k ++)
            aux[k] = a[k];
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= hi; k++) {
            if (i > mid) {
                // this means we have completed the iteration from left side half but right hand still remains
                a[k] = aux[j++];
            } else if (j > hi) {
                // this means we have completed the iteration from right side half but left hand still remains
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
        assert isSorted(a, low, hi);
    }
    protected static int CUTOFF;
    protected static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux,lo,mid);
        sort(a, aux,mid + 1,hi);
        merge(a, aux, lo, mid, hi);
    }
    protected static void sortWithCutOffForInsertionSort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo + CUTOFF - 1) InsertionSort.Sort(a,lo,hi);
        int mid = lo + (hi - lo) / 2;
        sort(a, aux,lo,mid);
        sort(a, aux,mid + 1,hi);
        merge(a, aux, lo, mid, hi);
    }
    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }
    public static void sort(Comparable[] a, int cutOffForInsertionSortSubArray) {
        CUTOFF = cutOffForInsertionSortSubArray;
        Comparable[] aux = new Comparable[a.length];
        if (cutOffForInsertionSortSubArray <= 0) {
            sort(a, aux, 0, a.length - 1);
        }
        else {
            sortWithCutOffForInsertionSort(a, aux, 0, a.length - 1);
        }


    }
}
