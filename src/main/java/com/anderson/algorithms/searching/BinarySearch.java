package com.anderson.algorithms.searching;

public class BinarySearch {
    static   int search(int[] source,  int key) {
        int low = 0;
        int high = source.length - 1;
        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (key > source[mid]) {
                low = mid    + 1;
            }
            else if(key < source[mid]) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }

        return -1;

    }
}
