package com.anderson.exercises;

public class SumOfThreeNumbers {
    /**
     * Counts the number of three subsequent numbers which have a sum of 0
     * O(N*N*N) largest expression operation is N choose 3
     * */
    public static int count(int[] input) {
        int count = 0;
        int N = input.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {

                for (int k = j + 1; k < N; k++) {

                    if (input[i] + input[j] + input[k] == 0)
                        count++;

                }

            }
        }

        return count;
    }
}
