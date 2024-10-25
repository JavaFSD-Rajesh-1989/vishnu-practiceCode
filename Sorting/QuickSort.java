package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, 5, 1, 7, 5, 12, 34};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    static int partition(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;  // Correctly calculate the mid index
        int temp = arr[mid];
        arr[mid] = arr[start];
        arr[start] = temp;

        int pivot = arr[start];  // Pivot value is now at the start
        int i = start + 1;
        int j = end;

        while (i <= j) {
            while (i <= end && arr[i] <= pivot) {
                i++;
            }
            while (j >= start && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Place the pivot in its correct position
        temp = arr[j];
        arr[j] = arr[start];
        arr[start] = temp;

        return j;
    }
}
