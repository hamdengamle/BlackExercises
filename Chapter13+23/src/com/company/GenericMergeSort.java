package com.company;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Julius on 25-10-2016.
 */
public class GenericMergeSort {
        public static<E extends Comparable<E>> void merge(E[] result, E[] left, E[] right) {
            int i1 = 0; // index into left array
            int i2 = 0; // index into right array
            for (int i = 0; i < result.length; i++) {
                if (i2 >= right.length || (i1 < left.length && left[i1].compareTo(right[i2]) <= 0)) {
                    result[i] = left[i1]; // take from left
                    i1++;
                } else {
                    result[i] = right[i2]; // take from right
                    i2++;
                }
            }
        }
    public static <E extends  Comparable<E>> void mergeSort(E[] a) {
        if (a.length > 1) {
            // split array into two halves
            E[] left = Arrays.copyOfRange(a, 0, a.length / 2);
            E[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
            // recursively sort the two halves
            mergeSort(left);
            mergeSort(right);
            // merge the sorted halves into a sorted whole
            merge(a, left, right);
        }
    }

    // COMPARATOR

    public static <E> void merge2(E[] result, E[] left, E[] right, Comparator<? super E> comparator) {
        int i1 = 0; // index into left array
        int i2 = 0; // index into right array
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && comparator.compare(left[i1], right[i2]) <= 0)) {
                result[i] = left[i1]; // take from left
                i1++;
            } else {
                result[i] = right[i2]; // take from right
                i2++;
            }
        }
    }
    public static <E> void mergeSort2(E[] a, Comparator<? super E> comparator) {

        if (a.length > 1) {
            // split array into two halves
            E[] left = Arrays.copyOfRange(a, 0, a.length / 2);
            E[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
            // recursively sort the two halves
            mergeSort2(left, comparator);
            mergeSort2(right, comparator);
            // merge the sorted halves into a sorted whole
            merge2(a, left, right, comparator);
        }
    }

    /** A test method */
    public static void main(String[] args) {
        Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        //mergeSort(list);
        mergeSort2(list, new CompareInt());
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
