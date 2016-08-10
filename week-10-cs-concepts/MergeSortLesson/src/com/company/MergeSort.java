package com.company;

/**
 * Created by michaeljeffress on 8/10/16.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 12, 2, 32, -2, -10, -1, 100, 16, 101};

        System.out.println("Unsorted numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(String.valueOf(numbers[i]));
        }

        numbers = mergeSort(numbers);

        System.out.println("Sorted numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(String.valueOf(numbers[i]));
        }
    }

    private static int[] mergeSort(int[] nums) {
        //Complete this method first

        if (nums == 0) {
            return nums;
        }

        int[] first = new int[nums.length / 2];

        int[] second = new int[nums.length - first.length];

        first = mergeSort(first);
        second = mergeSort(second);


        return merge(first, second, );

    }

    private static void merge(int[] first, int[] second, int[] result) {
        //Complete this method second
        int[] third;

        while (first != null && second != null) {
            if (first[0] > second[0]) {
                third.
            } else {

            }
            while (first != null) {

            }

            while (second != null) {

            }
            return third;

        }


    }

}
