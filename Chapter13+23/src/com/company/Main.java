package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Integer[] list = new Integer[20000000];
        Random r = new Random();
        for(int i = 0; i < list.length;i++){
            list[i] = r.nextInt(10000) + 1;
        }
        GenericMergeSort ms = new GenericMergeSort();
        //System.out.println("before: " + Arrays.toString(list));
        System.out.println("start");
        long startTime = System.currentTimeMillis();
        ms.mergeSort(list);
        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed time (ms): " + (endTime - startTime));
        //System.out.println("after : " + Arrays.toString(list));


    }

    public static int binarySearch(int[] numbers, int target) {
        //(log N)
        int min = 0;
        int max = numbers.length - 1;
        while (min <= max) {
            int mid = (max + min) / 2;
            if (numbers[mid] == target) {
                return mid; // found it!
            } else if (numbers[mid] < target) {
                min = mid + 1; // too small
            } else { // numbers[mid] > target
                max = mid - 1; // too large
            }
        }
        return -1; // not found
    }

    // Recursive binary search algorithm.
    // Returns an index at which the target
    // appears in the given input array, or –1 if not found.
    // pre: array is sorted.
    private static int binarySearchR(int[] numbers, int target,
                                     int min, int max) {
        // base case
        if (min > max) {
            return -1; // not found
        } else {
            // recursive case
            int mid = (max + min) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                return binarySearchR(numbers, target, mid + 1, max);
            } else {
                return binarySearchR(numbers, target, min, mid - 1);
            }
        }
    }

    // Sequential search algorithm.
    // Returns the index at which the given target number first
    // appears in the given input array, or –1 if it is not found.
    public static int indexOf(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return i;
            }
        }
        return -1; // not found
    }

    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    // places the elements of the given array into sorted order
    // using the selection sort algorithm
    // post: array is in sorted (nondecreasing) order
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
    // find index of smallest element
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            swap(a, i, smallest); // swap smallest to front
        }
    }

    // Merges the given left and right arrays into the given
// result array. Second, working version.
// pre : result is empty; left/right are sorted
// post: result contains result of merging sorted lists.
    public static void merge(int[] result, int[] left, int[] right) {

        int i1 = 0; // index into left array
        int i2 = 0; // index into right array
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length &&
                    left[i1] <= right[i2])) {
                result[i] = left[i1]; // take from left
                i1++;
            } else {
                result[i] = right[i2]; // take from right
                i2++;
            }
        }
    }
    public static void mergeSort(int[] a) {
        if (a.length > 1) {
            // split array into two halves
            int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
            int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
            // recursively sort the two halves
            mergeSort(left);
            mergeSort(right);
            // merge the sorted halves into a sorted whole
            merge(a, left, right);
        }
    }
}
